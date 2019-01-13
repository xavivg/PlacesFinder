import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    /**
     * @return
     * Mostra el menú i crida a la funció de demanar opció. El numero d'opcions es 3.
     * */
    protected static int showMenu() {

        System.out.println("-- Place Finder --");
        System.out.println("1. Cargar fichero");
        System.out.println("2. Estadisticas");
        System.out.println("3. Salir");

        return scanOption(3);
    }

    /**
     * @return
     * Mostra el menú Estaditiques i crida a la funció de demanar opció. El numero d'opcions màximes es 6.
     */
    protected static int statsMenu() {

        System.out.println("-- Estadísticas --");
        System.out.println("1. Mostrar locales alfabeticamente");
        System.out.println("2. Mejor valorados");
        System.out.println("3. Tipo con más locales abiertos");
        System.out.println("4. Mejor y peor valorado");
        System.out.println("5. Valoración media restaurantes");
        System.out.println("6. Precio restaurantes");

        return scanOption(6);
    }

    /**
     * @param max Es refereix al numero màxim d'opcions del menú
     * @return Retorna l'opció escrita per l'usuari
     */
    private static int scanOption(int max) {

        Scanner scanner = new Scanner(System.in);
        int option = 0;
        Boolean valid = false;

        while (!valid) {
            try {
                System.out.println("Introduce la opción");
                option = scanner.nextInt();
                if (option > 0 && option <= max) {
                    valid = true;
                    return option;
                } else {
                    System.out.println("Este numero no es una opción");
                }
            } catch(InputMismatchException e){
                System.out.println("No has introducdo un numero");
                scanner.next();
            }
        }

        return option;
    }
}
