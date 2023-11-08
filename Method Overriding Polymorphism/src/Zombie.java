public class Zombie extends Enemy {
    private int attackDamage = 5;

    @Override //Behövs inte men man ser då snabbt att det är en override som ska ske
    public void attack() { //Methodoverring. Alla enemies ska attackera fast på sitt egen sätt. Det overridar attack metoden i parenten Enemy
        System.out.println("Zombie attacks with a damage of " + baseDamage + attackDamage);
    }
}
