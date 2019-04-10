package domain;

public class Destination {
    private String destName;

    private Destination(){}

    private Destination(Builder builder) {
        this.destName = builder.destName;
    }

    public String getdestName() {
        return destName;
    }

    public static class Builder{

        private String destName;

        public Builder destName(String destName) {
            this.destName = destName;
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
                '}';
    }
}
