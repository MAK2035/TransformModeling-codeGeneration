/**
 * Generated by Acceleo 3
 * All rights reserved.
 */
package Interfaces;

// Start of user code for imports
import java.util.*;
// End of user code

/**
 * The documentation of the interface Bookings.
 * 
 * @generated
 */
public interface Bookings {
	/**
	 * The documentation of the method createTentativeReservation.
	 * 
	 * @return
	 * 
	 * @generated
	 */
	public Booking createTentativeReservation();
	
	/**
	 * The documentation of the method option.
	 * 
	 * @param res
	 * 
	 * @generated
	 */
	public void option(Booking res);
	
	/**
	 * The documentation of the method confirm.
	 * 
	 * @param res
	 * 
	 * @generated
	 */
	public void confirm(Booking res);
	
	/**
	 * The documentation of the method cancel.
	 * 
	 * @param res
	 * 
	 * @generated
	 */
	public void cancel(Booking res);
	
	/**
	 * The documentation of the method update.
	 * 
	 * @param res
	 * 
	 * @generated
	 */
	public void update(Booking res);
	
}