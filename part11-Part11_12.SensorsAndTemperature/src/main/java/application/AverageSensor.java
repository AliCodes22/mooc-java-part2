package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private ArrayList<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    public boolean isOff() {
        for(Sensor sensor: this.sensors) {
            if(sensor.isOn()) {
                return false;
            }
        }

        return true;

    }

    @Override
    public boolean isOn() {
        for(Sensor sensor: this.sensors) {
            if(!sensor.isOn()) {
                return false;
            }
        }

        return true;
    }

    @Override
    public void setOn() {
        for(Sensor sensor: this.sensors) {
            sensor.setOn();;
        }
    }

    @Override
    public void setOff() {
        for(Sensor sensor: this.sensors) {
            sensor.setOff();
        }
    }

    @Override
    public int read() {

        if(this.isOff() || this.sensors.size() == 0) {
            throw new IllegalStateException();
        }

        int sum = 0;
        int size = this.sensors.size();

        for(Sensor sensor: this.sensors) {
            sum += sensor.read();
        }
        int average = sum / size;
        this.readings.add(average);

        return  average;
    }

    public List<Integer> readings() {
       return new ArrayList<>(this.readings);
    }

}
