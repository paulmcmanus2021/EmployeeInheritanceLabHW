import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Cheryl",6666666, 150000.00,"Mergers", 800000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Cheryl", director.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals(6666666, director.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(150000.00, director.getSalary(), 0.1);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Mergers", director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(200000.00, director.raiseSalary(50000.00), 0.1);
    }

    @Test
    public void canPayBonus(){
        assertEquals(1500, director.payBonus(), 0.1);
    }

    @Test
    public void canHaveBudget(){ assertEquals( 800000, director.getBudget(), 0.1);
    }
}
