public class Zebra extends Animal{
    @Override
    public void eat(){
        System.out.println("The zebra is eating grass...");
    }
    @Override
    public void show(){
        System.out.println("The zebra is running...");
    }
    @Override
    public String getAnimal(){
        return "Zebra";
    }
}
