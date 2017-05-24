package com.example.vladii.guiaturismocuenca;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Color;
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
import com.google.android.gms.maps.model.PolylineOptions;

public class mapa_atractivos extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    private static final int PETICION_PERMISO_LOCALIZACION = 101;

    private Marker marcador;
    double lat = 0.0;
    double lng = 0.0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa_atractivos);
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

        int aux;

        //miUbicacion();
        lugares_turisticos();

        Bundle bundle =getIntent().getExtras();//paera resivir la variable

        aux = bundle.getInt("mensaje");//recivimos la lista view en aux

        if(aux==0){
            catedral_Imaculada();
        }
        else if(aux==1){
            plaza_Flores();
        }
        else if(aux==2){
            museo_Pumapungo();
        }
        else if(aux==3){
            museo_Sombrero();
        }
        else if(aux==4){
            amaru_Zologico();
        }
        else if(aux==5){
            catedral_Vieja();
        }
        else if(aux==6){
            parque_Cajas();
        }
        else if(aux==7){//posiblemente aya que eliminar
            zologico();
        }
        else if(aux==8){
            pumaPungo();
        }
        else if(aux==9){
            museo_Aborigenes();
        }
        else if(aux==10){
            parque_Calderon();
        }
        else if(aux==11){
            puente_Roto();
        }
        else if(aux==12){
            las_Conceptas();
        }
        else if(aux==13){
            ruinas_Santos();
        }
        else if(aux==14){
            museo_Landivar();
        }
        else if(aux==15){
            parque_Miraflores();
        }
        else if(aux==16){
            museo_madres_Conceptas();
        }
        else if(aux==17){
            parque_MAdre();
        }
        else if(aux==18){
            fundacion_Vienai();
        }
        else if(aux==19){
            iglesia_Sanblas();
        }
        else if(aux==20){
            museo_Arte_Moderno();
        }
        else if(aux==21){
            museo_Moderno();
        }
        else if(aux==22){
            cuenca_Cyti();
        }
        else if(aux==23){
            museo_Medicina();
        }
        else if(aux==24){
            casa_Cultura();
        }
        else if(aux==25){
            colegio_Imacualda();
        }
        else if(aux==26){
            museo_Minasterio_Conceptas();
        }
        else if(aux==27){
            mirador_Turi();
        }
        else if(aux==28){
            panama_Hal_Museum();
        }
        else if(aux==29){
            museo_Artes_Fuego();
        }
        else if(aux==30){
            museo_Remigo_Crespo();
        }
        else if(aux==31){
            victor_Cuesta();
        }
        else if(aux==32){
            ruinas_Pumapungo();
        }
        else if(aux==33){
            homero_Ortega_Hats();
        }
        else if(aux==34){
            museo_Folklore_Azuayo();
        }
        else if(aux==35){
            instituto_Azuayo_Folklore();
        }
        else if(aux==36){
            casa_Museo_Maria();
        }
        else if(aux==37){
            santuario_Mariano();
        }
        else if(aux==38){
            museo_Esqueletogia();
        }
        else if(aux==39){
            parque_Templete();
        }
        else if(aux==40){
            parque_Recreo();
        }




    }


    public void catedral_Imaculada(){
        LatLng catedral_imaculada = new LatLng(-2.897377, -79.005366);//para colocar el marcador
        mMap.addMarker(new MarkerOptions().position(catedral_imaculada).title("Catedral de la Imaculada Concepcion"));//para colocar el titulo al marcado
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(catedral_imaculada, 18));



        LatLng u_cuenca = new LatLng(-2.900821, -79.010251);//
        mMap.addMarker(new MarkerOptions().position(u_cuenca).title("Univercidad de Cuneca"));

        //Con esto creammos la ruta
        mMap.addPolyline(new PolylineOptions().add(
                u_cuenca,
                new LatLng(-2.900787, -79.010312),
                new LatLng(-2.900724, -79.010292),
                new LatLng(-2.900661, -79.010269),
                new LatLng(-2.900591, -79.010269),
                new LatLng(-2.900454, -79.010247),
                new LatLng(-2.900427, -79.010247),
                new LatLng(-2.900109, -79.010085),
                new LatLng(-2.900090, -79.010070),
                new LatLng(-2.900082, -79.010049),
                new LatLng(-2.900071, -79.010029),
                new LatLng(-2.900067, -79.010003),
                new LatLng(-2.900072, -79.009712),
                new LatLng(-2.900179, -79.009535),
                new LatLng(-2.900106, -79.009483),
                new LatLng(-2.900102, -79.009476),
                new LatLng(-2.900111, -79.009405),
                new LatLng(-2.900024, -79.009413),
                new LatLng(-2.899954, -79.009394),
                new LatLng(-2.899955, -79.009397),
                new LatLng(-2.899798, -79.009303),
                new LatLng(-2.899719, -79.009249),
                new LatLng(-2.899842, -79.009085),
                new LatLng(-2.899734, -79.008993),
                new LatLng(-2.899410, -79.008778),
                new LatLng(-2.899400, -79.008757),
                new LatLng(-2.899511, -79.008573),
                new LatLng(-2.899512, -79.008543),
                new LatLng(-2.899505, -79.008514),
                new LatLng(-2.899474, -79.008499),
                new LatLng(-2.899288, -79.008328),
                new LatLng(-2.897977, -79.008090),
                new LatLng(-2.898439, -79.006436),
                new LatLng(-2.898242, -79.006102),
                new LatLng(-2.897563, -79.005925),
                new LatLng(-2.897644, -79.005429),


                catedral_imaculada
                )
                        .width(10)
                        .color(Color.BLUE)

        );

    }

    public void plaza_Flores(){
        LatLng plaza_flores = new LatLng(-2.897645, -79.005807);
        mMap.addMarker(new MarkerOptions().position(plaza_flores).title("Plaza de las Flores"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(plaza_flores, 18));



        LatLng u_cuenca = new LatLng(-2.900821, -79.010251);//
        mMap.addMarker(new MarkerOptions().position(u_cuenca).title("Univercidad de Cuneca"));

        //Con esto creammos la ruta
        mMap.addPolyline(new PolylineOptions().add(
                u_cuenca,
                new LatLng(-2.900791, -79.010313),
                new LatLng(-2.900649, -79.010265),
                new LatLng(-2.900438, -79.010246),
                new LatLng(-2.900099, -79.010081),
                new LatLng(-2.900075, -79.010036),
                new LatLng(-2.900062, -79.009985),
                new LatLng(-2.900069, -79.009717),
                new LatLng(-2.900174, -79.009539),
                new LatLng(-2.900099, -79.009479),
                new LatLng(-2.900109, -79.009415),
                new LatLng(-2.900023, -79.009409),
                new LatLng(-2.899957, -79.009398),
                new LatLng(-2.899717, -79.009249),
                new LatLng(-2.899843, -79.009084),
                new LatLng(-2.899412, -79.008777),
                new LatLng(-2.899398, -79.008760),
                new LatLng(-2.899518, -79.008560),
                new LatLng(-2.899518, -79.008538),
                new LatLng(-2.899508, -79.00852),
                new LatLng(-2.899468, -79.008499),
                new LatLng(-2.899457, -79.008455),
                new LatLng(-2.899447, -79.008438),
                new LatLng(-2.899290, -79.008328),
                new LatLng(-2.898010, -79.008097),
                new LatLng(-2.898424, -79.006442),
                new LatLng(-2.898253, -79.006063),
                new LatLng(-2.897513, -79.005915),
                new LatLng(-2.897578, -79.005788),




                plaza_flores
                )
                        .width(10)
                        .color(Color.BLUE)

        );


    }

    public void museo_Pumapungo(){
        LatLng museo_pumapungo = new LatLng(-2.906078, -78.996864);//para colocar el marcador
        mMap.addMarker(new MarkerOptions().position(museo_pumapungo).title("Museo Pumapungo"));//para colocar el titulo al marcado
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(museo_pumapungo, 18));


        LatLng u_cuenca = new LatLng(-2.900821, -79.010251);//
        mMap.addMarker(new MarkerOptions().position(u_cuenca).title("Univercidad de Cuneca"));

        //Con esto creammos la ruta
        mMap.addPolyline(new PolylineOptions().add(
                u_cuenca,
                new LatLng(-2.901198, -79.008321),
                new LatLng(-2.900796, -79.007978),
                new LatLng(-2.901372, -79.007415),
                new LatLng(-2.901633, -79.007028),
                new LatLng(-2.901974, -79.006155),
                new LatLng(-2.902008, -79.006087),
                new LatLng(-2.902069, -79.006030),
                new LatLng(-2.902102, -79.005798),
                new LatLng(-2.902344, -79.004943),
                new LatLng(-2.902434, -79.004809),
                new LatLng(-2.903300, -79.003457),
                new LatLng(-2.904563, -79.001773),
                new LatLng(-2.904643, -79.001663),
                new LatLng(-2.904707, -79.001523),
                new LatLng(-2.904734, -79.001413),
                new LatLng(-2.904734, -79.001413),
                new LatLng(-2.904944, -79.001158),
                new LatLng(-2.905058, -79.001029),
                new LatLng(-2.905910, -79.000589),
                new LatLng(-2.906031, -79.000471),
                new LatLng(-2.906027, -79.000418),
                new LatLng(-2.906050, -79.000346),
                new LatLng(-2.906114, -79.000331),
                new LatLng(-2.906168, -79.000320),
                new LatLng(-2.906574, -78.999626),
                new LatLng(-2.906719, -78.999428),
                new LatLng(-2.906891, -78.999305),
                new LatLng(-2.907175, -78.999047),
                new LatLng(-2.908498, -78.998120),
                new LatLng(-2.910268, -78.996310),
                new LatLng(-2.910306, -78.996223),
                new LatLng(-2.910393, -78.996083),
                new LatLng(-2.910442, -78.995950),
                new LatLng(-2.910484, -78.995779),
                new LatLng(-2.910431, -78.995700),
                new LatLng(-2.910397, -78.995624),
                new LatLng(-2.905805, -78.996446),
                new LatLng(-2.905704, -78.996755),


                museo_pumapungo
                )
                        .width(10)
                        .color(Color.BLUE)

        );





    }

    public void museo_Sombrero(){
        LatLng museo_sombrero = new LatLng(-2.900421, -79.006766);
        mMap.addMarker(new MarkerOptions().position(museo_sombrero).title("Museo del Sombrero"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(museo_sombrero, 18));


        LatLng u_cuenca = new LatLng(-2.900821, -79.010251);//
        mMap.addMarker(new MarkerOptions().position(u_cuenca).title("Univercidad de Cuneca"));

        //Con esto creammos la ruta
        mMap.addPolyline(new PolylineOptions().add(
                u_cuenca,
                new LatLng(-2.900796, -79.010309),
                new LatLng(-2.900747, -79.010286),
                new LatLng(-2.900658, -79.010268),
                new LatLng(-2.900447, -79.010245),
                new LatLng(-2.900425, -79.010252),
                new LatLng(-2.900258, -79.010167),
                new LatLng(-2.900107, -79.010084),
                new LatLng(-2.900085, -79.010060),
                new LatLng(-2.900077, -79.010039),
                new LatLng(-2.900071, -79.010016),
                new LatLng(-2.900066, -79.009998),
                new LatLng(-2.900072, -79.009711),
                new LatLng(-2.900179, -79.009534),
                new LatLng(-2.900102, -79.009479),
                new LatLng(-2.900109, -79.009411),
                new LatLng(-2.900021, -79.009407),
                new LatLng(-2.899956, -79.009396),
                new LatLng(-2.899720, -79.009247),
                new LatLng(-2.899842, -79.009085),
                new LatLng(-2.899732, -79.008989),
                new LatLng(-2.899411, -79.008779),
                new LatLng(-2.899403, -79.008767),
                new LatLng(-2.899399, -79.008759),//hasta el puente donde estan las escaleras
                new LatLng(-2.899516, -79.008560),
                new LatLng(-2.899516, -79.008539),
                new LatLng(-2.899509, -79.008521),
                new LatLng(-2.899492, -79.008507),
                new LatLng(-2.899467, -79.008496),
                new LatLng(-2.899455, -79.008454),
                new LatLng(-2.899293, -79.008328),
                new LatLng(-2.900304, -79.006706),




                museo_sombrero
                )
                        .width(10)
                        .color(Color.BLUE)

        );


    }

    public void amaru_Zologico(){
        LatLng zoologico_amaru = new LatLng(-2.894099, -78.956900);
        mMap.addMarker(new MarkerOptions().position(zoologico_amaru).title("Amaru Zoologico Bioparque"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(zoologico_amaru, 18));

        LatLng u_cuenca = new LatLng(-2.900821, -79.010251);//
        mMap.addMarker(new MarkerOptions().position(u_cuenca).title("Univercidad de Cuneca"));

        //Con esto creammos la ruta
        mMap.addPolyline(new PolylineOptions().add(
                u_cuenca,
                new LatLng(-2.901208, -79.008340),
                new LatLng(-2.900783, -79.007981),
                new LatLng(-2.901384, -79.007423),
                new LatLng(-2.901627, -79.007014),
                new LatLng(-2.901961, -79.006141),
                new LatLng(-2.902016, -79.006079),
                new LatLng(-2.902066, -79.006016),
                new LatLng(-2.902358, -79.004961),
                new LatLng(-2.902474, -79.004741),
                new LatLng(-2.903342, -79.003424),//interseccion del parque de la madre
                new LatLng(-2.904279, -79.002277),
                new LatLng(-2.904630, -79.001663),
                new LatLng(-2.904703, -79.001410),
                new LatLng(-2.904847, -79.001266),
                new LatLng(-2.904982, -79.001158),
                new LatLng(-2.905081, -79.000959),
                new LatLng(-2.905906, -79.000596),
                new LatLng(-2.906050, -79.000488),
                new LatLng(-2.906040, -79.000415),
                new LatLng(-2.906061, -79.000380),
                new LatLng(-2.906098, -79.000342),
                new LatLng(-2.906134, -79.000321),
                new LatLng(-2.906169, -79.000318),
                new LatLng(-2.906547, -78.999681),
                new LatLng(-2.906707, -78.999486),
                new LatLng(-2.906887, -78.999296),
                new LatLng(-2.907047, -78.999182),
                new LatLng(-2.907209, -78.999041),
                new LatLng(-2.908526, -78.998129),
                new LatLng(-2.910308, -78.996257),
                new LatLng(-2.910477, -78.995981),
                new LatLng(-2.910521, -78.995898),
                new LatLng(-2.910576, -78.995687),
                new LatLng(-2.910574, -78.995607),//hasta aqui ruinas de pumapumgo y pumapungo
                new LatLng(-2.910486, -78.995219),
                new LatLng(-2.910418, -78.994904),
                new LatLng(-2.910353, -78.994658),
                new LatLng(-2.910130, -78.994009),
                new LatLng(-2.910107, -78.993880),
                new LatLng(-2.910152, -78.993762),
                new LatLng(-2.910262, -78.993694),
                new LatLng(-2.910391, -78.993694),
                new LatLng(-2.910804, -78.993624),
                new LatLng(-2.911090, -78.993699),
                new LatLng(-2.911497, -78.993842),
                new LatLng(-2.911570, -78.993859),
                new LatLng(-2.911690, -78.993854),
                new LatLng(-2.911836, -78.993809),
                new LatLng(-2.911942, -78.993758),
                new LatLng(-2.912072, -78.993652),
                new LatLng(-2.912187, -78.993515),
                new LatLng(-2.912340, -78.993206),
                new LatLng(-2.912384, -78.993037),
                new LatLng(-2.912423, -78.992874),
                new LatLng(-2.912356, -78.992692),
                new LatLng(-2.911763, -78.991537),
                new LatLng(-2.911686, -78.991339),
                new LatLng(-2.911684, -78.991242),
                new LatLng(-2.911751, -78.991119),
                new LatLng(-2.911793, -78.991073),
                new LatLng(-2.912369, -78.990771),
                new LatLng(-2.912559, -78.990551),
                new LatLng(-2.912590, -78.990458),
                new LatLng(-2.912669, -78.990398),
                new LatLng(-2.912771, -78.990374),
                new LatLng(-2.912874, -78.990416),
                new LatLng(-2.913391, -78.990121),
                new LatLng(-2.913091, -78.989456),
                new LatLng(-2.912766, -78.989003),
                new LatLng(-2.912109, -78.988301),
                new LatLng(-2.911893, -78.988091),
                new LatLng(-2.911842, -78.987899),
                new LatLng(-2.911447, -78.986445),
                new LatLng(-2.907960, -78.983465),
                new LatLng(-2.907730, -78.983309),
                new LatLng(-2.907381, -78.983186),
                new LatLng(-2.907274, -78.983124),
                new LatLng(-2.907265, -78.983021),
                new LatLng(-2.907355, -78.982876),
                new LatLng(-2.907490, -78.982854),
                new LatLng(-2.907734, -78.982850),
                new LatLng(-2.909245, -78.982061),
                new LatLng(-2.909390, -78.981927),
                new LatLng(-2.909485, -78.981665),
                new LatLng(-2.909449, -78.981548),
                new LatLng(-2.909458, -78.981453),
                new LatLng(-2.906512, -78.978231),
                new LatLng(-2.904983, -78.977223),
                new LatLng(-2.902508, -78.975368),
                new LatLng(-2.901888, -78.974996),
                new LatLng(-2.901021, -78.973848),
                new LatLng(-2.900121, -78.971230),
                new LatLng(-2.900033, -78.971130),
                new LatLng(-2.899977, -78.971042),
                new LatLng(-2.900064, -78.970929),
                new LatLng(-2.898401, -78.965676),
                new LatLng(-2.898239, -78.964990),
                new LatLng(-2.897518, -78.963871),
                new LatLng(-2.895301, -78.962031),
                new LatLng(-2.894400, -78.961093),
                new LatLng(-2.893698, -78.960154),
                new LatLng(-2.889124, -78.954157),
                new LatLng(-2.888156, -78.953009),
                new LatLng(-2.886143, -78.949283),
                new LatLng(-2.885786, -78.948671),
                new LatLng(-2.884792, -78.947803),
                new LatLng(-2.883033, -78.946833),
                new LatLng(-2.882762, -78.946774),
                new LatLng(-2.878492, -78.943487),
                new LatLng(-2.877370, -78.942465),
                new LatLng(-2.877865, -78.942266),
                new LatLng(-2.877859, -78.942127),
                new LatLng(-2.877907, -78.942043),
                new LatLng(-2.878117, -78.942121),//redeondel
                new LatLng(-2.878075, -78.942236),
                new LatLng(-2.878550, -78.942398),
                new LatLng(-2.878376, -78.942488),
                new LatLng(-2.878244, -78.942675),
                new LatLng(-2.878268, -78.942892),
                new LatLng(-2.879341, -78.943894),
                new LatLng(-2.881837, -78.945915),
                new LatLng(-2.883054, -78.946727),
                new LatLng(-2.883593, -78.946965),
                new LatLng(-2.884797, -78.947610),
                new LatLng(-2.884995, -78.947731),
                new LatLng(-2.885676, -78.948260),
                new LatLng(-2.886008, -78.948611),
                new LatLng(-2.886141, -78.948764),
                new LatLng(-2.886357, -78.949118),
                new LatLng(-2.887119, -78.950473),
                new LatLng(-2.887519, -78.951298),
                new LatLng(-2.887716, -78.951635),
                new LatLng(-2.887883, -78.952054),
                new LatLng(-2.888309, -78.952588),
                new LatLng(-2.888621, -78.953182),
                new LatLng(-2.889437, -78.954250),
                new LatLng(-2.891627, -78.957179),
                new LatLng(-2.891765, -78.956666),
                new LatLng(-2.891954, -78.956424),
                new LatLng(-2.892431, -78.956173),
                new LatLng(-2.892886, -78.956022),
                new LatLng(-2.893098, -78.955999),
                new LatLng(-2.893477, -78.956135),
                new LatLng(-2.893879, -78.956084),
                new LatLng(-2.893927, -78.956151),
                new LatLng(-2.893905, -78.956250),
                new LatLng(-2.893819, -78.956285),
                new LatLng(-2.893624, -78.956323),
                new LatLng(-2.893462, -78.956348),
                new LatLng(-2.893302, -78.956399),
                new LatLng(-2.893153, -78.956479),
                new LatLng(-2.893044, -78.956568),
                new LatLng(-2.892774, -78.956642),
                new LatLng(-2.892754, -78.956715),
                new LatLng(-2.892796, -78.956747),
                new LatLng(-2.893098, -78.956702),
                new LatLng(-2.893595, -78.956670),
                new LatLng(-2.893787, -78.956702),
                new LatLng(-2.893924, -78.956750),
                new LatLng(-2.894010, -78.956757),





                zoologico_amaru
                )
                        .width(10)
                        .color(Color.BLUE)

        );
    }

    public void catedral_Vieja(){
        LatLng catedral_vieja = new LatLng(-2.897809, -79.003820);//para colocar el marcador
        mMap.addMarker(new MarkerOptions().position(catedral_vieja).title("Catedral Vieja"));//para colocar el titulo al marcado
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(catedral_vieja, 18));


        LatLng u_cuenca = new LatLng(-2.900821, -79.010251);//
        mMap.addMarker(new MarkerOptions().position(u_cuenca).title("Univercidad de Cuneca"));

        //Con esto creammos la ruta
        mMap.addPolyline(new PolylineOptions().add(
                u_cuenca,
                new LatLng(-2.901205, -79.008316),
                new LatLng(-2.900783, -79.007995),
                new LatLng(-2.901366, -79.007411),
                new LatLng(-2.901526, -79.007149),
                new LatLng(-2.901658, -79.007002),
                new LatLng(-2.901992, -79.006088),
                new LatLng(-2.901629, -79.006022),
                new LatLng(-2.901509, -79.006153),
                new LatLng(-2.901473, -79.006195),
                new LatLng(-2.901358, -79.006176),
                new LatLng(-2.901462, -79.005827),
                new LatLng(-2.901452, -79.005743),
                new LatLng(-2.901428, -79.005703),
                new LatLng(-2.900973, -79.005551),
                new LatLng(-2.898755, -79.005185),
                new LatLng(-2.899014, -79.004288),
                new LatLng(-2.898073, -79.004126),
                new LatLng(-2.897995, -79.004140),
                new LatLng(-2.898068, -79.003872),






                catedral_vieja
                )
                        .width(10)
                        .color(Color.BLUE)

        );
    }

    public void parque_Cajas(){
        LatLng cajas = new LatLng(-2.848856, -79.253793);//para colocar el marcador
        mMap.addMarker(new MarkerOptions().position(cajas).title("Parque Nacional Cajas"));//para colocar el titulo al marcado
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(cajas, 18));



        LatLng u_cuenca = new LatLng(-2.900821, -79.010251);//
        mMap.addMarker(new MarkerOptions().position(u_cuenca).title("Univercidad de Cuneca"));

        //Con esto creammos la ruta
        mMap.addPolyline(new PolylineOptions().add(
                u_cuenca,

                new LatLng(-2.902317, -79.010336),
                new LatLng(-2.902167, -79.009735),
                new LatLng(-2.903013, -79.008287),
                new LatLng(-2.903666, -79.008524),
                new LatLng(-2.904485, -79.008691),
                new LatLng(-2.906401, -79.009186),
                new LatLng(-2.906687, -79.008330),
                new LatLng(-2.906784, -79.007885),
                new LatLng(-2.906757, -79.007638),
                new LatLng(-2.906660, -79.007514),
                new LatLng(-2.906698, -79.007311),
                new LatLng(-2.906842, -79.007182),
                new LatLng(-2.907051, -79.007171),
                new LatLng(-2.907255, -79.007235),
                new LatLng(-2.907292, -79.007359),
                new LatLng(-2.911006, -79.008395),
                new LatLng(-2.911124, -79.008408),
                new LatLng(-2.911203, -79.008421),
                new LatLng(-2.911267, -79.008478),
                new LatLng(-2.913003, -79.008990),
                new LatLng(-2.913385, -79.009061),
                new LatLng(-2.914753, -79.009381),
                new LatLng(-2.914902, -79.009413),
                new LatLng(-2.915165, -79.009492),
                new LatLng(-2.915512, -79.009555),
                new LatLng(-2.915722, -79.009682),
                new LatLng(-2.915837, -79.009686),
                new LatLng(-2.915911, -79.009720),
                new LatLng(-2.915949, -79.009777),
                new LatLng(-2.916860, -79.009187),
                new LatLng(-2.917806, -79.008826),
                new LatLng(-2.918058, -79.008564),
                new LatLng(-2.918292, -79.008420),
                new LatLng(-2.918400, -79.008239),
                new LatLng(-2.918581, -79.008158),
                new LatLng(-2.918644, -79.008005),
                new LatLng(-2.918833, -79.007202),
                new LatLng(-2.918770, -79.006661),
                new LatLng(-2.918941, -79.006480),
                new LatLng(-2.919103, -79.006435),
                new LatLng(-2.919736, -79.006328),
                new LatLng(-2.919724, -79.009618),
                new LatLng(-2.920164, -79.011023),
                new LatLng(-2.920292, -79.011184),
                new LatLng(-2.920582, -79.011173),








                cajas
                )
                        .width(10)
                        .color(Color.BLUE)

        );




    }

    public void zologico(){//talves haya que eliminar
        LatLng zoologico_amaru = new LatLng(-2.894099, -78.956900);
        mMap.addMarker(new MarkerOptions().position(zoologico_amaru).title("Amaru Zoologico Bioparque"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(zoologico_amaru, 18));

        LatLng u_cuenca = new LatLng(-2.900821, -79.010251);//
        mMap.addMarker(new MarkerOptions().position(u_cuenca).title("Univercidad de Cuneca"));

        //Con esto creammos la ruta
        mMap.addPolyline(new PolylineOptions().add(
                u_cuenca,
                new LatLng(-2.901208, -79.008340),
                new LatLng(-2.900783, -79.007981),
                new LatLng(-2.901384, -79.007423),
                new LatLng(-2.901627, -79.007014),
                new LatLng(-2.901961, -79.006141),
                new LatLng(-2.902016, -79.006079),
                new LatLng(-2.902066, -79.006016),
                new LatLng(-2.902358, -79.004961),
                new LatLng(-2.902474, -79.004741),
                new LatLng(-2.903342, -79.003424),//interseccion del parque de la madre
                new LatLng(-2.904279, -79.002277),
                new LatLng(-2.904630, -79.001663),
                new LatLng(-2.904703, -79.001410),
                new LatLng(-2.904847, -79.001266),
                new LatLng(-2.904982, -79.001158),
                new LatLng(-2.905081, -79.000959),
                new LatLng(-2.905906, -79.000596),
                new LatLng(-2.906050, -79.000488),
                new LatLng(-2.906040, -79.000415),
                new LatLng(-2.906061, -79.000380),
                new LatLng(-2.906098, -79.000342),
                new LatLng(-2.906134, -79.000321),
                new LatLng(-2.906169, -79.000318),
                new LatLng(-2.906547, -78.999681),
                new LatLng(-2.906707, -78.999486),
                new LatLng(-2.906887, -78.999296),
                new LatLng(-2.907047, -78.999182),
                new LatLng(-2.907209, -78.999041),
                new LatLng(-2.908526, -78.998129),
                new LatLng(-2.910308, -78.996257),
                new LatLng(-2.910477, -78.995981),
                new LatLng(-2.910521, -78.995898),
                new LatLng(-2.910576, -78.995687),
                new LatLng(-2.910574, -78.995607),//hasta aqui ruinas de pumapumgo y pumapungo
                new LatLng(-2.910486, -78.995219),
                new LatLng(-2.910418, -78.994904),
                new LatLng(-2.910353, -78.994658),
                new LatLng(-2.910130, -78.994009),
                new LatLng(-2.910107, -78.993880),
                new LatLng(-2.910152, -78.993762),
                new LatLng(-2.910262, -78.993694),
                new LatLng(-2.910391, -78.993694),
                new LatLng(-2.910804, -78.993624),
                new LatLng(-2.911090, -78.993699),
                new LatLng(-2.911497, -78.993842),
                new LatLng(-2.911570, -78.993859),
                new LatLng(-2.911690, -78.993854),
                new LatLng(-2.911836, -78.993809),
                new LatLng(-2.911942, -78.993758),
                new LatLng(-2.912072, -78.993652),
                new LatLng(-2.912187, -78.993515),
                new LatLng(-2.912340, -78.993206),
                new LatLng(-2.912384, -78.993037),
                new LatLng(-2.912423, -78.992874),
                new LatLng(-2.912356, -78.992692),
                new LatLng(-2.911763, -78.991537),
                new LatLng(-2.911686, -78.991339),
                new LatLng(-2.911684, -78.991242),
                new LatLng(-2.911751, -78.991119),
                new LatLng(-2.911793, -78.991073),
                new LatLng(-2.912369, -78.990771),
                new LatLng(-2.912559, -78.990551),
                new LatLng(-2.912590, -78.990458),
                new LatLng(-2.912669, -78.990398),
                new LatLng(-2.912771, -78.990374),
                new LatLng(-2.912874, -78.990416),
                new LatLng(-2.913391, -78.990121),
                new LatLng(-2.913091, -78.989456),
                new LatLng(-2.912766, -78.989003),
                new LatLng(-2.912109, -78.988301),
                new LatLng(-2.911893, -78.988091),
                new LatLng(-2.911842, -78.987899),
                new LatLng(-2.911447, -78.986445),
                new LatLng(-2.907960, -78.983465),
                new LatLng(-2.907730, -78.983309),
                new LatLng(-2.907381, -78.983186),
                new LatLng(-2.907274, -78.983124),
                new LatLng(-2.907265, -78.983021),
                new LatLng(-2.907355, -78.982876),
                new LatLng(-2.907490, -78.982854),
                new LatLng(-2.907734, -78.982850),
                new LatLng(-2.909245, -78.982061),
                new LatLng(-2.909390, -78.981927),
                new LatLng(-2.909485, -78.981665),
                new LatLng(-2.909449, -78.981548),
                new LatLng(-2.909458, -78.981453),
                new LatLng(-2.906512, -78.978231),
                new LatLng(-2.904983, -78.977223),
                new LatLng(-2.902508, -78.975368),
                new LatLng(-2.901888, -78.974996),
                new LatLng(-2.901021, -78.973848),
                new LatLng(-2.900121, -78.971230),
                new LatLng(-2.900033, -78.971130),
                new LatLng(-2.899977, -78.971042),
                new LatLng(-2.900064, -78.970929),
                new LatLng(-2.898401, -78.965676),
                new LatLng(-2.898239, -78.964990),
                new LatLng(-2.897518, -78.963871),
                new LatLng(-2.895301, -78.962031),
                new LatLng(-2.894400, -78.961093),
                new LatLng(-2.893698, -78.960154),
                new LatLng(-2.889124, -78.954157),
                new LatLng(-2.888156, -78.953009),
                new LatLng(-2.886143, -78.949283),
                new LatLng(-2.885786, -78.948671),
                new LatLng(-2.884792, -78.947803),
                new LatLng(-2.883033, -78.946833),
                new LatLng(-2.882762, -78.946774),
                new LatLng(-2.878492, -78.943487),
                new LatLng(-2.877370, -78.942465),
                new LatLng(-2.877865, -78.942266),
                new LatLng(-2.877859, -78.942127),
                new LatLng(-2.877907, -78.942043),
                new LatLng(-2.878117, -78.942121),//redeondel
                new LatLng(-2.878075, -78.942236),
                new LatLng(-2.878550, -78.942398),
                new LatLng(-2.878376, -78.942488),
                new LatLng(-2.878244, -78.942675),
                new LatLng(-2.878268, -78.942892),
                new LatLng(-2.879341, -78.943894),
                new LatLng(-2.881837, -78.945915),
                new LatLng(-2.883054, -78.946727),
                new LatLng(-2.883593, -78.946965),
                new LatLng(-2.884797, -78.947610),
                new LatLng(-2.884995, -78.947731),
                new LatLng(-2.885676, -78.948260),
                new LatLng(-2.886008, -78.948611),
                new LatLng(-2.886141, -78.948764),
                new LatLng(-2.886357, -78.949118),
                new LatLng(-2.887119, -78.950473),
                new LatLng(-2.887519, -78.951298),
                new LatLng(-2.887716, -78.951635),
                new LatLng(-2.887883, -78.952054),
                new LatLng(-2.888309, -78.952588),
                new LatLng(-2.888621, -78.953182),
                new LatLng(-2.889437, -78.954250),
                new LatLng(-2.891627, -78.957179),
                new LatLng(-2.891765, -78.956666),
                new LatLng(-2.891954, -78.956424),
                new LatLng(-2.892431, -78.956173),
                new LatLng(-2.892886, -78.956022),
                new LatLng(-2.893098, -78.955999),
                new LatLng(-2.893477, -78.956135),
                new LatLng(-2.893879, -78.956084),
                new LatLng(-2.893927, -78.956151),
                new LatLng(-2.893905, -78.956250),
                new LatLng(-2.893819, -78.956285),
                new LatLng(-2.893624, -78.956323),
                new LatLng(-2.893462, -78.956348),
                new LatLng(-2.893302, -78.956399),
                new LatLng(-2.893153, -78.956479),
                new LatLng(-2.893044, -78.956568),
                new LatLng(-2.892774, -78.956642),
                new LatLng(-2.892754, -78.956715),
                new LatLng(-2.892796, -78.956747),
                new LatLng(-2.893098, -78.956702),
                new LatLng(-2.893595, -78.956670),
                new LatLng(-2.893787, -78.956702),
                new LatLng(-2.893924, -78.956750),
                new LatLng(-2.894010, -78.956757),





                zoologico_amaru
                )
                        .width(10)
                        .color(Color.BLUE)

        );
    }

    public void pumaPungo(){
        LatLng pumapungo = new LatLng(-2.906035, -78.996735);
        mMap.addMarker(new MarkerOptions().position(pumapungo).title("Pumapungo"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(pumapungo, 18));

        LatLng u_cuenca = new LatLng(-2.900821, -79.010251);//
        mMap.addMarker(new MarkerOptions().position(u_cuenca).title("Univercidad de Cuneca"));

        //Con esto creammos la ruta
        mMap.addPolyline(new PolylineOptions().add(
                u_cuenca,
                new LatLng(-2.901208, -79.008340),
                new LatLng(-2.900783, -79.007981),
                new LatLng(-2.901384, -79.007423),
                new LatLng(-2.901627, -79.007014),
                new LatLng(-2.901961, -79.006141),
                new LatLng(-2.902016, -79.006079),
                new LatLng(-2.902066, -79.006016),
                new LatLng(-2.902358, -79.004961),
                new LatLng(-2.902474, -79.004741),
                new LatLng(-2.903342, -79.003424),//interseccion del parque de la madre
                new LatLng(-2.904279, -79.002277),
                new LatLng(-2.904630, -79.001663),
                new LatLng(-2.904703, -79.001410),
                new LatLng(-2.904847, -79.001266),
                new LatLng(-2.904982, -79.001158),
                new LatLng(-2.905081, -79.000959),
                new LatLng(-2.905906, -79.000596),
                new LatLng(-2.906050, -79.000488),
                new LatLng(-2.906040, -79.000415),
                new LatLng(-2.906061, -79.000380),
                new LatLng(-2.906098, -79.000342),
                new LatLng(-2.906134, -79.000321),
                new LatLng(-2.906169, -79.000318),
                new LatLng(-2.906547, -78.999681),
                new LatLng(-2.906707, -78.999486),
                new LatLng(-2.906887, -78.999296),
                new LatLng(-2.907047, -78.999182),
                new LatLng(-2.907209, -78.999041),
                new LatLng(-2.908526, -78.998129),
                new LatLng(-2.910308, -78.996257),
                new LatLng(-2.910477, -78.995981),
                new LatLng(-2.910521, -78.995898),
                new LatLng(-2.910576, -78.995687),
                new LatLng(-2.910574, -78.995607),//hasta aqui ruinas de pumapumgo y pumapungo
                new LatLng(-2.910545, -78.995453),
                new LatLng(-2.910454, -78.995547),
                new LatLng(-2.910367, -78.995645),
                new LatLng(-2.907150, -78.996219),
                new LatLng(-2.905917, -78.996429),


                pumapungo
                )
                        .width(10)
                        .color(Color.BLUE)

        );
    }

    public void museo_Aborigenes(){
        LatLng museo_culturas_aborigenes = new LatLng(-2.902650, -79.002311);//para colocar el marcador
        mMap.addMarker(new MarkerOptions().position(museo_culturas_aborigenes).title("Museo de las Culturs Aborigenes"));//para colocar el titulo al marcado
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(museo_culturas_aborigenes, 18));


        LatLng u_cuenca = new LatLng(-2.900821, -79.010251);//
        mMap.addMarker(new MarkerOptions().position(u_cuenca).title("Univercidad de Cuneca"));

        //Con esto creammos la ruta
        mMap.addPolyline(new PolylineOptions().add(
                u_cuenca,
                new LatLng(-2.901184, -79.008355),
                new LatLng(-2.900812, -79.008029),
                new LatLng(-2.901403, -79.007407),
                new LatLng(-2.901623, -79.007050),
                new LatLng(-2.902009, -79.006107),
                new LatLng(-2.902077, -79.006031),
                new LatLng(-2.902357, -79.004950),
                new LatLng(-2.902428, -79.004820),
                new LatLng(-2.904631, -79.001702),
                new LatLng(-2.904703, -79.001535),
                new LatLng(-2.904761, -79.001368),
                new LatLng(-2.904874, -79.001214),
                new LatLng(-2.905045, -79.001056),
                new LatLng(-2.905857, -79.000593),
                new LatLng(-2.906028, -79.000458),
                new LatLng(-2.906036, -79.000426),
                new LatLng(-2.906048, -79.000389),
                new LatLng(-2.906074, -79.000362),
                new LatLng(-2.905660, -78.999932),
                new LatLng(-2.905528, -78.999843),
                new LatLng(-2.905338, -78.999861),
                new LatLng(-2.905200, -78.999981),
                new LatLng(-2.903885, -79.001165),
                new LatLng(-2.903574, -79.001517),
                new LatLng(-2.903460, -79.001555),
                new LatLng(-2.903375, -79.001579),
                new LatLng(-2.902950, -79.002073),
                new LatLng(-2.902731, -79.002371),







                museo_culturas_aborigenes
                )
                        .width(10)
                        .color(Color.BLUE)

        );


    }

    public void parque_Calderon(){
        LatLng parque_calderon = new LatLng(-2.897180, -79.004224);
        mMap.addMarker(new MarkerOptions().position(parque_calderon).title("Parque Calderon"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(parque_calderon, 18));

        LatLng u_cuenca = new LatLng(-2.900821, -79.010251);//
        mMap.addMarker(new MarkerOptions().position(u_cuenca).title("Univercidad de Cuneca"));

        //Con esto creammos la ruta
        mMap.addPolyline(new PolylineOptions().add(
                u_cuenca,

                new LatLng(-2.900787, -79.010312),
                new LatLng(-2.900724, -79.010292),
                new LatLng(-2.900661, -79.010269),
                new LatLng(-2.900591, -79.010269),
                new LatLng(-2.900454, -79.010247),
                new LatLng(-2.900427, -79.010247),
                new LatLng(-2.900109, -79.010085),
                new LatLng(-2.900090, -79.010070),
                new LatLng(-2.900082, -79.010049),
                new LatLng(-2.900071, -79.010029),
                new LatLng(-2.900067, -79.010003),
                new LatLng(-2.900072, -79.009712),
                new LatLng(-2.900179, -79.009535),
                new LatLng(-2.900106, -79.009483),
                new LatLng(-2.900102, -79.009476),
                new LatLng(-2.900111, -79.009405),
                new LatLng(-2.900024, -79.009413),
                new LatLng(-2.899954, -79.009394),
                new LatLng(-2.899955, -79.009397),
                new LatLng(-2.899798, -79.009303),
                new LatLng(-2.899719, -79.009249),
                new LatLng(-2.899842, -79.009085),
                new LatLng(-2.899734, -79.008993),
                new LatLng(-2.899410, -79.008778),
                new LatLng(-2.899400, -79.008757),
                new LatLng(-2.899511, -79.008573),
                new LatLng(-2.899512, -79.008543),
                new LatLng(-2.899505, -79.008514),
                new LatLng(-2.899474, -79.008499),
                new LatLng(-2.899288, -79.008328),
                new LatLng(-2.897977, -79.008090),
                new LatLng(-2.898439, -79.006436),
                new LatLng(-2.898242, -79.006102),
                new LatLng(-2.897563, -79.005925),
                new LatLng(-2.897644, -79.005429),
                new LatLng(-2.897781, -79.004936),
                new LatLng(-2.897272, -79.004864),
                new LatLng(-2.896826, -79.004789),
                new LatLng(-2.896991, -79.004185),



                parque_calderon
                )
                        .width(10)
                        .color(Color.BLUE)

        );



    }

    public void puente_Roto(){
        LatLng puente_roto = new LatLng(-2.904075, -79.001202);
        mMap.addMarker(new MarkerOptions().position(puente_roto).title("Puente Roto"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(puente_roto, 18));


        LatLng u_cuenca = new LatLng(-2.900821, -79.010251);//
        mMap.addMarker(new MarkerOptions().position(u_cuenca).title("Univercidad de Cuneca"));

        //Con esto creammos la ruta
        mMap.addPolyline(new PolylineOptions().add(
                u_cuenca,

                new LatLng(-2.901230, -79.008298),
                new LatLng(-2.900798, -79.008009),
                new LatLng(-2.901370, -79.007404),
                new LatLng(-2.901654, -79.007034),
                new LatLng(-2.901978, -79.006132),
                new LatLng(-2.902075, -79.006020),
                new LatLng(-2.902370, -79.004928),
                new LatLng(-2.902418, -79.004832),
                new LatLng(-2.903330, -79.003429),
                new LatLng(-2.903231, -79.003346),
                new LatLng(-2.902989, -79.003279),
                new LatLng(-2.903358, -79.002548),
                new LatLng(-2.904030, -79.001818),
                new LatLng(-2.904144, -79.001516),
                new LatLng(-2.904289, -79.001306),
                new LatLng(-2.904151, -79.001252),



                puente_roto
                )
                        .width(10)
                        .color(Color.BLUE)

        );

    }

    public void las_Conceptas(){
        LatLng madres_conceptas = new LatLng(-2.899489, -79.003181);
        mMap.addMarker(new MarkerOptions().position(madres_conceptas).title("Las  Conceptas"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(madres_conceptas, 18));

        LatLng u_cuenca = new LatLng(-2.900821, -79.010251);//
        mMap.addMarker(new MarkerOptions().position(u_cuenca).title("Univercidad de Cuneca"));

        //Con esto creammos la ruta
        mMap.addPolyline(new PolylineOptions().add(
                u_cuenca,

                new LatLng(-2.901214, -79.008312),
                new LatLng(-2.900837, -79.008057),
                new LatLng(-2.900766, -79.007990),
                new LatLng(-2.901346, -79.007422),
                new LatLng(-2.901533, -79.007169),
                new LatLng(-2.901657, -79.007004),
                new LatLng(-2.901947, -79.006217),
                new LatLng(-2.901990, -79.006103),
                new LatLng(-2.901640, -79.006027),
                new LatLng(-2.901591, -79.006027),
                new LatLng(-2.901574, -79.006047),
                new LatLng(-2.901509, -79.006154),
                new LatLng(-2.901486, -79.006183),
                new LatLng(-2.901457, -79.006186),
                new LatLng(-2.901347, -79.006176),
                new LatLng(-2.901374, -79.006074),
                new LatLng(-2.901464, -79.005831),
                new LatLng(-2.901448, -79.005734),
                new LatLng(-2.901427, -79.005707),
                new LatLng(-2.900946, -79.005570),
                new LatLng(-2.899825, -79.005331),
                new LatLng(-2.900503, -79.002536),
                new LatLng(-2.900144, -79.002464),
                new LatLng(-2.899501, -79.002313),
                new LatLng(-2.899296, -79.003121),





                madres_conceptas
                )
                        .width(10)
                        .color(Color.BLUE)

        );


    }

    public void ruinas_Santos(){
        LatLng ruinas_santos = new LatLng(-2.905114, -78.999761);
        mMap.addMarker(new MarkerOptions().position(ruinas_santos).title("Runas de Todos los Santos"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ruinas_santos, 18));


        LatLng u_cuenca = new LatLng(-2.900821, -79.010251);//
        mMap.addMarker(new MarkerOptions().position(u_cuenca).title("Univercidad de Cuneca"));

        //Con esto creammos la ruta
        mMap.addPolyline(new PolylineOptions().add(
                u_cuenca,

                new LatLng(-2.901208, -79.008340),
                new LatLng(-2.900783, -79.007981),
                new LatLng(-2.901384, -79.007423),
                new LatLng(-2.901627, -79.007014),
                new LatLng(-2.901961, -79.006141),
                new LatLng(-2.902016, -79.006079),
                new LatLng(-2.902066, -79.006016),
                new LatLng(-2.902358, -79.004961),
                new LatLng(-2.902474, -79.004741),
                new LatLng(-2.903342, -79.003424),//interseccion del parque de la madre
                new LatLng(-2.904279, -79.002277),
                new LatLng(-2.904630, -79.001663),
                new LatLng(-2.904703, -79.001410),
                new LatLng(-2.904847, -79.001266),
                new LatLng(-2.904982, -79.001158),
                new LatLng(-2.905081, -79.000959),
                new LatLng(-2.905906, -79.000596),
                new LatLng(-2.906050, -79.000488),
                new LatLng(-2.906040, -79.000415),
                new LatLng(-2.906061, -79.000380),
                new LatLng(-2.906098, -79.000342),
                new LatLng(-2.906134, -79.000321),
                new LatLng(-2.906169, -79.000318),
                new LatLng(-2.906547, -78.999681),
                new LatLng(-2.906707, -78.999486),
                new LatLng(-2.906887, -78.999296),
                new LatLng(-2.907047, -78.999182),
                new LatLng(-2.907209, -78.999041),
                new LatLng(-2.908526, -78.998129),
                new LatLng(-2.910308, -78.996257),
                new LatLng(-2.910477, -78.995981),
                new LatLng(-2.910521, -78.995898),
                new LatLng(-2.910576, -78.995687),
                new LatLng(-2.910574, -78.995607),//hasta aqui ruinas de pumapumgo y pumapungo
                new LatLng(-2.910545, -78.995453),
                new LatLng(-2.910454, -78.995547),
                new LatLng(-2.910367, -78.995645),
                new LatLng(-2.907150, -78.996219),
                new LatLng(-2.905917, -78.996429),
                new LatLng(-2.905810, -78.996440),
                new LatLng(-2.904943, -78.998982),
                new LatLng(-2.904874, -78.999187),
                new LatLng(-2.904730, -78.999672),
                new LatLng(-2.904863, -78.999756),
                new LatLng(-2.904973, -78.999775),

                ruinas_santos
                )
                        .width(10)
                        .color(Color.BLUE)

        );
    }

    public void museo_Landivar(){
        LatLng museo_augustin_landivar = new LatLng(-2.904934, -78.999180);
        mMap.addMarker(new MarkerOptions().position(museo_augustin_landivar).title("Museo Manuel Augustin Landivar"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(museo_augustin_landivar, 18));


        LatLng u_cuenca = new LatLng(-2.900821, -79.010251);//
        mMap.addMarker(new MarkerOptions().position(u_cuenca).title("Univercidad de Cuneca"));

        //Con esto creammos la ruta
        mMap.addPolyline(new PolylineOptions().add(
                u_cuenca,
                new LatLng(-2.901208, -79.008340),
                new LatLng(-2.900783, -79.007981),
                new LatLng(-2.901384, -79.007423),
                new LatLng(-2.901627, -79.007014),
                new LatLng(-2.901961, -79.006141),
                new LatLng(-2.902016, -79.006079),
                new LatLng(-2.902066, -79.006016),
                new LatLng(-2.902358, -79.004961),
                new LatLng(-2.902474, -79.004741),
                new LatLng(-2.903342, -79.003424),//interseccion del parque de la madre
                new LatLng(-2.904279, -79.002277),
                new LatLng(-2.904630, -79.001663),
                new LatLng(-2.904703, -79.001410),
                new LatLng(-2.904847, -79.001266),
                new LatLng(-2.904982, -79.001158),
                new LatLng(-2.905081, -79.000959),
                new LatLng(-2.905906, -79.000596),
                new LatLng(-2.906050, -79.000488),
                new LatLng(-2.906040, -79.000415),
                new LatLng(-2.906061, -79.000380),
                new LatLng(-2.906098, -79.000342),
                new LatLng(-2.906134, -79.000321),
                new LatLng(-2.906169, -79.000318),
                new LatLng(-2.906547, -78.999681),
                new LatLng(-2.906707, -78.999486),
                new LatLng(-2.906887, -78.999296),
                new LatLng(-2.907047, -78.999182),
                new LatLng(-2.907209, -78.999041),
                new LatLng(-2.908526, -78.998129),
                new LatLng(-2.910308, -78.996257),
                new LatLng(-2.910477, -78.995981),
                new LatLng(-2.910521, -78.995898),
                new LatLng(-2.910576, -78.995687),
                new LatLng(-2.910574, -78.995607),//hasta aqui ruinas de pumapumgo y pumapungo
                new LatLng(-2.910545, -78.995453),
                new LatLng(-2.910454, -78.995547),
                new LatLng(-2.910367, -78.995645),
                new LatLng(-2.907150, -78.996219),
                new LatLng(-2.905917, -78.996429),
                new LatLng(-2.905811, -78.996444),
                new LatLng(-2.904942, -78.998959),
                new LatLng(-2.904884, -78.999116),




                museo_augustin_landivar
                )
                        .width(10)
                        .color(Color.BLUE)

        );

    }

    public void parque_Miraflores(){
        LatLng parque_miraflores = new LatLng(-2.883260, -78.993701);
        mMap.addMarker(new MarkerOptions().position(parque_miraflores).title("Parque Miraflores"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(parque_miraflores, 18));


        LatLng u_cuenca = new LatLng(-2.900821, -79.010251);//
        mMap.addMarker(new MarkerOptions().position(u_cuenca).title("Univercidad de Cuneca"));

        //Con esto creammos la ruta
        mMap.addPolyline(new PolylineOptions().add(
                u_cuenca,
                new LatLng(-2.901208, -79.008340),
                new LatLng(-2.900783, -79.007981),
                new LatLng(-2.901384, -79.007423),
                new LatLng(-2.901627, -79.007014),
                new LatLng(-2.901961, -79.006141),
                new LatLng(-2.902016, -79.006079),
                new LatLng(-2.902066, -79.006016),
                new LatLng(-2.902358, -79.004961),
                new LatLng(-2.902474, -79.004741),
                new LatLng(-2.903342, -79.003424),//interseccion del parque de la madre
                new LatLng(-2.904279, -79.002277),
                new LatLng(-2.904630, -79.001663),
                new LatLng(-2.904703, -79.001410),
                new LatLng(-2.904847, -79.001266),
                new LatLng(-2.904982, -79.001158),
                new LatLng(-2.905081, -79.000959),
                new LatLng(-2.905906, -79.000596),
                new LatLng(-2.906050, -79.000488),
                new LatLng(-2.906040, -79.000415),
                new LatLng(-2.906061, -79.000380),
                new LatLng(-2.906098, -79.000342),
                new LatLng(-2.906134, -79.000321),
                new LatLng(-2.906169, -79.000318),
                new LatLng(-2.906547, -78.999681),
                new LatLng(-2.906707, -78.999486),
                new LatLng(-2.906887, -78.999296),
                new LatLng(-2.907047, -78.999182),
                new LatLng(-2.907209, -78.999041),
                new LatLng(-2.908526, -78.998129),
                new LatLng(-2.910308, -78.996257),
                new LatLng(-2.910477, -78.995981),
                new LatLng(-2.910521, -78.995898),
                new LatLng(-2.910576, -78.995687),
                new LatLng(-2.910574, -78.995607),//hasta aqui ruinas de pumapumgo y pumapungo
                new LatLng(-2.910545, -78.995453),
                new LatLng(-2.910454, -78.995547),
                new LatLng(-2.910367, -78.995645),
                new LatLng(-2.907150, -78.996219),
                new LatLng(-2.905917, -78.996429),
                new LatLng(-2.903111, -78.996722),
                new LatLng(-2.901859, -78.996804),
                new LatLng(-2.901440, -78.996850),
                new LatLng(-2.900894, -78.996782),
                new LatLng(-2.895574, -78.996518),
                new LatLng(-2.895525, -78.996601),
                new LatLng(-2.895435, -78.996630),
                new LatLng(-2.895362, -78.996631),
                new LatLng(-2.895290, -78.996596),
                new LatLng(-2.895244, -78.996550),
                new LatLng(-2.895228, -78.996499),
                new LatLng(-2.892244, -78.996338),
                new LatLng(-2.891911, -78.996360),
                new LatLng(-2.891403, -78.996322),
                new LatLng(-2.891252, -78.996231),
                new LatLng(-2.891062, -78.996095),
                new LatLng(-2.890821, -78.995879),
                new LatLng(-2.889972, -78.995225),
                new LatLng(-2.889735, -78.995045),
                new LatLng(-2.885171, -78.991399),
                new LatLng(-2.885042, -78.991445),
                new LatLng(-2.884934, -78.991523),
                new LatLng(-2.884874, -78.991589),
                new LatLng(-2.884826, -78.991628),
                new LatLng(-2.884705, -78.991682),
                new LatLng(-2.884425, -78.991249),
                new LatLng(-2.884259, -78.990976),
                new LatLng(-2.884012, -78.990572),
                new LatLng(-2.883965, -78.990559),
                new LatLng(-2.883932, -78.990681),
                new LatLng(-2.882628, -78.993618),
                new LatLng(-2.882885, -78.993734),
                new LatLng(-2.882933, -78.993792),



                parque_miraflores
                )
                        .width(10)
                        .color(Color.BLUE)

        );




    }

    public void museo_madres_Conceptas(){
        LatLng madres_conceptas = new LatLng(-2.900136, -79.002514);
        mMap.addMarker(new MarkerOptions().position(madres_conceptas).title("De las Madres Conceptas"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(madres_conceptas, 18));

        LatLng u_cuenca = new LatLng(-2.900821, -79.010251);//
        mMap.addMarker(new MarkerOptions().position(u_cuenca).title("Univercidad de Cuneca"));

        //Con esto creammos la ruta
        mMap.addPolyline(new PolylineOptions().add(
                u_cuenca,

                new LatLng(-2.901214, -79.008312),
                new LatLng(-2.900837, -79.008057),
                new LatLng(-2.900766, -79.007990),
                new LatLng(-2.901346, -79.007422),
                new LatLng(-2.901533, -79.007169),
                new LatLng(-2.901657, -79.007004),
                new LatLng(-2.901947, -79.006217),
                new LatLng(-2.901990, -79.006103),
                new LatLng(-2.901640, -79.006027),
                new LatLng(-2.901591, -79.006027),
                new LatLng(-2.901574, -79.006047),
                new LatLng(-2.901509, -79.006154),
                new LatLng(-2.901486, -79.006183),
                new LatLng(-2.901457, -79.006186),
                new LatLng(-2.901347, -79.006176),
                new LatLng(-2.901374, -79.006074),
                new LatLng(-2.901464, -79.005831),
                new LatLng(-2.901448, -79.005734),
                new LatLng(-2.901427, -79.005707),
                new LatLng(-2.900946, -79.005570),
                new LatLng(-2.899825, -79.005331),
                new LatLng(-2.900503, -79.002536),
                new LatLng(-2.900144, -79.002464),





                madres_conceptas
                )
                        .width(10)
                        .color(Color.BLUE)

        );

    }

    public void parque_MAdre(){
        LatLng parque_madre = new LatLng(-2.904497, -79.003079);//para colocar el marcador
        mMap.addMarker(new MarkerOptions().position(parque_madre).title("Parque de la Madre"));//para colocar el titulo al marcado
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(parque_madre, 18));


        LatLng u_cuenca = new LatLng(-2.900821, -79.010251);//
        mMap.addMarker(new MarkerOptions().position(u_cuenca).title("Univercidad de Cuneca"));

        //Con esto creammos la ruta
        mMap.addPolyline(new PolylineOptions().add(
                u_cuenca,

                new LatLng(-2.901207, -79.008314),
                new LatLng(-2.900839, -79.008055),
                new LatLng(-2.900775, -79.007988),
                new LatLng(-2.901343, -79.007404),
                new LatLng(-2.901650, -79.007023),
                new LatLng(-2.901823, -79.006515),
                new LatLng(-2.901940, -79.006211),
                new LatLng(-2.901981, -79.006107),
                new LatLng(-2.901989, -79.006094),
                new LatLng(-2.902064, -79.006019),
                new LatLng(-2.902140, -79.006013),
                new LatLng(-2.903150, -79.006234),
                new LatLng(-2.905143, -79.006797),
                new LatLng(-2.905449, -79.005742),
                new LatLng(-2.905534, -79.005433),
                new LatLng(-2.905530, -79.005286),
                new LatLng(-2.905512, -79.005060),
                new LatLng(-2.905312, -79.003397),
                new LatLng(-2.904960, -79.003151),
                new LatLng(-2.904893, -79.003114),
                new LatLng(-2.904813, -79.003085),
                new LatLng(-2.904775, -79.003061),






                parque_madre
                )
                        .width(10)
                        .color(Color.BLUE)

        );

    }

    public void fundacion_Vienai(){
        LatLng fundacion_bienal = new LatLng(-2.895677, -79.009454);
        mMap.addMarker(new MarkerOptions().position(fundacion_bienal).title("Fundacion Bienal de Cuenca"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(fundacion_bienal, 18));


        LatLng u_cuenca = new LatLng(-2.900821, -79.010251);//
        mMap.addMarker(new MarkerOptions().position(u_cuenca).title("Univercidad de Cuneca"));

        //Con esto creammos la ruta
        mMap.addPolyline(new PolylineOptions().add(
                u_cuenca,

                new LatLng(-2.900788, -79.01030),
                new LatLng(-2.900734, -79.010284),
                new LatLng(-2.900657, -79.010270),
                new LatLng(-2.900574, -79.010264),
                new LatLng(-2.900450, -79.010243),
                new LatLng(-2.900423, -79.010247),
                new LatLng(-2.900101, -79.010079),
                new LatLng(-2.900084, -79.010054),
                new LatLng(-2.900068, -79.010029),
                new LatLng(-2.900065, -79.009997),
                new LatLng(-2.900073, -79.009713),
                new LatLng(-2.900177, -79.009536),
                new LatLng(-2.900102, -79.009484),
                new LatLng(-2.900108, -79.009407),
                new LatLng(-2.899733, -79.008992),
                new LatLng(-2.899413, -79.008780),
                new LatLng(-2.899402, -79.008762),
                new LatLng(-2.899500, -79.008591),
                new LatLng(-2.899514, -79.008567),
                new LatLng(-2.899513, -79.008538),
                new LatLng(-2.899510, -79.008516),
                new LatLng(-2.899462, -79.008498),
                new LatLng(-2.899458, -79.008450),
                new LatLng(-2.899295, -79.008332),
                new LatLng(-2.896997, -79.007922),
                new LatLng(-2.896765, -79.008911),
                new LatLng(-2.895799, -79.008741),
                new LatLng(-2.895616, -79.009446),



                fundacion_bienal
                )
                        .width(10)
                        .color(Color.BLUE)

        );
    }

    public void iglesia_Sanblas(){
        LatLng iglesia_samblas = new LatLng(-2.898604, -78.997845);
        mMap.addMarker(new MarkerOptions().position(iglesia_samblas).title("Iglesia de Samblas"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(iglesia_samblas, 18));

        LatLng u_cuenca = new LatLng(-2.900821, -79.010251);//
        mMap.addMarker(new MarkerOptions().position(u_cuenca).title("Univercidad de Cuneca"));

        //Con esto creammos la ruta
        mMap.addPolyline(new PolylineOptions().add(
                u_cuenca,

                new LatLng(-2.901214, -79.008312),
                new LatLng(-2.900837, -79.008057),
                new LatLng(-2.900766, -79.007990),
                new LatLng(-2.901346, -79.007422),
                new LatLng(-2.901533, -79.007169),
                new LatLng(-2.901657, -79.007004),
                new LatLng(-2.901947, -79.006217),
                new LatLng(-2.901990, -79.006103),
                new LatLng(-2.901640, -79.006027),
                new LatLng(-2.901591, -79.006027),
                new LatLng(-2.901574, -79.006047),
                new LatLng(-2.901509, -79.006154),
                new LatLng(-2.901486, -79.006183),
                new LatLng(-2.901457, -79.006186),
                new LatLng(-2.901347, -79.006176),
                new LatLng(-2.901374, -79.006074),
                new LatLng(-2.901464, -79.005831),
                new LatLng(-2.901448, -79.005734),
                new LatLng(-2.901427, -79.005707),
                new LatLng(-2.900946, -79.005570),
                new LatLng(-2.899825, -79.005331),
                new LatLng(-2.900503, -79.002536),
                new LatLng(-2.900144, -79.002464),
                new LatLng(-2.899495, -79.002323),
                new LatLng(-2.900249, -78.999331),
                new LatLng(-2.899219, -78.999119),
                new LatLng(-2.898330, -78.998939),
                new LatLng(-2.898587, -78.997940),
                new LatLng(-2.898619, -78.997950),



                iglesia_samblas
                )
                        .width(10)
                        .color(Color.BLUE)

        );
    }

    public void museo_Arte_Moderno(){
        LatLng museo_arte_moderno = new LatLng(-2.896705, -79.010195);
        mMap.addMarker(new MarkerOptions().position(museo_arte_moderno).title("Museo Municipal de Arte Moderno"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(museo_arte_moderno, 18));

        LatLng u_cuenca = new LatLng(-2.900821, -79.010251);//
        mMap.addMarker(new MarkerOptions().position(u_cuenca).title("Univercidad de Cuneca"));

        //Con esto creammos la ruta
        mMap.addPolyline(new PolylineOptions().add(
                u_cuenca,

                new LatLng(-2.900788, -79.01030),
                new LatLng(-2.900734, -79.010284),
                new LatLng(-2.900657, -79.010270),
                new LatLng(-2.900574, -79.010264),
                new LatLng(-2.900450, -79.010243),
                new LatLng(-2.900423, -79.010247),
                new LatLng(-2.900101, -79.010079),
                new LatLng(-2.900084, -79.010054),
                new LatLng(-2.900068, -79.010029),
                new LatLng(-2.900065, -79.009997),
                new LatLng(-2.900073, -79.009713),
                new LatLng(-2.900177, -79.009536),
                new LatLng(-2.900102, -79.009484),
                new LatLng(-2.900108, -79.009407),
                new LatLng(-2.899733, -79.008992),
                new LatLng(-2.899413, -79.008780),
                new LatLng(-2.899402, -79.008762),
                new LatLng(-2.899500, -79.008591),
                new LatLng(-2.899514, -79.008567),
                new LatLng(-2.899513, -79.008538),
                new LatLng(-2.899510, -79.008516),
                new LatLng(-2.899462, -79.008498),
                new LatLng(-2.899458, -79.008450),
                new LatLng(-2.899295, -79.008332),
                new LatLng(-2.896997, -79.007922),
                new LatLng(-2.896765, -79.008911),
                new LatLng(-2.896512, -79.009904),
                new LatLng(-2.896791, -79.009947),




                museo_arte_moderno
                )
                        .width(10)
                        .color(Color.BLUE)

        );

    }

    public void museo_Moderno(){
        LatLng arte_moderno = new LatLng(-2.896737, -79.010228);
        mMap.addMarker(new MarkerOptions().position(arte_moderno).title("Museo de Arte Moderno"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(arte_moderno, 18));


        LatLng u_cuenca = new LatLng(-2.900821, -79.010251);//
        mMap.addMarker(new MarkerOptions().position(u_cuenca).title("Univercidad de Cuneca"));

        //Con esto creammos la ruta
        mMap.addPolyline(new PolylineOptions().add(
                u_cuenca,

                new LatLng(-2.900788, -79.01030),
                new LatLng(-2.900734, -79.010284),
                new LatLng(-2.900657, -79.010270),
                new LatLng(-2.900574, -79.010264),
                new LatLng(-2.900450, -79.010243),
                new LatLng(-2.900423, -79.010247),
                new LatLng(-2.900101, -79.010079),
                new LatLng(-2.900084, -79.010054),
                new LatLng(-2.900068, -79.010029),
                new LatLng(-2.900065, -79.009997),
                new LatLng(-2.900073, -79.009713),
                new LatLng(-2.900177, -79.009536),
                new LatLng(-2.900102, -79.009484),
                new LatLng(-2.900108, -79.009407),
                new LatLng(-2.899733, -79.008992),
                new LatLng(-2.899413, -79.008780),
                new LatLng(-2.899402, -79.008762),
                new LatLng(-2.899500, -79.008591),
                new LatLng(-2.899514, -79.008567),
                new LatLng(-2.899513, -79.008538),
                new LatLng(-2.899510, -79.008516),
                new LatLng(-2.899462, -79.008498),
                new LatLng(-2.899458, -79.008450),
                new LatLng(-2.899295, -79.008332),
                new LatLng(-2.896997, -79.007922),
                new LatLng(-2.896765, -79.008911),
                new LatLng(-2.896512, -79.009904),
                new LatLng(-2.896791, -79.009947),




                arte_moderno
                )
                        .width(10)
                        .color(Color.BLUE)

        );
    }

    public void cuenca_Cyti(){
        LatLng cuanca_city = new LatLng(-2.897911, -79.004032);
        mMap.addMarker(new MarkerOptions().position(cuanca_city).title("Cuenca City Tour 360"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(cuanca_city, 18));

        LatLng u_cuenca = new LatLng(-2.900821, -79.010251);//
        mMap.addMarker(new MarkerOptions().position(u_cuenca).title("Univercidad de Cuneca"));

        //Con esto creammos la ruta
        mMap.addPolyline(new PolylineOptions().add(
                u_cuenca,

                new LatLng(-2.900787, -79.010312),
                new LatLng(-2.900724, -79.010292),
                new LatLng(-2.900661, -79.010269),
                new LatLng(-2.900591, -79.010269),
                new LatLng(-2.900454, -79.010247),
                new LatLng(-2.900427, -79.010247),
                new LatLng(-2.900109, -79.010085),
                new LatLng(-2.900090, -79.010070),
                new LatLng(-2.900082, -79.010049),
                new LatLng(-2.900071, -79.010029),
                new LatLng(-2.900067, -79.010003),
                new LatLng(-2.900072, -79.009712),
                new LatLng(-2.900179, -79.009535),
                new LatLng(-2.900106, -79.009483),
                new LatLng(-2.900102, -79.009476),
                new LatLng(-2.900111, -79.009405),
                new LatLng(-2.900024, -79.009413),
                new LatLng(-2.899954, -79.009394),
                new LatLng(-2.899955, -79.009397),
                new LatLng(-2.899798, -79.009303),
                new LatLng(-2.899719, -79.009249),
                new LatLng(-2.899842, -79.009085),
                new LatLng(-2.899734, -79.008993),
                new LatLng(-2.899410, -79.008778),
                new LatLng(-2.899400, -79.008757),
                new LatLng(-2.899511, -79.008573),
                new LatLng(-2.899512, -79.008543),
                new LatLng(-2.899505, -79.008514),
                new LatLng(-2.899474, -79.008499),
                new LatLng(-2.899288, -79.008328),
                new LatLng(-2.897977, -79.008090),
                new LatLng(-2.898439, -79.006436),
                new LatLng(-2.898242, -79.006102),
                new LatLng(-2.897563, -79.005925),
                new LatLng(-2.897644, -79.005429),
                new LatLng(-2.897781, -79.004936),
                new LatLng(-2.897917, -79.004407),
                new LatLng(-2.898000, -79.004152),
                new LatLng(-2.898019, -79.004028),




                cuanca_city
                )
                        .width(10)
                        .color(Color.BLUE)

        );

    }

    public void museo_Medicina(){
        LatLng museo_hitoria_medicina = new LatLng(-2.902937, -79.004864);
        mMap.addMarker(new MarkerOptions().position(museo_hitoria_medicina).title("Museo de Historia de la Medicina"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(museo_hitoria_medicina, 18));

        LatLng u_cuenca = new LatLng(-2.900821, -79.010251);//
        mMap.addMarker(new MarkerOptions().position(u_cuenca).title("Univercidad de Cuneca"));

        //Con esto creammos la ruta
        mMap.addPolyline(new PolylineOptions().add(
                u_cuenca,

                new LatLng(-2.901207, -79.008314),
                new LatLng(-2.900839, -79.008055),
                new LatLng(-2.900775, -79.007988),
                new LatLng(-2.901343, -79.007404),
                new LatLng(-2.901650, -79.007023),
                new LatLng(-2.901823, -79.006515),
                new LatLng(-2.901940, -79.006211),
                new LatLng(-2.901981, -79.006107),
                new LatLng(-2.901989, -79.006094),
                new LatLng(-2.902064, -79.006019),
                new LatLng(-2.902140, -79.006013),
                new LatLng(-2.903150, -79.006234),
                new LatLng(-2.903623, -79.006368),
                new LatLng(-2.903754, -79.005935),
                new LatLng(-2.903809, -79.005826),
                new LatLng(-2.903882, -79.005743),
                new LatLng(-2.903031, -79.005250),





                museo_hitoria_medicina
                )
                        .width(10)
                        .color(Color.BLUE)

        );
    }

    public void casa_Cultura(){
        LatLng casa_cultura = new LatLng(-2.898033, -79.005545);
        mMap.addMarker(new MarkerOptions().position(casa_cultura).title("Casa de la Cultura"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(casa_cultura, 18));


        LatLng u_cuenca = new LatLng(-2.900821, -79.010251);//
        mMap.addMarker(new MarkerOptions().position(u_cuenca).title("Univercidad de Cuneca"));

        //Con esto creammos la ruta
        mMap.addPolyline(new PolylineOptions().add(
                u_cuenca,
                new LatLng(-2.900787, -79.010312),
                new LatLng(-2.900724, -79.010292),
                new LatLng(-2.900661, -79.010269),
                new LatLng(-2.900591, -79.010269),
                new LatLng(-2.900454, -79.010247),
                new LatLng(-2.900427, -79.010247),
                new LatLng(-2.900109, -79.010085),
                new LatLng(-2.900090, -79.010070),
                new LatLng(-2.900082, -79.010049),
                new LatLng(-2.900071, -79.010029),
                new LatLng(-2.900067, -79.010003),
                new LatLng(-2.900072, -79.009712),
                new LatLng(-2.900179, -79.009535),
                new LatLng(-2.900106, -79.009483),
                new LatLng(-2.900102, -79.009476),
                new LatLng(-2.900111, -79.009405),
                new LatLng(-2.900024, -79.009413),
                new LatLng(-2.899954, -79.009394),
                new LatLng(-2.899955, -79.009397),
                new LatLng(-2.899798, -79.009303),
                new LatLng(-2.899719, -79.009249),
                new LatLng(-2.899842, -79.009085),
                new LatLng(-2.899734, -79.008993),
                new LatLng(-2.899410, -79.008778),
                new LatLng(-2.899400, -79.008757),
                new LatLng(-2.899511, -79.008573),
                new LatLng(-2.899512, -79.008543),
                new LatLng(-2.899505, -79.008514),
                new LatLng(-2.899474, -79.008499),
                new LatLng(-2.899288, -79.008328),
                new LatLng(-2.897977, -79.008090),
                new LatLng(-2.898439, -79.006436),
                new LatLng(-2.898242, -79.006102),
                new LatLng(-2.897563, -79.005925),
                new LatLng(-2.897644, -79.005429),
                new LatLng(-2.897787, -79.004959),
                new LatLng(-2.897952, -79.004989),


                casa_cultura
                )
                        .width(10)
                        .color(Color.BLUE)

        );

    }

    public void colegio_Imacualda(){
        LatLng colegio_imaculada = new LatLng(-2.892616, -78.970349);
        mMap.addMarker(new MarkerOptions().position(colegio_imaculada).title("Colegio la Imaculada"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(colegio_imaculada, 18));

        LatLng u_cuenca = new LatLng(-2.900821, -79.010251);//
        mMap.addMarker(new MarkerOptions().position(u_cuenca).title("Univercidad de Cuneca"));

        //Con esto creammos la ruta
        mMap.addPolyline(new PolylineOptions().add(
                u_cuenca,
                new LatLng(-2.901208, -79.008340),
                new LatLng(-2.900783, -79.007981),
                new LatLng(-2.901384, -79.007423),
                new LatLng(-2.901627, -79.007014),
                new LatLng(-2.901961, -79.006141),
                new LatLng(-2.902016, -79.006079),
                new LatLng(-2.902066, -79.006016),
                new LatLng(-2.902358, -79.004961),
                new LatLng(-2.902474, -79.004741),
                new LatLng(-2.903342, -79.003424),//interseccion del parque de la madre
                new LatLng(-2.904279, -79.002277),
                new LatLng(-2.904630, -79.001663),
                new LatLng(-2.904703, -79.001410),
                new LatLng(-2.904847, -79.001266),
                new LatLng(-2.904982, -79.001158),
                new LatLng(-2.905081, -79.000959),
                new LatLng(-2.905906, -79.000596),
                new LatLng(-2.906050, -79.000488),
                new LatLng(-2.906040, -79.000415),
                new LatLng(-2.906061, -79.000380),
                new LatLng(-2.906098, -79.000342),
                new LatLng(-2.906134, -79.000321),
                new LatLng(-2.906169, -79.000318),
                new LatLng(-2.906547, -78.999681),
                new LatLng(-2.906707, -78.999486),
                new LatLng(-2.906887, -78.999296),
                new LatLng(-2.907047, -78.999182),
                new LatLng(-2.907209, -78.999041),
                new LatLng(-2.908526, -78.998129),
                new LatLng(-2.910308, -78.996257),
                new LatLng(-2.910477, -78.995981),
                new LatLng(-2.910521, -78.995898),
                new LatLng(-2.910576, -78.995687),
                new LatLng(-2.910574, -78.995607),//hasta aqui ruinas de pumapumgo y pumapungo
                new LatLng(-2.910545, -78.995453),
                new LatLng(-2.910454, -78.995547),
                new LatLng(-2.910367, -78.995645),
                new LatLng(-2.907150, -78.996219),
                new LatLng(-2.905917, -78.996429),
                new LatLng(-2.905824, -78.996435),
                new LatLng(-2.906059, -78.995398),
                new LatLng(-2.906203, -78.995005),
                new LatLng(-2.906405, -78.994622),
                new LatLng(-2.906730, -78.994157),
                new LatLng(-2.907185, -78.993508),
                new LatLng(-2.904997, -78.992147),
                new LatLng(-2.904774, -78.991969),
                new LatLng(-2.904576, -78.991847),
                new LatLng(-2.904480, -78.991720),
                new LatLng(-2.904225, -78.991427),
                new LatLng(-2.903798, -78.990247),
                new LatLng(-2.903389, -78.989374),
                new LatLng(-2.902478, -78.986917),
                new LatLng(-2.902146, -78.986166),
                new LatLng(-2.901983, -78.985889),
                new LatLng(-2.901471, -78.985363),
                new LatLng(-2.901150, -78.985111),
                new LatLng(-2.900644, -78.984822),
                new LatLng(-2.900182, -78.984650),
                new LatLng(-2.899446, -78.984587),
                new LatLng(-2.899342, -78.984641),
                new LatLng(-2.899272, -78.984612),
                new LatLng(-2.899182, -78.984593),
                new LatLng(-2.899134, -78.984536),
                new LatLng(-2.899130, -78.984469),
                new LatLng(-2.899141, -78.984390),
                new LatLng(-2.898213, -78.981835),
                new LatLng(-2.897596, -78.980204),
                new LatLng(-2.897592, -78.980109),
                new LatLng(-2.897580, -78.979984),
                new LatLng(-2.897531, -78.979745),
                new LatLng(-2.897296, -78.979137),
                new LatLng(-2.897251, -78.978799),
                new LatLng(-2.897002, -78.977241),
                new LatLng(-2.896948, -78.976744),
                new LatLng(-2.896768, -78.976338),
                new LatLng(-2.896813, -78.976104),
                new LatLng(-2.896870, -78.975237),
                new LatLng(-2.896860, -78.974866),
                new LatLng(-2.896806, -78.974673),
                new LatLng(-2.896694, -78.974550),
                new LatLng(-2.896640, -78.974448),
                new LatLng(-2.896543, -78.974240),
                new LatLng(-2.895709, -78.973587),
                new LatLng(-2.895459, -78.973269),
                new LatLng(-2.895073, -78.972631),
                new LatLng(-2.894497, -78.971443),
                new LatLng(-2.894110, -78.970586),
                new LatLng(-2.893996, -78.970416),
                new LatLng(-2.893496, -78.969900),
                new LatLng(-2.893289, -78.969731),
                new LatLng(-2.892450, -78.969092),
                new LatLng(-2.891937, -78.969477),
                new LatLng(-2.892166, -78.969924),
                new LatLng(-2.892490, -78.970420),



                colegio_imaculada
                )
                        .width(10)
                        .color(Color.BLUE)

        );
    }

    public void museo_Minasterio_Conceptas(){
        LatLng museo_conceptas = new LatLng(-2.896524, -79.001631);
        mMap.addMarker(new MarkerOptions().position(museo_conceptas).title("Museo del Monasterio de las Conceptas"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(museo_conceptas, 18));

        LatLng u_cuenca = new LatLng(-2.900821, -79.010251);//
        mMap.addMarker(new MarkerOptions().position(u_cuenca).title("Univercidad de Cuneca"));

        //Con esto creammos la ruta
        mMap.addPolyline(new PolylineOptions().add(
                u_cuenca,

                new LatLng(-2.900787, -79.010312),
                new LatLng(-2.900724, -79.010292),
                new LatLng(-2.900661, -79.010269),
                new LatLng(-2.900591, -79.010269),
                new LatLng(-2.900454, -79.010247),
                new LatLng(-2.900427, -79.010247),
                new LatLng(-2.900109, -79.010085),
                new LatLng(-2.900090, -79.010070),
                new LatLng(-2.900082, -79.010049),
                new LatLng(-2.900071, -79.010029),
                new LatLng(-2.900067, -79.010003),
                new LatLng(-2.900072, -79.009712),
                new LatLng(-2.900179, -79.009535),
                new LatLng(-2.900106, -79.009483),
                new LatLng(-2.900102, -79.009476),
                new LatLng(-2.900111, -79.009405),
                new LatLng(-2.900024, -79.009413),
                new LatLng(-2.899954, -79.009394),
                new LatLng(-2.899955, -79.009397),
                new LatLng(-2.899798, -79.009303),
                new LatLng(-2.899719, -79.009249),
                new LatLng(-2.899842, -79.009085),
                new LatLng(-2.899734, -79.008993),
                new LatLng(-2.899410, -79.008778),
                new LatLng(-2.899400, -79.008757),
                new LatLng(-2.899511, -79.008573),
                new LatLng(-2.899512, -79.008543),
                new LatLng(-2.899505, -79.008514),
                new LatLng(-2.899474, -79.008499),
                new LatLng(-2.899288, -79.008328),
                new LatLng(-2.897977, -79.008090),
                new LatLng(-2.898439, -79.006436),
                new LatLng(-2.898242, -79.006102),
                new LatLng(-2.897563, -79.005925),
                new LatLng(-2.897644, -79.005429),
                new LatLng(-2.897781, -79.004936),
                new LatLng(-2.897272, -79.004864),
                new LatLng(-2.896826, -79.004789),
                new LatLng(-2.896991, -79.004185),
                new LatLng(-2.897037, -79.003948),
                new LatLng(-2.897160, -79.003387),
                new LatLng(-2.897547, -79.001961),
                new LatLng(-2.896547, -79.001750),





                museo_conceptas
                )
                        .width(10)
                        .color(Color.BLUE)

        );
    }

    public void mirador_Turi(){
        LatLng mirador_turi = new LatLng(-2.922355, -79.010361);
        mMap.addMarker(new MarkerOptions().position(mirador_turi).title("Mirador de Turi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(mirador_turi, 18));


        LatLng u_cuenca = new LatLng(-2.900821, -79.010251);//
        mMap.addMarker(new MarkerOptions().position(u_cuenca).title("Univercidad de Cuneca"));

        //Con esto creammos la ruta
        mMap.addPolyline(new PolylineOptions().add(
                u_cuenca,
                new LatLng(-2.902317, -79.010336),
                new LatLng(-2.902167, -79.009735),
                new LatLng(-2.903013, -79.008287),
                new LatLng(-2.903666, -79.008524),
                new LatLng(-2.904485, -79.008691),
                new LatLng(-2.906401, -79.009186),
                new LatLng(-2.906687, -79.008330),
                new LatLng(-2.906784, -79.007885),
                new LatLng(-2.906757, -79.007638),
                new LatLng(-2.906660, -79.007514),
                new LatLng(-2.906698, -79.007311),
                new LatLng(-2.906842, -79.007182),
                new LatLng(-2.907051, -79.007171),
                new LatLng(-2.907255, -79.007235),
                new LatLng(-2.907292, -79.007359),
                new LatLng(-2.911006, -79.008395),
                new LatLng(-2.911124, -79.008408),
                new LatLng(-2.911203, -79.008421),
                new LatLng(-2.911267, -79.008478),
                new LatLng(-2.913003, -79.008990),
                new LatLng(-2.913385, -79.009061),
                new LatLng(-2.914753, -79.009381),
                new LatLng(-2.914902, -79.009413),
                new LatLng(-2.915165, -79.009492),
                new LatLng(-2.915512, -79.009555),
                new LatLng(-2.915722, -79.009682),
                new LatLng(-2.915837, -79.009686),
                new LatLng(-2.915911, -79.009720),
                new LatLng(-2.915949, -79.009777),
                new LatLng(-2.916860, -79.009187),
                new LatLng(-2.917806, -79.008826),
                new LatLng(-2.918058, -79.008564),
                new LatLng(-2.918292, -79.008420),
                new LatLng(-2.918400, -79.008239),
                new LatLng(-2.918581, -79.008158),
                new LatLng(-2.918644, -79.008005),
                new LatLng(-2.918833, -79.007202),
                new LatLng(-2.918770, -79.006661),
                new LatLng(-2.918941, -79.006480),
                new LatLng(-2.919103, -79.006435),
                new LatLng(-2.919736, -79.006328),
                new LatLng(-2.919724, -79.009618),
                new LatLng(-2.920164, -79.011023),
                new LatLng(-2.920292, -79.011184),
                new LatLng(-2.920582, -79.011173),
                new LatLng(-2.920742, -79.010143),
                new LatLng(-2.920903, -79.00993),
                new LatLng(-2.921417, -79.009070),
                new LatLng(-2.921546, -79.008695),
                new LatLng(-2.921857, -79.007450),
                new LatLng(-2.921926, -79.006971),
                new LatLng(-2.921881, -79.006754),
                new LatLng(-2.921601, -79.006116),
                new LatLng(-2.921601, -79.005855),
                new LatLng(-2.921671, -79.005650),
                new LatLng(-2.921938, -79.005491),
                new LatLng(-2.922231, -79.005459),
                new LatLng(-2.922448, -79.005580),
                new LatLng(-2.922563, -79.005574),
                new LatLng(-2.923066, -79.005376),
                new LatLng(-2.923219, -79.005370),
                new LatLng(-2.923353, -79.005402),
                new LatLng(-2.923544, -79.005701),
                new LatLng(-2.923531, -79.005861),
                new LatLng(-2.923436, -79.006046),
                new LatLng(-2.922690, -79.006352),
                new LatLng(-2.922563, -79.006461),
                new LatLng(-2.922556, -79.006620),
                new LatLng(-2.922760, -79.007207),
                new LatLng(-2.922843, -79.007386),
                new LatLng(-2.922753, -79.008156),
                new LatLng(-2.922664, -79.008302),
                new LatLng(-2.922358, -79.008896),
                new LatLng(-2.922231, -79.009087),
                new LatLng(-2.922225, -79.009291),
                new LatLng(-2.922340, -79.009776),
                new LatLng(-2.922408, -79.009875),
                new LatLng(-2.922454, -79.009909),
                new LatLng(-2.922389, -79.010106),
                new LatLng(-2.922249, -79.010296),




                mirador_turi
                )
                        .width(10)
                        .color(Color.BLUE)

        );
    }

    public void panama_Hal_Museum(){
        LatLng hal_museum = new LatLng(-2.900399, -79.006815);
        mMap.addMarker(new MarkerOptions().position(hal_museum).title("Panama Hal Museum"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(hal_museum, 18));

        LatLng u_cuenca = new LatLng(-2.900821, -79.010251);//
        mMap.addMarker(new MarkerOptions().position(u_cuenca).title("Univercidad de Cuneca"));

        //Con esto creammos la ruta
        mMap.addPolyline(new PolylineOptions().add(
                u_cuenca,
                new LatLng(-2.900796, -79.010309),
                new LatLng(-2.900747, -79.010286),
                new LatLng(-2.900658, -79.010268),
                new LatLng(-2.900447, -79.010245),
                new LatLng(-2.900425, -79.010252),
                new LatLng(-2.900258, -79.010167),
                new LatLng(-2.900107, -79.010084),
                new LatLng(-2.900085, -79.010060),
                new LatLng(-2.900077, -79.010039),
                new LatLng(-2.900071, -79.010016),
                new LatLng(-2.900066, -79.009998),
                new LatLng(-2.900072, -79.009711),
                new LatLng(-2.900179, -79.009534),
                new LatLng(-2.900102, -79.009479),
                new LatLng(-2.900109, -79.009411),
                new LatLng(-2.900021, -79.009407),
                new LatLng(-2.899956, -79.009396),
                new LatLng(-2.899720, -79.009247),
                new LatLng(-2.899842, -79.009085),
                new LatLng(-2.899732, -79.008989),
                new LatLng(-2.899411, -79.008779),
                new LatLng(-2.899403, -79.008767),
                new LatLng(-2.899399, -79.008759),//hasta el puente donde estan las escaleras
                new LatLng(-2.899516, -79.008560),
                new LatLng(-2.899516, -79.008539),
                new LatLng(-2.899509, -79.008521),
                new LatLng(-2.899492, -79.008507),
                new LatLng(-2.899467, -79.008496),
                new LatLng(-2.899455, -79.008454),
                new LatLng(-2.899293, -79.008328),
                new LatLng(-2.900304, -79.006706),




                hal_museum
                )
                        .width(10)
                        .color(Color.BLUE)

        );
    }

    public void museo_Artes_Fuego(){
        LatLng artes_fuego = new LatLng(-2.913609, -78.994602);
        mMap.addMarker(new MarkerOptions().position(artes_fuego).title("Museo de las Artes de Fuego"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(artes_fuego, 18));


        LatLng u_cuenca = new LatLng(-2.900821, -79.010251);//
        mMap.addMarker(new MarkerOptions().position(u_cuenca).title("Univercidad de Cuneca"));

        //Con esto creammos la ruta
        mMap.addPolyline(new PolylineOptions().add(
                u_cuenca,
                new LatLng(-2.901208, -79.008340),
                new LatLng(-2.900783, -79.007981),
                new LatLng(-2.901384, -79.007423),
                new LatLng(-2.901627, -79.007014),
                new LatLng(-2.901961, -79.006141),
                new LatLng(-2.902016, -79.006079),
                new LatLng(-2.902066, -79.006016),
                new LatLng(-2.902358, -79.004961),
                new LatLng(-2.902474, -79.004741),
                new LatLng(-2.903342, -79.003424),//interseccion del parque de la madre
                new LatLng(-2.904279, -79.002277),
                new LatLng(-2.904630, -79.001663),
                new LatLng(-2.904703, -79.001410),
                new LatLng(-2.904847, -79.001266),
                new LatLng(-2.904982, -79.001158),
                new LatLng(-2.905081, -79.000959),
                new LatLng(-2.905906, -79.000596),
                new LatLng(-2.906050, -79.000488),
                new LatLng(-2.906040, -79.000415),
                new LatLng(-2.906061, -79.000380),
                new LatLng(-2.906098, -79.000342),
                new LatLng(-2.906134, -79.000321),
                new LatLng(-2.906169, -79.000318),
                new LatLng(-2.906547, -78.999681),
                new LatLng(-2.906707, -78.999486),
                new LatLng(-2.906887, -78.999296),
                new LatLng(-2.907047, -78.999182),
                new LatLng(-2.907209, -78.999041),
                new LatLng(-2.908526, -78.998129),
                new LatLng(-2.910308, -78.996257),
                new LatLng(-2.910477, -78.995981),
                new LatLng(-2.910521, -78.995898),
                new LatLng(-2.910576, -78.995687),
                new LatLng(-2.910574, -78.995607),//hasta aqui ruinas de pumapumgo y pumapungo
                new LatLng(-2.910545, -78.995453),
                new LatLng(-2.910544, -78.995444),//este
                new LatLng(-2.910576, -78.995344),
                new LatLng(-2.910778, -78.995305),
                new LatLng(-2.911785, -78.995069),
                new LatLng(-2.912474, -78.994833),
                new LatLng(-2.912683, -78.994780),
                new LatLng(-2.912998, -78.994753),
                new LatLng(-2.913308, -78.994716),
                new LatLng(-2.913506, -78.994694),
                new LatLng(-2.913650, -78.994684),





                artes_fuego
                )
                        .width(10)
                        .color(Color.BLUE)

        );
    }

    public void museo_Remigo_Crespo(){
        LatLng museo_remigio = new LatLng(-2.901948, -79.003948);
        mMap.addMarker(new MarkerOptions().position(museo_remigio).title("Museo Remigio Crespo Toral"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(museo_remigio, 18));

        LatLng u_cuenca = new LatLng(-2.900821, -79.010251);//
        mMap.addMarker(new MarkerOptions().position(u_cuenca).title("Univercidad de Cuneca"));

        //Con esto creammos la ruta
        mMap.addPolyline(new PolylineOptions().add(
                u_cuenca,

                new LatLng(-2.901214, -79.008312),
                new LatLng(-2.900837, -79.008057),
                new LatLng(-2.900766, -79.007990),
                new LatLng(-2.901346, -79.007422),
                new LatLng(-2.901533, -79.007169),
                new LatLng(-2.901657, -79.007004),
                new LatLng(-2.901947, -79.006217),
                new LatLng(-2.901990, -79.006103),
                new LatLng(-2.901640, -79.006027),
                new LatLng(-2.901591, -79.006027),
                new LatLng(-2.901574, -79.006047),
                new LatLng(-2.901509, -79.006154),
                new LatLng(-2.901486, -79.006183),
                new LatLng(-2.901457, -79.006186),
                new LatLng(-2.901347, -79.006176),
                new LatLng(-2.901374, -79.006074),
                new LatLng(-2.901464, -79.005831),
                new LatLng(-2.901448, -79.005734),
                new LatLng(-2.901427, -79.005707),
                new LatLng(-2.900946, -79.005570),
                new LatLng(-2.899825, -79.005331),
                new LatLng(-2.900258, -79.003519),
                new LatLng(-2.901249, -79.003714),
                new LatLng(-2.901872, -79.003887),







                museo_remigio
                )
                        .width(10)
                        .color(Color.BLUE)

        );

    }

    public void victor_Cuesta(){
        LatLng victor_cuesta = new LatLng(-2.899878, -78.999955);
        mMap.addMarker(new MarkerOptions().position(victor_cuesta).title("Victor J. Cuesta"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(victor_cuesta, 18));


        LatLng u_cuenca = new LatLng(-2.900821, -79.010251);//
        mMap.addMarker(new MarkerOptions().position(u_cuenca).title("Univercidad de Cuneca"));

        //Con esto creammos la ruta
        mMap.addPolyline(new PolylineOptions().add(
                u_cuenca,

                new LatLng(-2.901214, -79.008312),
                new LatLng(-2.900837, -79.008057),
                new LatLng(-2.900766, -79.007990),
                new LatLng(-2.901346, -79.007422),
                new LatLng(-2.901533, -79.007169),
                new LatLng(-2.901657, -79.007004),
                new LatLng(-2.901947, -79.006217),
                new LatLng(-2.901990, -79.006103),
                new LatLng(-2.901640, -79.006027),
                new LatLng(-2.901591, -79.006027),
                new LatLng(-2.901574, -79.006047),
                new LatLng(-2.901509, -79.006154),
                new LatLng(-2.901486, -79.006183),
                new LatLng(-2.901457, -79.006186),
                new LatLng(-2.901347, -79.006176),
                new LatLng(-2.901374, -79.006074),
                new LatLng(-2.901464, -79.005831),
                new LatLng(-2.901448, -79.005734),
                new LatLng(-2.901427, -79.005707),
                new LatLng(-2.900946, -79.005570),
                new LatLng(-2.899825, -79.005331),
                new LatLng(-2.900503, -79.002536),
                new LatLng(-2.900144, -79.002464),
                new LatLng(-2.899501, -79.002313),//desde aui es el punto de conceptas
                new LatLng(-2.899722, -79.001318),
                new LatLng(-2.900010, -79.000302),
                new LatLng(-2.899821, -79.000260),






                victor_cuesta
                )
                        .width(10)
                        .color(Color.BLUE)

        );
    }

    public void ruinas_Pumapungo(){
        LatLng ruinas_pumapungo = new LatLng(-2.907300, -78.997036);
        mMap.addMarker(new MarkerOptions().position(ruinas_pumapungo).title("Ruinas de Pumapungo"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ruinas_pumapungo, 18));

        LatLng u_cuenca = new LatLng(-2.900821, -79.010251);//
        mMap.addMarker(new MarkerOptions().position(u_cuenca).title("Univercidad de Cuneca"));

        //Con esto creammos la ruta
        mMap.addPolyline(new PolylineOptions().add(
                u_cuenca,
                new LatLng(-2.901208, -79.008340),
                new LatLng(-2.900783, -79.007981),
                new LatLng(-2.901384, -79.007423),
                new LatLng(-2.901627, -79.007014),
                new LatLng(-2.901961, -79.006141),
                new LatLng(-2.902016, -79.006079),
                new LatLng(-2.902066, -79.006016),
                new LatLng(-2.902358, -79.004961),
                new LatLng(-2.902474, -79.004741),
                new LatLng(-2.903342, -79.003424),//interseccion del parque de la madre
                new LatLng(-2.904279, -79.002277),
                new LatLng(-2.904630, -79.001663),
                new LatLng(-2.904703, -79.001410),
                new LatLng(-2.904847, -79.001266),
                new LatLng(-2.904982, -79.001158),
                new LatLng(-2.905081, -79.000959),
                new LatLng(-2.905906, -79.000596),
                new LatLng(-2.906050, -79.000488),
                new LatLng(-2.906040, -79.000415),
                new LatLng(-2.906061, -79.000380),
                new LatLng(-2.906098, -79.000342),
                new LatLng(-2.906134, -79.000321),
                new LatLng(-2.906169, -79.000318),
                new LatLng(-2.906547, -78.999681),
                new LatLng(-2.906707, -78.999486),
                new LatLng(-2.906887, -78.999296),
                new LatLng(-2.907047, -78.999182),
                new LatLng(-2.907209, -78.999041),
                new LatLng(-2.908526, -78.998129),
                new LatLng(-2.910308, -78.996257),
                new LatLng(-2.910477, -78.995981),
                new LatLng(-2.910521, -78.995898),
                new LatLng(-2.910576, -78.995687),
                new LatLng(-2.910574, -78.995607),//hasta aqui ruinas de pumapumgo y pumapungo
                new LatLng(-2.910545, -78.995453),
                new LatLng(-2.910454, -78.995547),
                new LatLng(-2.910367, -78.995645),
                new LatLng(-2.907150, -78.996219),




                ruinas_pumapungo
                )
                        .width(10)
                        .color(Color.BLUE)

        );

    }

    public void homero_Ortega_Hats(){
        LatLng ortega_hats = new LatLng(-2.890886, -78.992867);
        mMap.addMarker(new MarkerOptions().position(ortega_hats).title("Homero Ortega Hats"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ortega_hats, 18));


        LatLng u_cuenca = new LatLng(-2.900821, -79.010251);//
        mMap.addMarker(new MarkerOptions().position(u_cuenca).title("Univercidad de Cuneca"));

        //Con esto creammos la ruta
        mMap.addPolyline(new PolylineOptions().add(
                u_cuenca,
                new LatLng(-2.901208, -79.008340),
                new LatLng(-2.900783, -79.007981),
                new LatLng(-2.901384, -79.007423),
                new LatLng(-2.901627, -79.007014),
                new LatLng(-2.901961, -79.006141),
                new LatLng(-2.902016, -79.006079),
                new LatLng(-2.902066, -79.006016),
                new LatLng(-2.902358, -79.004961),
                new LatLng(-2.902474, -79.004741),
                new LatLng(-2.903342, -79.003424),//interseccion del parque de la madre
                new LatLng(-2.904279, -79.002277),
                new LatLng(-2.904630, -79.001663),
                new LatLng(-2.904703, -79.001410),
                new LatLng(-2.904847, -79.001266),
                new LatLng(-2.904982, -79.001158),
                new LatLng(-2.905081, -79.000959),
                new LatLng(-2.905906, -79.000596),
                new LatLng(-2.906050, -79.000488),
                new LatLng(-2.906040, -79.000415),
                new LatLng(-2.906061, -79.000380),
                new LatLng(-2.906098, -79.000342),
                new LatLng(-2.906134, -79.000321),
                new LatLng(-2.906169, -79.000318),
                new LatLng(-2.906547, -78.999681),
                new LatLng(-2.906707, -78.999486),
                new LatLng(-2.906887, -78.999296),
                new LatLng(-2.907047, -78.999182),
                new LatLng(-2.907209, -78.999041),
                new LatLng(-2.908526, -78.998129),
                new LatLng(-2.910308, -78.996257),
                new LatLng(-2.910477, -78.995981),
                new LatLng(-2.910521, -78.995898),
                new LatLng(-2.910576, -78.995687),
                new LatLng(-2.910574, -78.995607),//hasta aqui ruinas de pumapumgo y pumapungo
                new LatLng(-2.910545, -78.995453),
                new LatLng(-2.910454, -78.995547),
                new LatLng(-2.910367, -78.995645),
                new LatLng(-2.907150, -78.996219),
                new LatLng(-2.905917, -78.996429),
                new LatLng(-2.905831, -78.996429),
                new LatLng(-2.904824, -78.996515),
                new LatLng(-2.903490, -78.996681),
                new LatLng(-2.903004, -78.996712),
                new LatLng(-2.901799, -78.996843),
                new LatLng(-2.901493, -78.996803),
                new LatLng(-2.901296, -78.996810),
                new LatLng(-2.898675, -78.996640),
                new LatLng(-2.895645, -78.996535),
                new LatLng(-2.895528, -78.996591),
                new LatLng(-2.895407, -78.996627),
                new LatLng(-2.895286, -78.996595),
                new LatLng(-2.895222, -78.996506),
                new LatLng(-2.894511, -78.996413),
                new LatLng(-2.892261, -78.996360),
                new LatLng(-2.892148, -78.996301),
                new LatLng(-2.892072, -78.996162),
                new LatLng(-2.891888, -78.995377),
                new LatLng(-2.891813, -78.995345),
                new LatLng(-2.891779, -78.995290),
                new LatLng(-2.891796, -78.995216),
                new LatLng(-2.891843, -78.995172),
                new LatLng(-2.891442, -78.993960),
                new LatLng(-2.891172, -78.992815),

                ortega_hats
                )
                        .width(10)
                        .color(Color.BLUE)

        );
    }

    public void museo_Folklore_Azuayo(){
        LatLng museo_folklore_azuayo = new LatLng(-2.899037, -79.004074);
        mMap.addMarker(new MarkerOptions().position(museo_folklore_azuayo).title("Museo del Folklore Azuayo"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(museo_folklore_azuayo, 18));


        LatLng u_cuenca = new LatLng(-2.900821, -79.010251);//
        mMap.addMarker(new MarkerOptions().position(u_cuenca).title("Univercidad de Cuneca"));

        //Con esto creammos la ruta
        mMap.addPolyline(new PolylineOptions().add(
                u_cuenca,
                new LatLng(-2.900787, -79.010312),
                new LatLng(-2.900724, -79.010292),
                new LatLng(-2.900661, -79.010269),
                new LatLng(-2.900591, -79.010269),
                new LatLng(-2.900454, -79.010247),
                new LatLng(-2.900427, -79.010247),
                new LatLng(-2.900109, -79.010085),
                new LatLng(-2.900090, -79.010070),
                new LatLng(-2.900082, -79.010049),
                new LatLng(-2.900071, -79.010029),
                new LatLng(-2.900067, -79.010003),
                new LatLng(-2.900072, -79.009712),
                new LatLng(-2.900179, -79.009535),
                new LatLng(-2.900106, -79.009483),
                new LatLng(-2.900102, -79.009476),
                new LatLng(-2.900111, -79.009405),
                new LatLng(-2.900024, -79.009413),
                new LatLng(-2.899954, -79.009394),
                new LatLng(-2.899955, -79.009397),
                new LatLng(-2.899798, -79.009303),
                new LatLng(-2.899719, -79.009249),
                new LatLng(-2.899842, -79.009085),
                new LatLng(-2.899734, -79.008993),
                new LatLng(-2.899410, -79.008778),
                new LatLng(-2.899400, -79.008757),
                new LatLng(-2.899511, -79.008573),
                new LatLng(-2.899512, -79.008543),
                new LatLng(-2.899505, -79.008514),
                new LatLng(-2.899474, -79.008499),
                new LatLng(-2.899288, -79.008328),
                new LatLng(-2.897977, -79.008090),
                new LatLng(-2.898439, -79.006436),
                new LatLng(-2.898242, -79.006102),
                new LatLng(-2.897563, -79.005925),
                new LatLng(-2.897644, -79.005429),
                new LatLng(-2.897795, -79.004949),
                new LatLng(-2.897993, -79.004165),
                new LatLng(-2.898066, -79.004123),
                new LatLng(-2.898149, -79.004129),
                new LatLng(-2.898490, -79.004206),
                new LatLng(-2.898990, -79.004299),
                new LatLng(-2.899076, -79.004050),



                museo_folklore_azuayo
                )
                        .width(10)
                        .color(Color.BLUE)

        );
    }

    public void instituto_Azuayo_Folklore(){
        LatLng instituto_folklore = new LatLng(-2.899779, -79.003704);
        mMap.addMarker(new MarkerOptions().position(instituto_folklore).title("Instituto Azuayo del Folklore"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(instituto_folklore, 18));


        LatLng u_cuenca = new LatLng(-2.900821, -79.010251);//
        mMap.addMarker(new MarkerOptions().position(u_cuenca).title("Univercidad de Cuneca"));

        //Con esto creammos la ruta
        mMap.addPolyline(new PolylineOptions().add(
                u_cuenca,

                new LatLng(-2.901214, -79.008312),
                new LatLng(-2.900837, -79.008057),
                new LatLng(-2.900766, -79.007990),
                new LatLng(-2.901346, -79.007422),
                new LatLng(-2.901533, -79.007169),
                new LatLng(-2.901657, -79.007004),
                new LatLng(-2.901947, -79.006217),
                new LatLng(-2.901990, -79.006103),
                new LatLng(-2.901640, -79.006027),
                new LatLng(-2.901591, -79.006027),
                new LatLng(-2.901574, -79.006047),
                new LatLng(-2.901509, -79.006154),
                new LatLng(-2.901486, -79.006183),
                new LatLng(-2.901457, -79.006186),
                new LatLng(-2.901347, -79.006176),
                new LatLng(-2.901374, -79.006074),
                new LatLng(-2.901464, -79.005831),
                new LatLng(-2.901448, -79.005734),
                new LatLng(-2.901427, -79.005707),
                new LatLng(-2.900946, -79.005570),
                new LatLng(-2.899825, -79.005331),
                new LatLng(-2.900247, -79.003527),
                new LatLng(-2.899800, -79.003436),







                instituto_folklore
                )
                        .width(10)
                        .color(Color.BLUE)

        );
    }

    public void casa_Museo_Maria(){
        LatLng museo_astudillo = new LatLng(-2.897678, -79.002097);
        mMap.addMarker(new MarkerOptions().position(museo_astudillo).title("Casa Museo Maria Astudillo"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(museo_astudillo, 18));


        LatLng u_cuenca = new LatLng(-2.900821, -79.010251);//
        mMap.addMarker(new MarkerOptions().position(u_cuenca).title("Univercidad de Cuneca"));

        //Con esto creammos la ruta
        mMap.addPolyline(new PolylineOptions().add(
                u_cuenca,
                new LatLng(-2.900787, -79.010312),
                new LatLng(-2.900724, -79.010292),
                new LatLng(-2.900661, -79.010269),
                new LatLng(-2.900591, -79.010269),
                new LatLng(-2.900454, -79.010247),
                new LatLng(-2.900427, -79.010247),
                new LatLng(-2.900109, -79.010085),
                new LatLng(-2.900090, -79.010070),
                new LatLng(-2.900082, -79.010049),
                new LatLng(-2.900071, -79.010029),
                new LatLng(-2.900067, -79.010003),
                new LatLng(-2.900072, -79.009712),
                new LatLng(-2.900179, -79.009535),
                new LatLng(-2.900106, -79.009483),
                new LatLng(-2.900102, -79.009476),
                new LatLng(-2.900111, -79.009405),
                new LatLng(-2.900024, -79.009413),
                new LatLng(-2.899954, -79.009394),
                new LatLng(-2.899955, -79.009397),
                new LatLng(-2.899798, -79.009303),
                new LatLng(-2.899719, -79.009249),
                new LatLng(-2.899842, -79.009085),
                new LatLng(-2.899734, -79.008993),
                new LatLng(-2.899410, -79.008778),
                new LatLng(-2.899400, -79.008757),
                new LatLng(-2.899511, -79.008573),
                new LatLng(-2.899512, -79.008543),
                new LatLng(-2.899505, -79.008514),
                new LatLng(-2.899474, -79.008499),
                new LatLng(-2.899288, -79.008328),
                new LatLng(-2.897977, -79.008090),
                new LatLng(-2.898439, -79.006436),
                new LatLng(-2.898242, -79.006102),
                new LatLng(-2.897563, -79.005925),
                new LatLng(-2.897644, -79.005429),
                new LatLng(-2.897788, -79.004883),
                new LatLng(-2.898283, -79.003093),
                new LatLng(-2.898522, -79.002145),
                new LatLng(-2.897707, -79.001947),



                museo_astudillo
                )
                        .width(10)
                        .color(Color.BLUE)

        );
    }

    public void santuario_Mariano(){
        LatLng santuario_mariano = new LatLng(-2.897811, -79.005840);
        mMap.addMarker(new MarkerOptions().position(santuario_mariano).title("Santuario Mariano"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(santuario_mariano, 18));

        LatLng u_cuenca = new LatLng(-2.900821, -79.010251);//
        mMap.addMarker(new MarkerOptions().position(u_cuenca).title("Univercidad de Cuneca"));

        //Con esto creammos la ruta
        mMap.addPolyline(new PolylineOptions().add(
                u_cuenca,
                new LatLng(-2.900791, -79.010313),
                new LatLng(-2.900649, -79.010265),
                new LatLng(-2.900438, -79.010246),
                new LatLng(-2.900099, -79.010081),
                new LatLng(-2.900075, -79.010036),
                new LatLng(-2.900062, -79.009985),
                new LatLng(-2.900069, -79.009717),
                new LatLng(-2.900174, -79.009539),
                new LatLng(-2.900099, -79.009479),
                new LatLng(-2.900109, -79.009415),
                new LatLng(-2.900023, -79.009409),
                new LatLng(-2.899957, -79.009398),
                new LatLng(-2.899717, -79.009249),
                new LatLng(-2.899843, -79.009084),
                new LatLng(-2.899412, -79.008777),
                new LatLng(-2.899398, -79.008760),
                new LatLng(-2.899518, -79.008560),
                new LatLng(-2.899518, -79.008538),
                new LatLng(-2.899508, -79.00852),
                new LatLng(-2.899468, -79.008499),
                new LatLng(-2.899457, -79.008455),
                new LatLng(-2.899447, -79.008438),
                new LatLng(-2.899290, -79.008328),
                new LatLng(-2.898010, -79.008097),
                new LatLng(-2.898424, -79.006442),
                new LatLng(-2.898253, -79.006063),
                new LatLng(-2.897513, -79.005915),
                new LatLng(-2.897578, -79.005788),




                santuario_mariano
                )
                        .width(10)
                        .color(Color.BLUE)

        );
    }

    public void museo_Esqueletogia(){
        LatLng museo_esqueletogia = new LatLng(-2.897462, -79.002688);
        mMap.addMarker(new MarkerOptions().position(museo_esqueletogia).title("El Museo de Esqueletogia"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(museo_esqueletogia, 18));

        LatLng u_cuenca = new LatLng(-2.900821, -79.010251);//
        mMap.addMarker(new MarkerOptions().position(u_cuenca).title("Univercidad de Cuneca"));

        //Con esto creammos la ruta
        mMap.addPolyline(new PolylineOptions().add(
                u_cuenca,
                new LatLng(-2.900787, -79.010312),
                new LatLng(-2.900724, -79.010292),
                new LatLng(-2.900661, -79.010269),
                new LatLng(-2.900591, -79.010269),
                new LatLng(-2.900454, -79.010247),
                new LatLng(-2.900427, -79.010247),
                new LatLng(-2.900109, -79.010085),
                new LatLng(-2.900090, -79.010070),
                new LatLng(-2.900082, -79.010049),
                new LatLng(-2.900071, -79.010029),
                new LatLng(-2.900067, -79.010003),
                new LatLng(-2.900072, -79.009712),
                new LatLng(-2.900179, -79.009535),
                new LatLng(-2.900106, -79.009483),
                new LatLng(-2.900102, -79.009476),
                new LatLng(-2.900111, -79.009405),
                new LatLng(-2.900024, -79.009413),
                new LatLng(-2.899954, -79.009394),
                new LatLng(-2.899955, -79.009397),
                new LatLng(-2.899798, -79.009303),
                new LatLng(-2.899719, -79.009249),
                new LatLng(-2.899842, -79.009085),
                new LatLng(-2.899734, -79.008993),
                new LatLng(-2.899410, -79.008778),
                new LatLng(-2.899400, -79.008757),
                new LatLng(-2.899511, -79.008573),
                new LatLng(-2.899512, -79.008543),
                new LatLng(-2.899505, -79.008514),
                new LatLng(-2.899474, -79.008499),
                new LatLng(-2.899288, -79.008328),
                new LatLng(-2.897977, -79.008090),
                new LatLng(-2.898439, -79.006436),
                new LatLng(-2.898242, -79.006102),
                new LatLng(-2.897563, -79.005925),
                new LatLng(-2.897644, -79.005429),
                new LatLng(-2.897788, -79.004883),
                new LatLng(-2.898283, -79.003093),
                new LatLng(-2.898270, -79.003095),
                new LatLng(-2.897294, -79.002929),
                new LatLng(-2.897335, -79.002760),



                museo_esqueletogia
                )
                        .width(10)
                        .color(Color.BLUE)

        );
    }

    public void parque_Templete(){
        LatLng parque_templete = new LatLng(-2.884497, -78.993584);
        mMap.addMarker(new MarkerOptions().position(parque_templete).title("Parque el Templete"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(parque_templete, 18));


        LatLng u_cuenca = new LatLng(-2.900821, -79.010251);//
        mMap.addMarker(new MarkerOptions().position(u_cuenca).title("Univercidad de Cuneca"));

        //Con esto creammos la ruta
        mMap.addPolyline(new PolylineOptions().add(
                u_cuenca,
                new LatLng(-2.900787, -79.010312),
                new LatLng(-2.900724, -79.010292),
                new LatLng(-2.900661, -79.010269),
                new LatLng(-2.900591, -79.010269),
                new LatLng(-2.900454, -79.010247),
                new LatLng(-2.900427, -79.010247),
                new LatLng(-2.900109, -79.010085),
                new LatLng(-2.900090, -79.010070),
                new LatLng(-2.900082, -79.010049),
                new LatLng(-2.900071, -79.010029),
                new LatLng(-2.900067, -79.010003),
                new LatLng(-2.900072, -79.009712),
                new LatLng(-2.900179, -79.009535),
                new LatLng(-2.900106, -79.009483),
                new LatLng(-2.900102, -79.009476),
                new LatLng(-2.900111, -79.009405),
                new LatLng(-2.900024, -79.009413),
                new LatLng(-2.899954, -79.009394),
                new LatLng(-2.899955, -79.009397),
                new LatLng(-2.899798, -79.009303),
                new LatLng(-2.899719, -79.009249),
                new LatLng(-2.899842, -79.009085),
                new LatLng(-2.899734, -79.008993),
                new LatLng(-2.899410, -79.008778),
                new LatLng(-2.899400, -79.008757),
                new LatLng(-2.899511, -79.008573),
                new LatLng(-2.899512, -79.008543),
                new LatLng(-2.899505, -79.008514),
                new LatLng(-2.899474, -79.008499),
                new LatLng(-2.899288, -79.008328),
                new LatLng(-2.897977, -79.008090),
                new LatLng(-2.898439, -79.006436),
                new LatLng(-2.898242, -79.006102),
                new LatLng(-2.897563, -79.005925),
                new LatLng(-2.897644, -79.005429),
                new LatLng(-2.897786, -79.004931),
                new LatLng(-2.898297, -79.003096),
                new LatLng(-2.897296, -79.002924),
                new LatLng(-2.891046, -79.001799),
                new LatLng(-2.890018, -79.001606),
                new LatLng(-2.889454, -79.001619),
                new LatLng(-2.888816, -79.001579),
                new LatLng(-2.888835, -78.999749),
                new LatLng(-2.888884, -78.999475),
                new LatLng(-2.886712, -78.999159),
                new LatLng(-2.886062, -78.998980),
                new LatLng(-2.885522, -78.998867),
                new LatLng(-2.885609, -78.998426),
                new LatLng(-2.885753, -78.997827),
                new LatLng(-2.885871, -78.997266),
                new LatLng(-2.885984, -78.996746),
                new LatLng(-2.885996, -78.996196),
                new LatLng(-2.885994, -78.994947),
                new LatLng(-2.885916, -78.994448),
                new LatLng(-2.885478, -78.993209),



                parque_templete
                )
                        .width(10)
                        .color(Color.BLUE)

        );
    }

    public void parque_Recreo(){
        LatLng parque_recreo = new LatLng(-2.908861, -79.031305);
        mMap.addMarker(new MarkerOptions().position(parque_recreo).title("Parque el Recreo"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(parque_recreo, 18));

        LatLng u_cuenca = new LatLng(-2.900821, -79.010251);//
        mMap.addMarker(new MarkerOptions().position(u_cuenca).title("Univercidad de Cuneca"));

        //Con esto creammos la ruta
        mMap.addPolyline(new PolylineOptions().add(
                u_cuenca,
                new LatLng(-2.901035, -79.011622),
                new LatLng(-2.904053, -79.013027),
                new LatLng(-2.904197, -79.013144),
                new LatLng(-2.903648, -79.013713),
                new LatLng(-2.904224, -79.014380),
                new LatLng(-2.905837, -79.016167),
                new LatLng(-2.907774, -79.016679),
                new LatLng(-2.908468, -79.016864),
                new LatLng(-2.908863, -79.017049),
                new LatLng(-2.908991, -79.017330),
                new LatLng(-2.908832, -79.018069),
                new LatLng(-2.908872, -79.018381),
                new LatLng(-2.908886, -79.018593),
                new LatLng(-2.908967, -79.018710),
                new LatLng(-2.909553, -79.019030),
                new LatLng(-2.908042, -79.021562),
                new LatLng(-2.907845, -79.022131),
                new LatLng(-2.907212, -79.024841),
                new LatLng(-2.907084, -79.025262),
                new LatLng(-2.907079, -79.025632),
                new LatLng(-2.907208, -79.026163),
                new LatLng(-2.907283, -79.026432),
                new LatLng(-2.907695, -79.027744),
                new LatLng(-2.907880, -79.028707),
                new LatLng(-2.908179, -79.030457),
                new LatLng(-2.908676, -79.030595),
                new LatLng(-2.908772, -79.030662),
                new LatLng(-2.908909, -79.030777),
                new LatLng(-2.909129, -79.031010),





                parque_recreo
                )
                        .width(10)
                        .color(Color.BLUE)

        );
    }












    public void lugares_turisticos(){

        LatLng parque_madre = new LatLng(-2.904497, -79.003079);//para colocar el marcador
        mMap.addMarker(new MarkerOptions().position(parque_madre).title("Parque de la Madre"));//para colocar el titulo al marcado
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(parque_madre, 18));

        LatLng cajas = new LatLng(-2.848856, -79.253793);//para colocar el marcador
        mMap.addMarker(new MarkerOptions().position(cajas).title("Parque Nacional Cajas"));//para colocar el titulo al marcado
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(cajas, 18));

        LatLng catedral_vieja = new LatLng(-2.897809, -79.003820);//para colocar el marcador
        mMap.addMarker(new MarkerOptions().position(catedral_vieja).title("Catedral Vieja"));//para colocar el titulo al marcado
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(catedral_vieja, 18));

        LatLng catedral_imaculada = new LatLng(-2.897377, -79.005366);//para colocar el marcador
        mMap.addMarker(new MarkerOptions().position(catedral_imaculada).title("Catedral de la Imaculada Concepcion"));//para colocar el titulo al marcado
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(catedral_imaculada, 18));

        LatLng museo_pumapungo = new LatLng(-2.906078, -78.996864);//para colocar el marcador
        mMap.addMarker(new MarkerOptions().position(museo_pumapungo).title("Museo Pumapungo"));//para colocar el titulo al marcado
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(museo_pumapungo, 18));

        LatLng museo_culturas_aborigenes = new LatLng(-2.902650, -79.002311);//para colocar el marcador
        mMap.addMarker(new MarkerOptions().position(museo_culturas_aborigenes).title("Museo de las Culturs Aborigenes"));//para colocar el titulo al marcado
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(museo_culturas_aborigenes, 18));

        LatLng museo_culturas= new LatLng(-2.902650, -79.002311);//para colocar el marcador
        mMap.addMarker(new MarkerOptions().position(museo_culturas).title("Museo de las Culturs Aborigenes"));//para colocar el titulo al marcado
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(museo_culturas, 18));

        LatLng parque_calderon = new LatLng(-2.897180, -79.004224);
        mMap.addMarker(new MarkerOptions().position(parque_calderon).title("Parque Calderon"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(parque_calderon, 18));

        LatLng museo_augustin_landivar = new LatLng(-2.904934, -78.999180);
        mMap.addMarker(new MarkerOptions().position(museo_augustin_landivar).title("Museo Manuel Augustin Landivar"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(museo_augustin_landivar, 18));

        LatLng conceptas = new LatLng(-2.899505, -79.003174);
        mMap.addMarker(new MarkerOptions().position(conceptas).title("Las Conceptas"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(conceptas, 18));

        LatLng zoologico_amaru = new LatLng(-2.894099, -78.956900);
        mMap.addMarker(new MarkerOptions().position(zoologico_amaru).title("Amaru Zoologico Bioparque"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(zoologico_amaru, 18));

        LatLng zologico_amaru = new LatLng(-2.894099, -78.956900);
        mMap.addMarker(new MarkerOptions().position(zologico_amaru).title("Amaru Zoologico Bioparque"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(zologico_amaru, 18));

        LatLng plaza_flores = new LatLng(-2.897645, -79.005807);
        mMap.addMarker(new MarkerOptions().position(plaza_flores).title("Plaza de las Flores"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(plaza_flores, 18));

        LatLng museo_sombrero = new LatLng(-2.900421, -79.006766);
        mMap.addMarker(new MarkerOptions().position(museo_sombrero).title("Museo del Sombrero"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(museo_sombrero, 18));

        LatLng victor_cuesta = new LatLng(-2.899878, -78.999955);
        mMap.addMarker(new MarkerOptions().position(victor_cuesta).title("Victor J. Cuesta"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(victor_cuesta, 18));

        LatLng iglesia_samblas = new LatLng(-2.898604, -78.997845);
        mMap.addMarker(new MarkerOptions().position(iglesia_samblas).title("Iglesia de Samblas"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(iglesia_samblas, 18));

        LatLng puente_roto = new LatLng(-2.904075, -79.001202);
        mMap.addMarker(new MarkerOptions().position(puente_roto).title("Puente Roto"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(puente_roto, 18));

        LatLng casa_provincia = new LatLng(-2.898410, -78.999009);
        mMap.addMarker(new MarkerOptions().position(casa_provincia).title("Casa de la Provincia"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(casa_provincia, 18));

        LatLng fundacion_bienal = new LatLng(-2.895677, -79.009454);
        mMap.addMarker(new MarkerOptions().position(fundacion_bienal).title("Fundacion Bienal de Cuenca"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(fundacion_bienal, 18));

        LatLng museo_remigio = new LatLng(-2.901948, -79.003948);
        mMap.addMarker(new MarkerOptions().position(museo_remigio).title("Museo Remigio Crespo Toral"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(museo_remigio, 18));

        LatLng ruinas_pumapungo = new LatLng(-2.907300, -78.997036);
        mMap.addMarker(new MarkerOptions().position(ruinas_pumapungo).title("Ruinas de Pumapungo"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ruinas_pumapungo, 18));

        LatLng pumapungo = new LatLng(-2.906035, -78.996735);
        mMap.addMarker(new MarkerOptions().position(pumapungo).title("Pumapungo"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(pumapungo, 18));

        LatLng cuanca_city = new LatLng(-2.897911, -79.004032);
        mMap.addMarker(new MarkerOptions().position(cuanca_city).title("Cuenca City Tour 360"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(cuanca_city, 18));

        LatLng ruinas_santos = new LatLng(-2.905114, -78.999761);
        mMap.addMarker(new MarkerOptions().position(ruinas_santos).title("Runas de Todos los Santos"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ruinas_santos, 18));

        LatLng parque_paraiso = new LatLng(-2.909861, -78.987551);
        mMap.addMarker(new MarkerOptions().position(parque_paraiso).title("Parque el Paraiso"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(parque_paraiso, 18));

        LatLng museo_ciudad = new LatLng(-2.895879, -79.004407);
        mMap.addMarker(new MarkerOptions().position(museo_ciudad).title("Museo de la Ciudad"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(museo_ciudad, 18));

        LatLng hal_museum = new LatLng(-2.900399, -79.006815);
        mMap.addMarker(new MarkerOptions().position(hal_museum).title("Panama Hal Museum"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(hal_museum, 18));


        LatLng museo_conceptas = new LatLng(-2.896524, -79.001631);
        mMap.addMarker(new MarkerOptions().position(museo_conceptas).title("Museo del Monasterio de las Conceptas"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(museo_conceptas, 18));

        LatLng museo_arte_moderno = new LatLng(-2.896705, -79.010195);
        mMap.addMarker(new MarkerOptions().position(museo_arte_moderno).title("Museo Municipal de Arte Moderno"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(museo_arte_moderno, 18));

        LatLng museo_folklore_azuayo = new LatLng(-2.899037, -79.004074);
        mMap.addMarker(new MarkerOptions().position(museo_folklore_azuayo).title("Museo del Folklore Azuayo"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(museo_folklore_azuayo, 18));

        LatLng instituto_folklore = new LatLng(-2.899779, -79.003704);
        mMap.addMarker(new MarkerOptions().position(instituto_folklore).title("Instituto Azuayo del Folklore"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(instituto_folklore, 18));

        LatLng madres_conceptas = new LatLng(-2.900136, -79.002514);
        mMap.addMarker(new MarkerOptions().position(madres_conceptas).title("De las Madres Conceptas"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(madres_conceptas, 18));

        LatLng museo_astudillo = new LatLng(-2.897678, -79.002097);
        mMap.addMarker(new MarkerOptions().position(museo_astudillo).title("Casa Museo Maria Astudillo"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(museo_astudillo, 18));

        LatLng museo_hitoria_medicina = new LatLng(-2.902937, -79.004864);
        mMap.addMarker(new MarkerOptions().position(museo_hitoria_medicina).title("Museo de Historia de la Medicina"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(museo_hitoria_medicina, 18));

        LatLng santuario_mariano = new LatLng(-2.897811, -79.005840);
        mMap.addMarker(new MarkerOptions().position(santuario_mariano).title("Santuario Mariano"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(santuario_mariano, 18));

        LatLng mirador_turi = new LatLng(-2.923266, -79.018331);
        mMap.addMarker(new MarkerOptions().position(mirador_turi).title("Mirador de Turi"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(mirador_turi, 18));

        LatLng arte_moderno = new LatLng(-2.896737, -79.010228);
        mMap.addMarker(new MarkerOptions().position(arte_moderno).title("Museo de Arte Moderno"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(arte_moderno, 18));


        LatLng ortega_hats = new LatLng(-2.890886, -78.992867);
        mMap.addMarker(new MarkerOptions().position(ortega_hats).title("Homero Ortega Hats"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ortega_hats, 18));

        LatLng parque_san_blas = new LatLng(-2.898658, -78.998569);
        mMap.addMarker(new MarkerOptions().position(parque_san_blas).title("Parque San Blas"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(parque_san_blas, 18));

        LatLng museo_esqueletogia = new LatLng(-2.897462, -79.002688);
        mMap.addMarker(new MarkerOptions().position(museo_esqueletogia).title("El Museo de Esqueletogia"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(museo_esqueletogia, 18));

        LatLng casa_cultura = new LatLng(-2.898946, -79.004148);
        mMap.addMarker(new MarkerOptions().position(casa_cultura).title("Casa de la Cultura"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(casa_cultura, 18));


        LatLng parque_recreo = new LatLng(-2.908861, -79.031305);
        mMap.addMarker(new MarkerOptions().position(parque_recreo).title("Parque el Recreo"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(parque_recreo, 18));

        LatLng parque_miraflores = new LatLng(-2.883260, -78.993701);
        mMap.addMarker(new MarkerOptions().position(parque_miraflores).title("Parque Miraflores"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(parque_miraflores, 18));

        LatLng parque_templete = new LatLng(-2.884497, -78.993584);
        mMap.addMarker(new MarkerOptions().position(parque_templete).title("Parque el Templete"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(parque_templete, 18));

        LatLng artes_fuego = new LatLng(-2.913609, -78.994602);
        mMap.addMarker(new MarkerOptions().position(artes_fuego).title("Museo de las Artes de Fuego"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(artes_fuego, 18));

        LatLng colegio_imaculada = new LatLng(-2.892616, -78.970349);
        mMap.addMarker(new MarkerOptions().position(colegio_imaculada).title("Colegio la Imaculada"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(colegio_imaculada, 18));









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
