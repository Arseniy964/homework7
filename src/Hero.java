public abstract class Hero implements HavingSuperAbility {
    int health;
    int damade;
    String typeSuperAbility;

    public Hero(int health, int damade, String typeSuperAbility) {
        this.health = health;
        this.damade = damade;
        this.typeSuperAbility = typeSuperAbility;
    }
}
