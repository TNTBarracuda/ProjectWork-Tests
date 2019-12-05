public abstract class Weapon extends Equipment{
    private int rarity; int damage; String type;
    private boolean inRecess = false; boolean global;
    private String statusEffect; private int statusStrength;
    int accuracy; int tracking; double critMultiplier; int critChance;
    int statusChance;
    //TODO - IMPORT WEAPON GENERATION CODE
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
        }else if(Rand == 3){
            statusEffect = "Heat";
            statusStrength = (int)Master.Random(1, 5, 0);
            global = true;
        }else if(Rand == 4){
            statusEffect = "Cold";
            statusStrength = (int)Master.Random(1, 5, 0);
            global = false;
        }else if(Rand == 5){
            statusEffect = "Corrosion";
            statusStrength = (int)Master.Random(1, 5, 0);
            global = false;
        }else if(Rand == 6){
            statusEffect = "Bleeding";
            statusStrength = (int)Master.Random(1, 5, 0);
            global = true;
        } else if(Rand == 7){
            statusEffect = "Void";
            statusStrength = (int)Master.Random(1, 3, 0);
            global = true;
        }else if(Rand == 8){
            statusEffect = "Solar";
            statusStrength = (int)Master.Random(1, 3, 0);
            global = false;
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
    public void EVADE(){

    }
    public void GUARD(){

    }
    public abstract void BLITZ(Enemy target);




}
