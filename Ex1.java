// Camila Aki Yagima Jeronimo
package dobackofront;
import java.util.Random;
public class Main {
    public   static void main(String [] args) {
        Random random = new Random();

        int numero = random.nextInt(100) + 1;

        System.out.println("Número gerado:" + numero);

        }
    }

