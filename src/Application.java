import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    protected void init() {
        try {
            System.out.println("Welcome to my app!");

            Menu menu = new Menu();

            checkoption(menu.showMenu());

        }
        catch (Exception e) {
            System.out.println("Algo salió mal...");
        }
    }
    protected void checkoption(int option) {
        switch (option){
            case 1:
                System.out.println("Opcion 1, Cargar fichero");
                loadFile();
                break;
        }
    }
    protected ArrayList<Place> loadFile(){

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