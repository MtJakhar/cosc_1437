
public class Mage extends Character implements Role  {
    public Mage(String name) {
        super(name, 100, 1);
    }

    public Mage(String name, int level, String weaponName, int damage) {
        super(name, 80, level, weaponName, damage);
    }

    //methods
    @Override
    public void attack() {
        System.out.println("Warrior uses Shield Block!");
    }

    @Override
    public void heal(int amount) {
        int currentHp = getHealthPoints();
        if(currentHp + amount > 80) {
            try {
                setHealthPoints(80);
            } catch(InvalidHealthException e) {
                System.out.println(e);
            }
        } else {
            try {
                setHealthPoints(80);
            } catch(InvalidHealthException e) {
                System.out.println(e);
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + " ROLE: Mage";
    }

    public void levelUp() {
        int newLevel = getLevel() + 1;
        setLevel(newLevel);
        try {
            setHealthPoints(80);
        } catch(InvalidHealthException e) {
            System.out.println(e);
        }
    }

    public void useAbility() {
        System.out.println("Mage uses Mana Shield!");
    }
}
