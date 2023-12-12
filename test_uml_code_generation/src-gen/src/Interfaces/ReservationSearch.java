/**
 * Generated by Acceleo 3
 * All rights reserved.
 */
package Interfaces;

// Start of user code for imports
import java.util.*;
// End of user code

/**
 * The documentation of the interface ReservationSearch.
 * 
 * @generated
 */
public interface ReservationSearch {
	/**
	 * The documentation of the method get.
	 * 
	 * @param customer
	 * @return
	 * 
	 * @generated
	 */
	public Booking get(Customer customer);
	
	/**
	 * The documentation of the method findByTravel.
	 * 
	 * @param travel
	 * @return
	 * 
	 * @generated
	 */
	public Booking findByTravel(Travel travel);
	
}