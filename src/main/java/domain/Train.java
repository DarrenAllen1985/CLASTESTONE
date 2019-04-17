package domain;

public class Train {
    String trainID;
    String trainName;
    String destName;

    private Train(){}

    private Train(Train.Builder builder)
    {
        this.trainID = builder.trainID;
        this.trainName = builder.trainName;
        this.destName = builder.destName;
    }

    public String gettrainID() {
        return trainID;
    }
    public String gettrainName() {
        return trainName;
    }
    public String getdestName() {
        return destName;
    }

    public static class Builder{

        private String trainID;
        private String trainName;
        private String destName;

        public Train.Builder trainID(String trainID) {
            this.trainID = trainID;
            return this;
        }

        public Train.Builder trainName (String trainName) {
            this.trainName = trainName;
            return this;
        }
        public Train.Builder destName (String destName) {
            this.destName = destName;
            return this;
        }

        public Train build() {
            return new Train(this);
        }
    }

    @Override
    public String toString() {
        return "Train{" +
                "trainID='" + trainID + '\'' +
                ", trainName='" + trainName + '\'' +
                ", destName='" + destName + '\'' +
                '}';
    }
}
