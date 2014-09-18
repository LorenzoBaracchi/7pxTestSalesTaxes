package salesTaxes;

/**
 * Class defining the standard behavior for every good that has taxes and is imported
 * 
 * @author Lorenzo
 *
 */
public class TaxedImportedGood extends TaxedGood {
	
	public TaxedImportedGood(String name, double price) {
		super(name, price);
	}
	
	

	@Override
	public double computeTaxes() {
		double tax = this.getPrice() * TAX_RATE / 100;
		double imported = this.getPrice() * IMPORTED_TAX_RATE / 100;
		return round(tax + imported);
	}
}
