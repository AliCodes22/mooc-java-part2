package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {
    private boolean isOff;
    private boolean isOn;


    public TemperatureSensor() {
        this.isOff = true;
        this.isOn = false;
    }

    @Override
    public boolean isOn() {
        return this.isOn;
    }

    @Override
    public void setOn() {
        this.isOn = true;
        this.isOff = false;
    }

    @Override
    public void setOff() {
        this.isOff = true;
        this.isOn = false;
    }

    @Override
    public int read() {
       if(!this.isOn) {
        throw new IllegalStateException("Sensor is off");
       } 

       return new Random().nextInt(61) - 30;
    }
    
}
