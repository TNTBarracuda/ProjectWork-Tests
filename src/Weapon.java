public abstract class Weapon extends Equipment{
    private int rarity; int damage; String type;
    private boolean inRecess = false; boolean global; private int turns;
    private String statusEffect; private int statusStrength;
    int accuracy; int tracking; double critMultiplier; int critChance;
    int statusChance;
    //
    public void determineStats() {
        int Rand = (int) Master.Random(1, 25, 0);
        if (Rand > 90) {
            rarity = 4;
        } else if (Rand > 70) {
            rarity = 3;
        } else if (Rand > 46) {
            rarity = 2;
        } else {
            rarity = 1;
        }
        Rand = (int) Master.Random(0, 8, 0);
        if(Rand <= 2){
            statusEffect = "null";
            statusStrength = 0;
            global = true;
            turns = 0;
        }else if(Rand == 3){
            statusEffect = "Heat";
            statusStrength = (int)Master.Random(1, 5, 0);
            global = true;
            turns = statusStrength;
        }else if(Rand == 4){
            statusEffect = "Cold";
            statusStrength = (int)Master.Random(1, 5, 0);
            global = false;
            turns = (int)((statusStrength/2)+0.5);
        }else if(Rand == 5){
            statusEffect = "Corrosion";
            statusStrength = (int)Master.Random(1, 5, 0);
            global = false;
            turns = 1;
        }else if(Rand == 6){
            statusEffect = "Bleeding";
            statusStrength = (int)Master.Random(1, 5, 0);
            global = true;
            turns = (int)((statusStrength/2)+0.5);
        } else if(Rand == 7){
            statusEffect = "Void";
            statusStrength = (int)Master.Random(1, 3, 0);
            global = true;
            turns = statusStrength;
        }else if(Rand == 8){
            statusEffect = "Solar";
            statusStrength = (int)Master.Random(1, 3, 0);
            global = false;
            turns = (int)((statusStrength/2)+0.5);
        }

    }
    public String getStatusEffect(){
        return statusEffect;
    }
    public int getStatusStrength(){
        return statusStrength;
    }
    public int getRarity(){
        return rarity;
    }
    public int getTurns(){
        return turns;
    }
    public void EVADE(){

    }
    public void GUARD(){

    }
    public abstract void BLITZ(Enemy target);


}
