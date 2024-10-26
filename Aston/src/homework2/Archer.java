package homework2;

public class Archer extends Hero {
    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Archer " + getName() + " is attacking!");
        enemy.takeDamage(5);
    }


    @Override
    public void uniqueAbility() {
        System.out.println("Shoots 3 arrows from the bow");
    }
}
