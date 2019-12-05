public class Gun extends Weapon{
    private int rarity; private String type;
    public Gun(int level){
        super.determineStats();
        rarity = super.getRarity();
        String[] gunType = {"Repeater", "Carbine", "Concussion Gun", "Blast Cannon", "Fusion Rifle"};
        type=gunType[(int)Master.Random(0,4,0)];
        if(type == "Repeater"){//COMPLETE//TODO - FINISH STAT DELEGATION
            super.damage = (int)Master.getLEVEL_SCALING((int)Master.delegateStats(32, 64, 0, rarity), level);
            super.accuracy = (int)Master.delegateStats(65, 95, 0, rarity);
            super.tracking = (int)Master.delegateStats(40,70, 0, rarity);
            super.critChance = (int)Master.delegateStats(15, 20, 0, rarity);
            super.critMultiplier = Master.delegateStats(1.2, 1.7, 1, rarity);
            super.statusChance = (int)Master.delegateStats(25, 45, 0, rarity);
        }else if(type == "Carbine"){//COMPLETE
            super.damage = (int)Master.getLEVEL_SCALING((int)Master.delegateStats(24, 48, 0, rarity), level);
            super.accuracy = (int)Master.delegateStats(60, 90, 0, rarity);
            super.tracking = (int)Master.delegateStats(60,90, 0, rarity);
            super.critChance = (int)Master.delegateStats(10, 15, 0, rarity);
            super.critMultiplier = Master.delegateStats(1.3, 1.6, 1, rarity);
            super.statusChance = (int)Master.delegateStats(20, 35, 0, rarity);
        }else if(type == "Concussion Gun"){//COMPLETE
            super.damage = (int)Master.getLEVEL_SCALING((int)Master.delegateStats(60, 120, 0, rarity), level);
            super.accuracy = (int)Master.delegateStats(65, 95, 0, rarity);
            super.tracking = (int)Master.delegateStats(80,100, 0, rarity);
            super.critChance = (int)Master.delegateStats(15, 20, 0, rarity);
            super.critMultiplier = Master.delegateStats(1.6, 1.8, 1, rarity);
            super.statusChance = (int)Master.delegateStats(25, 30, 0, rarity);
        }else if(type == "Blast Cannon"){//COMPLETE
            super.damage = (int)Master.getLEVEL_SCALING((int)Master.delegateStats(85, 170, 0, rarity), level);
            super.accuracy = (int)Master.delegateStats(40, 70, 0, rarity);
            super.tracking = (int)Master.delegateStats(50,70, 0, rarity);
            super.critChance = (int)Master.delegateStats(15, 20, 0, rarity);
            super.critMultiplier = Master.delegateStats(1.7, 1.9, 1, rarity);
            super.statusChance = (int)Master.delegateStats(35, 80, 0, rarity);
        }else if(type == "Fusion Rifle"){//COMPLETE
            super.damage = (int)Master.getLEVEL_SCALING((int)Master.delegateStats(65, 130, 0, rarity), level);
            super.accuracy = (int)Master.delegateStats(75, 95, 0, rarity);
            super.tracking = (int)Master.delegateStats(35,60, 0, rarity);
            super.critChance = (int)Master.delegateStats(15, 20, 0, rarity);
            super.critMultiplier = Master.delegateStats(1.8, 2.3, 1, rarity);
            super.statusChance = (int)Master.delegateStats(30, 50, 0, rarity);
        }else{

        }

    }
    public void FOCUS(){

    }
    public void SHOOT(){

    }

    @Override
    public void BLITZ(Enemy target){

    }
    public String getDescription(){
        String description = "A";
        if(type == "Auto-Rifle"){description+="n";}
        description+=(" "+type+" that deals "+(super.getStatusEffect())+"("+Master.GenerateSymbol(super.getStatusEffect())+ ") damage. ");
        if(type == "Repeater"){description+="Small energy firearm that is good at inflicting status effects.";}
        else if(type == "Carbine"){description+="Automatic plasma-casting rifle that is consistently good at just about everything.";}
        else if(type == "Concussion Gun"){description+="Close-range gun that emits shockwaves of force, easy to hit enemies with.";}
        else if(type == "Blast Cannon"){description+="Powerful cannon that trades consistency for raw devastating power.";}
        else if (type == "Fusion Rifle"){description+="Precise beam weapon that excels at dealing heavy critical damage to slower targets.";}
        return description;
    }

}
