package com.example.bk_home_smarter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallbackExtended;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;

import java.nio.charset.StandardCharsets;

public class HomeActivity extends AppCompatActivity {

    MQTTService mqttService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        mqttService = new MQTTService(this);
        mqttService.setCallback(new MqttCallbackExtended() {
            @Override
            public void connectComplete(boolean reconnect, String serverURI) {
            }
            @Override
            public void connectionLost( Throwable cause){
            }

            @Override
            public void messageArrived(String topic, MqttMessage message) throws Exception {
                // String data_to_microbit = message.toString();
                // port.write(data_to_microbit.getBytes(),1000);
                Log.d(topic, message.toString());
                Toast myToast = Toast.makeText(getApplicationContext(), message.toString(), Toast.LENGTH_SHORT);
                myToast.show();
            }
            @Override
            public void deliveryComplete(IMqttDeliveryToken token) {
            }
        });
    }


    public void sendDataMQTT(String data){
        MqttMessage msg = new MqttMessage();
        msg.setId(1234);
        msg.setQos(0);
        msg.setRetained(true);

        byte[] b = data.getBytes(StandardCharsets.UTF_8);
        msg.setPayload(b);

        Log.d("ABC","Publish:"+ msg);
        try {
            mqttService.mqttAndroidClient.publish("bkdadn202/feeds/light", msg);
        } catch ( MqttException e){
            Log.d("MQTT", "sendDataMQTT: can not send anything");
        }
    }
}