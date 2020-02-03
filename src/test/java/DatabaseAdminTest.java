import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Kevin", 9999999,75000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Kevin", databaseAdmin.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals(9999999, databaseAdmin.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(75000.00, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(80000, databaseAdmin.raiseSalary(5000.00), 0.1);
    }

    @Test
    public void canPayBonus(){
        assertEquals(750, databaseAdmin.payBonus(), 0.1);
    }
}
