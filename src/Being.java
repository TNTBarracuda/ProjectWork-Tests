public class Being extends Entity{
    private int maxHealth;
    private int health;

    public Being(String name, String description, int maxHealth){
        super(name, description);
        this.maxHealth = maxHealth;
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

}
