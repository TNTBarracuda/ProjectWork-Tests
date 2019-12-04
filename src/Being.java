public class Being extends Entity{
    private int maxHealth;
    private int health;
    private int agility;
    private int size;
    private Attack[] effects;
    private String state;
    private int level;

    public Being(String name, String description, int maxHealth, int agility, int size, int XP, int level){
        super(name, description);
        this.maxHealth = maxHealth;
        this.agility = agility;
        this.size = size;
        this.health = maxHealth;
        this.effects = null;
        this.state = null;
        this.level = level;
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
    public int getLevel(){
        return this.level;
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
    public void evade(){ }
    public void getHit(Attack hit){
        int items = effects.length;
        Attack[] temp = effects;
        effects = new Attack[temp.length+1];
        for(int i=0; i<temp.length; i++){
            effects[i] = temp[i];
        }
        effects[temp.length] = hit;
        health-=hit.getDamage();
        System.out.println(this.getName()+": "+this.getHealth());
    }
    public void beginTurn(){
    }
    public int[] getGlobalProcs(){

        return new int[5];
    }
    public int[] getLocalProcs(){
        for(int i=0; i<effects.length; i++){
            if(effects[i].getTurns() <= 0){
                effects[i] = null;
            }
            if(effects[i].getElement() == "Heat"){
                health-=(9);//TODO - update
            }
        }
        int size = 0;
        for (Attack a:effects) {
            size++;
        }
        Attack[]temp = new Attack[size];
        for(int i=0; i<size; i++){
            effects[i]=effects[i];//TODO - complete & update
        }
    }

}
