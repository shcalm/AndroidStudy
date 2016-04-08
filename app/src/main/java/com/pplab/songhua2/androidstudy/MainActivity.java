package com.pplab.songhua2.androidstudy;

import android.Manifest;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    LocationManager loc = null;
    private final String TAG = "MainActivity";
    @TargetApi(Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                Log.d("songhua2","startservice!!!!!!!!!!!!!!!!!!!!!!!");

                Intent i = new Intent();
                i.setClassName("com.pplab.songhua2.androidstudy","com.pplab.songhua2.androidstudy.MyService");
                startService(i);
            }
        });
        loc = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            requestPermissions(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 1);
            return;
        } else {
            List<String> pro = loc.getAllProviders();
            for (String str : pro) {
                Log.d("====", "str " + str);
            }
//                loc.addGpsStatusListener(new GpsStatus.Listener() {
//                    @Override
//                    public void onGpsStatusChanged(int event) {
//                        Log.d(TAG, "onGpsStatusChanged: event" + event);
//                        if (event == GpsStatus.GPS_EVENT_SATELLITE_STATUS){
//                            GpsStatus gpsstatus = null;
//                            gpsstatus = loc.getGpsStatus(gpsstatus);
//                            Iterator<GpsSatellite> iter = gpsstatus.getSatellites().iterator();
//                            while(iter.hasNext()){
//                                GpsSatellite stat = iter.next();
//                                Log.d(TAG, "onStatusChanged: " + stat.getPrn()  );
//
//                            }
//
//                        }
//                    }
//                });
            loc.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 10000, 1000, new LocationListener() {

                @Override
                public void onLocationChanged(Location location) {
                    Log.d(TAG, "location" + location);
                }

                @Override
                public void onStatusChanged(String provider, int status, Bundle extras) {
                    Log.d(TAG, "onStatusChanged: ");
                }

                @Override
                public void onProviderEnabled(String provider) {
                    Log.d(TAG, "onProviderEnabled: ");

                }

                @Override
                public void onProviderDisabled(String provider) {
                    Log.d(TAG, "onProviderDisabled: ");
                }
            });
        }
    }




    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Log.d(TAG, "onRequestPermissionsResult: requestcode" + requestCode);
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }else {
            List<String> pro = loc.getAllProviders();
            for (String str : pro) {
                Log.d("====", "str " + str);
            }
//                loc.addGpsStatusListener(new GpsStatus.Listener() {
//                    @Override
//                    public void onGpsStatusChanged(int event) {
//                        Log.d(TAG, "onGpsStatusChanged: event" + event);
//                        if (event == GpsStatus.GPS_EVENT_SATELLITE_STATUS){
//                            GpsStatus gpsstatus = null;
//                            gpsstatus = loc.getGpsStatus(gpsstatus);
//                            Iterator<GpsSatellite> iter = gpsstatus.getSatellites().iterator();
//                            while(iter.hasNext()){
//                                GpsSatellite stat = iter.next();
//                                Log.d(TAG, "onStatusChanged: " + stat.getPrn()  );
//
//                            }
//
//                        }
//                    }
//                });
            loc.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 10000, 1000, new LocationListener() {

                @Override
                public void onLocationChanged(Location location) {
                    Log.d(TAG, "location" + location);
                }

                @Override
                public void onStatusChanged(String provider, int status, Bundle extras) {
                    Log.d(TAG, "onStatusChanged: ");
                }

                @Override
                public void onProviderEnabled(String provider) {
                    Log.d(TAG, "onProviderEnabled: ");

                }

                @Override
                public void onProviderDisabled(String provider) {
                    Log.d(TAG, "onProviderDisabled: ");
                }
            });
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        String aaa = "aaa";
        List<Object> objects = new ArrayList<>();
        return super.onOptionsItemSelected(item);

    }
}
