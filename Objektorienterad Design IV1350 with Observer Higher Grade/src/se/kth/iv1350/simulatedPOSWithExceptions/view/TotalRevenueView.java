package se.kth.iv1350.simulatedPOSWithExceptions.view;

import se.kth.iv1350.simulatedPOSWithExceptions.TotalRevenueTemplate;

/**
 * Class extending the observer class, printing the current total revenue to the screen.
 */
public class TotalRevenueView extends TotalRevenueTemplate {

	/**
	 * Formats the total revenue and prints to screen.
	 * @param totalRevenue new revenue to print.
	 */
	@Override
	protected void doPrintCurrentTotalRevenue(double totalRevenue) {
		try {
			System.out.print("\n\n##################################\n#\t\t\t\t\t\t\t\t #\n#\t");
			System.out.print("Total revenue view: " + totalRevenue);
			System.out.println("\t #\n#\t\t\t\t\t\t\t\t #\n##################################\n");
		}
		catch(Exception e){
			handleErrors(e);
		}
	}

	protected void handleErrors(Exception e) {
		System.out.println("Unable to print to screen.");
		e.printStackTrace();
	}
}
