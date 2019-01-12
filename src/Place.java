public class Place {

    private String address;
    private String name;
    private double rating;
    private boolean open;
    private String type;

    public Place() {
    }

    public Place(String address, String name, double rating, boolean open, String type) {
        this.address = address;
        this.name = name;
        this.rating = rating;
        this.open = open;
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
