package salesTaxes;

/**
 * Class defining the standard behavior for every good that has no taxes 
 * (books,food, and medical products) 
 * but it is imported
 * 
 * @author Lorenzo
 *
 */
public class TaxFreeImportedGood extends TaxFreeGood {
	
	public TaxFreeImportedGood(String name, double price) {
		super(name, price);
	}
	

	@Override
	public double computeTaxes() {
		double tax = this.getPrice() * IMPORTED_TAX_RATE / 100;
		return round(tax);
	}
}
