import org.junit.Before;
import org.junit.Test;
import staff.Employee;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){

        manager = new Manager("Niall", 8675309, 100000.00, "Cool Socks");
    }

    @Test
    public void hasName(){
        assertEquals("Niall", manager.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals(8675309, manager.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(100000.00, manager.getSalary(), 0.1);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Cool Socks", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(110000.00, manager.raiseSalary(10000.00), 0.1);
    }

    @Test
    public void canPayBonus(){
        assertEquals(1000, manager.payBonus(), 0.1);
    }
}
