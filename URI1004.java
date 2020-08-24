/* Leia dois valores inteiros. 
A seguir, calcule o produto entre estes dois valores e atribua esta operação à variável PROD. 
A seguir mostre a variável PROD com mensagem correspondente.    
*/ 

import java.util.Scanner;
public class URI1004{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);

        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = a * b;

        System.out.println("PROD = " + c);
    }
}