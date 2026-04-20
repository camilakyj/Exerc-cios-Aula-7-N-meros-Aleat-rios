// Camila Aki Yagima Jeronimo
package dobackofront;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroSecreto = random.nextInt(50) + 1;
        int palpite = 0;
        int tentativas = 0;

        while (palpite != numeroSecreto) {
            System.out.print("Digite seu palpite (1 a 50): ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroSecreto) {
                System.out.println("Maior");
            } else if (palpite > numeroSecreto) {
                System.out.println("Menor");
            } else {
                System.out.println("Acertou!");


            }
        }
        System.out.println("Quantidade de tentativas: " + tentativas);
        scanner.close();

    }
}
