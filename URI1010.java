/* Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, 
o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e 
o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.
*/

import java.util.Scanner;
public class URI1010{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);

        int p1 = teclado.nextInt();
        int n1 = teclado.nextInt();
        double v1 = teclado.nextDouble();

        int p2 = teclado.nextInt();
        int n2 = teclado.nextInt();
        double v2 = teclado.nextDouble();

        double pagar = n1*v1 + n2*v2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", pagar);
    }
}