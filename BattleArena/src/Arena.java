import Hero.Assassin;
import Hero.Mage;
import Hero.Priest;
import Hero.Warrior;

public class Arena {

       private Assassin assassin =  new Assassin(150,200,0,10,"Akali");
       private Priest priest = new Priest(100,250,0,5,"Soraka");
       private Warrior warrior = new Warrior(300,150,0,20,"Lee Sin");
       private Mage mage = new Mage(200,250,0,15,"Syndra");


    public void start() {
        while (mage.isAlive() || warrior.isAlive() || priest.isAlive() || assassin.isAlive()){
            int whosAttacking = (int) (Math.random() * 4) + 1;
          switch (whosAttacking){
              case 1:
                  int assassinVsAnyone = (int) ( Math.random() * 3) + 1;
                  switch (assassinVsAnyone){
                      case 1:
                          mage.takeDamage(assassin.basicAttack());
                          System.out.println(mage.name + " took " + (assassin.basicAttack() - mage.getDEF()) + " from: " + assassin.name);
                          System.out.println(mage.name + " current HP is: " + mage.getHP());
                          System.out.println("==============");
                          break;
                      case 2:
                          priest.takeDamage(assassin.basicAttack());
                          System.out.println(priest.name + " took " + (assassin.basicAttack() - priest.getDEF()) + " from: " + assassin.name);
                          System.out.println(priest.name + " current HP is: " + priest.getHP());
                          System.out.println("==============");
                          break;
                      case 3:
                          warrior.takeDamage(assassin.basicAttack());
                          System.out.println(warrior.name + " took " + (assassin.basicAttack() - warrior.getDEF()) + " from: " + assassin.name);
                          System.out.println(warrior.name + " current HP is: " + warrior.getHP());
                          System.out.println("==============");
                          break;
                  }
                  break;
              case 2:
                  int warriorVsAnyone = (int) ( Math.random() * 3) + 1;
                  switch (warriorVsAnyone){
                      case 1:
                          mage.takeDamage(warrior.basicAttack());
                          System.out.println(mage.name + " took " + (warrior.basicAttack() - mage.getDEF()) + " from: " + warrior.name);
                          System.out.println(mage.name + " current HP is: " + mage.getHP());
                          System.out.println("==============");
                          break;
                      case 2:
                          priest.takeDamage(warrior.basicAttack());
                          System.out.println(priest.name + " took " + (warrior.basicAttack() - priest.getDEF()) + " from: " + warrior.name);
                          System.out.println(priest.name + " current HP is: " + priest.getHP());
                          System.out.println("==============");
                          break;
                      case 3:
                          assassin.takeDamage(warrior.basicAttack());
                          System.out.println(assassin.name + " took " + (warrior.basicAttack() - assassin.getDEF()) + " from: " + warrior.name);
                          System.out.println(assassin.name + " current HP is: " + assassin.getHP());
                          System.out.println("==============");
                          break;
                  }
                  break;
              case 3:
                  int mageVsAnyone = (int) ( Math.random() * 3) + 1;
                  switch (mageVsAnyone){
                      case 1:
                          warrior.takeDamage(mage.basicAttack());
                          System.out.println(warrior.name + " took " + (mage.basicAttack() - warrior.getDEF()) + " from: " + mage.name);
                          System.out.println(warrior.name + " current HP is: " + warrior.getHP());
                          System.out.println("==============");
                          break;
                      case 2:
                          priest.takeDamage(mage.basicAttack());
                          System.out.println(priest.name + " took " + (mage.basicAttack() - priest.getDEF()) + " from: " + mage.name);
                          System.out.println(priest.name + " current HP is: " + priest.getHP());
                          System.out.println("==============");
                          break;
                      case 3:
                          assassin.takeDamage(mage.basicAttack());
                          System.out.println(assassin.name + " took " + (mage.basicAttack() - assassin.getDEF()) + " from: " + mage.name);
                          System.out.println(assassin.name + " current HP is: " + assassin.getHP());
                          System.out.println("==============");
                          break;
                  }
                  break;
              case 4:
                  int priestVsAnyone = (int) ( Math.random() * 3) + 1;
                  switch (priestVsAnyone){
                      case 1:
                          warrior.takeDamage(priest.basicAttack());
                          System.out.println(warrior.name + " took " + (priest.basicAttack() - warrior.getDEF()) + " from: " + priest.name);
                          System.out.println(warrior.name + " current HP is: " + warrior.getHP());
                          System.out.println("==============");
                          break;
                      case 2:
                          mage.takeDamage(priest.basicAttack());
                          System.out.println(mage.name + " took " + (priest.basicAttack() - mage.getDEF()) + " from: " + priest.name);
                          System.out.println(mage.name + " current HP is: " + mage.getHP());
                          System.out.println("==============");
                          break;
                      case 3:
                          assassin.takeDamage(priest.basicAttack());
                          System.out.println(assassin.name + " took " + (priest.basicAttack() - assassin.getDEF()) + " from: " + priest.name);
                          System.out.println(assassin.name + " current HP is: " + assassin.getHP());
                          System.out.println("==============");
                          break;
                  }
                  break;
          }
        }
    }
}
