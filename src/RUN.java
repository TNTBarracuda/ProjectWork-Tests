public class RUN {
    private String playerName = "Hero";
    public static void main(String[]args){
        Player hlayer = MasterEX.player;
        System.out.println (MasterEX.player.getMaxHealth());
        System.out.println(hlayer.getMaxHealth());
        hlayer.setName("OOhh");
        System.out.println(MasterEX.player.getName());
        MasterEX.generalCommand();

    }

}
