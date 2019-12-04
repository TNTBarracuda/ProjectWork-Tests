public class Enemy extends Being {
    private int maxHealth;
    private int agility;
    private int size;
    private int level;
    private int aggressionThreshold;
    private int aggression = 0;
    private int perception;

    public Enemy(String name, String description, int maxHealth, int agility, int size, int XP, int level, int aggressionThreshold, int perception){
        super(name, description, maxHealth, agility, size, XP, level);
        this.maxHealth = maxHealth;
        this.agility = agility;
        this.size = size;
        this.level = level;
        this.aggressionThreshold = aggressionThreshold;
        this.perception = perception;

    }
    public void OptionPhase(){

    }


}
