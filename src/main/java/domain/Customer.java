package domain;

import javafx.util.Builder;

import java.util.Set;

public class Customer {
    private String custName;
    private String custSurname;
    private int custID;
    private Set<Destination> Destinations;

    private Customer(){}

    private Customer(Builder builder){
        this.custName = builder.custName;
        this.custSurname = builder.custSurname;
        this.custID = builder.custID;
    }

    public String getCustName() {
        return custName;
    }

    public String getCustSurname() {
        return custSurname;
    }

    public int getCustID() {
        return custID;
    }

    public static class Builder {

        private String custName, custSurname;
        private int custID;
        private Set<Destination> Destinations;

        public Builder custName( String custName) {
            this.custName = custName;
            return this;
        }

        public Builder custSurname( String custSurname) {
            this.custSurname = custSurname;
            return this;
        }

        public Builder custID( int custID) {
            this.custID = custID;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custName='" + custName + '\'' +
                ", custSurname='" + custSurname + '\'' +
                ", custID=" + custID +
                ", Destinations=" + Destinations +
                '}';
    }
}
