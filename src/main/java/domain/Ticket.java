package domain;

public class Ticket {
    private String destName;
    private String custName;
    private String ticketId;

    private Ticket(){}

    private Ticket(Ticket.Builder builder)
    {
        this.destName = builder.destName;
        this.custName = builder.custName;
        this.ticketId = builder.ticketId;
    }

    public String getdestName() {
        return destName;
    }
    public String getcustName() {
        return custName;
    }
    public String getticketId() {
        return ticketId;
    }

    public static class Builder{

        private String destName;
        private String custName;
        private String ticketId;

        public Ticket.Builder destName(String destName) {
            this.destName = destName;
            return this;
        }

        public Ticket.Builder custName (String custName) {
            this.custName = custName;
            return this;
        }
        public Ticket.Builder ticketId (String ticketId) {
            this.ticketId = ticketId;
            return this;
        }

        public Ticket build() {
            return new Ticket(this);
        }
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "destName='" + destName + '\'' +
                ", custName='" + custName + '\'' +
                ", ticketId='" + ticketId + '\'' +
                '}';
    }
}
