import java.util.*;
public class Master {

    public static boolean splitString(Enemy enemy){
        return true;
    }

    public static double getLEVEL_SCALING(int initialValue, int level){
        return initialValue*Math.pow(1.15, level);
    }
    public static double Round(double value, int digits){
        double returnValueD = (Math.pow(10, digits)*value);
        returnValueD += 0.5;
        int returnValueI = (int)returnValueD;
        returnValueD = returnValueI/(1.0*(Math.pow(10, digits)));
        return returnValueD;
    }
    public static double Random(double min, double max){
        return (double)((int)(Math.random()*(max-min+1)+(min)));
    }
    public static double Random(double min, double max, int digits){
        if(min<max) {
            double finalReturn = (Math.random() * (max - min + 1) + min) * Math.pow(10, digits);
            int finalInt = (int) (finalReturn);
            //System.out.println(finalInt);
            finalReturn = ((double) finalInt) / Math.pow(10, digits);
            return finalReturn;
        }else if (min>max){
            double finalReturn = (Math.random() * (min - max + 1) + max) * Math.pow(10, digits);
            int finalInt = (int) (finalReturn);
            //System.out.println(finalInt);
            finalReturn = ((double) finalInt) / Math.pow(10, digits);
            return finalReturn;
        }else{
            return min;
        }

    }
    public static double delegateStats(double min, double max, int digits, int rarity){
        double StatGap = (max-min)/4;
        double startMarker = min + (StatGap*(rarity-1));
        double start;
        if(rarity == 1){
            start = startMarker;
        }else{
            start = startMarker - (StatGap/2);
        }
        double endMarker = max - (StatGap*(4-rarity));
        double end;
        if(rarity == 4){
            end = endMarker;
        }else{
            end = endMarker + (StatGap/2);
        }
        int rawVal =  ((int)((Math.random()*((end-start)+1)+start)*Math.pow(10, digits-1)));
        return ((double)rawVal)/Math.pow(10.0, digits-1);
    }
    public static int receiveInput(String input1, String input2, String input3, String input4, String input5){
        Scanner scan = new Scanner(System.in);
        scan.reset(); String typed = scan.next();
        if(scan.next().equals(input1)){
            return 1;
        }else if(scan.next().equals(input2)){
            return 2;
        }else if(scan.next().equals(input3)){
            return 3;
        }else if(scan.next().equals(input4)){
            return 4;
        }else if(scan.next().equals(input5)){
            return 5;
        }else{
            return 0;
        }
    }
    public static String decompressWeaponInfo(String infoString){
        String split[] = infoString.split(";");
        String merge = "";
        for (int item=0; item<split.length;item++){
            merge+=split[item];
        }
        return merge;
    }
    public static int[] calculateAmmoStats(int attackCount, int damagePerShot, int level){
        int shots = (int)Master.Random(1, 6);
        int consumption = (int)(Master.Random(50, 200)/(damagePerShot/Math.pow(1.15, level)));//TODO - fix
        int ammo = shots*consumption;
        int[] return_values = new int[2];
        return_values[0] = ammo;
        return_values[1] = consumption;
        return return_values;
    }
    public static void wait(double time)throws InterruptedException{
        if(time<0.1){
            time = 0.1;
        }
        Thread.sleep((int)(time*1000));
    }
    public static String inventoryToString(ArrayList<Equipment> arraylist){
        String string = "[\t";
        for(int i=0; i<arraylist.size(); i++){//loop for each item
            string+= arraylist.get(i).getName();

            int gapLength=0;
            for(int j=0; j<arraylist.size(); j++){
                if(arraylist.get(j).getName().length()>gapLength){
                    gapLength = arraylist.get(j).getName().length();
                }
            }
            for(int j=0; j<(gapLength+2)-arraylist.get(i).getName().length(); j++){
                string+=" ";
            }


            if((i-3)%4==0 && i>0 && i<(arraylist.size()-1)){
                string+="\n\t";
            }
        }
        string+="]";
        return string;
    }
    public static void sortInventory(ArrayList<Equipment> inventory) {
        ArrayList<Equipment> tempAL_I = new ArrayList<>();
        ArrayList<Equipment> tempAL_W = new ArrayList<>();
        //Collections.sort(tempAL_I, Comparator.comparing(Equipment::getName));


    }

