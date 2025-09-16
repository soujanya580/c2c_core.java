package com.tns.nonaccessmodifier;

public class Mainapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       FlightTicketCounter.display();
        
        FlightTicketCounter.bookTicket(2); 
        FlightTicketCounter.bookTicket(5); 
        FlightTicketCounter.bookTicket(4); 
        
       
        FlightTicketCounter.display();
		

	}

}
