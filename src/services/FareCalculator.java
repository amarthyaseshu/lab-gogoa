package services;

import model.Bus;
import model.Flight;
import model.Hotel;
import model.Train;

public class FareCalculator extends Booking{
	public double book(Hotel hotel) {
		int noOfPersons=hotel.getNoOfPersons();
		int rates=hotel.getRates();
		double totalrate=super.booking(noOfPersons, rates);
		return totalrate;
		
	}
	public double book(Flight flight) {
		int noOfPersons=flight.getNoOfPersons();
		int rates=flight.getRates();
		double totalrate=super.booking(noOfPersons, rates);
		return totalrate;
		
	}
	public double book(Train train) {
		int noOfPersons=train.getNoOfPersons();
		int rates=train.getRates();
		double totalrate=super.booking(noOfPersons, rates);
		return totalrate;
		
	}
	public double book(Bus bus) {
		int noOfPersons=bus.getNoOfPersons();
		int rates=bus.getRates();
		double totalrate=super.booking(noOfPersons, rates);
		return totalrate;
		
	}

}