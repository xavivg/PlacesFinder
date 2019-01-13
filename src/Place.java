public class Place {

    private String address;
    private String name;
    private double rating;
    private boolean open;
    private String type;

    protected Place() {
    }

    protected Place(String address, String name, double rating, boolean open, String type) {
        this.address = address;
        this.name = name;
        this.rating = rating;
        this.open = open;
        this.type = type;
    }

    protected String getAddress() {
        return address;
    }

    protected void setAddress(String address) {
        this.address = address;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected double getRating() {
        return rating;
    }

    protected void setRating(double rating) {
        this.rating = rating;
    }

    protected boolean isOpen() {
        return open;
    }

    protected void setOpen(boolean open) {
        this.open = open;
    }

    protected String getType() {
        return type;
    }

    protected void setType(String type) {
        this.type = type;
    }

    protected int getPrice() {
        return 0;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.name +
                ", Dirección: " + this.address +
                ", Valoración: " + this.rating +
                ", Abierto: " + this.open +
                ", Tipo: " + this.type;
    }
}
