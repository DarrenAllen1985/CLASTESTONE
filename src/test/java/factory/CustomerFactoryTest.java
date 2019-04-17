package factory;

import domain.Customer;
import domain.Destination;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerFactoryTest {

    @Test
    public void getStudent() {

        String name = "GoodWood";
        Customer cust = CustomerFactory.getStudent("Aldado", "Dampies",2015);
        System.out.println(cust);
        Assert.assertNotNull(cust);
    }
    }
