package homework2;

public class BattleGround {
    public static void main(String[] args) {
        Hero hero1 = new Warrior("Adam");
        Zombie zombie1 = new Zombie(100);
        hero1.attackEnemy(zombie1);
        hero1.attackEnemy(zombie1);
    }
}
