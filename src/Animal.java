public abstract class Animal {
    String name;
    String namevanhethok;
    String geslacht;
    String lastFed;
    String countOfOrigin;
    int numberOfChildren;


    public abstract void move();

    public abstract void speak();

    public abstract void sleep();

    public abstract void eat(String food);


    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getGeslacht() {
        return geslacht;
    }

    public int getNumberOfChildren() {
        return numberOfChildren;
    }

    public String getCountOfOrigin() {
        return countOfOrigin;
    }

    public String getLastFed() {
        return lastFed;
    }

    public String getNamevanhethok() {
        return namevanhethok;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfChildren(int numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }

    public void setCountOfOrigin(String countOfOrigin) {
        this.countOfOrigin = countOfOrigin;
    }

    public void setLastFed(String lastFed) {
        this.lastFed = lastFed;
    }

    public void setGeslacht(String geslacht) {
        this.geslacht = geslacht;
    }

    public void setNamevanhethok(String namevanhethok) {
        this.namevanhethok = namevanhethok;
    }
}
