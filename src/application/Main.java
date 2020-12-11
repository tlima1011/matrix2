package application;

import java.util.Scanner;

import entities.Matriz;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		System.out.print("How many lines: ");
		int m = sc.nextInt(); 
		System.out.print("How many columns: ");
		int n = sc.nextInt(); 
		
		int mat[][] = new int[m][n]; 
		
		for(int i = 0; i < mat.length;i++) {
			for(int j = 0; j < mat[i].length;j++) {
				System.out.printf("Elemento [%d][%d]: ", i, j);
				mat[i][j] = sc.nextInt();
			}
		}
		Matriz.informarMatriz(mat, m, n);
		System.out.print("Which element do you want to inform the position in the matrix? ");
		int num = sc.nextInt(); 
		Matriz.procurarPosicoes(mat, num);
		
		
		sc.close();
	}

}
