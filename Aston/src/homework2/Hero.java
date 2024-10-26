package homework2;

public abstract class Hero {

    private String name;
    public int healthHero;
    public boolean isAlive;

    public Hero(String name) {
        this.name = name;
        this.healthHero = 100;
        isAlive = true;
    }

    public String getName() {
        return name;
    }

    public abstract void attackEnemy(Enemy enemy);

    public abstract void uniqueAbility();


}
