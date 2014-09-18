package salesTaxesTests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import salesTaxes.Good;
import salesTaxes.TaxFreeImportedGood;

public class TaxFreeImportedGoodTest {

	Good g;
	Good tf;
	
	@Before
	 public void setUp() {
		 g = new TaxFreeImportedGood("item", 100.00);
		 tf = new TaxFreeImportedGood("box of imported chocolates", 11.25);
	 }

	@Test
	public void testComputeTaxes() {
		assertEquals(5, g.computeTaxes(), 0.001);
		assertEquals(0.6, tf.computeTaxes(), 0.001);
	}

	@Test
	public void testComputePrice() {
		assertEquals(105, g.computePrice(), 0.001);
		assertEquals(11.85, tf.computePrice(), 0.001);
	}

}
