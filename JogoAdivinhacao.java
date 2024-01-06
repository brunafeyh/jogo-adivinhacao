import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numero_adivinhar = random.nextInt(100);
        int tentativas = 0;
        final int max_tentativas = 10;

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número entre 0 e 100.");
        System.out.println("    ");

        while (tentativas < max_tentativas) {
            System.out.print("Tentativa " + (tentativas + 1) + ": Digite seu palpite: ");
            int palpiteUsuario = scanner.nextInt();
            tentativas++;

            if (palpiteUsuario == numero_adivinhar) {
                System.out.println("Parabéns! Você acertou o número " + numero_adivinhar + " em " + tentativas + " tentativas.");
                break;
            } else if (palpiteUsuario < numero_adivinhar) {
                System.out.println("Tente novamente. O número é MAIOR.");
            } else {
                System.out.println("Tente novamente. O número é MENOR.");
            }
            System.out.println("    ");
        }

        if (tentativas == max_tentativas) {
            System.out.println("Você atingiu o número máximo de tentativas. O número correto era: " + numero_adivinhar);
        }

        scanner.close();
    }
}
