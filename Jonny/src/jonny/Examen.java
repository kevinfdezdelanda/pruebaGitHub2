package jonny;

public class Examen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		(n-1) x 2(n-1)
//
//
//		El n� de posici�n cuyo elemento se quiere obtener estar� almacenado en la posici�n 40, en tanto que el resultado se guardar� en la 41
		
		int n40=6,n41,n42,n43,n44=0,n45;
		n41=0;
		n42=n40;
		n43=n40;
		n42--;
		n43--;
		n43--;
		n44++;
		n44++;
		n45=n44;
		n44=0;
		while(n43!=0) {
			n44++;
			n44++;
			
			
			while(n44!=0) {
				n41+=n45;
				n44--;
			}
			n45=n41;
			n41=0;
			n43--;
		}
		n41=n42;
		n45--;
		while(n45!=0) {
			n41+=n42;
			n45--;
		}
		System.out.println(n41);
	}

}
