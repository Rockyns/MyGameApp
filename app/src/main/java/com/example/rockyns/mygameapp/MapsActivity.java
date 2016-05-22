package com.example.rockyns.mygameapp;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    private GoogleApiClient mGoogleApiClient;
    public static final String TAG = MapsActivity.class.getSimpleName();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

//        LocationManager locationManager;
//        String context = Context.LOCATION_SERVICE;
//        locationManager = (LocationManager)getSystemService(context);
//
//        Criteria crta = new Criteria();
//        crta.setAccuracy(Criteria.ACCURACY_FINE);
//        crta.setAltitudeRequired(false);
//        crta.setBearingRequired(false);
//        crta.setCostAllowed(true);
//        crta.setPowerRequirement(Criteria.POWER_LOW);
//        String provider = locationManager.getBestProvider(crta, true);

// String provider = LocationManager.GPS_PROVIDER;
//        Location location = locationManager.getLastKnownLocation(provider);
//        updateWithNewLocation(location);
//
//        locationManager.requestLocationUpdates(provider, 1000, 0, locationListener);
    }



    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Wrocław and move the camera
        LatLng wroclaw = new LatLng(51.10789,	17.03854);
        mMap.addMarker(new MarkerOptions().position(wroclaw).title("Point 1") .snippet("51.10789 , 17.03854")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        LatLng wroclaw2 = new LatLng(51.10979,	17.03744);
        mMap.addMarker(new MarkerOptions().position(wroclaw2).title("Point 2"));
        LatLng wroclaw3 = new LatLng(51.10599,	17.03564);
        mMap.addMarker(new MarkerOptions().position(wroclaw3).title("Point 3"));
        LatLng wroclaw4 = new LatLng(51.10669,	17.03664);
        mMap.addMarker(new MarkerOptions().position(wroclaw4).title("Point 4") .snippet("51.10669, 17.0366")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(wroclaw));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(
                wroclaw, 16));

        Circle circle = mMap.addCircle(new CircleOptions()
                .center(wroclaw)
                .radius(50)
                .strokeColor(Color.RED)
                .fillColor(Color.BLUE));

//        Location location = null;
//
//        double lattitude = location.getLatitude();
//        double longitude = location.getLongitude();
//
//        LatLng locationmap = new LatLng(lattitude,	longitude);
//        mMap.addMarker(new MarkerOptions().position(locationmap).title("Point my")
//                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));

    }
//
//    @Override
//    protected void onResume() {
////        super.onResume();
//////        setUpMapIfNeeded();
////        mGoogleApiClient.connect();
//    }

//    @Override
//    protected void onPause() {
//        super.onPause();
//        if (mGoogleApiClient.isConnected()) {
//            mGoogleApiClient.disconnect();*-
//        }
//    }

}
