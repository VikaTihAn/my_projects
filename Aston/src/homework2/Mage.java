package homework2;

public class Mage extends Hero {
    public Mage(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Mage " + getName() + " is attacking!");
        enemy.takeDamage(10);
    }

    @Override
    public void uniqueAbility() {
        System.out.println("The magician becomes invisible");
    }

}
