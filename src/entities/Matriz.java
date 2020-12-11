package entities;

public class Matriz {
	
	public static void informarMatriz(int mat[][], int m, int n) {
		
		System.out.print("Matriz ");
		if(m == n) {
			System.out.print("Quadrada ");
		}
		System.out.printf("%d x %d\n ",m,n);
		for(int i = 0; i < mat.length;i++) {
			for(int j = 0; j < mat[i].length;j++) {
				System.out.print(mat[i][j] + "  ");
			}
			System.out.println();
		}
	}
	public static void procurarPosicoes(int mat[][], int p) {
		
		for(int i = 0; i < mat.length;i++) {
			for(int j = 0; j < mat[i].length;j++) {
				if(p == mat[i][j]) {
					System.out.printf("Position %d, %d: \n",i,j);
					if(j > 0) {
						System.out.printf("Left: %d\n", mat[i][j - 1]);
					}//Esquerda
					if(j < mat[i].length - 1) {
						System.out.printf("Right: %d\n", mat[i][j + 1]);
					}
					if(i > 0) {
						System.out.printf("Up: %d\n", mat[i - 1][j]);
					}
					if(i < mat.length - 1) {
						System.out.printf("Down: %d\n", mat[i + 1][j]);
					}
				}
			}
		}
	}

}
