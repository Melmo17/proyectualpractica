import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero_decimal = 0;
        System.out.println("Ingrese uno de los siguientes números romanos: I, V, X, L, C, D, M");
        String numero_romano = sc.nextLine();
        switch(numero_romano){
            case "I":
                numero_decimal = 1;
            break;
            case "V":
                numero_decimal = 5;
            break;
            case "X":
                numero_decimal = 10;
            break;
            case "L":
                numero_decimal = 50;
            break;
            case "C":
                numero_decimal = 100;
            break;
            case "D":
                numero_decimal = 500000;
            break;
            case "M":
                numero_decimal = 1000000;
            break;            
        }
        System.out.println(numero_romano + " en números romanos es igual a " + numero_decimal + " en número decimal.");
    }
}
