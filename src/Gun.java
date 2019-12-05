public class Gun extends Weapon{
    private int rarity; private String type;
    public Gun(int level){
        super(level);
        rarity = super.getRarity();
        String[] gunType = {"Repeater", "Carbine", "Concussion Gun", "Blast Cannon", "Fusion Rifle"};
        type=gunType[(int)Master.Random(1,5,0)];

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
        description+=(" "+type+" that deals "+(super.getStatusEffect())+"("+Master.GenerateSymbol(super.getStatusEffect())+ ") damage.");
        if(type == "Repeater"){description+="Small energy firearm that is good at inflicting status effects.";}
        else if(type == "Carbine"){description+="Automatic plasma-casting rifle that consistently good at just about everything.";}
        else if(type == "Concussion Gun"){description+="Close-range gun that emits shockwaves of force, easy to land hits with.";}
        else if(type == "Blast Cannon"){description+="Powerful cannon that trades consistency for raw devastating power.";}
        else if (type == "Fusion Rifle"){description+="Precise beam weapon that excels at dealing heavy critical damage to slower targets.";}
        return description;
    }

}
