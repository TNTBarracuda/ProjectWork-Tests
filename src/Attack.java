public class Attack{
    private String element;
    private boolean global;
    private int turns;
    private int slot = 0;
    private int damage;
    private int accuracy;
    private int statusChance;
    public Attack(int damage, String element, int magnitude, boolean global, int turns, int accuracy, int statusChance){
        this.element = element;
        this.global = global;
        this.turns = turns;
        this.damage = damage;
        this.accuracy = accuracy;
        this.statusChance = statusChance;
    }
    public void setSlot(int slot){
        this.slot = slot;
    }
    public int getSlot(){
        return this.slot;
    }
    public String getElement(){
        return this.element;
    }
    public int getTurns(){
        return this.turns;
    }
    public void nextTurnUpdate(){
        turns--;
    }
    public int getDamage(){
        return this.damage;
    }

}
