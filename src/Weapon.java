public class Weapon extends Equipment{
    private int damage; private int level; private int rarity;
    private boolean inRecess = false; private boolean global;
    private double critMult = 0.0;  private int critChance;
    private int accuracy;   private int tracking;
    private int attacks;
    private String statusEffect; private int statusChance;
    private int statusStrength; private int statusDuration;
    //TODO - IMPORT WEAPON GENERATION CODE
    public Weapon(String name, String description, int level){
        super(name, description);
        int Rand = (int)Master.Random(1, 25, 0);
        if(Rand>92){ rarity = 4; }
        else if(Rand>80){ rarity = 3; }
        else if(Rand>47){ rarity = 2; }
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
    public void EVADE(){

    }
    public void GUARD(){

    }
    public void BLITZ(Enemy target){
        target.getHit(new Attack(damage, statusEffect, statusStrength, global, 2));
    }



}
