import java.util.Scanner;

public class ejericio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un número entero: ");
        numero = sc.nextInt();
        for (int i = 1; i < (numero+1); i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
