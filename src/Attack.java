public class Attack{
    private String element;
    private boolean global;
    private int turns;
    private int slot=0;
    private int damage;
    public Attack(int damage, String element, int magnitude, boolean global, int turns){
        this.element = element;
        this.global = global;
        this.turns = turns;
        this.damage = damage;
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
