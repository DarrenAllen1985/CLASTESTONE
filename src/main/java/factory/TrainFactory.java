package factory;

import domain.Ticket;
import domain.Train;


public class TrainFactory {


    public static Train Train(String trainID, String trainName, String destName) {
        return new Train.Builder().destName(destName)
                .trainID(trainID)
                .trainName(trainName)
                .build();
    }

}
