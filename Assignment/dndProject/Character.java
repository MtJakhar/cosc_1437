public abstract class Character {
    private String name;
    private int healthPoints;
    private int level;
    private Weapon myWeapon;

    public Character(String name, int healthPoints, int level) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.level = level;
        this.myWeapon = new Weapon("Stick", 1);
    }

    public Character(String name, int healthPoints, int level, String weaponName, int weaponDamage) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.level = level;
        this.myWeapon = new Weapon(weaponName, weaponDamage);
    }

    //getters
    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getLevel() {
        return level;
    }

    public Weapon getWeapon() {
        return myWeapon;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setHealthPoints(int healthPoints) throws InvalidHealthException {
        if(healthPoints <= 0) {
            throw new InvalidHealthException();
        } else {
            this.healthPoints = healthPoints;
        }
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setWeapon(String name, int damage)  throws InvalidDamageException {
        if(damage <= 0) {
            throw new InvalidDamageException();
        } else {
            this.myWeapon = new Weapon(name, damage);
        }
      
    }

    //methods
    public String toString() {
        return "Name: " + this.name + "\n Hp: " + this.healthPoints + "\n Level: " + this.level + "\n Weapon: " + this.myWeapon;
    }

    public abstract void attack();

    public abstract void heal(int amount);
}