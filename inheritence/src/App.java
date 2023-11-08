public class App {
    public static void main(String[] args) throws Exception {
        // Enemy enemy = new Enemy();
        // System.out.println(enemy.getBaseDamage());

        Zombie zombie = new Zombie();
        System.out.println(zombie.attack());

        Test test = new Test();
        System.out.println(test.getMaxHealth());
    }
}
