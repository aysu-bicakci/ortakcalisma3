import java.util.Scanner;

public class Player {

    private int healthy,money,damage,rhealthy;
    private String name,charactername;
    Inventory inv;

    public void initPlayer(String Cname,int dmg,int healthy,int mny){
        setCharactername(Cname);
        setDamage(dmg);
        setHealthy(healthy);
        setMoney(mny);
        setRhealthy(healthy);

    }

    Scanner scan = new Scanner(System.in);
    public void selectCha(){
        switch (chaMenu()){
            case 1 :
                initPlayer("Warrior",5,21,10);
                break;
            case 2 :
                initPlayer("Mage",7,18,20);
                break;
            case 3 :
                initPlayer("God",8,24,30);
                break;
            default:
                initPlayer("Warrior",5,21,10);
                break;

        }
        System.out.println("Character: "+getCharactername()+"\t Damage: "+getDamage()+"\t Health: "+getHealthy()+"\t Money: "+getMoney());


    }
    public int chaMenu(){
        System.out.println("Choose your character: ");
        System.out.println("1-Warrior \t Damage:5 \t Health:21 \t Money:10");
        System.out.println("2-Mage \t Damage:7 \t Health:18\t Money:20");
        System.out.println("3-God \t Damage:8 \t Health:24\t Money:30");
        System.out.println("What is your choice?");
        int chaID=scan.nextInt();

        while(chaID<1||chaID>3){
            System.out.println("Plase enter a valid character.");
            chaID= scan.nextInt();
        }
        return chaID;
    }

    public int getTotalDamage(){
        return this.getDamage()+this.getInv().getDamage();
    }

    public Player(String name) {

        this.name = name;
        this.inv = new Inventory();
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharactername() {
        return charactername;
    }

    public void setCharactername(String charactername) {
        this.charactername = charactername;
    }

    public Inventory getInv() {
        return inv;
    }

    public void setInv(Inventory inv) {
        this.inv = inv;
    }

    public int getRhealthy() {
        return rhealthy;
    }

    public void setRhealthy(int rhealthy) {
        this.rhealthy = rhealthy;
    }
}

