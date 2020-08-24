import java.util.Scanner;
public class Livros{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);

        System.out.println("Bem vindo(a) ao sistema de cadastro de livros da Biblioteca.");
        System.out.println("Digite o titulo do livro: ");
        String titulo = teclado.nextLine();
        System.out.println("Digite o nome do autor: ");
        String autor = teclado.nextLine();
        System.out.println("Digite o ano da publicacao: ");
        String ano = teclado.nextLine();
        System.out.println("Categoria: ");
        String categoria = teclado.nextLine();
        System.out.println("Posicao na Estante: ");
        String posE = teclado.nextLine();
        System.out.println("Posicao na Prateleira: ");
        String posP = teclado.nextLine();
        System.out.println("Esta disponivel para emprestimo (S/N)? ");
        String disponivel = teclado.nextLine();

        Biblioteca livro1 = new Biblioteca(titulo, autor, ano, categoria, posE, posP, disponivel);

        System.out.println("Livro cadastrado com sucesso!");
        System.out.println(livro1.exibirInfo());

    }
}