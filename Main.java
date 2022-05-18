import observers.CurrentConditionsDisplay;

class Main {
  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();

    CurrentConditionsDisplay currentDisplay = new         
    CurrentConditionsDisplay(weatherData);

    weatherData.setMeasurementsChanged(80, 65, 30.4f);
    weatherData.setMeasurementsChanged(90, 70, 45.5f);
    weatherData.setMeasurementsChanged(30, 10, 5.5f);
    

    
  }
}