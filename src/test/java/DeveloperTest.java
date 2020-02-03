import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Paul", 2021202,50000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Paul", developer.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals(2021202, developer.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(50000.00, developer.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(60000, developer.raiseSalary(10000.00), 0.1);
    }

    @Test
    public void canPayBonus(){
        assertEquals(500, developer.payBonus(), 0.1);
    }

}
