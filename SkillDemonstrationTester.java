import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemonstrationTester {
   
    @Before
    public void setUp() {
    }

    @Test
    public void skillDemonstrationTest() {
        assertEquals(1, SkillDemonstration.subtract(3, 2)); //Fixed Assertion
    }

    
}
