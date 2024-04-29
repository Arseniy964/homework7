public class Medic extends Hero {
    int healPoints = 10;

    public void increaseExperience() {
        healPoints += healPoints * 0.1;
    }

    public Medic(int health, int damade, String typeSuperAbility) {
        super(health, damade, typeSuperAbility);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Медик применил суперспособность: " + typeSuperAbility);
    }
}
