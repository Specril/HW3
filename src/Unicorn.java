public class Unicorn extends Animal {
    @Override
    public void eat() {
        System.out.println("The unicorn is eating rainbow cakes...");
    }

    @Override
    public void show() {
        System.out.println("The unicorn is flying...");
    }

    @Override
    public String getAnimal() {
        return "Unicorn";
    }
}
