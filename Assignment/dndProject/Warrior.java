public class Warrior extends Character implements Role {

    public Warrior(String name) {
        super(name, 100, 1);
    }

    public Warrior(String name, int level, String weaponName, int damage) {
        super(name, 100, level, weaponName, damage);
    }

    //methods
    @Override
    public void attack() {
        System.out.println("Warrior swings a sword for massive damage!");
    }

    @Override
    public void heal(int amount) {
        int currentHp = getHealthPoints();
        if(currentHp + amount > 100) {
            try {
                setHealthPoints(100);
            } catch(InvalidHealthException e) {
                System.out.println(e);
            }
        } else {
            try {
                setHealthPoints(100);
            } catch(InvalidHealthException e) {
                System.out.println(e);
            }
        }
    }

    @Override 
    public String toString() {
        return super.toString() + " ROLE: Warrior";
    }

    public void levelUp() {
        int newLevel = getLevel() + 1;
        setLevel(newLevel);
        try {
            setHealthPoints(100);
        } catch(InvalidHealthException e) {
            System.out.println(e);
        }
    }

    public void useAbility() {
        System.out.println("Warrior uses Shield Block!");
    }



}