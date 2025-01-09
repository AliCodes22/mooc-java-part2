package application;

import application.Sensor;

public class StandardSensor implements Sensor {
    private int number;
    private boolean on;

    public StandardSensor(int num) {
        this.number = num;
        this.on = true;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override 
    public void setOn() {
        this.on = true;
    }

    @Override 
    public void setOff() {
        return;
    }

    @Override
    public int read() {
       return this.number;
    }




    
}
