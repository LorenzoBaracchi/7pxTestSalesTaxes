package salesTaxesTests;

import org.junit.Test;

import salesTaxes.Receipt;
import salesTaxes.TaxFreeGood;
import salesTaxes.TaxFreeImportedGood;
import salesTaxes.TaxedGood;
import salesTaxes.TaxedImportedGood;
import static org.junit.Assert.assertEquals;



public class ReceiptTest {
	
	

	@Test
	public void testInput1() {
		Receipt test = new Receipt();
		test.addItem(new TaxFreeGood("book", 12.49));
		test.addItem(new TaxedGood("music CD", 14.99));
		test.addItem(new TaxFreeGood("chocolate bar", 0.85));
		
		System.out.println("Test 1");
		System.out.println(test);
		System.out.println();
		
		assertEquals(1.50, test.getTotalTaxes(), 0.00001);
		assertEquals(29.83, test.getTotal(), 0.00001);
			
	}
	
	@Test
	public void testInput2() {
		Receipt test = new Receipt();
		test.addItem(new TaxFreeImportedGood("imported box of chocolates", 10.00));
		test.addItem(new TaxedImportedGood("imported bottle of perfume", 47.50));
		
		System.out.println("Test 2");
		System.out.println(test);
		System.out.println();
		
		assertEquals(7.65, test.getTotalTaxes(), 0.00001);
		assertEquals(65.15, test.getTotal(), 0.00001);
			
	}
	
	@Test
	public void testInput3() {
		Receipt test = new Receipt();
		test.addItem(new TaxedImportedGood("imported bottle of perfume", 27.99));
		test.addItem(new TaxedGood("bottle of perfume ", 18.99));
		test.addItem(new TaxFreeGood("packet of headache pills", 9.75));
		test.addItem(new TaxFreeImportedGood("box of imported chocolates", 11.25));
		
		System.out.println("Test 3");
		System.out.println(test);
		System.out.println();
		
		assertEquals(6.70, test.getTotalTaxes(), 0.00001);
		assertEquals(74.68, test.getTotal(), 0.00001);
			
	}


}
