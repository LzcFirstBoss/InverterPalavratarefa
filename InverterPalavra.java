import java.util.Scanner;

public class InverterPalavra {

    public static String inverterPalavra(String palavra) {
        StringBuilder resultado = new StringBuilder();

        for (int i = palavra.length() - 1; i >= 0; i--) {
            resultado.append(palavra.charAt(i));
        }

        return resultado.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite uma palavra (ou 'sair' para encerrar): ");
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("sair")) {
                break;
            }

            String palavraInvertida = inverterPalavra(entrada);
            System.out.println("Palavra invertida: " + palavraInvertida);
        }

        scanner.close();
    }
}
