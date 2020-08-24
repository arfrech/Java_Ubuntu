/* Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno. 
A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a 
nota C tem peso 5. Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.
*/

import java.util.Scanner;
public class URI1006{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);

        double n1 = teclado.nextDouble();
        double n2 = teclado.nextDouble();
        double n3 = teclado.nextDouble();
        double m = (n1*2 + n2*3 + n3*5) / 10;

        System.out.printf("MEDIA = %.1f\n", m);

    }
}