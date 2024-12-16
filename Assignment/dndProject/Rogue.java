public class Rogue extends Character implements Role {
    public Rogue(String name) {
        super(name, 90, 1);
    }

    public Rogue(String name, int level) {
        super(name,90 ,level);
    }

    public Rogue(String name, int level, String weaponName, int damage) {
        super(name, 90, level, weaponName, damage);
    }

    //methods
    @Override
    public void attack() {
        System.out.println("Rogue backstabs the enemy!");
    }

    @Override
    public void heal(int amount) {
        int currentHp = getHealthPoints();
        if(currentHp + amount > 90) {
            try {
                setHealthPoints(90);
            } catch(InvalidHealthException e) {
                System.out.println(e);
            }
        } else {
            try {
                setHealthPoints(90);
            } catch(InvalidHealthException e) {
                System.out.println(e);
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + " ROLE: Rogue";
    }

    public void levelUp() {
        int newLevel = getLevel() + 1;
        setLevel(newLevel);
        try {
            setHealthPoints(90);
        } catch(InvalidHealthException e) {
            System.out.println(e);
        }
    }

    public void useAbility() {
        System.out.println("Rogue uses Stealth!");
    }

}
