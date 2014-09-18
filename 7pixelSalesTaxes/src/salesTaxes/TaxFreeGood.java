package salesTaxes;

/**
 * Class defining the standard behavior for every good that has no taxes
 * (books, food, and medical products) 
 * 
 * @author Lorenzo
 *
 */
public class TaxFreeGood extends Good {
	
	public TaxFreeGood(String name, double price) {
		this.setName(name);
		this.setPrice(price);
	}

	@Override
	public double computeTaxes() {
		return 0;
	}

}
