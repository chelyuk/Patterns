package FactoryPattern.pizzas;

public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        name = "Pepperoni Pizza";
        dough = "Crust";
        sauce = "Marinara sauce";
        toppings.add("Sliced pepperoni");
        toppings.add("Sliced onion");
        toppings.add("Grated parmesan cheese");
    }
}
