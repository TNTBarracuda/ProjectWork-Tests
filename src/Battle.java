public class Battle {
    public static void routine(boolean firstAttack, String environment, int level, Enemy e1, Enemy e2, Enemy e3, Enemy e4, int enemies){
        int globalTurn = 1;int playerTurn = 0;
        Enemy enemy1 = e1;Enemy enemy2 = e2;
        Enemy enemy3 = e3;Enemy enemy4 = e4;
        if(e4==null && enemies==4){
            if(environment == "[Insert environment]"){
                //INPUT ENEMY GENERATION
            }
        }if(e3==null && enemies==3){

        }if(e2==null && enemies==2){

        }if(e1==null && enemies==1){

        }

        while(enemies>0){//BATTLE LOOP

            if((globalTurn+enemies)%enemies==0){
                playerTurn++;
                MasterEX.player.OptionPhase();
            }
            globalTurn++;


        }//END OF BATTLE LOOP

    }

}
