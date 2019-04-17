package domain;

import java.util.Set;

public class NName {
    private String Fname;
    private String Mname;
    private String Lname;

    private NName(){}

    private NName(Builder builder){
        this.Fname = builder.Fname;
        this.Mname = builder.Mname;
        this.Lname = builder.Lname;
    }

    public String getFname() {
        return Fname;
    }
    public String getMname() {
        return Mname;
    }
    public String  getLname() {return Lname;}

    public static class Builder {

        private String Fname, Mname,Lname ;
        private Set<Destination> Destinations;

        public Builder Fname( String Fname) {
            this.Fname = Fname;
            return this;
        }

        public Builder Mname( String Mname) {
            this.Mname = Mname;
            return this;
        }

        public Builder Lname( String Lname) {
            this.Lname = Lname;
            return this;
        }

        public NName build() {
            return new NName(this);
        }
    }

    @Override
    public String toString() {
        return "NName{" +
                "Fname='" + Fname + '\'' +
                ", Mname='" + Mname + '\'' +
                ", Lname='" + Lname + '\'' +
                '}';
    }
}
