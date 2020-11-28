import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese números para sumar y luego un número negativo para detener la cuenta: ");
        int suma_numeros = 0;
        int numero = sc.nextInt();
        int maximo = numero;
        int minimo = numero;
        while(numero > 0) {
            suma_numeros+= numero;
            if (numero > maximo){
                maximo = numero;
            }
            if (numero < minimo){
                minimo = numero;
            }
            numero = sc.nextInt();
        }
        System.out.println("La suma de todos los números es: " + suma_numeros);
        System.out.println("El máximo número ingresado fue: " + maximo);
        System.out.println("El mínimo número ingresado fue: " + minimo);
    }   
}