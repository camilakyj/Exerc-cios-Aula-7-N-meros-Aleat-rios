// Camila Aki Yagima Jeronimo
package dobackofront;
import java.util.Random;
public class Main {
public    static void main(String [] args) {
    Random random = new Random();

    int soma = 0;
    int pares = 0;

    for (int i = 1; i <= 10; i++) {
        int numero = random.nextInt(20) + 1;

        System.out.println("Número " + i + ": " + numero);

        soma += numero;

        if (numero % 2 == 0) {
            pares++;


        }
        double media = soma / 10.0;

        System.out.println("Soma total: " + soma);
        System.out.println("Média:" + media);
        System.out.println("Quantidade de números pares:" + pares);

        }
    }
}
