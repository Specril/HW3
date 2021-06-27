public class Monkey extends Animal{
    @Override
    public void eat(){
        System.out.println("The monkey is eating a banana...");
    }
    @Override
    public void show(){
        System.out.println("The monkey is hanging on trees...");
    }
    @Override
    public String getAnimal(){
        return "Monkey";
    }
}
