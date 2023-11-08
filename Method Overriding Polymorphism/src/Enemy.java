public class Enemy {
    protected int baseDamage = 10; //Protected så man kommer åt det i barn klassen Zombie

    public void attack() {
        System.out.println("Enemy does attack damage of " + baseDamage);
    }
}
