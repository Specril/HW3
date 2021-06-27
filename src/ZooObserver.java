public class ZooObserver implements Observer{
    private String name;
    private String desc;
    private Zoo zoo;
    public ZooObserver(String name){
        this.name=name;
        this.zoo=null;
    }
    @Override
    public void update(String desc){
        this.desc=desc;
        displayUpdate();
    }
    @Override
    public void subscribe(){
        this.zoo.addObserver(this);
    }
    @Override
    public void unsubscribe(){
        this.zoo.removeObserver(this);
    }
    public void displayUpdate(){
        System.out.println("["+name+"] "+desc);
    }
}
