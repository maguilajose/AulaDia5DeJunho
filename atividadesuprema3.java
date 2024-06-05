package AulaDia5DeJunho;

import java.util.Scanner;

public class atividadesuprema3 {

	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);

	        int[] a = new int[2];
	        int[] b = new int[2];
	        int[] c = new int[4];

	        int i = 0;
	        while (i < 2) {
	            System.out.print("Informe o " + i + "° valor para o vetor a: ");
	            a[i] = ler.nextInt();
	            i++;
	        }

	        i = 0;
	        while (i < 2) {
	            System.out.print("Informe o " + i + "° valor para o vetor b: ");
	            b[i] = ler.nextInt();
	            i++;
	        }

	        i = 0;
	        while (i < 2) {
	            c[i] = a[i];
	            c[i + 2] = b[i];
	            i++;
	        }

	        i = 0;
	        while (i < 4) {
	            System.out.println("Valor " + i + " do vetor c: " + c[i]);
	            i++;
	        }

	        ler.close();
	    }
	}