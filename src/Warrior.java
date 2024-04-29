public class Warrior extends Hero{
    public Warrior(int health, int damade, String typeSuperAbility) {
        super(health, damade, typeSuperAbility);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Воин применил суперспособность: " + typeSuperAbility);
    }
}
