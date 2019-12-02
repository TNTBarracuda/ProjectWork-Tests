public class Interface {
    final int STORAGE = 30;
    private Object [] inventory = new Object[STORAGE];

    public Interface(){

    }
    public void InventorySort(){

    }//end of InventorySort

    public void addToInventory(Object object){
        for (int item = 0; item<(STORAGE-1); item++){
            //if(this.inventory[item] != null){
                //System.out.println(this.inventory[item]);
            //}else{
                this.inventory[item] = object;
            //}
        }
    }//end of addToInventory
    public void returnInventory(){
       for(int item = 0; item<(STORAGE-1); item++) {
           System.out.print(this.inventory[item].toString() + " ");
       }
        System.out.println();
    }//end of returnInventory


}
