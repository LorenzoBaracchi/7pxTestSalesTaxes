package salesTaxes;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Class defining the standard behavior for every good 
 * 
 * @author Lorenzo
 *
 */
public abstract class Good {

	static int TAX_RATE = 10;
	static int IMPORTED_TAX_RATE = 5;

	private double price;
	private String name;

	/**
	 * It computes the price of the goods
	 * @return price + taxes
	 */
	public double computePrice() {
		return roundTo2Digit(this.getPrice() + computeTaxes());
	}

	/**
	 * It computes the taxese to pay on the good
	 * @return
	 */
	public abstract double computeTaxes();

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {	
		String s = "1 " + name + " at " + OutputFormatter.doubleFormat(computePrice());
		return s;
	}

	/**
	 * Round a value to the nearest 0.05.
	 * It rounds to the ceiling of first two decimal digits, and then computes the nearest to 0.05.
	 * @param value the value to be rounded
	 * @return the rounded value
	 */
	public double round(double value) {
		double rounded = roundUp(value, 2);
		double lastDigit = (int) (((rounded * 100) / Math.pow(10, 0)) % 10);
		if (lastDigit <= 5)
			return Math.round(rounded * 20.0) / 20.0;
		else
			return roundUp(rounded, 1);
	}

	/**
	 * Round a value to its ceiling 
	 * @param value the value to round
	 * @param digit the number of digit to consider for the rounding
	 * @return the rounded value
	 */
	double roundUp(double value, int digit) {
		BigDecimal bd = new BigDecimal(value);
		bd = bd.setScale(digit, RoundingMode.CEILING);
		return bd.doubleValue();
	}

	/**
	 * Round a value to a 2 digit after the comma 
	 * @param value the value to round
	 * @return the rounded value
	 */
	double roundTo2Digit(double value) {
		BigDecimal bd = new BigDecimal(value);
		bd = bd.setScale(2, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}
}
