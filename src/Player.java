public class Player extends Being{
    private int maxHealth = super.maxHealth;
    private int qealth;
    private Equipment[] inventory = new Equipment[15];

    public Player(){
        //super("Hero", "The hero of the story. Adept at using magic.", 65, 25, 100, 0, 0);

    }
    public Equipment[] getInventory(){
        return inventory;
    }
    public void Heal(int healingAmount){

    }
    public void OptionPhase(){
        MasterEX.battleCommand();
    }




}
