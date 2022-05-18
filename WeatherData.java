import java.util.ArrayList;
import interfaces.Observer;
import interfaces.Subject;

public class WeatherData implements Subject{

  private ArrayList<Observer> observers;
  private float temp;
  private float humidity;
  private float pressure;
  
  public WeatherData(){
    observers = new ArrayList<Observer>();
  }

  @Override
  public void registerObserver(Observer o){
    observers.add(o);
  }

  @Override
  public void removeObserver(Observer o){
    int i = observers.indexOf(o);
    if(i >= 0){
      observers.remove(o);
    }
  }

  @Override
  public void notifyObserver(){
    for(int i = 0; i < observers.size(); i++){
      Observer observer = (Observer)observers.get(i);
      observer.update(temp, humidity, pressure);
    }
  }
  
  public void setMeasurementsChanged(float temperature, float humidity, float pressure){

    temp = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
  }

  public void measurementsChanged(){
    notifyObserver();
  }
}