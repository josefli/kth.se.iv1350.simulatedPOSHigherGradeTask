package se.kth.iv1350.simulatedPOSWithExceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Class extending the observer class, logging the current total revenue to a file.
 */

public class TotalRevenueFileOutput extends TotalRevenueTemplate {
	private PrintWriter logStream;

	/**
	 * Creates a new instance and a new log file.
	 * Existing log file will be deleted.
	 */
	public TotalRevenueFileOutput() {
		try {
			logStream = new PrintWriter(new FileWriter("revenueFileLog.txt"), true);
		} catch (IOException e) {
			handleErrors(e);
		}
	}

	private void log(String msg){
		logStream.println(msg);
	}

	/**
	 * Formats the total revenue and prints to defined file.
	 * @param totalRevenue new revenue to log.
	 */
	@Override
	protected void doPrintCurrentTotalRevenue(double totalRevenue) {
		try {
			log("New total revenue: " + totalRevenue + "\n\n");
		}
		catch(Exception e){
			handleErrors(e);
		}
	}

	/**
	 * Handles errors that may be thrown upon initiation/logging.
	 * @param e error to handle.
	 */
	@Override
	protected void handleErrors(Exception e) {
		System.out.println("Unable to log.");
		e.printStackTrace();
	}
}
