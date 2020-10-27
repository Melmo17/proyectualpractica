public class ejercicio8 {
    public static void main(String[] args) {
        int i = 0;
        int cantPares = 0;
        int multiplosDeCuatro = 0;
        do {
            if (i % 2 == 0){
              System.out.println(i);
              cantPares++;
              if (i % 4 == 0){
                  multiplosDeCuatro++;
              }
            }
            i++;
            
        } while (cantPares < 100);
        System.out.println("La cantidad de múltiplos de 4 fue: " + multiplosDeCuatro);
        
    }
}
