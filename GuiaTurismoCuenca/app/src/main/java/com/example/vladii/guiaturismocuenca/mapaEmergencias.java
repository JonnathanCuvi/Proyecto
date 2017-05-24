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

public class mapaEmergencias extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    private static final int PETICION_PERMISO_LOCALIZACION = 101;

    private Marker marcador;
    double lat = 0.0;
    double lng = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa_emergencias);
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

        miUbicacion();
        sitios_emergencia();


    }

    public void sitios_emergencia(){

        //**************ESTACIONES DE POLICIA****************************************
        LatLng policia_judicial = new LatLng(-2.888757, -78.987354);
        mMap.addMarker(new MarkerOptions().position(policia_judicial).title("Policia Juadicial"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(policia_judicial, 18));


        LatLng terminal_terrestre = new LatLng(-2.891213, -78.992254);
        mMap.addMarker(new MarkerOptions().position(terminal_terrestre).title("UPC Terminal Teterrestre"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(terminal_terrestre, 18));

        LatLng departamento_upc = new LatLng(-2.916854, -79.043040);
        mMap.addMarker(new MarkerOptions().position(departamento_upc).title("Departamento UPC"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(departamento_upc, 18));

        LatLng upc_monay = new LatLng(-2.903207, -78.979645);
        mMap.addMarker(new MarkerOptions().position(upc_monay).title("UpcMonay"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(upc_monay, 18));

        LatLng zona_policia = new LatLng(-2.887599, -78.997087);
        mMap.addMarker(new MarkerOptions().position(zona_policia).title("Zona 6 Policia Nacional"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(zona_policia, 18));


        //***************************HOSPITALES****************************

        LatLng santa_ines = new LatLng(-2.902202, -79.008932);
        mMap.addMarker(new MarkerOptions().position(santa_ines).title("Clinica Santa Ines"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(santa_ines, 18));

        LatLng santa_ana = new LatLng(-2.907782, -79.000727);
        mMap.addMarker(new MarkerOptions().position(santa_ana).title("Clinica Santa Ana"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(santa_ana, 18));

        LatLng clinica_paz = new LatLng(-2.903485, -78.994656);
        mMap.addMarker(new MarkerOptions().position(clinica_paz).title("Clinica La Paz"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(clinica_paz, 18));

        LatLng clinica_especialidaddes = new LatLng(-2.892754, -79.017616);
        mMap.addMarker(new MarkerOptions().position(clinica_especialidaddes).title("Clinica de Especialidades Medica Latinoamericana"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(clinica_especialidaddes, 18));

        LatLng clinica_paucarbamba = new LatLng(-2.911907, -78.998436);
        mMap.addMarker(new MarkerOptions().position(clinica_paucarbamba).title("Clinica Paucarbamba"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(clinica_paucarbamba, 18));

        LatLng hospital_rio = new LatLng(-2.892847, -78.960914);
        mMap.addMarker(new MarkerOptions().position(hospital_rio).title("Hospital Univercitario del Rio"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(hospital_rio, 18));

        LatLng clinica_fracturas = new LatLng(-2.898282, -78.996488);
        mMap.addMarker(new MarkerOptions().position(clinica_fracturas).title("Clinica de Fracturas"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(clinica_fracturas, 18));

        LatLng juan_dios = new LatLng(-2.908146, -79.000706);
        mMap.addMarker(new MarkerOptions().position(juan_dios).title("Hospital San Juan de Dios"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(juan_dios, 18));

        LatLng clinica_humanitaria = new LatLng(-2.898227, -79.028840);
        mMap.addMarker(new MarkerOptions().position(clinica_humanitaria).title("Clinica Humanitaria"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(clinica_humanitaria, 18));

        LatLng clinica_especalidades = new LatLng(-2.891764, -78.999864);
        mMap.addMarker(new MarkerOptions().position(clinica_especalidades).title("Clinica de Especialidades de los Andes"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(clinica_especalidades, 18));

        LatLng clinica_gloria = new LatLng(-2.902078, -79.018064);
        mMap.addMarker(new MarkerOptions().position(clinica_gloria).title("Clinica la Gloria"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(clinica_gloria, 18));


        LatLng hospital_iess = new LatLng(-2.898590, -78.970186);
        mMap.addMarker(new MarkerOptions().position(hospital_iess).title("Hospital IESS Jose Carrasco Artega"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(hospital_iess, 18));

        LatLng hospital_catolico = new LatLng(-2.892759, -78.997519);
        mMap.addMarker(new MarkerOptions().position(hospital_catolico).title("Hospital Universitario Catolico"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(hospital_catolico, 18));

        LatLng monte_sinai = new LatLng(-2.908566, -79.007378);
        mMap.addMarker(new MarkerOptions().position(monte_sinai).title("Hospital Monte Sinai"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(monte_sinai, 18));

        LatLng hospital_martin = new LatLng(-2.891565, -79.008531);
        mMap.addMarker(new MarkerOptions().position(hospital_martin).title("Hospital San Martin de Porres"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(hospital_martin, 18));

        LatLng hospital_moscosa = new LatLng(-2.910980, -78.993554);
        mMap.addMarker(new MarkerOptions().position(hospital_moscosa).title("Hospital Vicente Corral Moscoso"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(hospital_moscosa, 18));

        LatLng regional_iess = new LatLng(-2.899461, -78.996210);
        mMap.addMarker(new MarkerOptions().position(regional_iess).title("Regional del IESS"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(regional_iess, 18));

        LatLng lucha_cancer = new LatLng(-2.912829, -78.992388);
        mMap.addMarker(new MarkerOptions().position(lucha_cancer).title("Sociedad de Lucha Contra el Cancer"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(lucha_cancer, 18));




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
