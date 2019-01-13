import com.google.gson.*;

import java.io.*;
import java.util.ArrayList;

public class FileManagement implements ReadFile{

    public int checkExtension(String name){
        try{
            String[] parts = name.split("[.]");

            if (parts[1].equals("json")) return 1;
            else if (parts[1].equals("csv")) return 2;
        }
        catch(ArrayIndexOutOfBoundsException IE){
            System.out.println("No se encontró el archivo o tiene un formato no compatible");
        }

        return 0;
    }

    public ArrayList<Place> readJson(String file) {

        System.out.println("Cargando fichero json...");
        ArrayList<Place> places = new ArrayList<>();

        try{

            FileReader reader = new FileReader("datasets/"+file);

            JsonElement jelement = new JsonParser().parse(reader);

            JsonArray arr = jelement.getAsJsonArray();

            Place p = new Place();

            Place r = new Restaurant();
            for(int i = 0; i < arr.size(); i++ ) {

                JsonObject  jobject = arr.get(i).getAsJsonObject();

                String name = jobject.get("name").getAsString();

                JsonObject openHrs = jobject.get("opening_hours").getAsJsonObject();

                Boolean open = openHrs.get("open_now").getAsBoolean();

                String type = jobject.get("type").getAsString();

                String address = jobject.get("address").getAsString();

                Double rating = jobject.get("rating").getAsDouble();


                if(type.equals("restaurant")){

                    Integer price = jobject.get("price_level").getAsInt();
                    places.add(new Restaurant(address, name, rating, open, type, price));
                }
                else {
                    places.add(new Place(address, name, rating, open, type));
                }
            }
            System.out.println("Fichero JSON cargado correctamente!");
        }
        catch (FileNotFoundException FE){
            System.out.println("No se ha encontrado el archivo");
        }
        catch (IllegalStateException SE){
            System.out.println("Este JSON tiene un formato no compatible");
        }


        return places;
    }

    public ArrayList<Place> readCsv(String file){

        System.out.println("Cargando fichero csv...");
        ArrayList<Place> places = new ArrayList<>();
        try{
            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            br.readLine(); //nos saltamos la primera linea
            String line;

            while ((line = br.readLine()) != null) {

                String[] parts = line.split(",");

                String name = parts[0];
                boolean open_now = Boolean.valueOf(parts[1]);
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
            System.out.println("Fichero csv cargado correctamente!");
        }
        catch (FileNotFoundException FE){
            System.out.println("No se ha encontrado el archivo");
        }
        catch (IOException IOE){
            System.out.println("Se ha encontrado un error analizando el archivo");
        }

        return places;
    }
}
