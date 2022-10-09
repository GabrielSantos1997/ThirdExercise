package saojudas.thirdexercise;

import java.util.Scanner;

/**
 *
 * @author Gabriel Jerônimo dos Santos
 * RA: 818125147
 *
 */
public class ThirdExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double firstNumber;
        double secondNumber;

        System.out.print("Digite o primeiro número: ");
        firstNumber = scanner.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        secondNumber = scanner.nextDouble();
        
        System.out.print("A soma dos dois números é: " + (firstNumber + secondNumber));
    }
}
