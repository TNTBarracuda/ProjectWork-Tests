public class Being extends Entity{
    private int maxHealth;
    private int health;
    private int agility;
    private int size;
    private String[] effects;
    private String state;

    public Being(String name, String description, int maxHealth, int agility, int size, int XP, int level){
        super(name, description);
        this.maxHealth = maxHealth;
        this.agility = agility;
        this.size = size;
        this.health = maxHealth;
        this.effects = null;
        this.state = null;
    }
    public int getHealth(){
        return health;
    }
    public int getMaxHealth(){
        return maxHealth;
    }
    public void setMaxHealth(int newMax){
        maxHealth = newMax;
    }
    public void heal(int healAmount, boolean fixedHealing){
        if(fixedHealing){
            health+=healAmount;
            if(health>=maxHealth){
                health=maxHealth;
            }
        }else{
            health+=((maxHealth-health)/100)*(healAmount);
        }
    }
    public void evade(){

    }

}
