
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numA, numB;
        System.out.println("Ingrese un número entero: ");
        numA = sc.nextInt();
        System.out.println("Ingrese un otro número entero: ");
        numB = sc.nextInt();
        if (numA > numB) {
           System.out.println(numA + " es mayor que " + numB); 
        }else if (numB > numA){
           System.out.println(numA + " es menor que " + numB); 
        }else{
            System.out.println(numA + " es igual que " + numB); 
        }
    }
}
