public class Restaurant extends Place {

    private int price;

    public Restaurant() {
    }

    public Restaurant(String address, String name, int rating, boolean open, int price) {
        super(address, name, rating, open);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
