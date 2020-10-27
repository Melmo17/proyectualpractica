
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int[] numeros;
        do {
            numeros = new int[numero];
            numero = sc.nextInt();
        } while (numero > 0 );
        System.out.println(Arrays.toString(numeros));
    }
}
