public class Zombie extends Enemy{ //ärver från enemy. Har allt Enemy har + det som finns i zombie. Man kan bara extenda från en klass.
    private int attackDamage = 5;

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int attack() {
        return getBaseDamage() + attackDamage; //Hämtar information från parent och använder egen information
    }
}