    public static void addToInventory(){

    }
    /**
     * Text box generating scripts--------------------------------------------------------------------------------------
     */
    public static void textBox(int width, int horizontalPadding, int verticalPadding, char border, String string) {
        String [] words = string.split(" ");
        String line = "";
        System.out.println();

        if(width<=0) {
            width = (string.length());
        }
        if(width%2==1) {
            width++;
        }
        for(int i=1; i<= width; i+=2){//top border
            System.out.print(border+" ");
        }
        System.out.println();
        for(int i=1; i<= verticalPadding; i++){
            System.out.print(border);
            for(int j=1; j<= width-3; j++) {
                System.out.print(" ");
            }
            System.out.println(border);
        }

        for (int i=0; i<words.length; i++){//TEXT BODY

            if(words[i].length()+1+line.length()<width-(2*(horizontalPadding+1))){
                //System.out.println("_1_");
                for(int j=0; j<words[i].length(); j++) {
                    line += words[i].charAt(j);
                    //System.out.print(words[i].charAt(j));
                }
                line+=" ";
            }else if(words[i].length()+line.length()<width-(2*(horizontalPadding+1))){
                //System.out.println("_2_");
                for(int j=0; j<words[i].length(); j++) {
                    line += words[i].charAt(j);
                }
            }else{
                //System.out.println("_3_");
                System.out.print(border);
                for(int k=1; k<= horizontalPadding; k++){
                    System.out.print(" ");
                }
                System.out.print(line);
                for(int k=line.length(); k < width-1-((horizontalPadding+2)); k++){//TODO - script could use some work here
                    System.out.print(" ");
                }
                System.out.println(border);
                //System.out.print("___"+line.length());//extra line used for testing
                //System.out.print("+"+(horizontalPadding+1));
                //System.out.print("="+width);
                line = "";
                i--;
                continue;
            }

        }//TEXT BODY

        for(int i=1; i<= verticalPadding; i++){
            System.out.print(border);
            for(int j=1; j<= width-3; j++) {
                System.out.print(" ");
            }
            System.out.println(border);
        }
        for(int i=1; i<= width; i+=2){//top border
            System.out.print(border+" ");
        }
        System.out.println();
    }//END OF SCRIPT
    public static void battleDataBox(int length, String s1, String s2, String s3, String s4, String s5){
        System.out.println();
        if(length%2==1){length++;}
        for(int i=1;i<=length;i++){ System.out.print("*"); }
        System.out.println();System.out.print("*");
        for(int i=1;i<=((length-2)-s1.length())/2;i++){System.out.print(" ");}System.out.print(s1);
        if(s1.length()%2==1){ System.out.print(" "); }
        for(int i=1;i<=((length-2)-s1.length())/2;i++){System.out.print(" ");}System.out.println("*");
        System.out.print("*");
        for(int i=1;i<=((length-2)-s2.length())/2;i++){System.out.print(" ");}System.out.print(s2);
        if(s2.length()%2==1){ System.out.print(" "); }
        for(int i=1;i<=((length-2)-s2.length())/2;i++){System.out.print(" ");}System.out.println("*");
        System.out.print("*");
        for(int i=1;i<=((length-2)-s3.length())/2;i++){System.out.print(" ");}System.out.print(s3);
        if(s3.length()%2==1){ System.out.print(" "); }
        for(int i=1;i<=((length-2)-s3.length())/2;i++){System.out.print(" ");}System.out.println("*");
        System.out.print("*");
        for(int i=1;i<=((length-2)-s4.length())/2;i++){System.out.print(" ");}System.out.print(s4);
        if(s4.length()%2==1){ System.out.print(" "); }
        for(int i=1;i<=((length-2)-s4.length())/2;i++){System.out.print(" ");}System.out.println("*");
        System.out.print("*");
        for(int i=1;i<=((length-2)-s5.length())/2;i++){System.out.print(" ");}System.out.print(s5);
        if(s5.length()%2==1){ System.out.print(" "); }
        for(int i=1;i<=((length-2)-s5.length())/2;i++){System.out.print(" ");}System.out.println("*");
        for(int i=1;i<=length;i++){ System.out.print("*"); }System.out.println();
    }
    /** TODO - Allow bright colors to be used in TEXT coloration
     * Affects color of the text----------------------------------------------------------------------------------------
     */
    public static String Default(String string){//                         DEFAULT
        return ("\u001B[0m" + string + "\u001B[0m");
    }
        public static String Default(String string, Character type){
            if(type == 'B') {
                return ("\033[1;37m" + string + "\u001B[0m");
            }else if(type == 'U'){
                return ("\033[4;37m" + string + "\u001B[0m");
            }else{
                return ("\u001B[0m" + string + "\u001B[0m");
            }
        }
    public static String Extra(String string){//                           EXTRA
        return ("\u001B[30m" + string + "\u001B[0m");
    }
        public static String Extra(String string, Character type){
            if(type == 'B') {
                return ("\033[1;30m" + string + "\u001B[0m");
            }else if(type == 'U'){
                return ("\033[4;30m" + string + "\u001B[0m");
            }else{
                return ("\u001B[30m" + string + "\u001B[0m");
            }
        }
    public static String Red(String string){//                             RED
        return ("\u001B[31m" + string + "\u001B[0m");
    }
        public static String Red(String string, Character type){
            if(type == 'B') {
                return ("\033[1;31m" + string + "\u001B[0m");
            }else if(type == 'U'){
                return ("\033[4;31m" + string + "\u001B[0m");
            }else{
                return ("\u001B[31m" + string + "\u001B[0m");
            }
        }
    public static String Blue(String string){//                            BLUE
        return ("\u001B[34m" + string + "\u001B[0m");
    }
        public static String Blue(String string, Character type){
            if(type == 'B') {
                return ("\033[1;34m" + string + "\u001B[0m");
            }else if(type == 'U'){
                return ("\033[4;34m" + string + "\u001B[0m");
            }else{
                return ("\u001B[34m" + string + "\u001B[0m");
            }
        }
    public static String Yellow(String string){//                          YELLOW
        return ("\u001B[33m" + string + "\u001B[0m");
    }
        public static String Yellow(String string, Character type){
            if(type == 'B') {
                return ("\033[1;33m" + string + "\u001B[0m");
            }else if(type == 'U'){
                return ("\033[4;33m" + string + "\u001B[0m");
            }else{
                return ("\u001B[33m" + string + "\u001B[0m");
            }
        }
    public static String Green(String string){//                           GREEN
        return ("\u001B[32m" + string + "\u001B[0m");
    }
        public static String Green(String string, Character type){
            if(type == 'B') {
                return ("\033[1;32m" + string + "\u001B[0m");
            }else if(type == 'U'){
                return ("\033[4;32m" + string + "\u001B[0m");
            }else{
                return ("\u001B[32m" + string + "\u001B[0m");
            }
        }
    public static String Purple(String string){//                          PURPLE
        return ("\u001B[35m" + string + "\u001B[0m");
    }
        public static String Purple(String string, Character type){
            if(type == 'B') {
                return ("\033[1;35m" + string + "\u001B[0m");
            }else if(type == 'U'){
                return ("\033[4;35m" + string + "\u001B[0m");
            }else{
                return ("\u001B[35m" + string + "\u001B[0m");
            }
        }
    public static String Cyan(String string){//                            CYAN
        return ("\u001B[36m" + string + "\u001B[0m");
    }
        public static String Cyan(String string, Character type){
            if(type == 'B') {
                return ("\033[1;36m" + string + "\u001B[0m");
            }else if(type == 'U'){
                return ("\033[4;36m" + string + "\u001B[0m");
            }else{
                return ("\u001B[36m" + string + "\u001B[0m");
            }
        }
    /**
     * Affects text background color------------------------------------------------------------------------------------
     */
    public static String Extra_Background(boolean bright, String string){
        if(bright){
            return ("\033[0;107m" + string + "\033[0m");
        }else{
            return ("\u001B[47m" + string + "\033[0m");
        }
    }
    public static String Red_Background(boolean bright, String string){
        if(bright){
            return ("\033[0;101m" + string + "\033[0m");
        }else{
            return ("\u001B[41m" + string + "\033[0m");
        }
    }
    public static String Blue_Background(boolean bright, String string){
        if(bright){
            return ("\033[0;104m" + string + "\033[0m");
        }else{
            return ("\u001B[44m" + string + "\033[0m");
        }
    }
    public static String Yellow_Background(boolean bright, String string){
        if(bright){
            return ("\033[0;103m" + string + "\033[0m");
        }else{
            return ("\u001B[43m" + string + "\033[0m");
        }
    }
    public static String Green_Background(boolean bright, String string){
        if(bright){
            return ("\033[0;102m" + string + "\033[0m");
        }else{
            return ("\u001B[42m" + string + "\033[0m");
        }
    }
    public static String Purple_Background(boolean bright, String string){
        if(bright){
            return ("\033[0;105m" + string + "\033[0m");
        }else{
            return ("\u001B[45m" + string + "\033[0m");
        }
    }
    public static String Cyan_Background(boolean bright, String string){
        if(bright){
            return ("\033[0;106m" + string + "\033[0m");
        }else{
            return ("\u001B[46m" + string + "\033[0m");
        }
    }
    /**
     * Creates/spawns symbols according to type-------------------------------------------------------------------------
     */
    public static String GenerateSymbol(String symbol) {
        if (symbol == "Heat") {
            return "🔥";     //△
        } else if (symbol == "Cold") {
            return "❄";
        } else if (symbol == "Corrosive") {
            return "♨";
        } else if (symbol == "Toxin") {
            return "☢";
        } else if (symbol == "Concussion") {
            return "₪";
        } else if (symbol == "Electric") {
            return "⚡";
        } else if (symbol == "Impact") {
            return "⚶";
        } else if (symbol == "Binding") {               //TODO - Implement this new element
            return "⛓";
        } else if (symbol == "Slash") {
            return "🔪";
        } else if (symbol == "Flash") {
            return "🔆";      //might need some work (✨, 💥, 🌟, Ж, ⚹)
        } else if (symbol == "Solar") {
            return "☀";
        } else if (symbol == "Void") {
            return "⍉";
        }else if (symbol == "Dead") {
            return "☠";
        }else if (symbol == "Bleeding") {
            return "🔪";//should be updated if slash makes it in as an element
        }
        //else if (symbol == "Blind") {
        //    return ‍"👁";   //apparently an "illegal" symbol
        //}
        else if (symbol == "Defending") {
            return "⛉";     //⛊
        }else if (symbol == "Evading") {
            return "☇";     //☈
        } else if (symbol == "Healing") {
            return "✚";         //(☤, ⚕, ⚚)
        }else if(symbol == "Angered"){
            return "💢";
        }else {
            return "";      //☁, ⛅, ⛺, ⛰, ☯, ☣
        }

    }

}
