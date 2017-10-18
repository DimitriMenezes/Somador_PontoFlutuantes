public class Multiplicador {

	public static PFlutuante multiplicacao(PFlutuante x, PFlutuante y){
		PFlutuante resultado = new PFlutuante();
		if (x.isZero() || y.isZero()){
			return resultado; // retorne o valor 0.0
		}
		resultado.setSinal((x.getSinal() + y.getSinal()) % 2);
		resultado.setExpoente(x.getExpoente() + y.getExpoente() - 127); // soma os expoentes e subtrai a polarização
		long a = x.getMantissa()+8388608; long b =y.getMantissa()+8388608;
		long mantissaTemp = a*b;
		resultado.setMantissa(mantissaTemp);
		long posVirgula = mantissaTemp >> 46;
		long guardBit = 0; // Responsável por arredondar ou não o valor (1)
		long roundBit = 0; // Responsável por arredondar ou não o valor (2)
		long stickyBit = 0; // Responsável por arredondar ou não o valor (3)
		
		// Descobrir se número antes da vírgula não está normalizado,
		// Se sim, incrementa expoente
		while (posVirgula != 1){
			resultado.setExpoente(resultado.getExpoente()+1);
			posVirgula = posVirgula >> 1;
		}
		// Renormalizar
		int i = 0;
		if (resultado.getMantissa() > 16777215){
			while (resultado.getMantissa() > 16777215){
				if (i == 0)
					guardBit = resultado.getMantissa() & 1;
				else if (i == 1){
					roundBit = guardBit;
					guardBit = resultado.getMantissa() & 1;
				}else if (i == 2){
					stickyBit = roundBit;
					roundBit = guardBit;
					guardBit = resultado.getMantissa() & 1;
				}else{
					stickyBit = stickyBit | roundBit;
					roundBit = guardBit;
					guardBit = resultado.getMantissa() & 1;
				}
				resultado.setMantissa(resultado.getMantissa() >> 1);
				i++;
			}
		}
		if (guardBit == 1 && (roundBit != 0 || stickyBit != 0)){
			resultado.setMantissa(resultado.getMantissa()+1);
		}else{
			if ((mantissaTemp & 1) == 1){
				mantissaTemp += 1;					
			}
		}
		resultado.setMantissa(resultado.getMantissa() & 8388607);
		resultado.gerarFloat();
		return resultado;
	}
	
}
