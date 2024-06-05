package AulaDia5DeJunho;

import java.util.Scanner;

public class Atividadesuprema1 {

	public static void main(String[] args) {
		
        double a;

        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Informe um valor: ");
        a = scanner.nextDouble();

        
        if (a % 5 == 0) {
            System.out.println("O número " + a + " é múltiplo de 5");
        } else {
            System.out.println("O número " + a + " não é múltiplo de 5");
        }

       
        scanner.close();
    }
}