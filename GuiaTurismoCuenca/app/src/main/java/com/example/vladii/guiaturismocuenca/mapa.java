package com.example.vladii.guiaturismocuenca;

import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class mapa extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    private static final int PETICION_PERMISO_LOCALIZACION = 101;

    private Marker marcador;
    double lat = 0.0;
    double lng = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
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

        // Add a marker in Sydney and move the camera
        //LatLng sydney = new LatLng(-34, 151);
        //mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

        miUbicacion();

        hoteles();

    }


    public void hoteles(){


        LatLng mansion_alcazar = new LatLng(-2.896057, -79.008058);
        mMap.addMarker(new MarkerOptions().position(mansion_alcazar).title("Mansion Alcazar  USD217"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(mansion_alcazar, 18));

        LatLng posada_angel = new LatLng(-2.895662, -79.009805);
        mMap.addMarker(new MarkerOptions().position(posada_angel).title("Hostal Posada de Angel   USD48"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(posada_angel, 18));


        LatLng casa_aguila = new LatLng(-2.896586, -79.009595);
        mMap.addMarker(new MarkerOptions().position(casa_aguila).title("Hotel Casa del Aguila   USD71"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(casa_aguila, 18));

        LatLng aparatamento_otorongo = new LatLng(-2.896999, -79.013860);
        mMap.addMarker(new MarkerOptions().position(aparatamento_otorongo).title("Apartamentos Otorongo   USD65"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(aparatamento_otorongo, 18));

        LatLng san_Angres = new LatLng(-2.895058, -79.007589);
        mMap.addMarker(new MarkerOptions().position(san_Angres).title("Hotel San Andres   USD48"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(san_Angres, 18));

        LatLng gran_hotel = new LatLng(-2.894712, -79.009427);
        mMap.addMarker(new MarkerOptions().position(gran_hotel).title("Gran Hotel   USD36"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(gran_hotel, 18));

        LatLng casa_montalvo = new LatLng(-2.896337, -79.009053);
        mMap.addMarker(new MarkerOptions().position(casa_montalvo).title("Casa Montalvo   USD46"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(casa_montalvo, 18));

        LatLng casa_lloret = new LatLng(-2.913956, -79.014220);
        mMap.addMarker(new MarkerOptions().position(casa_lloret).title("Casa Lloret"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(casa_lloret, 18));


        LatLng cuenca_suites = new LatLng(-2.895467, -79.010386);
        mMap.addMarker(new MarkerOptions().position(cuenca_suites).title("Cuenca Suites"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(cuenca_suites, 18));

        LatLng hotel_gardenias = new LatLng(-2.894318, -79.008421);
        mMap.addMarker(new MarkerOptions().position(hotel_gardenias).title("Hotel Las Gardenias   USD46"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(hotel_gardenias, 18));

        LatLng hotel_sucre = new LatLng(-2.894318, -79.008421);
        mMap.addMarker(new MarkerOptions().position(hotel_sucre).title("Hotel Casa Sucre   USD68"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(hotel_sucre, 18));


        LatLng hotel_ana = new LatLng(-2.898151, -79.007868);
        mMap.addMarker(new MarkerOptions().position(hotel_ana).title("Hotel Santa Ana"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(hotel_ana, 18));

        LatLng hotel_maria = new LatLng(-2.894842, -79.007964);
        mMap.addMarker(new MarkerOptions().position(hotel_maria).title("Hotel Ines Maria  USD55"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(hotel_maria, 18));


        LatLng casa_hoterl = new LatLng(-2.890135, -79.008810);
        mMap.addMarker(new MarkerOptions().position(casa_hoterl).title("Mi Casa Hotel   USD50"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(casa_hoterl, 18));

        LatLng cuenca_rooms = new LatLng(-2.906280, -79.012249);
        mMap.addMarker(new MarkerOptions().position(cuenca_rooms).title("Cuenca Rooms USD44"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(cuenca_rooms, 18));

        LatLng palaza_hotel = new LatLng(-2.895755, -79.010809);
        mMap.addMarker(new MarkerOptions().position(palaza_hotel).title("Azul de la Plaza Hotel  USD85"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(palaza_hotel, 18));

        LatLng hacienda = new LatLng(-2.907102, -79.030639);
        mMap.addMarker(new MarkerOptions().position(hacienda).title("Hacienda Hushupud"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(hacienda, 18));

        LatLng san_rocke = new LatLng(-2.899123, -79.011606);
        mMap.addMarker(new MarkerOptions().position(san_rocke).title("San Rocke Hause"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(san_rocke, 18));

        LatLng posada_cuencana = new LatLng(-2.895530, -79.007583);
        mMap.addMarker(new MarkerOptions().position(posada_cuencana).title("La Posada Cuencana"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(posada_cuencana, 18));

        LatLng visita_ecuador = new LatLng(-2.896967, -79.018427);
        mMap.addMarker(new MarkerOptions().position(visita_ecuador).title("Visita Ecuador"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(visita_ecuador, 18));




    }









    public void agregarMarcador(double lat, double lng) {

        LatLng coordenadas = new LatLng(lat, lng);
        CameraUpdate miUbicacion = CameraUpdateFactory.newLatLngZoom(coordenadas, 16);
        if (marcador != null) marcador.remove();
        marcador = mMap.addMarker(new MarkerOptions()
                .position(coordenadas)
                .title("Mi pocicion Actual"));
        //.icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)));//para agrgar un icono personalizado
        mMap.animateCamera(miUbicacion);

    }

    private void actualizarUbicacioon(Location location) {

        if (location != null) {
            lat = location.getLatitude();
            lng = location.getLongitude();
            agregarMarcador(lat, lng);
        }
    }

    LocationListener locListener = new LocationListener() {
        @Override
        public void onLocationChanged(Location location) {
            actualizarUbicacioon(location);
        }

        @Override
        public void onStatusChanged(String provider, int status, Bundle extras) {

        }

        @Override
        public void onProviderEnabled(String provider) {

        }

        @Override
        public void onProviderDisabled(String provider) {

        }
    };



    private void miUbicacion() {

        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {

            ActivityCompat.requestPermissions(this,
                    new String[]{android.Manifest.permission.ACCESS_FINE_LOCATION},
                    PETICION_PERMISO_LOCALIZACION);
        } else {

            LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
            Location location = locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
            actualizarUbicacioon(location);
            locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 15000, 0, locListener);
        }

    }


}
