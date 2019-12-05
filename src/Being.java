public abstract class Being extends Entity{
    String name; String description;
    int maxHealth; private int health;
    int maxArmor; private int armor;
    int XP; int level;
    int agility; int size;
    int awareness;
    Attack[] effects;
    String state;


//    public Being(String name, String description, int maxHealth, int agility, int size, int XP, int level){
//        this.maxHealth = maxHealth;
//        this.agility = agility;
//        this.size = size;
//        this.health = maxHealth;
//        this.effects = null;
//        this.state = null;
//        this.level = level;
//    }
//    public Being(){
//
//    }
    public int getHealth(){
        return health;
    }
    public int getArmor(){
        return armor;
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
    public void setName(String newName){}//TODO - finish method
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
    public Attack[] getLocalProcs(){
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

        return effects;//final return statement
    }

}
