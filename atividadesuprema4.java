package AulaDia5DeJunho;

import java.util.Scanner;

public class atividadesuprema4 {

	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);
	        
	        int a[][] = new int[3][3];
	        int b[][] = new int[3][3];
	        int c[][] = new int[3][3];

	        int i = 0;
	        while (i < 3) {
	            int j = 0;
	            while (j < 3) {
	                a[i][j] = (int) Math.round(Math.random() * 10);
	                j++;
	            }
	            i++;
	        }

	        i = 0;
	        while (i < 3) {
	            int j = 0;
	            while (j < 3) {
	                b[i][j] = (int) Math.round(Math.random() * 10);
	                j++;
	            }
	            i++;
	        }

	        i = 0;
	        while (i < 3) {
	            int j = 0;
	            while (j < 3) {
	                c[i][j] = a[i][j] * b[i][j];
	                j++;
	            }
	            i++;
	        }

	        i = 0;
	        while (i < 3) {
	            int j = 0;
	            while (j < 3) {
	                System.out.println("Os valores da MATRIZ C na posição [" + i + "][" + j + "] é: " + c[i][j]);
	                j++;
	            }
	            i++;
	        }
	        
	        ler.close();
	    }
	}