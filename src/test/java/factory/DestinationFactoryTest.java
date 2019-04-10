package factory;

import domain.Destination;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DestinationFactoryTest {

    @Test
    public void getdestName() {
        String name = "GoodWood";
        Destination c = DestinationFactory.getdestName(name);
        System.out.println(c);
        Assert.assertNotNull(c);
    }
}