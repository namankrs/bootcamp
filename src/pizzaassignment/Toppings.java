package pizzaassignment;

import java.util.ArrayList;
import java.util.List;

public class Toppings {
    private List<Topping> toppings;

    Toppings() {
        this.toppings = new ArrayList<>();
    }

    void addTopping(Topping topping){
        this.toppings.add(topping);
    }

    Double calculatePrice(){
        Double totalPrice = 0D;
        for (Topping topping : this.toppings) {
            totalPrice += topping.getPrice();
        }
        return totalPrice;
    }

    String getDescription(){
        String delimiter = " ";
        String description = "Toppings : ";
        for (Topping topping : this.toppings) {
            description += topping;
            description += delimiter;
        }
        return description;
    }
}
