package array_string;

public class TPN3_Ejercicio1_C {

	public static void main(String[] args) {
		int []vector3 = {5, 15, 25, 55, 105};
		int x=20, suma=0;
		
		System.out.println();
		System.out.println(" Segundo Vector: ");
		for (int indice1=0; indice1 < vector3.length; indice1++){
			if(vector3[indice1] > x) {
				suma = suma + vector3 [indice1];
				
			}
			
			
		}
		System.out.print(" La suma es:  "+suma);

	}

}
