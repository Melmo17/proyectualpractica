
import java.util.Scanner;


public class ejercicio7 {
    public static void main(String[] args) {
        int i = 0;
        int cantPares = 0;
        do {
            if (i % 2 == 0){
              System.out.println(i);
              cantPares++;
            }
            i++;
            
        } while (cantPares < 100);
        
    }
}
