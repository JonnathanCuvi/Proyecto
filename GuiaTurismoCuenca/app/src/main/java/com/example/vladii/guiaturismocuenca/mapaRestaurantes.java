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

public class mapaRestaurantes extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;


    private static final int PETICION_PERMISO_LOCALIZACION = 101;

    private Marker marcador;
    double lat = 0.0;
    double lng = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa_restaurantes);
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
        restauitantes();


    }

    public void restauitantes(){

        LatLng raimipampa = new LatLng(-2.897294, -79.004927);
        mMap.addMarker(new MarkerOptions().position(raimipampa).title("Raymipampa"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(raimipampa, 18));

        LatLng tiesto_cafe = new LatLng(-2.900804, -79.001222);
        mMap.addMarker(new MarkerOptions().position(tiesto_cafe).title("Tiesto's Cafe Restaurant"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(tiesto_cafe, 18));

        LatLng villa_rosa = new LatLng(-2.900975, -79.008063);
        mMap.addMarker(new MarkerOptions().position(villa_rosa).title("Villa Rosa"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(villa_rosa, 18));

        LatLng restaurante_esquina = new LatLng(-2.902425, -79.002842);
        mMap.addMarker(new MarkerOptions().position(restaurante_esquina).title("Restaurante la Esquina"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(restaurante_esquina, 18));

        LatLng anubis_restaurante = new LatLng(-2.917787, -79.023659);
        mMap.addMarker(new MarkerOptions().position(anubis_restaurante).title("Anubis Restaurante"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(anubis_restaurante, 18));

        LatLng mercado = new LatLng(-2.901256, -79.005200);
        mMap.addMarker(new MarkerOptions().position(mercado).title("El Mercado"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(mercado, 18));

        LatLng pizeria = new LatLng(-2.905329, -79.011867);
        mMap.addMarker(new MarkerOptions().position(pizeria).title("Pappardelle Ristorante-Pizzería"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(pizeria, 18));


        LatLng pedir_boca = new LatLng(-2.900451, -79.005418);
        mMap.addMarker(new MarkerOptions().position(pedir_boca).title("A Pedir de Boca"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(pedir_boca, 18));

        LatLng jardin_restaurante = new LatLng(-2.902107, -79.003626);
        mMap.addMarker(new MarkerOptions().position(jardin_restaurante).title("El Jardin Restaurante"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(jardin_restaurante, 18));

        LatLng moliendo_cafe = new LatLng(-2.901378, -79.002886);
        mMap.addMarker(new MarkerOptions().position(moliendo_cafe).title("Moliendo Cafe"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(moliendo_cafe, 18));

        LatLng sebas_cafe = new LatLng(-2.896003, -79.011448);
        mMap.addMarker(new MarkerOptions().position(sebas_cafe).title("San Sebas Cafe"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sebas_cafe, 18));

        LatLng tacanijo = new LatLng(-2.883439, -78.988395);
        mMap.addMarker(new MarkerOptions().position(tacanijo).title("Tacanijo"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(tacanijo, 18));

        LatLng ranchero = new LatLng(-2.885748, -78.976713);
        mMap.addMarker(new MarkerOptions().position(ranchero).title("Restaurante Rancho Dorado 2"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ranchero, 18));

        LatLng crirtao_consuelo = new LatLng(-2.885748, -78.976713);
        mMap.addMarker(new MarkerOptions().position(crirtao_consuelo).title("Restaurante Cristo Del Consuelo"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(crirtao_consuelo, 18));

        LatLng bene = new LatLng(-2.895922, -79.009858);
        mMap.addMarker(new MarkerOptions().position(bene).title("Mangiare Bene"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(bene, 18));

        LatLng sunrise_cafe = new LatLng(-2.895922, -79.009858);
        mMap.addMarker(new MarkerOptions().position(sunrise_cafe).title("Sunrise Cafe"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sunrise_cafe, 18));

        LatLng matto_piszeria = new LatLng(-2.910105, -79.008586);
        mMap.addMarker(new MarkerOptions().position(matto_piszeria).title("Tutto Matto Pizzeria"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(matto_piszeria, 18));

        LatLng parrillada_estaurante = new LatLng(-2.905292, -79.009360);
        mMap.addMarker(new MarkerOptions().position(parrillada_estaurante).title("La Parrillada Restaurant"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(parrillada_estaurante, 18));

        LatLng sofy_glocal = new LatLng(-2.901351, -79.006217);
        mMap.addMarker(new MarkerOptions().position(sofy_glocal).title("Sofy Glocal Cuisine"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sofy_glocal, 18));

        LatLng pizeria_marea = new LatLng(-2.901692, -79.002809);
        mMap.addMarker(new MarkerOptions().position(pizeria_marea).title("Pizzeria Marea"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(pizeria_marea, 18));

        LatLng pedregal_azteca = new LatLng(-2.896086, -79.009761);
        mMap.addMarker(new MarkerOptions().position(pedregal_azteca).title("El Pedregal Azteca"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(pedregal_azteca, 18));

        LatLng guajibamaba = new LatLng(-2.893770, -79.003190);
        mMap.addMarker(new MarkerOptions().position(guajibamaba).title("Guajibamba"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(guajibamaba, 18));

        LatLng maiz = new LatLng(-2.905114, -78.998861);
        mMap.addMarker(new MarkerOptions().position(maiz).title("El Maiz"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(maiz, 18));

        LatLng terece_grill = new LatLng(-2.909891, -79.003751);
        mMap.addMarker(new MarkerOptions().position(terece_grill).title("Terrace Grill & Lounge"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(terece_grill, 18));

        LatLng balcon_quiteno = new LatLng(-2.891054, -79.026314);
        mMap.addMarker(new MarkerOptions().position(balcon_quiteno).title("Balcón Quiteño"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(balcon_quiteno, 18));

        LatLng pio_restaruantes = new LatLng(-2.892072, -79.018692);
        mMap.addMarker(new MarkerOptions().position(pio_restaruantes).title("Pio Pio Restaurantes"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(pio_restaruantes, 18));

        LatLng gastro_santos = new LatLng(-2.902920, -79.002086);
        mMap.addMarker(new MarkerOptions().position(gastro_santos).title("GASTRO TODOSANTOS"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(gastro_santos, 18));

        LatLng amore_bar = new LatLng(-2.903108, -79.013189);
        mMap.addMarker(new MarkerOptions().position(amore_bar).title("That´s Amore Bar Ristorante"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(amore_bar, 18));

        LatLng festin_beffet = new LatLng(-2.902831, -79.014700);
        mMap.addMarker(new MarkerOptions().position(festin_beffet).title("El Festin Buffet"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(festin_beffet, 18));

        LatLng muccha = new LatLng(-2.904394, -79.008757);
        mMap.addMarker(new MarkerOptions().position(muccha).title("Muccha"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(muccha, 18));

        LatLng luci_hotel = new LatLng(-2.904394, -79.008757);
        mMap.addMarker(new MarkerOptions().position(luci_hotel).title("Santa Lucia Hotel Cuenca"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(luci_hotel, 18));

        LatLng vina = new LatLng(-2.900056, -79.004531);
        mMap.addMarker(new MarkerOptions().position(vina).title("La Vina"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(vina, 18));

        LatLng mama_eulalia = new LatLng(-2.896713, -79.008634);
        mMap.addMarker(new MarkerOptions().position(mama_eulalia).title("restaurante mama eulalia"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(mama_eulalia, 18));

        LatLng marabu = new LatLng(-2.913722, -79.030011);
        mMap.addMarker(new MarkerOptions().position(marabu).title("Marabu"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(marabu, 18));

        LatLng liron = new LatLng(-2.913722, -79.030011);
        mMap.addMarker(new MarkerOptions().position(liron).title("Lirón Lirón Bar Restaurante"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(liron, 18));

        LatLng estrellas = new LatLng(-2.905221, -78.997939);
        mMap.addMarker(new MarkerOptions().position(estrellas).title("Tres Estrellas"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(estrellas, 18));

        LatLng colon = new LatLng(-2.897750, -79.005209);
        mMap.addMarker(new MarkerOptions().position(colon).title("Don Colon Restaurante"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(colon, 18));

        LatLng gio_polleria = new LatLng(-2.897559, -78.979716);
        mMap.addMarker(new MarkerOptions().position(gio_polleria).title("Gio's Polleria Restaurant"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(gio_polleria, 18));

        LatLng telepiza = new LatLng(-2.903785, -79.014077);
        mMap.addMarker(new MarkerOptions().position(telepiza).title("Telepizza"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(telepiza, 18));

        LatLng bertuchis = new LatLng(-2.903785, -79.014077);
        mMap.addMarker(new MarkerOptions().position(bertuchis).title("Restaurant Bertuchis"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(bertuchis, 18));





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
