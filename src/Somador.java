public class Somador {

	/**
	 * Realiza a soma aritmética entre dois valores reais representados por Ponto Flutuante 
	 * de acordo com a norma IEEE 754 
	 * @param x
	 * @param y
	 * @return
	 */
	public static PFlutuante soma(PFlutuante x, PFlutuante y){
		PFlutuante resultado = new PFlutuante();
		resultado.setSinal(x.getSinal()); // Na soma, o sinal dos operandos são iguais
		int diferença = Math.abs(x.getExpoente() - y.getExpoente());
		if (diferença == 0){ // Caso onde os expoentes são iguais
			resultado.setExpoente(x.getExpoente());
			resultado.setMantissa((x.getMantissa()+ 8388608 + y.getMantissa()+ 8388608) >> 1);
			if ((resultado.getMantissa() & 1) == 1){
				resultado.setMantissa(resultado.getMantissa()+1);					
			}
			resultado.gerarFloat();
			return resultado;
		}
		long guardBit = 0; // Responsável por arredondar ou não o valor (1)
		long roundBit = 0; // Responsável por arredondar ou não o valor (2)
		long stickyBit = 0; // Responsável por arredondar ou não o valor (3)
		if (x.getExpoente() < y.getExpoente()){ // Caso expoente de X seja menor que expoente de Y
			// Adiciona bit da parte inteira (denormalização)
			long mantissaTemp = x.getMantissa() + 8388608;
			for (int i = 0; i < diferença; i++){
				if (i == 0)
					guardBit = mantissaTemp & 1;
				else if (i == 1){
					roundBit = guardBit;
					guardBit = mantissaTemp & 1;
				}else if (i == 2){
					stickyBit = roundBit;
					roundBit = guardBit;
					guardBit = mantissaTemp & 1;
				}else{
					stickyBit = stickyBit | roundBit;
					roundBit = guardBit;
					guardBit = mantissaTemp & 1;
				}
				mantissaTemp = mantissaTemp >> 1;
			}
			mantissaTemp += (y.getMantissa() + 8388608); // Adiciona bit da parte inteira (denormalização)
			resultado.setExpoente(y.getExpoente());
			if (mantissaTemp >= 8388608){     // condição que verifica se a parte inteira possui 2 dígitos e/ou está normalizada
				if (mantissaTemp >= 16777216){
					stickyBit = stickyBit | roundBit;
					roundBit = guardBit;
					guardBit = mantissaTemp & 1;
					mantissaTemp = mantissaTemp >> 1; // renormalização
					resultado.setExpoente(resultado.getExpoente()+1);
				}
			}
			mantissaTemp = mantissaTemp & 8388607;
			if (guardBit == 1 && (roundBit != 0 || stickyBit != 0)){
				mantissaTemp += 1;
			}else{
				if ((mantissaTemp & 1) == 1){
					mantissaTemp += 1;					
				}
			}
			resultado.setMantissa(mantissaTemp);
		}else{ // Caso expoente de Y seja menor que expoente de X
			long mantissaTemp = y.getMantissa() + 8388608; // Adiciona bit da parte inteira (denormalização)
			for (int i = 0; i < diferença; i++){
				if (i == 0)
					guardBit = mantissaTemp & 1;
				else if (i == 1){
					roundBit = guardBit;
					guardBit = mantissaTemp & 1;
				}else if (i == 2){
					stickyBit = roundBit;
					roundBit = guardBit;
					guardBit = mantissaTemp & 1;
				}else{
					stickyBit = stickyBit | roundBit;
					roundBit = guardBit;
					guardBit = mantissaTemp & 1;
				}
				mantissaTemp = mantissaTemp >> 1;
			}
			mantissaTemp += (x.getMantissa() + 8388608); // Adiciona bit da parte inteira (denormalização)
			resultado.setExpoente(x.getExpoente());
			if (mantissaTemp >= 8388608){     // condição que verifica se a parte inteira possui 2 dígitos e/ou está normalizada
				if (mantissaTemp >= 16777216){
					stickyBit = stickyBit | roundBit;
					roundBit = guardBit;
					guardBit = mantissaTemp & 1;
					mantissaTemp = mantissaTemp >> 1; // renormalização
					resultado.setExpoente(resultado.getExpoente()+1);
				}
			}
			mantissaTemp = mantissaTemp & 8388607;
			if (guardBit == 1 && (roundBit != 0 || stickyBit != 0)){
				mantissaTemp += 1;
			}else{
				if ((mantissaTemp & 1) == 1){
					mantissaTemp += 1;					
				}
			}
			resultado.setMantissa(mantissaTemp);
		}
		resultado.gerarFloat();
		return resultado;
	}
}
