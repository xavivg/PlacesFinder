import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    protected int showMenu() {
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        Boolean valid = false;
        System.out.println("-- Place Finder --");
        System.out.println("1. Cargar fichero");
        System.out.println("2. Estadisticas");
        System.out.println("3. Salir");
        while (!valid) {
            try {
                System.out.println("Introduce la opción");
                option = scanner.nextInt();
                if(option >0 && option <=3){
                    valid = true;
                    return option;
                }
                else{
                    System.out.println("Este numero no es una opción");
                }
            }
            catch(InputMismatchException e){
                System.out.println("No has introducdo un numero");
                scanner.next();
            }
        }
        return option;
    }
}
