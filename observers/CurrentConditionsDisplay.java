package observers;
import interfaces.DisplayElement;
import interfaces.Observer;
import interfaces.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
  private float temp;
  private float humidity;
  private Subject weatherData;

  public CurrentConditionsDisplay(Subject weatherData){
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  @Override
  public void update(float temperature, float humidity, float pressure){
    temp = temperature;
    this.humidity = humidity;
    display();
  }

  @Override
  public void display(){
    System.out.println("Current conditions: " + temp + " F degrees and " +        humidity + " %     humidity");
  }
}