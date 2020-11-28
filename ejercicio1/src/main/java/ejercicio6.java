import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mes, anio;
        System.out.println("1.Enero 2.Febrero 3.Marzo 4.Abril 5.Mayo 6.Junio 7.Julio 8.Agosto 9.Septiembre 10.Octubre 11.Noviembre 12.Diciembre");
        System.out.println("Ingrese un número correspondiente a un mes: ");
        mes = sc.nextInt();
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("El mes ingresado tiene 31 días.");
            break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("El mes ingresado tiene 30 días.");
            break;
            case 2:
                System.out.println("El mes ingresado fue febrero. Ingrese el año: ");
                anio = sc.nextInt();
                if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))){
                    System.out.println("El año es bisiesto, por lo tanto Febrero tiene 29 días.");
                }else{
                    System.out.println("El año no es bisiesto, por lo tanto Febrero tiene 28 días.");
                }
            break;
        }
        
    }
}
