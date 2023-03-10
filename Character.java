public abstract class Character {
    private String name;
    private int health;
    
    public Character(String name, int health) {
        
        this.name = name;
        this.health = health;
        
    }
    
    public abstract void attack(Character target);
    
    public String getName() {
        
        return name;
        
    }
    
    public int getHealth() {
        
        return health;
        
    }
    
    public void setHealth(int health) {
        
        this.health = health;
        
    }
}
