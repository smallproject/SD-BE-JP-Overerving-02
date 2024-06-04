public class Tiger extends Animal {
    int numberOfStripes;

    @Override
    public void move() {
        System.out.println("Tiger: 4 meter is verplaatst.");
    }

    @Override
    public void speak() {
        System.out.println("Grrrrrr!");

    }

    @Override
    public void sleep() {
        System.out.println("Heeft acht (8) uur geslapen");
    }

    @Override
    public void eat(String food) {
        System.out.println("Heeft een " + food + " gegeten.");
    }

    public Tiger(String name) {
        super(name);
    }
}
