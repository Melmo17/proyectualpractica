import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese números para sumar y luego un número negativo para detener la cuenta: ");
        int suma_numeros = 0;
        int numero = sc.nextInt();
        while(numero > 0) {
            suma_numeros+= numero;
            numero = sc.nextInt();
        }
        System.out.println("La suma de todos los números es: " + suma_numeros);
    }   
}
