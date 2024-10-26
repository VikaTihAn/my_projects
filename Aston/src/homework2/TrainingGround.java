package homework2;

public class TrainingGround {
    public static void main(String[] args) {
        Enemy enemy1 = new Enemy(100);
        Warrior warrior1 = new Warrior("Sam");
        warrior1.attackEnemy(enemy1);

        Mage mage1 = new Mage("Den");
        mage1.attackEnemy(enemy1);

        Archer archer1 = new Archer("Tom");
        archer1.attackEnemy(enemy1);

    }


}
