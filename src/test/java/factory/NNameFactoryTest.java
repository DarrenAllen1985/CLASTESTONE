package factory;

import domain.NName;
import domain.Ticket;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NNameFactoryTest {

    @Test
    public void NName() {

        String Fname = "Darren";
        String Mname ="Max ";
        String Lname ="Allen";

        NName xx =NNameFactory.NName(Fname,Mname,Lname);
        System.out.println(xx);
        Assert.assertNotNull(xx);
    }
}