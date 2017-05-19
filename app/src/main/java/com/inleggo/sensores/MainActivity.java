package com.inleggo.sensores;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SensorEventListener{

    SensorManager sm;
    Sensor luz;
    Sensor prox;
    Sensor acel;
    Sensor temp;
    Sensor grav;
    Sensor giro;
    Sensor lace;
    Sensor magn;
    //Sensor orie;
    TextView txtSalida;
    String msgSalida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtSalida   = (TextView)findViewById(R.id.txtSalida);
        sm          = (SensorManager)getSystemService(Context.SENSOR_SERVICE);
        luz         = sm.getDefaultSensor(Sensor.TYPE_LIGHT);
        prox        = sm.getDefaultSensor(Sensor.TYPE_PROXIMITY);
        acel        = sm.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        temp        = sm.getDefaultSensor(Sensor.TYPE_AMBIENT_TEMPERATURE);
        grav        = sm.getDefaultSensor(Sensor.TYPE_GRAVITY);
        giro        = sm.getDefaultSensor(Sensor.TYPE_GYROSCOPE);
        lace        = sm.getDefaultSensor(Sensor.TYPE_LINEAR_ACCELERATION);
        magn        = sm.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD);
        //orie        = sm.getDefaultSensor(Sensor.TYPE_ORIENTATION);

        msgSalida = "Listado de Sensores: \n\n";

        if(luz!=null){
            msgSalida += "Luz                    :"+luz.getName()+"\n";
        }

        if(prox!=null){
            msgSalida += "Proximidad      :"+prox.getName()+"\n";
        }

        if(acel!=null){
            msgSalida += "Acelerómetro  :"+acel.getName()+"\n";
        }

        if(temp!=null){
            msgSalida += "Temperatura   :"+temp.getName()+"\n";
        }

        if(grav!=null){
            msgSalida += "Grevedad      :"+grav.getName()+"\n";
        }

        if(giro!=null){
            msgSalida += "Giroscopio    :"+giro.getName()+"\n";
        }

        if(lace!=null){
            msgSalida += "Aceleración L :"+lace.getName()+"\n";
        }

        if(magn!=null){
            msgSalida += "Campo magn. :"+magn.getName()+"\n";
        }

        txtSalida.setText(msgSalida);

    }

    @Override
    public void onSensorChanged(SensorEvent event) {

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
