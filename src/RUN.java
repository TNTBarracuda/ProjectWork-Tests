public class RUN {
    private String playerName = "Hero";
    public static void main(String[]args){
        Player hlayer = MasterEX.player;
        //System.out.println (MasterEX.player.getMaxHealth());
        //System.out.println(hlayer.getMaxHealth());
        hlayer.setName("OOhh");
        System.out.println(MasterEX.player.getName());
        //Battle.BattleRoutine(true, "Ooh", 6, new Enemy("1", "Enemy", 50, 40, 40, 5, 5, 50, 4), new Enemy("2", "Enemy", 50, 40, 40, 5, 5, 50, 4), new Enemy("3", "Enemy", 50, 40, 40, 5, 5, 50, 4), new Enemy("4", "Enemy", 50, 40, 40, 5, 5, 50, 4), 4);
        Weapon gun = new Gun(2);
        gun.getDescription();
    }

}
