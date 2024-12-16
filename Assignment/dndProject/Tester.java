import java.util.Random;
import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        int partySize = randomNumber.nextInt(5) + 2;
        ArrayList <Character> adventureParty = new ArrayList<Character>();

        for(int i = 0; i < partySize; i ++) {
            Character newCharacter = createRandomCharacter();
            adventureParty.add(newCharacter);
        }

        System.out.println("A New party has been created, here are all the memebers:");
        for(Character partyMember : adventureParty) {
            partyMember.toString();
        }

        System.out.println("Your party has leveled up here are their new stats:");
        for(Character partyMember : adventureParty) {
            partyMember.setLevel(2);
            partyMember.toString();
        }

    }

    public static Character createRandomCharacter() {
        Character newCharacter;
        Random randomNumber = new Random();
        int randomRole = randomNumber.nextInt(3) + 1;
        int randomName = randomNumber.nextInt(20) + 1;
        int randomDamage = randomNumber.nextInt(41) + 10;

        String [] fantasyNames= {
            "Arinor", "Thalor", "Draven", "Eldric", "Borin", "Galdor", "Fenrik", "Rurik", "Kaelith", "Zephyros", "Elara", "Lyanna", "Mirelle", "Selene", "Vaelora", "Amara", "Thyra", "Nymeria", "Ilyana", "Sylphira"
        };

        switch(randomRole) {
            case 1: 
                newCharacter = new Warrior(fantasyNames[randomName], 1, "Sword", randomDamage);
                break;
            case 2:
                newCharacter = new Mage(fantasyNames[randomName], 1, "Magical Staff", randomDamage);
                break;
            case 3:
                newCharacter = new Rogue(fantasyNames[randomName], 1, "Dagger", randomDamage);
                break;
            default:
                newCharacter = new Mage("Bob");
        }

        return newCharacter;
    }
}
