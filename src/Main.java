import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Hero[] heroes = {
                new Magic(100, 10, "cold"),
                new Medic(60, 0, "heal"),
                new Warrior(150, 25, "attack")};

        for (Hero hero : heroes) {
            hero.applySuperAbility();
            if (hero instanceof Medic) {
                ((Medic) hero).increaseExperience();
                System.out.println("Медик увеличил навык лечения: " + ((Medic) hero).healPoints);
            }
        }


    }
}