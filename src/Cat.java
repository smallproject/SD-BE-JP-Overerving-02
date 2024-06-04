public class Cat extends Animal {
    String nameOfOwner;
    String favoriteFoodBrand;
    Boolean binnenKat;

    @Override
    public void move() {
        System.out.println("cat: 1m is verplaatst");
    }

    @Override
    public void speak() {
        System.out.println("Meeooooow!");
    }

    @Override
    public void sleep() {
        System.out.println("Heeft acht (8) uur geslapen.");
    }

    @Override
    public void eat(String food) {
        System.out.println("Heeft een " + food + " gegeten.");
    }

    public Cat(String name) {
        super(name);
    }
}
