public class Lion extends Animal {

    @Override
    public void move() {
        System.out.println("Lion: 2 meter is verplaatst.");
    }

    @Override
    public void speak() {
        System.out.println("Rawrrrrrr");
    }

    @Override
    public void sleep() {
        System.out.println("Slaap acht (8) uur");
    }

    @Override
    public void eat(String food) {
        System.out.println("Heeft " + food + " gegeten");
    }

    public Lion(String name) {
        super(name);
    }
}
