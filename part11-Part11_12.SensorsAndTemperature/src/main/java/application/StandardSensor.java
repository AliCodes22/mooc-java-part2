package application;

import application.Sensor;

public class StandardSensor implements Sensor {
    private int number;

    public StandardSensor(int num) {
        this.number = num;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override 
    public void setOn() {
    }
    

    @Override 
    public void setOff() {
    }

    @Override
    public int read() {
       return this.number;
    }




    
}
