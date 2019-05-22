import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SoftwareSalesTest {
	
	SoftwareSales s;

	@Before
	public void setUp() throws Exception {
		 s = new SoftwareSales();

	}

	@Test
	public void testBuyOneSoftwarePackage() {
		double finalPrice = s.calculatePrice(2);
		// When comparing decimals in JUnit, you must add a 3rd parameter to the assertEquals() function. Use smallest number like 0 or 0.0001
		assertEquals(198, finalPrice,0);
		
		
	}
	@Test
	public void testBuy10Packages() {
		double finalPrice = s.calculatePrice(12);
		assertEquals(950.4, finalPrice,0);
	}
	
	@Test
	public void testBuy20Packages() {
		double finalPrice = s.calculatePrice(30);
		assertEquals(2079, finalPrice,0);
	}
	
	@Test
	public void testBuy50Packages() {
		double finalPrice = s.calculatePrice(60);
		assertEquals(3564, finalPrice,0);
	}
	
	@Test
	public void testBuy100Packages() {
		double finalPrice = s.calculatePrice(120);
		assertEquals(5940, finalPrice,0);
	}
	
	@Test
	public void testZeroQuantity() {
		double finalPrice = s.calculatePrice(0);
		assertEquals(5940, finalPrice,0);
	}
	
	

}
