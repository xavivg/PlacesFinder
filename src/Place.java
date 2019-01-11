public class Place {

    private String address;
    private String name;
    private int rating;
    private boolean open;

    public Place() {
    }

    public Place(String address, String name, int rating, boolean open) {
        this.address = address;
        this.name = name;
        this.rating = rating;
        this.open = open;
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

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }
}
