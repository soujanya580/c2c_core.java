package com.tns.nonaccessmodifier;

public class FlightTicketCounter {
	
	public static int noOfTickets=100;
	
    public static void display() {
        System.out.println("Available tickets: " + noOfTickets);
    }

    
    public static void bookTicket(int qty) {
        if(qty <= noOfTickets) {
            noOfTickets -= qty;   // reduce tickets
            System.out.println(qty + " ticket(s) booked successfully!");
            display();
        } else {
            System.out.println("Sorry! Only " + noOfTickets + " ticket(s) available.");
        }
    }
}
  