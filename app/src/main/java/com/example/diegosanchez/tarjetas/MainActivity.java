package com.example.diegosanchez.tarjetas;

import android.content.Context;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {//principal
public ListView lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista = (ListView) findViewById(R.id.listaTarjetas);
        OrigenDeDatosDeTarjeta datosDeTarjeta = new OrigenDeDatosDeTarjeta();
        tarjetaAdapter adapter = new tarjetaAdapter();
        adapter.datos=datosDeTarjeta.getDatos();
        adapter.contexto=this;
        adapter.Imagen=datosDeTarjeta.getImagenes();
        lista.setAdapter(adapter);
    }


    class Tarjeta
    {//classtarjeta

        private int edad;
        private String nombre;
        private String descripcion;
        private int img;

        public void setEdad(int edad) {
            this.edad = edad;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }
        public void setImg(int img) {
            this.img = img;
        }


        public int getEdad() {
            return edad;
        }
        public String getNombre() {
            return nombre;
        }
        public String getDescripcion() {
            return descripcion;
        }
        public int getImg() {
            return img;
        }

        public Tarjeta(int edad, String nombre, String descripcion, int img)
        {
            this.edad = edad;
            this.nombre = nombre;
            this.descripcion = descripcion;
            this.img = img;
        }

        public Tarjeta()
        {

        }
    }//classtarjeta

    class OrigenDeDatosDeTarjeta
    {//classorigen

        public OrigenDeDatosDeTarjeta()
        {
        }

        public ArrayList <String> getImagenes (){
            ArrayList <String> Imagen = new ArrayList<String>();
            Imagen.add("https://c1.staticflickr.com/4/3736/32762943674_2456ce495c_b.jpg");
            Imagen.add("https://c1.staticflickr.com/8/7360/27753422426_23646beb65_b.jpg");
            Imagen.add("http://i0.kym-cdn.com/entries/icons/original/000/023/977/VectorFlightSuit.jpg");
            Imagen.add("http://www.mytinyphone.com/uploads/users/twifranny/560841.jpg");
            Imagen.add("http://www.regioncallao.gob.pe/contenidos/contenidosGRC/DATATRANSPORTE/SexyLightBox/sexyimages/homerin2.jpg");
            Imagen.add("https://c1.staticflickr.com/6/5339/17721429261_42450d81db_b.jpg");
            Imagen.add("https://quewallpaper.files.wordpress.com/2008/08/guepardo09.jpg");
            Imagen.add("https://c1.staticflickr.com/6/5216/30091409642_42af7bf19f_b.jpg");
            Imagen.add("https://media-cdn.tripadvisor.com/media/photo-s/12/67/fb/d9/img-20180318-114944-largejpg.jpg");
            Imagen.add("http://www.conacytprensa.mx/images/1-HEAD_mango2118.jpg");
            return Imagen;
        }
        public ArrayList <Tarjeta> getDatos() {
            ArrayList<Tarjeta> datos = new ArrayList<Tarjeta>();

            Tarjeta uno = new Tarjeta();
            uno.setNombre("Juan");
            uno.setDescripcion("Me gusta el labial");
            uno.setEdad(19);
            uno.setImg(1);
            datos.add(uno);

            Tarjeta dos = new Tarjeta();
            dos.setNombre("Juen");
            dos.setDescripcion("No me gusta el labial");
            dos.setEdad(18);
            dos.setImg(2);
            datos.add(dos);

            Tarjeta tres = new Tarjeta();
            tres.setNombre("juin");
            tres.setDescripcion("No se si me gusta el labial");
            tres.setEdad(18);
            tres.setImg(3);
            datos.add(tres);

            Tarjeta cuatro = new Tarjeta();
            cuatro.setNombre("juon");
            cuatro.setDescripcion("A veces suele gustarme el labial");
            cuatro.setEdad(18);
            cuatro.setImg(4);
            datos.add(cuatro);

            Tarjeta cinco = new Tarjeta();
            cinco.setNombre("juun");
            cinco.setDescripcion("Definitivamente no me gusta el labial");
            cinco.setEdad(19);
            cinco.setImg(5);
            datos.add(cinco);

            Tarjeta seis = new Tarjeta();
            seis.setNombre("Diega");
            seis.setDescripcion("Me gusta el helado");
            seis.setEdad(20);
            seis.setImg(6);
            datos.add(seis);

            Tarjeta siete = new Tarjeta();
            siete.setNombre("Diege");
            siete.setDescripcion("No me gusta el helado");
            siete.setEdad(18);
            siete.setImg(7);
            datos.add(siete);

            Tarjeta ocho = new Tarjeta();
            ocho.setNombre("Diegi");
            ocho.setDescripcion("A veces me gusta el helado");
            ocho.setEdad(18);
            ocho.setImg(8);
            datos.add(ocho);

            Tarjeta nueve = new Tarjeta();
            nueve.setNombre("Diego");
            nueve.setDescripcion("Definitivamente no me gusta el helado");
            nueve.setEdad(20);
            nueve.setImg(9);
            datos.add(nueve);

            Tarjeta diez = new Tarjeta();
            diez.setNombre("Diegu");
            diez.setDescripcion("No se si me gusta el helado");
            diez.setEdad(18);
            diez.setImg(10);
            datos.add(diez);

            return datos;
        }

    }//classorigen

    class tarjetaAdapter extends BaseAdapter
    {
        public ArrayList <String> Imagen;
        public ArrayList<Tarjeta> datos;
        Context contexto;
        @Override
        public int getCount() {
            return datos.size();
        }

        @Override
        public Object getItem(int i) {
            return datos.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            LayoutInflater vinculo = LayoutInflater.from(contexto);
            View v=vinculo.inflate(R.layout.tarjeta,null);
            TextView nombrePersona = (TextView)v.findViewById(R.id.nombrePersona);
            nombrePersona.setText(datos.get(i).nombre);
            TextView edadPersona = (TextView)v.findViewById(R.id.edadPersona);
            edadPersona.setText(""+datos.get(i).edad);
            TextView descripcionPersona = (TextView)v.findViewById(R.id.descripcionPersona);
            descripcionPersona.setText(datos.get(i).descripcion);
            ImageView imageView = (ImageView)v.findViewById(R.id.imagenPerfil);
            Picasso.with(contexto).load(Imagen.get(i)).into(imageView);

            return v;
        }

    }//classadapter




}//Principal


