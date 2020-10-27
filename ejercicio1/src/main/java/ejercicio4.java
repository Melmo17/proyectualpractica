
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota1, nota2, nota3, totalNotas;
        float promedio;
        System.out.println("Ingrese la primer nota: ");
        nota1 = sc.nextInt();
        System.out.println("Ingrese la segunda nota: ");
        nota2 = sc.nextInt();
        System.out.println("Ingrese la tercer nota: ");
        nota3 = sc.nextInt();
        totalNotas = nota1 + nota2 + nota3;
        promedio = totalNotas / 3;
        if ((nota1 >= 4) && (nota2 >= 4) && (nota3 >= 4)){
            System.out.println("El promedio del alumnx es:  " + promedio);
            System.out.println("Está aprobado :)"); 
        }else{
            System.out.println("El promedio del alumnx es:  " + promedio);
            System.out.println("No está aprobado :(");    
        }
    }
    
}
