package salesTaxes;

/**
 * Class defining the standard behavior for every good that has taxes
 * 
 * @author Lorenzo
 *
 */
public class TaxedGood extends Good {
	
	public TaxedGood(String name, double price) {
		this.setName(name);
		this.setPrice(price);
	}
	

	@Override
	public double computeTaxes() {
		double tax = this.getPrice() * TAX_RATE / 100;
		return round(tax);
	}

}
