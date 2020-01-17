package p213co.znly.core.sensormanager;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.HashMap;

/* renamed from: co.znly.core.sensormanager.GoSensorManager */
public class GoSensorManager implements SensorEventListener {
    private final Handler handler;
    private final HandlerThread handlerThread = new HandlerThread("co.znly.core.sensormanager.thread");
    private final HashMap<Sensor, Integer> samplingPeriods = new HashMap<>();
    private final SensorManager sensorManager;
    private final HashMap<Integer, Sensor> sensors = new HashMap<>();

    public GoSensorManager(Context context) {
        this.sensorManager = (SensorManager) context.getSystemService("sensor");
        this.handlerThread.start();
        this.handler = new Handler(this.handlerThread.getLooper());
    }

    private native void _onSensorChanged(int i, long j, int i2, float[] fArr);

    public synchronized int addSensor(int i, int i2) {
        if (this.sensors.containsKey(Integer.valueOf(i))) {
            return 1;
        }
        Sensor defaultSensor = this.sensorManager.getDefaultSensor(i);
        if (defaultSensor == null) {
            return 2;
        }
        this.sensors.put(Integer.valueOf(defaultSensor.getType()), defaultSensor);
        this.samplingPeriods.put(defaultSensor, Integer.valueOf(i2));
        return 0;
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        _onSensorChanged(sensorEvent.sensor.getType(), sensorEvent.timestamp, sensorEvent.accuracy, sensorEvent.values);
    }

    public synchronized void start() {
        for (Sensor sensor : this.sensors.values()) {
            this.sensorManager.registerListener(this, sensor, ((Integer) this.samplingPeriods.get(sensor)).intValue(), this.handler);
        }
    }

    public synchronized void stop() {
        this.sensorManager.unregisterListener(this);
    }
}
