
import java.util.Scanner;
public class URI1002{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);

        double raio = teclado.nextDouble();
        double area = 3.14159 * raio * raio;

        System.out.printf("A=%.4f\n", area);
    }
}
