public abstract class Weapon extends Equipment{
    private int rarity; int damage; String type;
    private boolean inRecess = false; boolean global;
    private String statusEffect; private int statusStrength;
    int accuracy; int tracking; double critMultiplier; int critChance;
    int statusChance;
    //TODO - IMPORT WEAPON GENERATION CODE
    public Weapon(int level){
        int Rand = (int)Master.Random(1, 25, 0);
        if(Rand>90){ rarity = 4; }
        else if(Rand>70){ rarity = 3; }
        else if(Rand>46){ rarity = 2; }
        else{ rarity = 1; }

        if(statusEffect == "Heat"){
            statusStrength = (int)Master.Random(1, 5, 0);
            global = true;
        }else if(statusEffect == "Cold"){
            statusStrength = (int)Master.Random(1, 5, 0);
            global = false;
        }else if(statusEffect == "Corrosion"){
            statusStrength = (int)Master.Random(1, 5, 0);
            global = false;
        }else if(statusEffect == "Bleed"){
            statusStrength = (int)Master.Random(1, 5, 0);
            global = true;
        } else if(statusEffect == "Void"){
            statusStrength = (int)Master.Random(1, 3, 0);
            global = true;
        }else if(statusEffect == "Solar"){
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
