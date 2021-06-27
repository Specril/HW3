public class ZooObserver implements Observer{
    private final String name;
    private String desc;

    /**
     * A builder method for ZooObserver
     * @param name A string containing the name of the observer.
     */
    public ZooObserver(String name){
        this.name=name;
    }

    /**
     * A method that updates the desc field of the observer and displays the current update.
     * @param desc A string that holds the update message.
     */
    @Override
    public void update(String desc){
        this.desc=desc;
        displayUpdate();
    }
    public void displayUpdate(){
        System.out.println("["+name+"] "+desc);
    }
}
