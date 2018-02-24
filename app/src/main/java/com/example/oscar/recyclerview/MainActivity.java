package com.example.oscar.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<String> arrayNombres;
    ArrayList<String> arrayNumeros;
    ArrayList<String> arrayCarrera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView= (RecyclerView)findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        arrayNombres = new ArrayList<String>();
        arrayNumeros = new ArrayList<String>();
        arrayCarrera = new ArrayList<String>();


        arrayNombres.add("ABREGO DELGADO ALEXIA ARIANA	");
        arrayNombres.add("ARANDA PATRON NOMAR JAZIEL");
        arrayNombres.add("BAUTISTA MONSALVO JULIO CESAR	");
        arrayNombres.add("CARDENAS RAMOS FRANCISCO EMANUEL	");
        arrayNombres.add("CARO LOPEZ LUIS RICARDO	");
        arrayNombres.add("CARVAJAL GUTIERREZ RAUL RAFAEL	");
        arrayNombres.add("CORDERO VILLA OSCAR ALBERTO	");
        arrayNombres.add("ESPINO SERRANO CESAR RAMSES	");
        arrayNombres.add("ESPINOSA ABANDO DENISSE YANETH	");
        arrayNombres.add("ESPINOZA ORONIA CARLOS EDUARDO	");
        arrayNombres.add("GALLEGOS GODINEZ FRANCISCO JAVIER	");
        arrayNombres.add("GIL LLANOS JUAN PEDRO	");
        arrayNombres.add("GONZALEZ ARELLANO ERNESTO	");
        arrayNombres.add("GONZALEZ CASTELLANOS EDGAR FABRIZIO	");
        arrayNombres.add("GUTIERREZ ESPARZA BRAYAN JESUS	");
        arrayNombres.add("GUTIÉRREZ ROJAS BRYAN	");
        arrayNombres.add("HERNANDEZ SANDOVAL ABRIL YARELI	");
        arrayNombres.add("JIMENEZ ORTIZ JUAN DANIEL	");
        arrayNombres.add("LIZOLA CHAVARÍN LUIS FERNANDO	");
        arrayNombres.add("LOZANO MORA EDGAR ERNESTO	");
        arrayNombres.add("MARTINEZ BAÑUELOS ERIKA LIZBETH	");
        arrayNombres.add("MENDEZ SANTANA KEVIN ALEJANDRO	");
        arrayNombres.add("MONROY SALCEDO JOSE DE JESUS	");
        arrayNombres.add("PARRA DOMINGUEZ DYLAN SALVADOR	");
        arrayNombres.add("PEREZ ARAIZA FLOR MARIELA	");
        arrayNombres.add("PUGA FLORES CARLOS");
        arrayNombres.add("REYES GUERRERO GUILLERMO GUADALUPE");
        arrayNombres.add("RODRIGUEZ ADAME OLIVER GIOVANNY");
        arrayNombres.add("SANCHEZ CARRILLO BETSY DEL CARMEN");
        arrayNombres.add("SILVA CAMACHO EDUARDO LUIS	");
        arrayNombres.add("TORRES CUETO JESUS MANUEL	");
        arrayNombres.add("VALDEZ CORREA CARLOS GERMAN	");
        arrayNombres.add("VALDEZ LOPEZ HOLLIVER EDUARDO	");
        arrayNombres.add("VALENZUELA MIRAMONTES JOSE PABLO	");
        arrayNombres.add("VEGA LUNA CRISTOBAL ELIHU	");
        arrayNombres.add("CARRILLO GONZÁLEZ CARLOS ARTURO	");
        arrayNombres.add("IBARRA MARAVILLAS JONATHAN GUADALUPE	");
        arrayNombres.add("OCAMPO AGUILAR JESUS ANDRÉS	");

        arrayNumeros.add("	13400378	");
        arrayNumeros.add("	13400381	");
        arrayNumeros.add("	13400390	");
        arrayNumeros.add("	14400916	");
        arrayNumeros.add("	13400395	");
        arrayNumeros.add("	13400396	");
        arrayNumeros.add("	14400925	");
        arrayNumeros.add("	13400402	");
        arrayNumeros.add("	14400932	");
        arrayNumeros.add("	12401119	");
        arrayNumeros.add("	13400409	");
        arrayNumeros.add("	14400941	");
        arrayNumeros.add("	14400944	");
        arrayNumeros.add("	13400419	");
        arrayNumeros.add("	13400424	");
        arrayNumeros.add("	14400945	");
        arrayNumeros.add("	13400430	");
        arrayNumeros.add("	13400436	");
        arrayNumeros.add("	13400441	");
        arrayNumeros.add("	12400283	");
        arrayNumeros.add("	13400452	");
        arrayNumeros.add("	13400458	");
        arrayNumeros.add("	14400968	");
        arrayNumeros.add("	14400983	");
        arrayNumeros.add("	13400474	");
        arrayNumeros.add("	14400990	");
        arrayNumeros.add("	14400996	");
        arrayNumeros.add("	13400507	");
        arrayNumeros.add("	14401007	");
        arrayNumeros.add("	13400494	");
        arrayNumeros.add("	14401009	");
        arrayNumeros.add("	12400326	");
        arrayNumeros.add("	13400499	");
        arrayNumeros.add("	13400501	");
        arrayNumeros.add("	14401015	");
        arrayNumeros.add("	13401087	");
        arrayNumeros.add("	13401097	");
        arrayNumeros.add("	13401100	");

        arrayCarrera.add("	ISC	");
        arrayCarrera.add("	ISC	");
        arrayCarrera.add("	ISC	");
        arrayCarrera.add("	ISC	");
        arrayCarrera.add("	ISC	");
        arrayCarrera.add("	ISC	");
        arrayCarrera.add("	ISC	");
        arrayCarrera.add("	ISC	");
        arrayCarrera.add("	ISC	");
        arrayCarrera.add("	ISC	");
        arrayCarrera.add("	ISC	");
        arrayCarrera.add("	ISC	");
        arrayCarrera.add("	ISC	");
        arrayCarrera.add("	ISC	");
        arrayCarrera.add("	ISC	");
        arrayCarrera.add("	ISC	");
        arrayCarrera.add("	ISC	");
        arrayCarrera.add("	ISC	");
        arrayCarrera.add("	ISC	");
        arrayCarrera.add("	ISC	");
        arrayCarrera.add("	ISC	");
        arrayCarrera.add("	ISC	");
        arrayCarrera.add("	ISC	");
        arrayCarrera.add("	ISC	");
        arrayCarrera.add("	ISC	");
        arrayCarrera.add("	ISC	");
        arrayCarrera.add("	ISC	");
        arrayCarrera.add("	ISC	");
        arrayCarrera.add("	ISC	");
        arrayCarrera.add("	ISC	");
        arrayCarrera.add("	ISC	");
        arrayCarrera.add("	ISC	");
        arrayCarrera.add("	ISC	");
        arrayCarrera.add("	ISC	");
        arrayCarrera.add("	ISC	");
        arrayCarrera.add("	ISC	");
        arrayCarrera.add("	ISC	");
        arrayCarrera.add("	ISC	");


        AdapterDatos adapter= new AdapterDatos(arrayNombres,arrayNumeros,arrayCarrera);
        recyclerView.setAdapter(adapter);
    }
}
