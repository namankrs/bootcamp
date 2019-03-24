package pizzaassignment;

public enum Topping {
    VEGETABLE(20D),
    CHICKEN(30D),
    MOZZARELLA(10D),
    TOMATO_SAUCE(5D),
    EXTRA_CHEESE(25D),
    JALAPENO(40D);

    private final Double price;

    Topping(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return this.price;
    }

}
