package salesTaxesTests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import salesTaxes.Good;
import salesTaxes.TaxedImportedGood;

public class TaxedImportedGoodTest {

	Good g;
	
	@Before
	 public void setUp() {
		 g = new TaxedImportedGood("item", 100.00);
	 }

	@Test
	public void testComputeTaxes() {
		assertEquals(15, g.computeTaxes(), 0.001);
	}

	@Test
	public void testComputePrice() {
		assertEquals(115, g.computePrice(), 0.001);
	}

}
