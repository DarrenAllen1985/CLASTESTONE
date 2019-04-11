package factory;

import domain.Destination;
import util.Misc;

public class DestinationFactory {
    public static Destination getdestName(String destName) {
        return new Destination.Builder().destName(destName)
                .destId(Misc.generateId())
                .build();
    }

}
