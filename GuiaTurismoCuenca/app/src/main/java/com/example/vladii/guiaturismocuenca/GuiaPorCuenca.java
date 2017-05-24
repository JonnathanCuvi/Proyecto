package com.example.vladii.guiaturismocuenca;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class GuiaPorCuenca extends ActionBarActivity {

    ListViewAdapter adapter;

    String[] titulo = new String[]{
            "Catedral de la Inmaculada ",//1
            "Plaza de las flores",//***********************************************
            "Museo Pumapungo",//2
            "Museo del Sombrero",//3
            "Amaru Zoológico Bioparque",//4
            "Catedral vieja ",//5
            "Parque El Cajas",//6
            "Amaru Zoológico Bioparque",//7
            "Pumapungo",//8
            "Museo de las Culturas Aborígenes",//9
            "Parque Calderón",//10
            "Puente Roto",//11
            "Las Conceptas",//12
            "Ruinas de Todos Santos",//13
            "Museo Manuel Agustín Landívar",//14
            "Parque Miraflores",//15
            "De las Madres Conceptas",//16
            "Parque de la Madre",//17
            "Fundación Bienal de Cuenca",//18
            "Iglesia de San Blas",//19
            "Museo Municipal de Arte Moderno",//20
            "Museo de Arte Moderno",//21
            "Cuenca City Tour 360",//22
            "Museo Historia de la Medicina",//23
            "Casa de la Cultura",//24
            "Colegio La Inmaculada",//25
            "Museo del Monasterio de la Conceptas",//26
            "Mirador de Turi",//27
            "Panama Hat Museum",//28
            "Museo de las Artes del Fuego",//29
            "Museo Remigio Crespo Toral",//30******************
            "Víctor J. Cuesta",//31
            "Ruinas de Pumapungo",//32
            "Homero Ortega Hats",//33//descde aqui  ya no esta en el word
            "Museo del Folklore Azuayo",//34talves aya que qutar
            "Instituto Azuayo de Folklore",//35
            "Casa Museo María Astudillo",//36 Casa Museo María Astudillo Montesinos
            "Santuario Mariano",//37
            "El Museo de Esqueletología",//38
            "Parque El Templete",//39
            "Parque el Recreo",//40

    };

    String[] subtitulo = new String[]{
            "Es un templo católico ubicado en la ciudad de Cuenca",//1
            "Dirección: Cuenca                                    ",//******************************
            "Museo Pumapungo                                   ",//2
            "Museo del sombreo                             ",//3
            "Estan cerca de la univercidad de cuenca y tambien pasa por u rio",//4
            "Fue el principal lugar de culto español durante la época de la colonización española",//5
            "está situado en los Andes, al sur del Ecuador, en la provincia de Azuay",//6
            "Amaru Zoológico Bioparque                                 ",//7
            "Pumapungo                                             ",//8
            "Museo de las Culturas Aborígenes                           ",//9
            "Parque Calderón                                              ",//10
            "Puente Roto                                                     ",//11
            "Las Conceptas                                                    ",//12
            "Dirección: Calle Larga, Cuenca                                   ",//13
            "Dirección: Calle Larga, Cuenca                                   ",//14
            "Dirección: Cuenca                                                 ",//15
            "Dirección: Hermano Miguel, Cuenca                                 ",//16
            "Dirección: Av 12 de Abril, Cuenca                                 ",//17
            "Dirección: Simón Bolívar, Cuenca                                  ",//18
            "Dirección: Manuel Vega                                            ",//19
            "Dirección: Estévez de Toral, Cuenca                               ",//20
            "Dirección: Coronell Guillermo Talbot, Cuenca                      ",//21
            "Dirección: Cuenca                                                 ",//22
            "Dirección: Cuenca                                                 ",//23
            "Dirección: Mariscal Sucre y Benigno Malo, Benigno Malo            ",//24
            "Dirección: Los Shyris y Pintag                                    ",//25
            "Dirección: Hermano Miguel, Cuenca, Ecuador                        ",//26
            "Dirección: Cuenca                                                 ",//27
            "Dirección: Calle Larga, Cuenca                                    ",//28
            "Dirección: Las Herrerias, Cuenca                                  ",//29
            "Dirección: Calle Larga, Cuenca                                     ",//30
            "Parque en Cuenca, Ecuador                                          ",//31
            "Dirección: Cuenca                                                  ",//32
            "Dirección: Avenue Gil Ramírez Dávalos, Cuenca                      ",//33
            "Dirección: Pdte Córdova, Cuenca                                    ",//34
            "Dirección: Presidente Borrero, Cuenca                              ",//35
            "Dirección: Cuenca, Horario: Cierra pronto · 10–12, 16–18           ",//36
            "Dirección: Cuenca                                                  ",//37
            "Dirección: Simón Bolívar 657, Horario: 10–13, 15:30–19             ",//38
            "Dirección: Cuenca                                                  ",//39
            "Dirección: Cuenca                                                  ",//40





    };

    int[] imagenes = {
            R.drawable.catedral,//1
            R.drawable.plazaflores,//***************************************
            R.drawable.museopumapungo,//2
            R.drawable.museosombrero,//3
            R.drawable.zoobioparque,//4
            R.drawable.catedralvieja,//5
            R.drawable.cajas,//6
            R.drawable.zoobioparque,//7
            R.drawable.pumapungo,//8
            R.drawable.culturasaborigenes,//9
            R.drawable.calderon,//10
            R.drawable.puenteroto,//11
            R.drawable.conceptadas,//12
            R.drawable.ruinassantos,//13
            R.drawable.augustinlandivar,//14
            R.drawable.parquemiraflores,//15
            R.drawable.madresconceptadas,//16
            R.drawable.parquemadre,//17
            R.drawable.fundacionbienal,//18
            R.drawable.samblas,//19
            R.drawable.museomunicipal,//20
            R.drawable.museoartemoderno,//21
            R.drawable.citytour,//22
            R.drawable.museohistoria,//23 museo de historia y medicina
            R.drawable.casaculturacoche,//24
            R.drawable.colegio,//25
            R.drawable.museomonasterio,//26
            R.drawable.miradorturi,//27
            R.drawable.panamahat,//28
            R.drawable.artesfuego,//29
            R.drawable.museoremigiocrespo,//30
            R.drawable.vectorjcueva,//31
            R.drawable.ruinaspumapungo,//32
            R.drawable.homeroortegahats,//33
            R.drawable.museofolcloreazuayo,//34
            R.drawable.institutodeflolclore,//35
            R.drawable.museomariaastudillo,//36
            R.drawable.santuariomarino,//37
            R.drawable.museoesqueketologia,//38
            R.drawable.parquetemplete,//39
            R.drawable.parquerecreo,//40

    };

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guia_por_cuenca);


        ListView lista = (ListView) findViewById(R.id.listView3);
        adapter = new ListViewAdapter(this,titulo,subtitulo,imagenes);
        lista.setAdapter(adapter);//hasta aqui es lomismo que el video

        //Nos permite realizar accioes al aplastar los listview
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(getApplicationContext(), "poscion "+ (position+1)+titulo[position], Toast.LENGTH_SHORT).show();
                switch (position) {
                    case 0 :
                        Bundle bundle=new Bundle();//para enviar parametros
                        bundle.putInt("mensaje",position);//para enviar un nuemro se pone putInt (para enviar parametros)

                        Intent a = new Intent(getApplicationContext(), mapa_atractivos.class);

                        a.putExtras(bundle);//para enviaar parametros)

                        startActivity(a);
                        break;
                    case 1 :
                        Bundle bundle1=new Bundle();//para enviar parametros
                        bundle1.putInt("mensaje",position);//para enviar un nuemro se pone putInt (para enviar parametros)

                        Intent b = new Intent(getApplicationContext(), mapa_atractivos.class);

                        b.putExtras(bundle1);//para enviaar parametros)

                        startActivity(b);
                        break;
                    case 2 :
                        Bundle bundle2=new Bundle();//para enviar parametros
                        bundle2.putInt("mensaje",position);//para enviar un nuemro se pone putInt (para enviar parametros)

                        Intent c = new Intent(getApplicationContext(), mapa_atractivos.class);

                        c.putExtras(bundle2);//para enviaar parametros)

                        startActivity(c);
                        break;
                    case 3 :
                        Bundle bundle3=new Bundle();//para enviar parametros
                        bundle3.putInt("mensaje",position);//para enviar un nuemro se pone putInt (para enviar parametros)

                        Intent d = new Intent(getApplicationContext(), mapa_atractivos.class);

                        d.putExtras(bundle3);//para enviaar parametros)

                        startActivity(d);
                        break;
                    case 4 :
                        Bundle bundle4=new Bundle();//para enviar parametros
                        bundle4.putInt("mensaje",position);//para enviar un nuemro se pone putInt (para enviar parametros)

                        Intent e = new Intent(getApplicationContext(), mapa_atractivos.class);

                        e.putExtras(bundle4);//para enviaar parametros)

                        startActivity(e);
                        break;

                    case 5 :
                        Bundle bundle5=new Bundle();//para enviar parametros
                        bundle5.putInt("mensaje",position);//para enviar un nuemro se pone putInt (para enviar parametros)

                        Intent f = new Intent(getApplicationContext(), mapa_atractivos.class);

                        f.putExtras(bundle5);//para enviaar parametros)

                        startActivity(f);
                        break;

                    case 6 :
                        Bundle bundle6=new Bundle();//para enviar parametros
                        bundle6.putInt("mensaje",position);//para enviar un nuemro se pone putInt (para enviar parametros)

                        Intent g = new Intent(getApplicationContext(), mapa_atractivos.class);

                        g.putExtras(bundle6);//para enviaar parametros)

                        startActivity(g);
                        break;

                    case 7 :
                        Bundle bundle7=new Bundle();//para enviar parametros
                        bundle7.putInt("mensaje",position);//para enviar un nuemro se pone putInt (para enviar parametros)

                        Intent h = new Intent(getApplicationContext(), mapa_atractivos.class);

                        h.putExtras(bundle7);//para enviaar parametros)

                        startActivity(h);
                        break;

                    case 8 :
                        Bundle bundle8=new Bundle();//para enviar parametros
                        bundle8.putInt("mensaje",position);//para enviar un nuemro se pone putInt (para enviar parametros)

                        Intent i = new Intent(getApplicationContext(), mapa_atractivos.class);

                        i.putExtras(bundle8);//para enviaar parametros)

                        startActivity(i);
                        break;

                    case 9 :
                        Bundle bundle9=new Bundle();//para enviar parametros
                        bundle9.putInt("mensaje",position);//para enviar un nuemro se pone putInt (para enviar parametros)

                        Intent j = new Intent(getApplicationContext(), mapa_atractivos.class);

                        j.putExtras(bundle9);//para enviaar parametros)

                        startActivity(j);
                        break;

                    case 10 :
                        Bundle bundle10=new Bundle();//para enviar parametros
                        bundle10.putInt("mensaje",position);//para enviar un nuemro se pone putInt (para enviar parametros)

                        Intent k = new Intent(getApplicationContext(), mapa_atractivos.class);

                        k.putExtras(bundle10);//para enviaar parametros)

                        startActivity(k);
                        break;

                    case 11 :
                        Bundle bundle11=new Bundle();//para enviar parametros
                        bundle11.putInt("mensaje",position);//para enviar un nuemro se pone putInt (para enviar parametros)

                        Intent l = new Intent(getApplicationContext(), mapa_atractivos.class);

                        l.putExtras(bundle11);//para enviaar parametros)

                        startActivity(l);
                        break;

                    case 12 :
                        Bundle bundle12=new Bundle();//para enviar parametros
                        bundle12.putInt("mensaje",position);//para enviar un nuemro se pone putInt (para enviar parametros)

                        Intent ll = new Intent(getApplicationContext(), mapa_atractivos.class);

                        ll.putExtras(bundle12);//para enviaar parametros)

                        startActivity(ll);
                        break;

                    case 13 :
                        Bundle bundle13=new Bundle();//para enviar parametros
                        bundle13.putInt("mensaje",position);//para enviar un nuemro se pone putInt (para enviar parametros)

                        Intent m = new Intent(getApplicationContext(), mapa_atractivos.class);

                        m.putExtras(bundle13);//para enviaar parametros)

                        startActivity(m);
                        break;

                    case 14 :
                        Bundle bundle14=new Bundle();//para enviar parametros
                        bundle14.putInt("mensaje",position);//para enviar un nuemro se pone putInt (para enviar parametros)

                        Intent n = new Intent(getApplicationContext(), mapa_atractivos.class);

                        n.putExtras(bundle14);//para enviaar parametros)

                        startActivity(n);
                        break;

                    case 15 :
                        Bundle bundle15=new Bundle();//para enviar parametros
                        bundle15.putInt("mensaje",position);//para enviar un nuemro se pone putInt (para enviar parametros)

                        Intent nn = new Intent(getApplicationContext(), mapa_atractivos.class);

                        nn.putExtras(bundle15);//para enviaar parametros)

                        startActivity(nn);
                        break;

                    case 16 :
                        Bundle bundle16=new Bundle();//para enviar parametros
                        bundle16.putInt("mensaje",position);//para enviar un nuemro se pone putInt (para enviar parametros)

                        Intent o = new Intent(getApplicationContext(), mapa_atractivos.class);

                        o.putExtras(bundle16);//para enviaar parametros)

                        startActivity(o);
                        break;

                    case 17 :
                        Bundle bundle17=new Bundle();//para enviar parametros
                        bundle17.putInt("mensaje",position);//para enviar un nuemro se pone putInt (para enviar parametros)

                        Intent p = new Intent(getApplicationContext(), mapa_atractivos.class);

                        p.putExtras(bundle17);//para enviaar parametros)

                        startActivity(p);
                        break;

                    case 18 :
                        Bundle bundle18=new Bundle();//para enviar parametros
                        bundle18.putInt("mensaje",position);//para enviar un nuemro se pone putInt (para enviar parametros)

                        Intent r = new Intent(getApplicationContext(), mapa_atractivos.class);

                        r.putExtras(bundle18);//para enviaar parametros)

                        startActivity(r);
                        break;

                    case 19 :
                        Bundle bundle19=new Bundle();//para enviar parametros
                        bundle19.putInt("mensaje",position);//para enviar un nuemro se pone putInt (para enviar parametros)

                        Intent rr = new Intent(getApplicationContext(), mapa_atractivos.class);

                        rr.putExtras(bundle19);//para enviaar parametros)

                        startActivity(rr);
                        break;

                    case 20 :
                        Bundle bundle20=new Bundle();//para enviar parametros
                        bundle20.putInt("mensaje",position);//para enviar un nuemro se pone putInt (para enviar parametros)

                        Intent s = new Intent(getApplicationContext(), mapa_atractivos.class);

                        s.putExtras(bundle20);//para enviaar parametros)

                        startActivity(s);
                        break;

                    case 21 :
                        Bundle bundle21=new Bundle();//para enviar parametros
                        bundle21.putInt("mensaje",position);//para enviar un nuemro se pone putInt (para enviar parametros)

                        Intent t = new Intent(getApplicationContext(), mapa_atractivos.class);

                        t.putExtras(bundle21);//para enviaar parametros)

                        startActivity(t);
                        break;

                    case 22 :
                        Bundle bundle22=new Bundle();//para enviar parametros
                        bundle22.putInt("mensaje",position);//para enviar un nuemro se pone putInt (para enviar parametros)

                        Intent u = new Intent(getApplicationContext(), mapa_atractivos.class);

                        u.putExtras(bundle22);//para enviaar parametros)

                        startActivity(u);
                        break;

                    case 23 :
                        Bundle bundle23=new Bundle();//para enviar parametros
                        bundle23.putInt("mensaje",position);//para enviar un nuemro se pone putInt (para enviar parametros)

                        Intent v = new Intent(getApplicationContext(), mapa_atractivos.class);

                        v.putExtras(bundle23);//para enviaar parametros)

                        startActivity(v);
                        break;

                    case 24 :
                        Bundle bundle24=new Bundle();//para enviar parametros
                        bundle24.putInt("mensaje",position);//para enviar un nuemro se pone putInt (para enviar parametros)

                        Intent w = new Intent(getApplicationContext(), mapa_atractivos.class);

                        w.putExtras(bundle24);//para enviaar parametros)

                        startActivity(w);
                        break;

                    case 25 :
                        Bundle bundle25=new Bundle();//para enviar parametros
                        bundle25.putInt("mensaje",position);//para enviar un nuemro se pone putInt (para enviar parametros)

                        Intent x = new Intent(getApplicationContext(), mapa_atractivos.class);

                        x.putExtras(bundle25);//para enviaar parametros)

                        startActivity(x);
                        break;

                    case 26 :
                        Bundle bundle26=new Bundle();//para enviar parametros
                        bundle26.putInt("mensaje",position);//para enviar un nuemro se pone putInt (para enviar parametros)

                        Intent y = new Intent(getApplicationContext(), mapa_atractivos.class);

                        y.putExtras(bundle26);//para enviaar parametros)

                        startActivity(y);
                        break;

                    case 27 :
                        Bundle bundle27=new Bundle();//para enviar parametros
                        bundle27.putInt("mensaje",position);//para enviar un nuemro se pone putInt (para enviar parametros)

                        Intent z = new Intent(getApplicationContext(), mapa_atractivos.class);

                        z.putExtras(bundle27);//para enviaar parametros)

                        startActivity(z);
                        break;

                    case 28 :
                        Bundle bundle28=new Bundle();//para enviar parametros
                        bundle28.putInt("mensaje",position);//para enviar un nuemro se pone putInt (para enviar parametros)

                        Intent a1 = new Intent(getApplicationContext(), mapa_atractivos.class);

                        a1.putExtras(bundle28);//para enviaar parametros)

                        startActivity(a1);
                        break;
                    case 29 :
                        Bundle bundle29=new Bundle();//para enviar parametros
                        bundle29.putInt("mensaje",position);//para enviar un nuemro se pone putInt (para enviar parametros)

                        Intent b1 = new Intent(getApplicationContext(), mapa_atractivos.class);

                        b1.putExtras(bundle29);//para enviaar parametros)

                        startActivity(b1);
                        break;
                    case 30 :
                        Bundle bundle30=new Bundle();//para enviar parametros
                        bundle30.putInt("mensaje",position);//para enviar un nuemro se pone putInt (para enviar parametros)

                        Intent c1 = new Intent(getApplicationContext(), mapa_atractivos.class);

                        c1.putExtras(bundle30);//para enviaar parametros)

                        startActivity(c1);
                        break;
                    case 31 :
                        Bundle bundle31=new Bundle();//para enviar parametros
                        bundle31.putInt("mensaje",position);//para enviar un nuemro se pone putInt (para enviar parametros)

                        Intent d1 = new Intent(getApplicationContext(), mapa_atractivos.class);

                        d1.putExtras(bundle31);//para enviaar parametros)

                        startActivity(d1);
                        break;
                    case 32 :
                        Bundle bundle32=new Bundle();//para enviar parametros
                        bundle32.putInt("mensaje",position);//para enviar un nuemro se pone putInt (para enviar parametros)

                        Intent e1 = new Intent(getApplicationContext(), mapa_atractivos.class);

                        e1.putExtras(bundle32);//para enviaar parametros)

                        startActivity(e1);
                        break;

                    case 33 :
                        Bundle bundle33=new Bundle();//para enviar parametros
                        bundle33.putInt("mensaje",position);//para enviar un nuemro se pone putInt (para enviar parametros)

                        Intent f1 = new Intent(getApplicationContext(), mapa_atractivos.class);

                        f1.putExtras(bundle33);//para enviaar parametros)

                        startActivity(f1);
                        break;

                    case 34 :
                        Bundle bundle34=new Bundle();//para enviar parametros
                        bundle34.putInt("mensaje",position);//para enviar un nuemro se pone putInt (para enviar parametros)

                        Intent g1 = new Intent(getApplicationContext(), mapa_atractivos.class);

                        g1.putExtras(bundle34);//para enviaar parametros)

                        startActivity(g1);
                        break;

                    case 35 :
                        Bundle bundle35=new Bundle();//para enviar parametros
                        bundle35.putInt("mensaje",position);//para enviar un nuemro se pone putInt (para enviar parametros)

                        Intent h1 = new Intent(getApplicationContext(), mapa_atractivos.class);

                        h1.putExtras(bundle35);//para enviaar parametros)

                        startActivity(h1);
                        break;

                    case 36 :
                        Bundle bundle36=new Bundle();//para enviar parametros
                        bundle36.putInt("mensaje",position);//para enviar un nuemro se pone putInt (para enviar parametros)

                        Intent i1 = new Intent(getApplicationContext(), mapa_atractivos.class);

                        i1.putExtras(bundle36);//para enviaar parametros)

                        startActivity(i1);
                        break;

                    case 37 :
                        Bundle bundle37=new Bundle();//para enviar parametros
                        bundle37.putInt("mensaje",position);//para enviar un nuemro se pone putInt (para enviar parametros)

                        Intent j1 = new Intent(getApplicationContext(), mapa_atractivos.class);

                        j1.putExtras(bundle37);//para enviaar parametros)

                        startActivity(j1);
                        break;

                    case 38 :
                        Bundle bundle38=new Bundle();//para enviar parametros
                        bundle38.putInt("mensaje",position);//para enviar un nuemro se pone putInt (para enviar parametros)

                        Intent k1 = new Intent(getApplicationContext(), mapa_atractivos.class);

                        k1.putExtras(bundle38);//para enviaar parametros)

                        startActivity(k1);
                        break;

                    case 39 :
                        Bundle bundle39=new Bundle();//para enviar parametros
                        bundle39.putInt("mensaje",position);//para enviar un nuemro se pone putInt (para enviar parametros)

                        Intent l1 = new Intent(getApplicationContext(), mapa_atractivos.class);

                        l1.putExtras(bundle39);//para enviaar parametros)

                        startActivity(l1);
                        break;

                    case 40 :
                        Bundle bundle40=new Bundle();//para enviar parametros
                        bundle40.putInt("mensaje",position);//para enviar un nuemro se pone putInt (para enviar parametros)

                        Intent ll1 = new Intent(getApplicationContext(), mapa_atractivos.class);

                        ll1.putExtras(bundle40);//para enviaar parametros)

                        startActivity(ll1);
                        break;


                    default:
                        Toast.makeText(getApplicationContext(), "Opcion incorrecta", Toast.LENGTH_SHORT).show();
                }
                
            }
        });



    }



    //LISTVIEW ADAPTER

    public class ListViewAdapter extends BaseAdapter {
        // Declare Variables
        Context context;
        String[] titulos;
        String[] subtitulo;
        int[] imagenes;
        LayoutInflater inflater;

        public ListViewAdapter(Context context, String[] titulos,String[] subtitulo ,int[] imagenes) {
            this.context = context;
            this.titulos = titulos;
            this.subtitulo=subtitulo;
            this.imagenes = imagenes;
        }

        @Override
        public int getCount() {
            return titulos.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        public View getView(int position, View convertView, ViewGroup parent) {

            // Declare Variables
            TextView txtTitle;
            TextView txtSubtiteler;
            ImageView imgImg;

            //http://developer.android.com/intl/es/reference/android/view/LayoutInflater.html
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View itemView = inflater.inflate(R.layout.leyenda_list_row, parent, false);

            // Locate the TextViews in listview_item.xml
            txtTitle = (TextView) itemView.findViewById(R.id.titulo1);
            txtSubtiteler=(TextView) itemView.findViewById(R.id.subtitulo2);
            imgImg = (ImageView) itemView.findViewById(R.id.imagen1);

            // Capture position and set to the TextViews
            txtTitle.setText(titulos[position]);
            txtSubtiteler.setText(subtitulo[position]);
            imgImg.setImageResource(imagenes[position]);


            return itemView;
        }
    }


}
