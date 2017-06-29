package rpg_tests;

import SoftuniClasses.Axe;
import SoftuniClasses.Dummy;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class AxeTests {
    
    @Test(expected = IllegalArgumentException.class)
    public void weaponLosesDurabilirt() {
        Axe axe = new Axe(10, 10);
        Dummy dummy = new Dummy(10, 10);
        axe.attack(dummy);
        axe.attack(dummy);
        Assert.assertTrue(axe.getAttackPoints() == 9);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void brokenWeaponTest() {
        Axe axe = new Axe(10, 10);
        Dummy dummy = new Dummy(10, 10);
        axe.attack(dummy);
        axe.attack(dummy);
        Assert.assertEquals(9, axe.getDurabilityPoints());
    }
}
