package factory;

import domain.Customer;
import util.Misc;

public class CustomerFactory {

    public static Customer getStudent(String custName, String custSurname, int custID) {
        return new Customer.Builder().custID(custID)
                .custName(custName)
                .custSurname(custSurname)
                .build();
    }
}
