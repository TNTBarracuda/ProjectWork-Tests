public class Enemy extends Being {
    private int aggressionThreshold;
    private int aggression = 0;

    public Enemy(String name, String description, int maxHealth, int agility, int size, int XP, int level, int aggressionThreshold, int awareness){
        this.name = name; this.description = description;
        this.maxHealth = maxHealth;
        this.agility = agility;
        this.size = size;
        this.level = level;
        this.aggressionThreshold = aggressionThreshold;
        this.awareness = awareness;

    }
    public Enemy(String environment, int level){
        this.level = level;
        int Rand = (int)Master.Random(1,100, 0);
        if(environment == "Cave"){

        }
        if(environment == "Crystal Forest"){
            if(Rand > 80){}
            else if(Rand > 60){}
            else if(Rand > 40){}
            else if(Rand >20){}
            else /**Rand <20)*/{}
        }

    }
    public void OptionPhase(){

    }


}
