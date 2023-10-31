import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
            String filme = leitura.nextLine(); //Leitura de String

        System.out.println("Qual o ano de lançamento?");
            int anoDeLancamento = leitura.nextInt(); //Leitura de Int

        System.out.println("Diga sua avaliação para o filme");
            double avaliacao = leitura.nextDouble(); //Leitura de Double

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);
    }
}
