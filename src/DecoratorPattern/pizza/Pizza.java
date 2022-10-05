package DecoratorPattern.pizza;

public abstract class Pizza {

    String description = "Just Pizza";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
