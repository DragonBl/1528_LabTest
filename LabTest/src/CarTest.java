import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CarTest {

	Car car1;
	
	@Before
	public void setUp() throws Exception {
		car1 = new Car(3000);
	}

	@Test
	public void testGetEngineCapacity() {
		//fail("Not yet implemented");
		assertEquals(3000,car1.getEngineCapacity());
	}

}
