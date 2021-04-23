package usantatecla.movies.v24;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Customer {

	private String name;
	
	private List<Rental> rentals;
	
	private double totalCharge = 0;
	
	private int totalFrequentRenterPoints = 0;
	

	public Customer(String name) {
		this.name = name;
		rentals = new ArrayList<Rental>();
	}

	public void addRental(Rental rental) {
		rentals.add(rental);
	}

	public String getName() {
		return name;
	}
	
	public Double getTotalCharge() {
		return totalCharge;
	}

	public void setTotalCharge(Double charge) {
		totalCharge=charge;
	}

	public int getTotalFrequentRenterPoints() { return totalFrequentRenterPoints; }

	public void setTotalFrequentRenterPoints(int frequentRenterPoints) {
		totalFrequentRenterPoints=frequentRenterPoints;
	}
	

	public String statement() {
		Iterator<Rental> rentals = this.rentals.iterator();
		String result = "Rental Record for " + this.getName() + "\n";
		while (rentals.hasNext()) {
			Rental rental = rentals.next();
			this.setTotalCharge(this.getTotalCharge()+rental.getCharge());
			this.setTotalFrequentRenterPoints(this.getTotalFrequentRenterPoints()+rental.getFrequentRenterPoints());
			result += "\t" + rental.getTitle() + "\t" + String.valueOf(rental.getCharge()) + "\n";
		}
		result += "Amount owed is " + String.valueOf(this.getTotalCharge()) + "\n";
		result += "You earned " + String.valueOf(this.getTotalFrequentRenterPoints()) + " frequent renter points";
		return result;
	}
	
}
