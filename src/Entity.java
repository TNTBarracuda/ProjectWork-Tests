abstract public class Entity {
    private String name;
    private String description;
//    public Entity(String name, String description){
//        this.name = name;
//        this.description = description;
//    }
    public String getName(){
        return name;
    }
    public void setName(String newName){name = newName;}
    public void setDescription(String newDescription){description = newDescription;}
    public String getDescription(){
        return description;
    }
    public String toString(){
        return (name+": "+description);
    }

}
