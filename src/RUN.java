public class RUN {
    private String playerName = "Hero";
    public static void main(String[]args){
        //System.out.println (MasterEX.player.getMaxHealth());
        //System.out.println(hlayer.getMaxHealth());
        MasterEX.player.setName("OOhh");
        System.out.println(MasterEX.player.getName());
        MasterEX.updateEnemy(1, "Cave", 1);
        MasterEX.updateEnemy(2, "Cave", 1);
        Weapon gun = new Gun(2);
        System.out.println(gun.getName());
        System.out.println(gun.getDescription());
        Battle.BattleRoutine(true, "Ooh", 6, MasterEX.e1, MasterEX.e2, MasterEX.e3, MasterEX.e4, 4);
    }

}
