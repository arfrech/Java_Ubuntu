import java.util.Scanner;

public class ExemploDeVariaveis{
    public static void main (String args[]){

        /* 
        int a;     // ocupa 32 bits (4 bytes)
        long b;    // ocupa 64 bits (8 bytes)
        short c;   // ocupa 16 bits (2 bytes)
        byte d;    // ocupa 8 bits (1 byte)


        a = 10;
        b = 8914;
        c = 10000;
        d = 20;

        System.out.println("Valor de a = " + a);
        System.out.println("Valor de b = " + b);
        System.out.println("Valor de c = " + c);
        System.out.println("Valor de d = " + d);
        
        int a, b, c, d;

        a = 10;
        b = 3;
        c = a + b;
        d = a % b;

        System.out.println("Valor de a = " + a);
        System.out.println("Valor de b = " + b);
        System.out.println("Valor de c = " + c);
        System.out.println("Valor do resto de d = " + d);
        
        float x;     // float ocupa 32 bits (8 bytes)
        double y;    // double ocupa 64 bits (16 bytes)

        x = 1.0f;
        y = 2.0d;

        System.out.println("Valor do x = " + x);
        System.out.println("Valor do y = " + y);

        boolean b, b2;

        b = true;
        b2 = false;

        System.out.println("Valor do b = " + b);
        System.out.println("Valor do b2 = " + b2);

        char c;
        String s;

        c = 'x';
        s = "Oi quer tc?";

        System.out.println("Valor do c = " + c);
        System.out.println("Valor do s = " + s);

        */

        int a;
        float b;
        double c;
        String d;
        char e;

        Scanner teclado;
        teclado = new Scanner (System.in);

        System.out.println("Digite um valor inteiro:");
        a = teclado.nextInt();

        System.out.println("Valor do a = " + a);

        System.out.println("Digite um novo valor:");
        b = teclado.nextFloat();

        System.out.println("Valor de b = " + b);

        System.out.println("Digite um novo valor:");
        c = teclado.nextDouble();

        System.out.println("Valor de c = " + c);

        System.out.println("Digite um texto:");
        d = teclado.nextLine();
        d = teclado.nextLine();

        System.out.println("Valor do d = " + d);

        System.out.println("Digite um caracter:");
        e = teclado.nextLine().charAt(0);

        System.out.println("Valor do e = " + e);

    } 
}