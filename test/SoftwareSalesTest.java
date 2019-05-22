import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SoftwareSalesTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testBuyOneSoftwarePackage() {
		SoftwareSales s = new SoftwareSales();
		double finalPrice = s.calculatePrice(2);
		// When comparing decimals in JUnit, you must add a 3rd parameter to the assertEquals() function. Use smallest number like 0 or 0.0001
		assertEquals(198, finalPrice,0);
		
		
	}
	@Test
	public void testBuy10Packages() {
		SoftwareSales s = new SoftwareSales();
		double finalPrice = s.calculatePrice(2);
		assertEquals(950.4, finalPrice,0);
	}
	

}
