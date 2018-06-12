package sample;

import java.io.Serializable;

import jssc.*;

public class Sensor implements Runnable, Serializable {
    private double value;

    public Sensor() {
        System.out.println("Prøver at oprette forbindelse til sensor");
        SerialPort serialPort = null;
        String[] serialPortList = SerialPortList.getPortNames();
        String forste = serialPortList[0];
        try {


        }catch(Exception ex){

        }
    }


    public double getValue() {
        return value;
    }


    @Override
    public void run() {

    }
}
