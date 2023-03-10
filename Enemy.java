public class Enemy extends Character {
    private int attackPower;
    
    public Enemy(String name, int health, int attackPower) {
        super(name, health);
        this.attackPower = attackPower;
        
    }
    
    public void attack(Character target) {
        int damage = attackPower;
        target.setHealth(target.getHealth() - damage);
        System.out.println(getName() + " attacks " + target.getName() + " for " + damage + " damage.");
        
    }
    
}