package salesTaxesTests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import salesTaxes.Good;
import salesTaxes.TaxedGood;

public class TaxedGoodTest {
	
	Good g;
	
	@Before
	 public void setUp() {
		 g = new TaxedGood("item", 100.00);
	 }

	@Test
	public void testComputeTaxes() {
		assertEquals(10, g.computeTaxes(), 0.001);
	}

	@Test
	public void testComputePrice() {
		assertEquals(110, g.computePrice(), 0.001);
	}

}
