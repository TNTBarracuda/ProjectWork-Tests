import java.util.Scanner;

public class MasterEX {
    static Player player = new Player(); private static boolean availableOptions = true;
    static Enemy e1 = new Enemy(null, 0);static Enemy e2 = new Enemy(null, 0);
    static Enemy e3 = new Enemy(null, 0);static Enemy e4 = new Enemy(null, 0);
    public static void updateEnemy(int enemyID, String name, String description, int maxHealth, int agility, int size, int XP, int level, int aggressionThreshold, int perception) {
        Enemy enemy = new Enemy(name, description, maxHealth, agility, size, XP, level, aggressionThreshold, perception);
        if(enemyID == 1){
            e1 = enemy;
        }else if(enemyID == 2) {
            e2 = enemy;
        }else if (enemyID == 3){
            e3 = enemy;
        }else{
            e4 = enemy;
        }

    }
    public static void updateEnemy(int enemyID, String environment, int level){
        Enemy enemy = new Enemy(environment, level);
        if(enemyID == 1){
            e1 = enemy;
        }else if(enemyID == 2) {
            e2 = enemy;
        }else if (enemyID == 3){
            e3 = enemy;
        }else{
            e4 = enemy;
        }
    }

    public static Player getPlayer(){
        return player;
    }
    public static void generalCommand(){
        Scanner scan = new Scanner(System.in);
        String next = scan.next(); String input = next;
        String command=""; String target="";
        for(int i=0; i<next.length(); i++){
            if (!Character.isLetterOrDigit(input.charAt(i)) && input.charAt(i)!='\''){
                String n = next.substring(i+1);
                next=next.substring(0, i);
                next+=n;
                System.out.println(next+" "+i);
            }else{
                //System.out.println("i");
            }
        }

        if(command.toUpperCase().equals("EQUIP")){

        }
        if(command.toUpperCase().equals("SNEAK")){

        }
        if(command.toUpperCase().equals("")){

        }

    }
    public static void battleCommand(){
        System.out.println(Master.Red("A BATTLE HAS COMMENCED", 'b'));
        Scanner scan = new Scanner(System.in);
        while(availableOptions == true) {
            String next = scan.next();
            String input = next;
            String weapon = "";
            String command = "";
            String target = "";
            String[] divide = input.trim().split("\\s");//TODO... WHAT THE FUCK IS HAPPENING?!?
//            for(int i=0; i<divide.length; i++){
//                System.out.println(divide[i]);
//            }
            System.out.println(divide.length);
            if (divide.length == 3) {
                weapon = divide[0];
                command = divide[1];
                target = divide[2];
                availableOptions = false;
            } else {
                //System.out.println(Master.Red("EXECUTION FAILED: Syntax Error.", 'b'));
                break;
            }
            System.out.println(weapon);
            System.out.println(command);
            System.out.println(target);

            Equipment selected = null;
            Enemy enemy = null;
            if(target == e1.name || target == "1"){
                enemy = e1;
            }else if(target == e2.name || target == "2"){
                if(e2 != null){
                    enemy = e2;
                }else{
                    System.out.println("EXECUTION FAILED: Invalid target.");
                    continue;
                }
            }else if(target == e3.name || target == "3"){
                if(e3 != null){
                    enemy = e3;
                }else{
                    System.out.println("EXECUTION FAILED: Invalid target.");
                    continue;
                }
            }else if(target == e4.name || target == "4"){
                if(e4 != null){
                    enemy = e4;
                }else{
                    System.out.println("EXECUTION FAILED: Invalid target.");
                    continue;
                }
            }else{
                System.out.println(Master.Red("EXECUTION FAILED: Invalid target.", 'b'));
                continue;
            }
            for (int i = 0; i < player.getInventory().length; i++) {
                if (player.getInventory()[i].getName().equalsIgnoreCase(weapon.toUpperCase())) {
                    selected = player.getInventory()[i];
                }
            }
            for (int i = 0; i < 4; i++) {//TODO - Implement enemy-storing battle script
                if (player.getInventory()[i].getName().equalsIgnoreCase(weapon)) {
                    selected = player.getInventory()[i];
                }
            }

            if (command.toUpperCase().equals("USE")) {
                if (selected instanceof Item) {
                    ((Item) selected).USE();
                }
            }
            if (command.toUpperCase().equals("GUARD")) {
                if (selected instanceof Weapon) {
                    ((Weapon) selected).GUARD();
                }
            }
            if (command.toUpperCase().equals("EVADE")) {
                if (selected instanceof Weapon) {
                    ((Weapon) selected).EVADE();
                }
            }
            if (command.toUpperCase().equals("BLITZ")) {
                if (selected instanceof Weapon) {//THIS SHOULD NOT REQUIRE NEW ENEMIES, SHOULD BE FED THE ENEMY VARIABLES FROM THE BATTLE
                    ((Weapon) selected).BLITZ(enemy);//
                }
            }
            if (command.toUpperCase().equals("SHOOT")) {
                if (selected instanceof Gun) {
                    ((Gun) selected).SHOOT();
                }
            }
            if (command.toUpperCase().equals("FOCUS")) {
                if (selected instanceof Gun) {
                    ((Gun) selected).FOCUS(enemy);
                }
            }
            if (command.toUpperCase().equals("SLICE")) {
                if (selected instanceof Saber) {
                    ((Saber) selected).SLICE();
                }
            }
            if (command.toUpperCase().equals("SMASH")) {
                if (selected instanceof Maul) {
                    ((Maul) selected).SMASH();
                }
            }else{
                System.out.println("EXECUTION FAILED: Invalid command.");
                continue;
            }
        }
    }//END OF METHOD



}
