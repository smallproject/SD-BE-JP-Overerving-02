public class Wolf extends Animal {
    @Override
    public void move() {
        System.out.println("Wolf: 10 meter is verplaatst.");
    }

    @Override
    public void speak() {
        System.out.println("howling");
    }

    @Override
    public void sleep() {
        System.out.println("Heeft acht (8) geslapen");
    }

    @Override
    public void eat(String food) {
        System.out.println("Heeft een " + food + " gegeten.");
    }

    String nameOfPack;

    public Wolf(String name) {
        super(name);
    }
}
