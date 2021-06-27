import java.util.ArrayList;

public class Zoo {
    private int happiness;
    private int hunger;
    private ArrayList<Animal> animals;
    private ArrayList<ZooObserver> observers;
    private static Zoo instance = null;

    private Zoo() {
        this.happiness = 2;
        this.hunger = 3;
        this.animals = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    public static Zoo getInstance() {
        if (instance == null) {
            System.out.println("Creating zoo...");
            instance = new Zoo();
        } else {
            System.out.println("The zoo already exists...");
        }

        return instance;
    }

    public void addObserver(ZooObserver zooObserver) {
        observers.add(zooObserver);
    }

    public void removeObserver(ZooObserver zooObserver) {
        observers.remove(zooObserver);
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
        updateObserversAdd(animal.getAnimal());
    }

    public void feedAnimals() {
        if (hunger > 1) {
            hunger--;
        }
        for (Animal animal : animals) {
            animal.eat();
        }
        updateObserversEat();
    }

    public void watchAnimals() {
        if (hunger < 5) {
            hunger++;
        }
        if (happiness < 5) {
            happiness++;
        }
        for (Animal animal : animals) {
            animal.show();
        }
        updateObserversShow();
    }

    private void updateObserversAdd(String type) {
        System.out.println("Notifying observers:");
        for (ZooObserver zooObserver : observers) {
            zooObserver.update(type + " has been added to the zoo!");
        }
    }

    private void updateObserversEat() {
        System.out.println("Notifying observers:");
        for (ZooObserver zooObserver : observers) {
            zooObserver.update("The animals are being fed");
        }
    }

    private void updateObserversShow() {
        System.out.println("Notifying observers:");
        for (ZooObserver zooObserver : observers) {
            zooObserver.update("The animals are being watched");
        }
    }

    public void showAnimalsInfo() {
        System.out.println("The zoo contains total of " + animals.size() + " animals:");
        int zebras = 0;
        int unicorns = 0;
        int monkeys = 0;
        for (Animal animal : animals) {
            switch (animal.getAnimal()) {
                case "Zebra":
                    zebras++;
                    break;
                case "Unicorn":
                    unicorns++;
                    break;
                case "Monkey":
                    monkeys++;
                    break;
            }
        }
        System.out.println("- Zebra: " + zebras);
        System.out.println("- Unicorn: " + unicorns);
        System.out.println("- Monkey: " + monkeys);
        System.out.println("Happiness level: " + happiness);
        if (happiness < 3) {
            System.out.println("The animals are not happy, you should watch them...");
        } else {
            System.out.println("The animals are very happy, keep working hard...");
        }
        System.out.println("Hunger level: " + hunger);
        if (hunger > 3) {
            System.out.println("The animals are hungry, you should feed them...");
        }
    }
}
