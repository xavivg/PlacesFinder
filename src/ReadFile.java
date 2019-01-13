import java.io.IOException;
import java.util.ArrayList;

public interface ReadFile {

    int checkExtension(String name) throws IOException;

    ArrayList<Place> readJson(String file);

    ArrayList<Place> readCsv(String file) throws IOException;

}
