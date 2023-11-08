public class Enemy {
    private int damage = 10;

    public void attack() {
        System.out.println("Enemy does " + damage + " points of damage");
    }

    public void attack(int buffDamage) { //Metoderna kan heta samma sålänge det är olika typer av parametrar
        System.out.println("Enemy does " + (damage + buffDamage) + " points of damage");
    }
}
