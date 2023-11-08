public class App {
    public static void main(String[] args) throws Exception {
        Enemy enemy = new Enemy();
        enemy.attack(); //"Vanliga" attack metoden

        enemy.attack(5); //Sätter buffDamage till 5 på andra metoden
    }
}
