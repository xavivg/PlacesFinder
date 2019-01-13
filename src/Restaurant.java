public class Restaurant extends Place {

    protected int price;

    protected Restaurant() {
    }

    protected Restaurant(String address, String name, double rating, boolean open, String type, int price) {
        super(address, name, rating, open, type);
        this.price = price;
    }

    @Override
    protected int getPrice() {
        return price;
    }

    protected void setPrice(int price) {
        this.price = price;
    }
}
