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
    protected Place loadFile(){
        System.out.println("Cargando Fichero...");
        Place p = new Place();
        return p;
    }
}