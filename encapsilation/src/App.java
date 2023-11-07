class Player { //normalt sett vill man ha en ny fil för ny class
    private String playerName;
    private int maxHealth;       //Ta för vana att sätta alla dessa private. Använd getters & setters för att få public
    private int level;

    public String getPlayerName() {
        return playerName;
    }
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    public int getMaxHealth() {
        return maxHealth;
    }
    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }

    public void levelUp() {
        level += 1;
        maxHealth += 10;
    }
}


public class App {
    public static void main(String[] args) throws Exception {
        Player player = new Player();
        player.setPlayerName("Love");
        System.out.println(player.getPlayerName());
    }
}
 