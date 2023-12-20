import java.util.Scanner;

public abstract class BattleLoc extends Location {
    protected Obstacle obstacle;
    Scanner scan = new Scanner(System.in);
    BattleLoc(Player player,String name,Obstacle obstacle){
        super(player);
        this.obstacle=obstacle;
        this.name=name;
    }
    public boolean getLocation()  {
        int obsCount = obstacle.count();
        System.out.println("You are here now : "+this.getName());
        System.out.println("Be careful ! "+obsCount+" bears live "+obstacle.getName());
        System.out.println("<W>ar or <E>scape");
        String selCase = scan.next();
        selCase = selCase.toUpperCase();
        if (selCase.equals("W"))  {
            if (combat(obsCount))  {
                System.out.println("You have defeated all the enemies in the "+this.getName()+" area");
                return true;
            }
            else {
                System.out.println("You dead.");
                return false;
            }
        }
        return true;
    }
    public boolean combat(int obsCount)  {
        for (int i=0; i<obsCount;i++)  {
            playerStats();
            enemyStats();
        }
        return true;
    }
    public void playerStats()  {
        System.out.println("Player Information\n-----------");
        System.out.println("Health : "+player.getHealthy());
        System.out.println("Damage : "+player.getTotalDamage());
        System.out.println("Money : "+player.getMoney());
        if (player.getInv().getDamage()>0)  {
            System.out.println("Weapon : "+player.getInv().getwName());
        }
        if (player.getInv().getArmor()>0)  {
            System.out.println("Armor : "+player.getInv().getaName());
        }
    }

    public void enemyStats()  {
        System.out.println(obstacle.getName()+" Information\n------");
        System.out.println("Health : "+obstacle.getHealth());
        System.out.println("Damage : "+obstacle.getDamage());
        System.out.println("Award : "+obstacle.getAward());
    }
}
