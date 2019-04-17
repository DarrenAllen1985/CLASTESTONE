package factory;

import domain.Destination;
import domain.Ticket;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TicketFactoryTest {

    @Test
    public void ticket() {
        String destName = "GoodWood";
        String custName ="Darren ";
        String ticketID ="12345";
        Ticket ticketDetails= TicketFactory.Ticket(destName,custName,ticketID);
        System.out.println(ticketDetails);
        Assert.assertNotNull(ticketDetails);
    }
}