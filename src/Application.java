import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    ArrayList<Place> places;
    Boolean fileLoaded = false;

    /**
     * Funció que inicia el programa.
     */
    protected void init() {

        System.out.println("Welcome to my app!");

        int option = 0;

        while (option != 3) {
            option = Menu.showMenu();
            checkOption(option);
        }


    }

    /**
     * @param option
     * Envia a la funció corresponent segons la opció rebuda.Menú principal
     *
     */
    protected void checkOption(int option) {
        switch (option){
            case 1:
                System.out.println("Opcion 1, Cargar fichero");
                places = loadFile();
                if(places.isEmpty()){

                    fileLoaded = false;
                }
                else{
                    fileLoaded = true;
                }
                break;

            case 2:
                if(fileLoaded){
                    System.out.println("Opcion 2, Estadísticas");
                    checkStatsOption(Menu.statsMenu());
                }
                else{
                    System.out.println("No se pueden mostrar estadisticas sin cargar primero el archivo");
                }
                break;
        }
    }

    /**
     * @param option
     * Envia a la funció corresponent segons la opció rebuda.Menú Estadisticas
     */
    protected void checkStatsOption(int option) {

        switch (option) {

            case 1:
                Stats.showPlacesAlphabetically(places);
                break;
            case 2:
                Stats.showBestPlacesBetterFirst(places);
                break;
            case 3:
                Stats.typeMorePlacesOpen(places);
                break;
            case 4:
                Stats.showBestPlaceAndTheWorst(places);
                break;
            case 5:
                Stats.showRestaurantAverageRating(places);
                break;
            case 6:
                Stats.restaurantsPrice(places);
                break;
        }
    }

    /**
     * @return
     * Crida a la funció per saber quina extensió té l'arxiu. Segons el integer que retorna es crida una funció o una altre.
     * Retorna l'array de Places.
     */
    protected ArrayList<Place> loadFile() {

        ArrayList<Place> places = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el nombre del fichero: ");
        String file = scanner.nextLine();
        FileManagement fm = new FileManagement();

        int extension = fm.checkExtension(file);

        if (extension == 1) places = fm.readJson(file);
        else if (extension == 2) places = fm.readCsv(file);

        return places;
    }
}