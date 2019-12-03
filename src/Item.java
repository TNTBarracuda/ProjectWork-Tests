public class Item extends Equipment{
    private int duration;
    private int healAmount;
    private int agility;
    private boolean fixedHealing;

    public Item(String name, String description, int duration, int agility, int healAmount, boolean fixedHealing){
        super(name, description);
        this.duration = duration;
        this.healAmount = healAmount;
        this.agility = agility;
        this.fixedHealing = fixedHealing;
    }
    public void USE(){
        if(fixedHealing){

        }else{

        }
    }

}
