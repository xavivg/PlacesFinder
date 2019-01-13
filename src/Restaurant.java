public class Restaurant extends Place {

    private int price;

    public Restaurant() {
    }

    public Restaurant(String address, String name, double rating, boolean open, String type, int price) {
        super(address, name, rating, open, type);
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
