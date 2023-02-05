package mx.generation;


public class ArbolNavidad {

	public static void main(String[] args) {
		// Definimos variable para el tamaño del arbol
		int tamanioArbol = 10;
		
		for(int i=0; i<tamanioArbol+(tamanioArbol/2); i++) {
			for(int j=tamanioArbol+(tamanioArbol/2); j>i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=2*i-1; k++) {
				System.out.print("\u001B[32m*");
			}
			System.out.println("");
		}
		for(int i=0; i<tamanioArbol-(tamanioArbol/2); i++) {
			for(int j=tamanioArbol+(tamanioArbol/2); j>1; j--) {
				System.out.print(" ");
			}
			System.out.println("\u001B[31m***");
		}

	}

}
