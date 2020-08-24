/* Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara.
Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”, 
caso haja uma divisão por 0 ou raiz de numero negativo.
*/

import java.util.Scanner;
public class URI1036{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);

        double a = teclado.nextDouble();
        double b = teclado.nextDouble();
        double c = teclado.nextDouble();
        double delta = b*b - 4*a*c;

        if(a == 0 || delta < 0){
            System.out.println("Impossivel calcular");
        }
        else{
            double R1 = (Math.sqrt(delta) - b)/(2*a);
            double R2 = ((Math.sqrt(delta) + b)/(2*a))*(-1);
            System.out.printf("R1 = %.5f\n", R1);
            System.out.printf("R2 = %.5f\n", R2);
        }
    }
}