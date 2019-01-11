import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileManagement {

    public static void checkExtension(String name) throws IOException{

        String[] parts = name.split("[.]");

        if (parts[1].equals("json")) readJson(name);
        else if (parts[1].equals("csv")) readCsv(name);
        else System.out.println("Error! Extensión no válida");
    }

    public static ArrayList<Place> readJson(String fichero) {
        ArrayList<Place> places = new ArrayList<>();
        return places;
    }

    public static ArrayList<Place> readCsv(String file) throws IOException {
        /*FileReader fileReader = new FileReader(fichero);
        BufferedReader br = new BufferedReader(fileReader);
        String line;
        ArrayList<Alumno> alumnos = new ArrayList<>();

        while ((line = br.readLine()) != null) {

            String[] parts = line.split(",");

            int id = Integer.parseInt(parts[0]);
            String degree = parts[1];
            String course = parts[2];
            double mark = Double.parseDouble(parts[3]);

            Alumno a = new Alumno(id, degree, course, mark);
            alumnos.add(a);
        }

        return alumnos;*/
        ArrayList<Place> places = new ArrayList<>();
        return places;
    }
}
