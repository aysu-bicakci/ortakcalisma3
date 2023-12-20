public class Home extends NormalLoc {

    public Home(Player player) {
        super(player,"Safe House");
    }

    public boolean getLocation(){
        player.setHealthy(player.getRhealthy());
        System.out.println("Your health is full");
        System.out.println("You are now in the safe house");
        return true;
    }
}
