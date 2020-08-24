/* Faça um programa que leia o nome de um vendedor, 
o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro).
Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, 
informar o total a receber no final do mês, com duas casas decimais.
*/

import java.util.Scanner;
public class URI1009{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);

        String funcionario = teclado.nextLine();
        Double salario = teclado.nextDouble();
        Double vendas = teclado.nextDouble();
        Double pagar = salario + vendas * (15d/100);

        System.out.printf("TOTAL = R$ %.2f\n", pagar);
    }
}