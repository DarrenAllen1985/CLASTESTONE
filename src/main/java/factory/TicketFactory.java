package factory;

import domain.Customer;
import domain.Ticket;

public class TicketFactory {

    public static Ticket Ticket(String destName, String custNamee, String ticketId) {
        return new Ticket.Builder().custName(custNamee)
                .destName(destName)
                .ticketId(ticketId)
                .build();
    }
}
