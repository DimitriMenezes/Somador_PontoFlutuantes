public class Somador {

	/**
	 * Realiza a soma aritm�tica entre dois valores reais representados por Ponto Flutuante 
	 * de acordo com a norma IEEE 754 
	 * @param x
	 * @param y
	 * @return
	 */
	public static PFlutuante soma(PFlutuante x, PFlutuante y){
		PFlutuante resultado = new PFlutuante();
		resultado.setSinal(x.getSinal()); // Na soma, o sinal dos operandos s�o iguais
		int diferen�a = Math.abs(x.getExpoente() - y.getExpoente());
		if (diferen�a == 0){ // Caso onde os expoentes s�o iguais
			resultado.setExpoente(x.getExpoente());
			resultado.setMantissa((x.getMantissa()+ 8388608 + y.getMantissa()+ 8388608) >> 1);
			if ((resultado.getMantissa() & 1) == 1){
				resultado.setMantissa(resultado.getMantissa()+1);					
			}
			resultado.gerarFloat();
			return resultado;
		}
		long guardBit = 0; // Respons�vel por arredondar ou n�o o valor (1)
		long roundBit = 0; // Respons�vel por arredondar ou n�o o valor (2)
		long stickyBit = 0; // Respons�vel por arredondar ou n�o o valor (3)
		if (x.getExpoente() < y.getExpoente()){ // Caso expoente de X seja menor que expoente de Y
			// Adiciona bit da parte inteira (denormaliza��o)
			long mantissaTemp = x.getMantissa() + 8388608;
			for (int i = 0; i < diferen�a; i++){
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
			mantissaTemp += (y.getMantissa() + 8388608); // Adiciona bit da parte inteira (denormaliza��o)
			resultado.setExpoente(y.getExpoente());
			if (mantissaTemp >= 8388608){     // condi��o que verifica se a parte inteira possui 2 d�gitos e/ou est� normalizada
				if (mantissaTemp >= 16777216){
					stickyBit = stickyBit | roundBit;
					roundBit = guardBit;
					guardBit = mantissaTemp & 1;
					mantissaTemp = mantissaTemp >> 1; // renormaliza��o
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
			long mantissaTemp = y.getMantissa() + 8388608; // Adiciona bit da parte inteira (denormaliza��o)
			for (int i = 0; i < diferen�a; i++){
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
			mantissaTemp += (x.getMantissa() + 8388608); // Adiciona bit da parte inteira (denormaliza��o)
			resultado.setExpoente(x.getExpoente());
			if (mantissaTemp >= 8388608){     // condi��o que verifica se a parte inteira possui 2 d�gitos e/ou est� normalizada
				if (mantissaTemp >= 16777216){
					stickyBit = stickyBit | roundBit;
					roundBit = guardBit;
					guardBit = mantissaTemp & 1;
					mantissaTemp = mantissaTemp >> 1; // renormaliza��o
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
