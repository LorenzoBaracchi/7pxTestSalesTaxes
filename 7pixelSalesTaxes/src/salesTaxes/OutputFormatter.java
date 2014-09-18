package salesTaxes;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 * Class used to provide a standardized format for the output
 * 
 * @author Lorenzo
 *
 */
public class OutputFormatter {
	
	public static String doubleFormat(double value) {
		DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols();
		otherSymbols.setDecimalSeparator('.');
		otherSymbols.setGroupingSeparator(',');
		DecimalFormat formatter = new DecimalFormat("#0.00", otherSymbols);
		return formatter.format(value);
	}

}
