package br.com.ivanamorim.www.loginappivanamorim;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by ivan on 26/02/2016.
 */
public class Display extends Activity {

    DatabaseHelper helper = new DatabaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);
        String username = getIntent().getStringExtra("Username");

        TextView tv = (TextView)findViewById(R.id.TVusername);
        TextView tvLoc = (TextView)findViewById(R.id.textOldLat);
        TextView tvBemVindo = (TextView) findViewById(R.id.Txtbemvindo);

        GPSTracker gpsTracker = new GPSTracker(this);

        tvBemVindo.setText("Bem Vindo, " + username +" ");

        if(gpsTracker.isGPSEnabled){
                double latitude = gpsTracker.latitude;
                double longitude = gpsTracker.longitude;
                tv.setText(" Localizacao Atual: \n Latitude: "+latitude+"\n Longitude: "+longitude);
               /* Toast temp = Toast.makeText(Display.this, " "+username+"\n Latitude: "+latitude+"\n Longitude: "+longitude, Toast.LENGTH_SHORT);
                temp.show();*/

                Usuario userTemp = null;

                userTemp = helper.getUser(username);
            try {
                Location locationOld = helper.getLocationByUserId(userTemp.getId());

                if(locationOld != null){
                    tvLoc.setText(" Localizacao Anterior Salva: \n Latitude: "+locationOld.getLatitude()+"\n Longitude: "+locationOld.getLongitude());
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }

                Location location = new Location();
                if(userTemp != null) {
                    location.setUserId(userTemp.getId());
                    location.setLatitude("" + latitude);
                    location.setLongitude("" + longitude);
                    helper.insertLocation(location);
                }

        }else{
            Toast temp = Toast.makeText(Display.this, "GPS desativado! habilite antes de usar.!", Toast.LENGTH_SHORT);
            temp.show();
            gpsTracker.showSettingsAlert();
        }


    }
}
