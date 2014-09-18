package salesTaxesTests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import salesTaxes.Good;
import salesTaxes.TaxFreeGood;

public class TaxFreeGoodTest {

	Good g;
	
	@Before
	 public void setUp() {
		 g = new TaxFreeGood("item", 100.00);
	 }

	@Test
	public void testComputeTaxes() {
		assertEquals(0, g.computeTaxes(), 0.001);
	}

	@Test
	public void testComputePrice() {
		assertEquals(g.getPrice(), g.computePrice(), 0.001);
	}

}
