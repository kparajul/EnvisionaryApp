package backend.WeatherPredictions;

import backend.BasePredictionObject.Prediction;

import com.google.gson.annotations.SerializedName;

public class WeatherPrediction {
    @SerializedName("prediction")
    private Prediction prediction = new Prediction();

    @SerializedName("temperature")
    private int temperature;

    @SerializedName("highTempPrediction")
    public boolean highTempPrediction;

    public Prediction getPrediction() {
        return prediction;
    }

    public void setPrediction(Prediction prediction) {
        this.prediction = prediction;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public boolean isHighTempPrediction() {
        return highTempPrediction;
    }

    public void setHighTempPrediction(boolean highTempPrediction) {
        this.highTempPrediction = highTempPrediction;
    }

    // Empty constructor
    public WeatherPrediction() {
    }

    // Constructor with parameters
    public WeatherPrediction(Prediction prediction, int temperature, boolean highTempPrediction) {
        this.prediction = prediction;
        this.temperature = temperature;
        this.highTempPrediction = highTempPrediction;
    }

    public void printPredictionDetails() {
        System.out.println(
                "--------------------------------------------------------------------------------" + "\n" +
                        "Weather Prediction Details:" + "\n" +
                        "BasePredictionsObject.Prediction Type: " + prediction.getPredictionType() + "\n" +
                        "BasePredictionsObject.Prediction Content: " + prediction.getPredictionContent() + "\n" +
                        "BasePredictionsObject.Prediction Made Date: " + prediction.getPredictionMadeDate() + "\n" +
                        "BasePredictionsObject.Prediction End Date: " + prediction.getPredictionEndDate() + "\n" +
                        "Reminder Frequency: " + prediction.getRemindFrequency() + "\n" +
                        "--------------------------------------------------------------------------------" + "\n" +
                        "Weather Prediction Details:" + "\n" +
                        "Temperature: " + getTemperature() + "\n" +
                        "High Temperature Prediction: " + isHighTempPrediction() + "\n" +
                        "--------------------------------------------------------------------------------"
        );
    }
}