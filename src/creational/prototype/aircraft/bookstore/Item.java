package creational.prototype.aircraft.bookstore;
// prototypw
public abstract class Item implements Cloneable {
    private String title;
    private double price;

    public Item clone() {
        Item clonedItem = null;
        try {
            // use default object clone.
            clonedItem = (Item) super.clone();
            // specialised clone
            clonedItem.setPrice(price);
            clonedItem.setTitle(title);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        } // catch
        return clonedItem;
    }

    public void setTitle(String title2) {
        this.title=title2;

    }

    public void setPrice(double price2) {
        this.price=price2;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Title="+title+" price="+price;
    }
}
