import java.util.Scanner;

public class MasterEX {
    static Player player = new Player();
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
        String[] split = input.split(" ");
        command=split[0];target=split[1];
        System.out.println(command+"||"+target);
        if(command=="" || target==""){
            System.out.println("Execution failed. Syntax Error.");
        }
        if(command.toLowerCase().equals("equip")){

        }
        if(command.toLowerCase().equals("sneak")){

        }


    }
    public static void battleCommand(){
        Scanner scan = new Scanner(System.in);
        String next = scan.next(); String input = next;
        String weapon="";String command="";String target="";
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
        //for(int i=0; i<next.length(); i++){
            String[] split = input.split(" ");
            weapon=split[0];command=split[1];target=split[2];
//            if (input.charAt(i)==' '){
//                command = input.substring(0, i);
//                target = input.substring(i+1, next.length());
//                break;
//            }
        //}
        if(weapon=="" || command==""){
            System.out.println("Execution failed. Syntax Error.");
        }

        Equipment selected = null;
        Being enemy = null;
        for(int i=0; i<player.getInventory().length; i++){
            if(player.getInventory()[i].getName().equalsIgnoreCase(weapon.toUpperCase())){
                selected = player.getInventory()[i];
            }
        }
        for(int i=0; i<4; i++){//TODO - Implement enemy-storing battle script
            if(player.getInventory()[i].getName().equalsIgnoreCase(weapon.toUpperCase())){
                selected = player.getInventory()[i];
            }
        }


        if(command.toUpperCase().equals("USE")){
            if(selected instanceof Item){
                ((Item) selected).USE();
            }
        }
        if(command.toUpperCase().equals("GUARD")){
            if(selected instanceof Weapon){
                ((Weapon) selected).GUARD();
            }
        }
        if(command.toUpperCase().equals("EVADE")){
            if(selected instanceof Weapon){
                ((Weapon) selected).EVADE();
            }
        }
        if(command.toUpperCase().equals("BLITZ")){
            if(selected instanceof Weapon){
                ((Weapon) selected).BLITZ(target);
            }
        }
        if(command.toUpperCase().equals("SHOOT")){
            if(selected instanceof Gun){
                ((Gun) selected).SHOOT();
            }
        }
        if(command.toUpperCase().equals("FOCUS")){
            if(selected instanceof Gun){
                ((Gun) selected).FOCUS();
            }
        }
        if(command.toUpperCase().equals("SLICE")){
            if(selected instanceof Saber){
                ((Saber) selected).SLICE();
            }
        }
        if(command.toUpperCase().equals("SMASH")){
            if(selected instanceof Maul){
                ((Maul) selected).SMASH();
            }
        }
    }//END OF METHOD



}
