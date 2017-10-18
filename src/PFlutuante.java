public class PFlutuante {

	private float numero;
	
	private int sinal;
	private int expoente;
	private long mantissa;
	
	public PFlutuante(float f){
		numero = f;
		int x = Float.floatToRawIntBits(f);
		if (f < 0)
			sinal = 1;			
		else
			sinal = 0;
		expoente = (x & 2139095040) >> 23;
		mantissa = x & 8388607;
	}

	public PFlutuante(){
		numero = 0;
		sinal = 0;
		expoente = 0;
		mantissa = 0;
	}
	
	public boolean isZero(){
		if (this.getExpoente() == 0 && this.getMantissa() == 0){
			return true;
		}else{
			return false;
		}
	}

	public float getNumero() {
		return numero;
	}

	public void setNumero(float numero) {
		this.numero = numero;
	}

	public int getSinal() {
		return sinal;
	}

	public void setSinal(int sinal) {
		this.sinal = sinal;
	}

	public int getExpoente() {
		return expoente;
	}

	public void setExpoente(int expoente) {
		this.expoente = expoente;
	}

	public long getMantissa() {
		return mantissa;
	}

	public void setMantissa(long mantissa) {
		this.mantissa = mantissa;
	}
	
	/**
	 * Define o número de ponto flutuante após realização da soma de acordo com a norma IEEE 754
	 */
	public void gerarFloat() {
		int f = sinal << 31;
		f += expoente << 23;
		f += mantissa;
		numero = Float.intBitsToFloat(f);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + expoente;
		result = prime * result + (int) (mantissa ^ (mantissa >>> 32));
		result = prime * result + Float.floatToIntBits(numero);
		result = prime * result + sinal;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PFlutuante other = (PFlutuante) obj;
		if (expoente != other.expoente)
			return false;
		if (mantissa != other.mantissa)
			return false;
		if (Float.floatToIntBits(numero) != Float.floatToIntBits(other.numero))
			return false;
		if (sinal != other.sinal)
			return false;
		return true;
	}
}
