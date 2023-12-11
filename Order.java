import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderItem> orders = new ArrayList<OrderItem>();
    Scanner sc = new Scanner(System.in);
    String[] options = { "1 - Update price", "2 - Add One More" };

    // Order business logic methods
    public void addItem(OrderItem item){
        for(OrderItem checkedItem : orders){
            if(item.equals(checkedItem)){
                System.out.println("Item is already in the order");
                System.out.println("Select an option:");
                for(String option : options){
                    System.out.println(option);
                }

            }
        }
    }

    // OrderItem class
class OrderItem {
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean equals(OrderItem item){
        if(this.name == item.name){
            return true;
        }
    }
}
}