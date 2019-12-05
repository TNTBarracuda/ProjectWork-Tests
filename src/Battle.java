public class Battle {
    public static void BattleRoutine(boolean firstAttack, String environment, int level, Enemy e1, Enemy e2, Enemy e3, Enemy e4, int enemies){
        int globalTurn = 1;int playerTurn = 0;int cycleTurn=0;
        Enemy enemy1 = e1;Enemy enemy2 = e2;
        Enemy enemy3 = e3;Enemy enemy4 = e4;


        while(enemies>0){//BATTLE LOOP

            if(1==1){
                playerTurn++;
                MasterEX.player.OptionPhase();

            }
            globalTurn++;
            cycleTurn++;
            if(cycleTurn>enemies){cycleTurn=0;}


        }//END OF BATTLE LOOP

    }


}
