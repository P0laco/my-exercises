import Hero.Assassin;
import Hero.Warrior;

public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior(200,100,15, 20,"Garen");
        Assassin assassin = new Assassin(150, 100,5,15,"Akali");

        int warriorAttack = warrior.basicAttack();
        assassin.takeDamage(warriorAttack);
        System.out.println(assassin.name + " HP just dropped to: " + assassin.HP + " after " + warrior.name + " attack of: " + warriorAttack + " and " + assassin.name + " defense of: " + assassin.DEF);
    }
}
