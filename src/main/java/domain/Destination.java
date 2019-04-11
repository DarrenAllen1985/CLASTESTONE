package domain;

public class Destination {
    private String destName;
    private int destId;

    private Destination(){}

    private Destination(Builder builder)
    {
        this.destName = builder.destName;
        this.destId = builder.destId;
    }

    public String getdestName() {
        return destName;
    }

    public static class Builder{

        private String destName;
        private int destId;

        public Builder destName(String destName) {
            this.destName = destName;
            return this;
        }

        public Builder destId (int destId) {
            this.destId = destId;
            return this;
        }

        public Destination build() {
            return new Destination(this);
        }

    }

    @Override
    public String toString() {
        return "Destination{" +
                "destName='" + destName + '\'' +
                ", destId=" + destId +
                '}';
    }
}
