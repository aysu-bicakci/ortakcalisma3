import java.util.Scanner;

public class Game {
    Player player;
    Location location;
    Scanner scan=new Scanner(System.in);
    public void login(){

        System.out.println("Heroes Arise");
        System.out.print("Enter your name before the game starts: ");
        String playerName=scan.nextLine();
        player = new Player(playerName);
        player.selectCha();
        start();
    }
    public void start(){
        while(true){
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Select where you want to take action: ");
            System.out.println("1-Home ---> Your own safe space,no enemies");
            System.out.println("2-Cave ---> Your may encounter a zombie");
            System.out.println("3-Forest ---> Your may encounter a vampire");
            System.out.println("4-River ---> Your may encounter a bear");
            System.out.println("5-Store ---> Where you can buy weapons and armor");
            System.out.println("Where you want to go: ");
            int selLog=scan.nextInt();
            while(selLog<0||selLog>5){
                System.out.println("Select a valid location: ");
                selLog=scan.nextInt();
            }

            switch (selLog){
                case 1:
                    location=new Home(player);
                    break;
                case 2:
                    location=new Cave(player);
                    break;
                case 3:
                    location=new Forest(player);
                    break;
                case 4:
                    location=new River(player);
                    break;
                case 5:
                    location=new ToolStore(player);
                    break;
                default:
                    location=new Home(player);
            }
            if(!location.getLocation()){
                System.out.println("Game Over!");
                break;
            }

        }}



}


