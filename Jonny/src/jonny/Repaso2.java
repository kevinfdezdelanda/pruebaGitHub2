package jonny;

public class Repaso2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Realiza un programa, que pueda ser probado en el simulador Johnny, para calcular el elemento en�simo de la siguiente sucesi�n. 
//		1	2	9	64	625 � (n)n-1
//
//		El n� de posici�n cuyo elemento se quiere obtener estar� almacenado en la posici�n 40, en tanto que el resultado se guardar� en la 41.
		
		int n40=5,n41, n42,n43,n44;
		n41=0;
		n42=n40;
		n43=n40;
		n44=n40;
		n42--;
		n42--;
		while (n42!=0) {
			n43=n40;
			while(n43!=0) {
				n41+=n44;
				n43--;
			}
			n44=n41;
			n42--;
		}
		System.out.println(n41);
	}

}
