
import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numA, numB;
        System.out.println("Ingrese un número entero: ");
        numA = sc.nextInt();
        System.out.println("Ingrese un otro número entero: ");
        numB = sc.nextInt();
        int resultado = numA + numB;
        System.out.println("La suma es: " + resultado);
        resultado = numA - numB;
        System.out.println("La resta es: " + resultado);
        resultado = numA * numB;
        System.out.println("La multiplicacion es: " + resultado);
        resultado = numA / numB;
        System.out.println("La division es: " + resultado);
    }
}
