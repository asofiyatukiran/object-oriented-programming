public class HealthPotion implements Item {
    
    private String name;
    private int healAmount;
    
    public HealthPotion(String name, int healAmount) {
        
        this.name = name;
        this.healAmount = healAmount;
        
    }
    
    public String getName() {
        
        return name;
        
    }
    
    public void use(Character target) {
        
        int newHealth = target.getHealth() + healAmount;
        target.setHealth(newHealth);
        System.out.println(target.getName() + " uses a " + getName() + " and heals for " + healAmount + " health.");
        
    }
}