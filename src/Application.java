import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    ArrayList<Place> places;

    protected void init() {

        try {

            System.out.println("Welcome to my app!");

            int option = 0;

            while (option != 3) {
                option = Menu.showMenu();
                checkoption(option);
            }

        } catch (Exception e) {
            System.out.println("Algo salió mal...");
        }
    }

    protected void checkoption(int option) {
        switch (option){
            case 1:
                System.out.println("Opcion 1, Cargar fichero");
                places = loadFile();
                break;

            case 2:
                System.out.println("Opcion 2, Estadísticas");
                checkStatsOption(Menu.statsMenu());

        }
    }

    protected void checkStatsOption(int option) {

        switch (option) {

            case 1:
                Stats.showPlacesAlphabetically(places);

            case 3:
                Stats.typeMorePlacesOpen(places);
        }
    }

    protected ArrayList<Place> loadFile() {

        ArrayList<Place> places = new ArrayList<>();

        try {

            System.out.println("Introduce el nombre del fichero: ");
            Scanner scanner = new Scanner(System.in);
            String file = scanner.nextLine();

            int extension = FileManagement.checkExtension(file);

            if (extension == 1) places = FileManagement.readJson(file);
            else if (extension == 2) places = FileManagement.readCsv(file);
            else System.out.println("Error! Extensión no válida.");

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        return places;
    }
}