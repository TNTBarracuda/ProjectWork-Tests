public class Master {

    public Master(){
   //empty, no local variables involved in Master System operations
    }

    public double Random(double min, double max){
        return (double)((int)(Math.random()*(max-min+1)+(min)));
    }
    public double Random(double min, double max, int digits){
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
    public double DelegateStats(double min, double max, int digits, int rarity){
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
        System.out.println("\u001B[31m"+ start + " " + end +"\u001B[0m");
        int rawVal =  ((int)((Math.random()*((end-start)+1)+start)*Math.pow(10, digits-1)));
        return ((double)rawVal)/Math.pow(10.0, digits-1);
    }

    /** TODO - Allow bright colors to be used in TEXT coloration
     * Affects color of the text----------------------------------------------------------------------------------------
     */
    public String Default(String string){//                         DEFAULT
        return ("\u001B[0m" + string + "\u001B[0m");
    }
        public String Default(String string, Character type){
            if(type == 'B') {
                return ("\033[1;37m" + string + "\u001B[0m");
            }else if(type == 'U'){
                return ("\033[4;37m" + string + "\u001B[0m");
            }else{
                return ("\u001B[0m" + string + "\u001B[0m");
            }
        }
    public String Extra(String string){//                           EXTRA
        return ("\u001B[30m" + string + "\u001B[0m");
    }
        public String Extra(String string, Character type){
            if(type == 'B') {
                return ("\033[1;30m" + string + "\u001B[0m");
            }else if(type == 'U'){
                return ("\033[4;30m" + string + "\u001B[0m");
            }else{
                return ("\u001B[30m" + string + "\u001B[0m");
            }
        }
    public String Red(String string){//                             RED
        return ("\u001B[31m" + string + "\u001B[0m");
    }
        public String Red(String string, Character type){
            if(type == 'B') {
                return ("\033[1;31m" + string + "\u001B[0m");
            }else if(type == 'U'){
                return ("\033[4;31m" + string + "\u001B[0m");
            }else{
                return ("\u001B[31m" + string + "\u001B[0m");
            }
        }
    public String Blue(String string){//                            BLUE
        return ("\u001B[34m" + string + "\u001B[0m");
    }
        public String Blue(String string, Character type){
            if(type == 'B') {
                return ("\033[1;34m" + string + "\u001B[0m");
            }else if(type == 'U'){
                return ("\033[4;34m" + string + "\u001B[0m");
            }else{
                return ("\u001B[34m" + string + "\u001B[0m");
            }
        }
    public String Yellow(String string){//                          YELLOW
        return ("\u001B[33m" + string + "\u001B[0m");
    }
        public String Yellow(String string, Character type){
            if(type == 'B') {
                return ("\033[1;33m" + string + "\u001B[0m");
            }else if(type == 'U'){
                return ("\033[4;33m" + string + "\u001B[0m");
            }else{
                return ("\u001B[33m" + string + "\u001B[0m");
            }
        }
    public String Green(String string){//                           GREEN
        return ("\u001B[32m" + string + "\u001B[0m");
    }
        public String Green(String string, Character type){
            if(type == 'B') {
                return ("\033[1;32m" + string + "\u001B[0m");
            }else if(type == 'U'){
                return ("\033[4;32m" + string + "\u001B[0m");
            }else{
                return ("\u001B[32m" + string + "\u001B[0m");
            }
        }
    public String Purple(String string){//                          PURPLE
        return ("\u001B[35m" + string + "\u001B[0m");
    }
        public String Purple(String string, Character type){
            if(type == 'B') {
                return ("\033[1;35m" + string + "\u001B[0m");
            }else if(type == 'U'){
                return ("\033[4;35m" + string + "\u001B[0m");
            }else{
                return ("\u001B[35m" + string + "\u001B[0m");
            }
        }
    public String Cyan(String string){//                            CYAN
        return ("\u001B[36m" + string + "\u001B[0m");
    }
        public String Cyan(String string, Character type){
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
    public String Extra_Background(boolean bright, String string){
        if(bright){
            return ("\033[0;107m" + string + "\033[0m");
        }else{
            return ("\u001B[47m" + string + "\033[0m");
        }
    }
    public String Red_Background(boolean bright, String string){
        if(bright){
            return ("\033[0;101m" + string + "\033[0m");
        }else{
            return ("\u001B[41m" + string + "\033[0m");
        }
    }
    public String Blue_Background(boolean bright, String string){
        if(bright){
            return ("\033[0;104m" + string + "\033[0m");
        }else{
            return ("\u001B[44m" + string + "\033[0m");
        }
    }
    public String Yellow_Background(boolean bright, String string){
        if(bright){
            return ("\033[0;103m" + string + "\033[0m");
        }else{
            return ("\u001B[43m" + string + "\033[0m");
        }
    }
    public String Green_Background(boolean bright, String string){
        if(bright){
            return ("\033[0;102m" + string + "\033[0m");
        }else{
            return ("\u001B[42m" + string + "\033[0m");
        }
    }
    public String Purple_Background(boolean bright, String string){
        if(bright){
            return ("\033[0;105m" + string + "\033[0m");
        }else{
            return ("\u001B[45m" + string + "\033[0m");
        }
    }
    public String Cyan_Background(boolean bright, String string){
        if(bright){
            return ("\033[0;106m" + string + "\033[0m");
        }else{
            return ("\u001B[46m" + string + "\033[0m");
        }
    }
    /**
     * Creates/spawns symbols according to type-------------------------------------------------------------------------
     */
    public String GenerateSymbol(String symbol) {
        if (symbol == "Flame") {
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
