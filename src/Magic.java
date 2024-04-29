public class Magic extends Hero{

    public Magic(int health, int damade, String typeSuperAbility) {
        super(health, damade, typeSuperAbility);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Маг применил способность: " + typeSuperAbility);
    }
}
