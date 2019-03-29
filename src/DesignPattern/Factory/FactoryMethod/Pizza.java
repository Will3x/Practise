package DesignPattern.Factory.FactoryMethod;

public abstract class Pizza {

    private String name;
    private String dough;
    private String sauce;
    private String topping;

    Pizza(String name, String dough, String sauce, String topping) {
        this.name = name;
        this.dough = dough;
        this.sauce = sauce;
        this.topping = topping;

        prepare();
    }

    private void prepare() {
        System.out.println("Preparing " + name + "...");
        System.out.println("Adding " + topping + "...");
    }

    void bake() {
        System.out.println("Baking the pizza in a hot oven...");
    }

    void cut() {
        System.out.println("Cutting the pizza...");
    }

    void box() {
        System.out.println("Placing the pizza in a box...");
    }

    public String getName() {
        return name;
    }

    public String getDough() {
        return dough;
    }

    public String getSauce() {
        return sauce;
    }

    public String getTopping() {
        return topping;
    }
}
