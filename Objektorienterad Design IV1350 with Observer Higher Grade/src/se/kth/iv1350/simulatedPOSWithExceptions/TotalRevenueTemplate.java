package se.kth.iv1350.simulatedPOSWithExceptions;

import se.kth.iv1350.simulatedPOSWithExceptions.model.SaleObserver;

public abstract class TotalRevenueTemplate implements SaleObserver {
	private double totalRevenue;

	protected TotalRevenueTemplate(){
		totalRevenue = 0;
	}

	/**
	 * Prints new total revenue.
	 * @param newSale sale to add to revenue.
	 */
	public void newRunningTotal(double newSale){
		addNewRevenue(newSale);
		printTotalRevenue();
	}

	private void addNewRevenue(double newSale){
		totalRevenue += newSale;
	}

	private void printTotalRevenue(){
		try{
			doPrintCurrentTotalRevenue(totalRevenue);
		}
		catch(Exception e){
			handleErrors(e);
		}
	}

	/**
	 * Abstract class which is implemented in the extending classes and defines the print function.
	 * @param totalRevenue revenue to print.
	 */
	protected abstract void doPrintCurrentTotalRevenue(double totalRevenue);

	/**
	 * Abstract class which is implemented in the extending classes and defines the exception handling of the class.
	 * @param e exception to handle.
	 */
	protected abstract void handleErrors(Exception e);
}
