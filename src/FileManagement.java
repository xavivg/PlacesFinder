import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileManagement {

    public static int checkExtension(String name) throws IOException {

        String[] parts = name.split("[.]");

        if (parts[1].equals("json")) return 1;
        else if (parts[1].equals("csv")) return 2;

        return 0;
    }

    public static ArrayList<Place> readJson(String file) {
        ArrayList<Place> places = new ArrayList<>();
        return places;
    }

    public static ArrayList<Place> readCsv(String file) throws IOException {

        System.out.println("Cargando fichero json...");

        FileReader fileReader = new FileReader(file);
        BufferedReader br = new BufferedReader(fileReader);
        br.readLine(); //nos saltamos la primera linea
        String line;
        ArrayList<Place> places = new ArrayList<>();

        while ((line = br.readLine()) != null) {

            String[] parts = line.split(",");

            String name = parts[0];
            boolean open_now = Boolean.getBoolean(parts[1]);
            String type = parts[2];
            String address = parts[3];
            double rating = Double.parseDouble(parts[4]);

            if (type.equals("restaurant")) {
                int price = Integer.parseInt(parts[5]);
                Restaurant r = new Restaurant(address, name, rating, open_now, type, price);
                places.add(r);
            } else {
                Place p = new Place(address, name, rating, open_now, type);
                places.add(p);
            }
        }

        return places;
    }
}
