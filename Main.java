import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter player name:");
        String playerName = scanner.nextLine();
        
        System.out.println("Enter player health:");
        int playerHealth = scanner.nextInt();
        
        System.out.println("Enter player attack power:");
        int playerAttackPower = scanner.nextInt();
        
        Player player = new Player(playerName, playerHealth, playerAttackPower);
        
        Enemy enemy1 = new Enemy("Enemy 1", 50, 5);
        Enemy enemy2 = new Enemy("Enemy 2", 60, 7);
        
        HealthPotion potion1 = new HealthPotion("Small Health Potion", 10);
        HealthPotion potion2 = new HealthPotion("Large Health Potion", 25);
        
        player.attack(enemy1);
        player.attack(enemy2);
        
        enemy1.attack(player);
        enemy2.attack(player);
        
        potion1.use(player);
        potion2.use(player);
        
        System.out.println(player.getName() + " has " + player.getHealth() + " health.");
        System.out.println(enemy1.getName() + " has " + enemy1.getHealth() + " health.");
        System.out.println(enemy2.getName() + " has " + enemy2.getHealth() + " health.");
    }
}
        
