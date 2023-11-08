public class Werewolf extends Enemy { //Man kan extenda från Enemy hur mycket man vill. Man kan inte ha flera parents men en parent kan ha många barn
    private int attackDamage;

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    } 
}
