public class Dog extends Animal {
    String nameOfOwner;
    String favoriteFoodBrand;

    @Override
    public void move() {
        System.out.println("Dog: 1.4 meter is verplaatst.");
    }

    @Override
    public void speak() {
        System.out.println("woooof! wooof!");
    }

    @Override
    public void sleep() {
        System.out.println("heeft acht (8) uur geslapen");

    }

    @Override
    public void eat(String food) {
        System.out.println("Heeft een " + food + " gegeten.");
    }

    public Dog(String name) {
        super(name);
    }
}
