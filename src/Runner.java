import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Hello");
    }

    @Test
    public void test() {
        BodyArmor testBodyArmor = new BodyArmor("Chain");
        assertEquals(testBodyArmor.test(), true);

        Boots testBoots = new Boots(false, "Leather", true);
        assertEquals(testBoots.test(),true);

        Gauntlets testGaunlets = new Gauntlets(1);
        assertEquals(testGaunlets.test(),true);

        Gloves testGloves = new Gloves("Common","The Force",true,5,9,10);
        assertEquals(testGloves.getGloveCost(),9);

        Helmet testHelmet = new Helmet("Gold");
        assertEquals(testHelmet.getWeight(),1.5,0.1);

        Origin testOrigin = new Origin("New York","English","Student","Good","Strength","Intelligence");
        assertEquals(testOrigin.test(),true);

        Shield testShield = new Shield("wood");
        assertEquals(testShield.test(), true);

        Species testSpecies = new Species("Elf");
        assertEquals(testSpecies.testSpecies(), true);

        MeleeWeapon testMeleeWeapon = new MeleeWeapon("Sword", 1, 2, 3, 4, 6);
        assertEquals(testMeleeWeapon.testAll(),true);

        Role testRole = new Role("Rogue");
        assertEquals(testRole.test(), true);
    }
}
