package ch8;

public class Dog extends Mammal implements Nameable {
    String name;
    Head head;

    @Override
    public void makeNoise() {
        System.out.println("Bark!");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
