package salesTaxes;

import java.util.ArrayList;

/**
 * The class defining a receipt, i.e. a list of goods
 * 
 * @author Lorenzo
 *
 */
public class Receipt {
	
	ArrayList<Good> goods;
	
	
	public Receipt() {
		goods  = new ArrayList<Good>();
	}
	
	public void addItem(Good good) {
		goods.add(good);
	}
	
	/**
	 * Compute the total amount of taxes to pay for all the items
	 * @return the total taxes
	 */
	public double getTotalTaxes() {
		double total = 0;
		for(Good g : goods)
			total += g.computeTaxes();
		return total;
	}
	
	/**
	 * Compute the total amount to pay for the items
	 * @return the total
	 */
	public double getTotal() {
		double total = 0;
		for(Good g : goods)
			total += g.computePrice();
		return total;
	}
	
	public String toString() {
		String s = "";
		for(Good g : goods)
			s += g.getDescription()+"\n";
		s += "Sales Taxes: "+OutputFormatter.doubleFormat(getTotalTaxes())+"\n";
		s += "Total: "+OutputFormatter.doubleFormat(getTotal());
		return s;
	}
	
}
