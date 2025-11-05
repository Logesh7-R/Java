package serialization;

public class SerializeChild extends SerializeParent{
    private double bonus;
    private final static long serialVersionUID = 1L;
    transient int managerID = 1;
    public static int dumy = 1;
    public SerializeChild(String name,int bonus){
        super(name);
        this.bonus = bonus;
        dumy = 11;
        managerID = 12;
        System.out.println("Serialze child constructor called..");
    }
    public double getBonus(){
        return bonus;
    }
}
