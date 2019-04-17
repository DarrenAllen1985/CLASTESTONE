package factory;

import domain.NName;
import domain.Ticket;

public class NNameFactory {


    public static NName NName(String Fname, String MName , String Lname) {
        return new NName.Builder().Fname(Fname)
                .Mname(MName)
                .Lname(Lname)
                .build();
    }
}
