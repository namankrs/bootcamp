package pizzaassignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToppingsTest {
    @Test
    void calculatePriceShouldReturnTheTotalPriceOfAllToppings() {
        Toppings toppings = new Toppings();
        toppings.addTopping(Topping.VEGETABLE);
        toppings.addTopping(Topping.CHICKEN);
        Double actual = toppings.calculatePrice();
        Double expected = 50D;
        assertEquals(expected, actual);
    }

//    @Test
//    void getDescriptionShouldReturnTheNameOfAllToppingsSeperatedBySpace() {
//        Toppings toppings = new Toppings();
//        toppings.addTopping(Topping.VEGETABLE);
//        toppings.addTopping(Topping.CHICKEN);
//        assertEquals();
//    }
}