package factory;

import domain.Ticket;
import domain.Train;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrainFactoryTest {

    @Test
    public void train() {
        String trainID = "9702a";
        String trainName = "GoodWood";
        String destName = "GoodWoodCPT ";

        Train  tt = TrainFactory.Train(trainID,trainName,destName);
        System.out.println(tt);
        Assert.assertNotNull(tt);

    }
}