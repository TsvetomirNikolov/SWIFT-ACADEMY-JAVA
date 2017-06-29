package rpg_tests;

import SoftuniClasses.Axe;
import SoftuniClasses.Dummy;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DummyTests {

    private static final int DUMMY_HEALTH = 10;
    private static final int DUMMY_EXPERIENCE = 10;
    private static final int ATTACK_POINTS = 10;
    private static final int DURABILITY_POINTS = 10;
    private static final int EXPECTED_DURABILITY = DURABILITY_POINTS - 1;
    private Dummy dum;
    private Axe axe;

    @Before
    public void initializeObjects() {
        this.dum = new Dummy(DUMMY_HEALTH, DUMMY_EXPERIENCE); // Arrange
        this.axe = new Axe(ATTACK_POINTS, DURABILITY_POINTS);
    }

    @Test(expected = IllegalArgumentException.class)
    public void dummyLossesHealthIfAttack() {
        this.axe.attack(this.dum); // Act
        Assert.assertEquals("Wrong durability", EXPECTED_DURABILITY, this.axe.getDurabilityPoints()); // Assert
    }

    @Test(expected = IllegalArgumentException.class)
    public void dummyThrowsExceptionIfAttached() {
        if (dum.isDead()) {
            Assert.assertEquals("Dummy is dead", DUMMY_HEALTH, ATTACK_POINTS);
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void deadDummyCanGiveXp() {
        if (dum.isDead()) {
            Assert.assertEquals("Wrong Experience", DUMMY_EXPERIENCE, this.dum.giveExperience());
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void aliveDummyCantGiveXP() {
        while (true) {
            dum.takeAttack(ATTACK_POINTS);
            if (dum.getHealth() > 0) {
                Assert.assertEquals("Can't give experience", ATTACK_POINTS, dum.getHealth());
            }
        }
    }
}
