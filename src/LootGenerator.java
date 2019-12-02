public class LootGenerator {
    Master master = new Master();
    private int dmg = 0;
    final double DAMAGE_SCALING = 1.15;
    private double crit_mult = 0.0;
    private double crit_chance = 0.0;
    private double accuracy = 0;
    private double tracking = 0.0;
    private int attackCount = 0;
    private int clipSize = 0;
    private int ammoConsumption = 1;
     /**
      * For normal weapons, accuracy return registers a hit if higher than the accuracy threshhold
      * For shotguns, accuracy return registers the percent of damage dealt on enemy hit
      */

    private int rarity = 0;
    private String weaponType;
    private String status_effect = "null";
    private int status_strength = 0;
    private double status_chance = 0.0;
    private String name = "null";
    private Character type = '-';
    private int level;


    public LootGenerator(int $level, Character $type){
        type = $type;
        level = $level;
        
         //Registers an item-type loot drop
        if($type == 'i'){
          int return_item_name = (int)master.Random(1,6,0);
               if(return_item_name == 1){name = "Void Purge";}
               if(return_item_name == 2){name = "Soul Cleanse";}
               if(return_item_name == 3){name = "Super Shuffler";}
               if(return_item_name == 4){name = "MedEX Kit";}
               if(return_item_name == 5){name = "Amps";}
               if(return_item_name == 6){name = "VIS Kit";}
               if(return_item_name == 1){name = "";}
               if(return_item_name == 1){name = "";}
             
        }
        
         //Registers a weapon-type loot drop
        if($type == 'w'){
            int return_rarity = (int)master.Random(0,100,0);
                if(return_rarity<=92){rarity=4;}if(return_rarity<=76){rarity=3;}
                if(return_rarity<=55){rarity=2;}if(return_rarity<=30){rarity=1;}
                    if(return_rarity>92) {rarity=5;}
                    //rarity = 5;//TODO -- USE ONLY FOR TESTING LEGENDARIES-----------------------------------------------
            int return_weapon_type;

                double return_tracking; //tracking is the value for which enemy mobility is neglected (higher is better)
                int return_dmg_max;


            /**
             * Deals with randomizing status effects
             */
            if(rarity!=5){
            if(rarity >=3){
                    int return_effect = (int)master.Random(1, 12);
                if(return_effect==1){status_effect="Flame";}if(return_effect==2){status_effect="Cold";}
                if(return_effect==3){status_effect="Corrosive";}if(return_effect==4){status_effect="Toxin";}
                if(return_effect==5){status_effect="Concussion";}if(return_effect==6){status_effect="Electric";}
                if(return_effect==7){status_effect="Impact";}if(return_effect==8){status_effect="Slash";}
                if(return_effect==9){status_effect="Flash";}if(return_effect==10){status_effect="Binding";}
                if(return_effect==11){status_effect="Solar";}if(return_effect==12){status_effect="Void";}
            }else if (rarity==2){
                    int return_effect = (int)master.Random(1, 16);
                if(return_effect==1){status_effect="Flame";}if(return_effect==2){status_effect="Cold";}
                if(return_effect==3){status_effect="Corrosive";}if(return_effect==4){status_effect="Toxin";}
                if(return_effect==5){status_effect="Concussion";}if(return_effect==6){status_effect="Electric";}
                if(return_effect==7){status_effect="Impact";}if(return_effect==8){status_effect="Slash";}
                if(return_effect==9){status_effect="Flash";}if(return_effect==10){status_effect="Binding";}
                if(return_effect>=11){status_effect="None";}
            }else{
                    int return_effect = (int)master.Random(1, 8);
                if(return_effect>=4){status_effect="None";}if(return_effect==3){status_effect="Slash";}
                if(return_effect==2){status_effect="Concussion";}if(return_effect==1){status_effect="Impact";}
            }
            int status_strength_max = 0;
            if(status_effect=="Flame"){status_strength_max=5;}if(status_effect=="Cold"){status_strength_max=3;}
            if(status_effect=="Corrosive"){status_strength_max=5;}if(status_effect=="Toxin"){status_strength_max=3;}
            if(status_effect=="Concussion"){status_strength_max=3;}if(status_effect=="Electric"){status_strength_max=3;}
            if(status_effect=="Impact"){status_strength_max=1;}if(status_effect=="Slash"){status_strength_max=1;}
            if(status_effect=="Flash"){status_strength_max=5;}if(status_effect=="None"){status_strength_max=0;}
            if(status_effect=="Solar"){status_strength_max=1;}if(status_effect=="Void"){status_strength_max=3;}
            if(status_effect=="Binding"){status_strength_max=3;}

            if(status_effect != "None") {
                this.status_strength = (int) master.Random(1, status_strength_max);
            }else{
                this.status_strength = 0;
            }
     }else {//IF LEGENDARY RARITY //TODO - update stats to include ammo count
                int legendaryWeapon = (int)master.Random(1, 4);
                this.level = $level;
                if(legendaryWeapon == 1){
                    this.name = "Trigger Finger";
                    this.weaponType = "SMG";
                    this.status_effect = "None";
                    this.dmg = (int)(19.0*(Math.pow(DAMAGE_SCALING, this.level-1)));//DAMAGE SCALING FORMULA
                    this.crit_mult = 2.0;
                    this.attackCount = 6;
                    this.clipSize = 60;
                    this.ammoConsumption = 2;
                    this.status_chance = 0.0;
                    this.status_strength = 0;
                    this.accuracy = 71.0;
                    this.tracking = 0.87;
                }else if(legendaryWeapon == 2){
                    this.name = "Filthy Harrison";
                    this.weaponType = "Revolver";
                    this.status_effect = "None";
                    this.dmg = (int)(99.0*(Math.pow(DAMAGE_SCALING, this.level-1)));//DAMAGE SCALING FORMULA
                    this.crit_mult = 2.0;
                    this.attackCount = 1;
                    this.clipSize = 12;
                    this.ammoConsumption = 2;
                    this.status_chance = 0.0;
                    this.status_strength = 0;
                    this.accuracy = 95.0;
                    this.tracking = 0.69;
                }else if(legendaryWeapon == 3){
                    this.name = "Volcanic Destroyer";
                    this.weaponType = "Assault Rifle";
                    this.status_effect = "Flame";
                    this.dmg = (int)(36.0*(Math.pow(DAMAGE_SCALING, this.level-1)));//DAMAGE SCALING FORMULA
                    this.crit_mult = 1.25;
                    this.attackCount = 3;
                    this.clipSize = 27;
                    this.ammoConsumption = 3;
                    this.status_chance = 65.0;
                    this.status_strength = 3;
                    this.accuracy = 65.0;
                    this.tracking = 0.78;
                }else if(legendaryWeapon == 4){
                    this.name = "Smackdown";
                    this.weaponType = "Coach Gun";
                    this.status_effect = "Impact";
                    this.dmg = (int)(176.0*(Math.pow(DAMAGE_SCALING, this.level-1)));//DAMAGE SCALING FORMULA
                    this.crit_mult = 2.0;
                    this.attackCount = 1;
                    this.clipSize = 20;
                    this.ammoConsumption = 5;
                    this.status_chance = 65.0;
                    this.status_strength = 1;
                    this.accuracy = 58.0;
                    this.tracking = 1.0;
                }else if(legendaryWeapon == 5){
                    this.name = "Harbinger";
                    this.weaponType = "Rocket Launcher";
                    this.status_effect = "Impact";
                    this.dmg = (int)(200.0*(Math.pow(DAMAGE_SCALING, this.level-1)));//DAMAGE SCALING FORMULA
                    this.crit_mult = 2.0;
                    this.attackCount = 1;
                    this.clipSize = 35;
                    this.ammoConsumption = 35;
                    this.status_chance = 85.0;
                    this.status_strength = 1;
                    this.accuracy = 100.0;
                    this.tracking = 0.3;
                }else if(legendaryWeapon == 6){

                }else if(legendaryWeapon == 7){

                }else if(legendaryWeapon ==8){

                }else if(legendaryWeapon == 9){

                }else if(legendaryWeapon == 10){

                }
            }//END OF LEGENDARY WEAPON RANDOMIZER


        }
            /**
             * Deals with randomizing the weapon stats
             */
            
             /**
              * Accuracy
              *     Repeater =      63-93   (63-70.5    70.5-78    78-85.5    85.5-93)
              *     Revolver =      72-98   (72-78.5    78.5-85    85-91.5    91.5-98)
              *     Coachgun =      30-98   (30-47      47-64      64-81      81-98  )
              *     Shotgun =       60-98   (60-69.5    69.5-79    79-88.5    88.5-98)
              *     SMG =           55-89   (55-63.5    63.5-72    72-80.5    80.5-89)
              *     Assault Rifle = 66-90   (66-72      72-78      78-84      84-90  )
              *     Heavy Rifle =   65-89   (65-71      71-77      77-83      83-89  )
              *     LMG =           63-87   (63-69      69-75      75-81      81-87  )
              *     Marksman Rifle =70-96   (70-76.5    76.5-83    83-89.5    89.5-96)
              *     Heavy Sniper =  75-99   (75-81      81-87      87-93      93-99  )
              *
              *
              *
              *        *     Repeater =      63-93   (63-70.5    70.5-78    78-85.5    85.5-93)
              *        *     Blast Gun =       60-98   (60-69.5    69.5-79    79-88.5    88.5-98)
              *        *     Fusion Rifle =           55-89   (55-63.5    63.5-72    72-80.5    80.5-89)
              *        *     Auto Rifle = 66-90   (66-72      72-78      78-84      84-90  )
              *        *     Beam Rifle = 70-96   (70-76.5    76.5-83    83-89.5    89.5-96)
              */
             //TODO - Add other attributes (Crit Chance, Crit Damage Multiplier, Damage, Attack Count, Status Chance, Max Ammo)
             int return_weapon_type;
        return_weapon_type = (int)master.Random(-3.0, 10.0);
                 //Type 0 = Melee
                if(return_weapon_type <= -1){
                   this.weaponType = "Melee";
                    if(rarity == 4){
                        int return_effect = (int)master.Random(1, 12);
                        if(return_effect <= 1){
                            this.status_effect = "Slash";
                        }else if (return_effect == 2){
                            this.status_effect = "Concussion";
                        }else if (return_effect == 3){
                            this.status_effect = "Flame";
                        }else if (return_effect == 4){
                            this.status_effect = "Cold";
                        }else if (return_effect == 5){
                            this.status_effect = "Electric";
                        }else if (return_effect == 6){
                            this.status_effect = "Void";
                        }else if (return_effect == 7){
                            this.status_effect = "Solar";
                        }
                    }else if (rarity == 3){
                        int return_effect = (int)master.Random(-2, 5);
                        if(return_effect <= 1){
                            this.status_effect = "Slash";
                        }else if (return_effect == 2){
                            this.status_effect = "Concussion";
                        }else if (return_effect == 3){
                            this.status_effect = "Flame";
                        }else if (return_effect == 4){
                            this.status_effect = "Cold";
                        }else if (return_effect == 5){
                            this.status_effect = "Electric";
                        }
                    }else if (rarity == 2){
                        int return_effect = (int)master.Random(1, 2);
                        if(return_effect == 1){
                            this.status_effect = "Slash";
                        }else if (return_effect == 2){
                            this.status_effect = "Concussion";
                        }
                    }else{
                        this.status_effect = "Slash";
                    }

                }
        if(return_weapon_type == 0) {
            this.weaponType = "Rocket Launcher";
            this.attackCount = 1;
            this.crit_mult = 0.0;
            this.crit_chance = 0.0;
            if (rarity == 4) {
                accuracy = master.Random(85.5, 93.0, 1);//
                tracking = master.Random(0.5, 0.8, 2);//
                status_chance = master.Random(32.0, 45.0);
            }else if (rarity == 3){
                accuracy = master.Random(78.0, 85.5, 1);//
                tracking = master.Random(0.5, 0.8, 2);//
                status_chance = master.Random(26.0, 32.0);
            }else if (rarity == 2){
                accuracy = master.Random(70.5, 78.0, 1);//
                tracking = master.Random(0.5, 0.8, 2);//
                status_chance = master.Random(20.0, 26.0);
            }else{
                accuracy = master.Random(63.0, 70.5, 1);//
                tracking = master.Random(0.5, 0.8, 2);//
                status_chance = master.Random(5.0, 20.0);
            }
        }
                //Type 1 = REPEATER
                 if(return_weapon_type == 1) {
                     this.weaponType = "Repeater";
                     this.attackCount = 2;
                     if (rarity == 4) {
                         accuracy = master.Random(85.5, 93.0, 1);//
                         tracking = master.Random(0.5, 0.8, 2);//
                         crit_mult = 1.5;
                         crit_chance = master.Random(25.0, 40.0);
                         status_chance = master.Random(32.0, 45.0);
                     }else if (rarity == 3){
                         accuracy = master.Random(78.0, 85.5, 1);//
                         tracking = master.Random(0.5, 0.8, 2);//
                         crit_mult = 1.4;
                         crit_chance = master.Random(20.0, 30.0);
                         status_chance = master.Random(26.0, 32.0);
                     }else if (rarity == 2){
                         accuracy = master.Random(70.5, 78.0, 1);//
                         tracking = master.Random(0.5, 0.8, 2);//
                         crit_mult = 1.3;
                         crit_chance = master.Random(15.0, 25.0);
                         status_chance = master.Random(20.0, 26.0);
                     }else{
                         accuracy = master.Random(63.0, 70.5, 1);//
                         tracking = master.Random(0.5, 0.8, 2);//
                         crit_mult = 1.2;
                         crit_chance = master.Random(10.0, 20.0);
                         status_chance = master.Random(5.0, 20.0);
                     }
                 }
                //Type 2 = REVOLVER
                 if(return_weapon_type == 2) {
                     this.weaponType = "Revolver";
                     this.attackCount = 1;
                     if (rarity == 4) {
                         accuracy = master.Random(91.5, 98.0, 1);//
                         tracking = master.Random(0.4, 0.7, 2);//
                         crit_mult = 1.7;
                         crit_chance = master.Random(20.0, 40.0);
                         status_chance = master.Random(35.0, 50.0);
                     }else if (rarity == 3){
                         accuracy = master.Random(85.0, 91.5, 1);//
                         tracking = master.Random(0.4, 0.7, 2);//
                         crit_mult = 1.55;
                         crit_chance = master.Random(20.0, 40.0);
                         status_chance = master.Random(25.0, 40.0);
                     }else if (rarity == 2){
                         accuracy = master.Random(78.5, 85.0, 1);//
                         tracking = master.Random(0.4, 0.7, 2);//
                         crit_mult = 1.4;
                         crit_chance = master.Random(20.0, 35.0);
                         status_chance = master.Random(15.0, 30.0);
                     }else{
                         accuracy = master.Random(72.0, 78.5, 1);//
                         tracking = master.Random(0.4, 0.7, 2);//
                         crit_mult = 1.25;
                         crit_chance = master.Random(10.0, 25.0);
                         status_chance = master.Random(10.0, 20.0);
                     }
                 }
                //Type 3 = COACH GUN
                 if(return_weapon_type == 3){
                     this.weaponType = "Coach Gun";
                     this.attackCount = 1;
                     if (rarity == 4) {
                         accuracy = master.Random(81.0, 98.0,1);//
                         tracking = (1.0);//
                     }else if (rarity == 3){
                         accuracy = master.Random(64.0, 81.0,1);//
                         tracking = (1.0);//
                     }else if (rarity == 2){
                         accuracy = master.Random(47.0, 64.0,1);//
                         tracking = (1.0);//
                     }else{
                         accuracy = master.Random(30.0, 47.0,1);//
                         tracking = (1.0);//
                     }
                 }
                //Type 4 = SHOTGUN
                 if(return_weapon_type == 4){
                     this.weaponType = "Shotgun";
                     this.attackCount = 1;
                     if (rarity == 4) {
                         accuracy = master.Random(88.5, 98.0,1);//
                         tracking = (1.0);//
                     }else if (rarity == 3){
                         accuracy = master.Random(79.0, 88.5,1);//
                         tracking = (1.0);//
                     }else if (rarity == 2){
                         accuracy = master.Random(69.5, 79.0,1);//
                         tracking = (1.0);//
                     }else{
                         accuracy = master.Random(60.0, 69.5,1);//
                         tracking = (1.0);//
                     }
                 }
                //Type 5 = SMG
                 if(return_weapon_type == 5){
                     this.weaponType = "SMG";
                     this.attackCount = 4;
                     if (rarity == 4) {
                         accuracy = master.Random(80.5, 89.0,1);//
                         tracking = master.Random(0.6, 0.9, 2);//
                     }else if (rarity == 3){
                         accuracy = master.Random(72.0, 80.5,1);//
                         tracking = master.Random(0.6, 0.9, 2);//
                     }else if (rarity == 2){
                         accuracy = master.Random(63.5, 72.0,1);//
                         tracking = master.Random(0.6, 0.9, 2);//
                     }else{
                         accuracy = master.Random(55.0, 63.5,1);//
                         tracking = master.Random(0.6, 0.9, 2);//
                     }
                 }
                //Type 6 = ASSAULT RIFLE
                 if(return_weapon_type == 6){
                     this.weaponType = "Assault Rifle";
                     this.attackCount = 3;
                     if (rarity == 4) {
                         accuracy = master.Random(84.0, 90.0,1);//
                         tracking = master.Random(0.6, 0.85, 2);//
                     }else if (rarity == 3){
                         accuracy = master.Random(78.0, 84.0,1);//
                         tracking = master.Random(0.6, 0.85, 2);//
                     }else if (rarity == 2){
                         accuracy = master.Random(72.0, 78.0,1);//
                         tracking = master.Random(0.6, 0.85, 2);//
                     }else{
                         accuracy = master.Random(66.0, 72.0,1);//
                         tracking = master.Random(0.6, 0.85, 2);//
                     }
                 }
                //Type 7 = HEAVY RIFLE
                 if(return_weapon_type == 7){
                     this.weaponType = "Heavy Rifle";
                     this.attackCount = 2;
                     if (rarity == 4) {
                         accuracy = master.Random(83.0, 89.0,1);//
                         tracking = master.Random(0.55, 0.8, 2);//
                     }else if (rarity == 3){
                         accuracy = master.Random(77.0, 83.0,1);//
                         tracking = master.Random(0.55, 0.8, 2);//
                     }else if (rarity == 2){
                         accuracy = master.Random(71.0, 77.0,1);//
                         tracking = master.Random(0.55, 0.8, 2);//
                     }else{
                         accuracy = master.Random(65.0, 71.0,1);//
                         tracking = master.Random(0.55, 0.8, 2);//
                     }
                 }
                //Type 8 = LMG
                 if(return_weapon_type == 8){
                     this.weaponType = "LMG";
                     this.attackCount = 2;
                     if (rarity == 4) {
                         accuracy = master.Random(81.0, 87.0,1);//
                         tracking = master.Random(0.5, 0.75, 2);//
                     }else if (rarity == 3){
                         accuracy = master.Random(75.0, 81.0,1);//
                         tracking = master.Random(0.5, 0.75, 2);//
                     }else if (rarity == 2){
                         accuracy = master.Random(69.0, 75.0,1);//
                         tracking = master.Random(0.5, 0.75, 2);//
                     }else{
                         accuracy = master.Random(63.0, 69.0,1);//
                         tracking = master.Random(0.5, 0.75, 2);//
                     }
                 }
                //Type 9 = MARKSMAN RIFLE
                 if(return_weapon_type == 9){
                     this.weaponType = "Marksman Rifle";
                     this.attackCount = 1;
                     if (rarity == 4) {
                         accuracy = master.Random(89.5, 96.0,1);//
                         tracking = master.Random(0.4, 0.7, 2);//
                     }else if (rarity == 3){
                         accuracy = master.Random(83.0, 89.5,1);//
                         tracking = master.Random(0.4, 0.7, 2);//
                     }else if (rarity == 2){
                         accuracy = master.Random(76.5, 83.0,1);//
                         tracking = master.Random(0.4, 0.7, 2);//
                     }else{
                         accuracy = master.Random(70.0, 76.5,1);//
                         tracking = master.Random(0.4, 0.7, 2);//
                     }
                 }
                //Type 10 = HEAVY SNIPER
                 if(return_weapon_type == 10){
                     this.weaponType = "Heavy Sniper Rifle";
                     this.attackCount = 1;
                     if (rarity == 4) {
                         accuracy = master.Random(93.0, 99.0,1);//
                         tracking = master.Random(0.35, 0.65, 2);//
                     }else if (rarity == 3){
                         accuracy = master.Random(87.0, 93.0,1);//
                         tracking = master.Random(0.35, 0.65, 2);//
                     }else if (rarity == 2){
                         accuracy = master.Random(81.0, 87.0,1);//
                         tracking = master.Random(0.35, 0.65, 2);//
                     }else{
                         accuracy = master.Random(75.0, 81.0,1);//
                         tracking = master.Random(0.35, 0.65, 2);//
                     }
                 }
                 


        }//END OF THE WEAPON RANDOMIZER---------------------------------------------------------------------------------

    //Guns with special parameters
    public LootGenerator(int $level, String $name){
        if($name == ""){ }
        if($name == ""){ }
        if($name == ""){ }
        if($name == ""){ }
        if($name == ""){ }
        if($name == ""){ }
        if($name == ""){ }
        if($name == ""){ }
        if($name == ""){ }
        if($name == ""){ }
        if($name == ""){ }
        if($name == ""){ }
        if($name == ""){ }
        if($name == ""){ }


    }//END OF SPECIAL WEAPON GENERATOR

    public String returnInfo() {
        if (this.type == 'w') {
            return (this.name + "={Type:" + this.weaponType + ", Lv:" + this.level + ", DMG:" + this.dmg + ", Crit_Mult:" + this.crit_mult + ", Acc:" + this.accuracy + ", Att:" + this.attackCount + ", Clip:" + this.clipSize + ", Rarity:" + this.rarity + ", Proc:" + status_effect + "(lv" + this.status_strength + ", " + this.status_chance + "%)}");
        }else{
            return (this.name);
        }
    }//END OF returnInfo

}//END OF SCRIPT
