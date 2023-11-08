public class Enemy {
    private int maxHealth = 100;
    private int baseDamage = 10;

    public int getMaxHealth() { //Public gör så man kommer åt den. Om det var private kommer man inte åt den även i barn klasserna. Protected kommer man åt den i barnklasser också, men inte utfanför det.
        return maxHealth;
    }
    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }
    public int getBaseDamage() {
        return baseDamage;
    }
    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }
}
