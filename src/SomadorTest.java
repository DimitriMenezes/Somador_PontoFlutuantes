import static org.junit.Assert.*;

import org.junit.Test;


public class SomadorTest {

	public final int CONSTANTE = 1000000;
	
	@Test
	public void test() {
		for (int i = 0; i < CONSTANTE; i++){
			float f1 = (float) (Math.random()*100);
			PFlutuante x = new PFlutuante(f1);
			float f2 = (float) (Math.random()*100);
			PFlutuante y = new PFlutuante(f2);
			assertEquals((x.getNumero()+y.getNumero()),Somador.soma(x, y).getNumero(),0.0001);
			System.out.println(f1 +" + "+f2+" = "+Somador.soma(x, y).getNumero());
		}
	}
}
