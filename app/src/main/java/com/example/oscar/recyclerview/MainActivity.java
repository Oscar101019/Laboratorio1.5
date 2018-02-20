package com.example.oscar.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView= (RecyclerView)findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        arrayList = new ArrayList<String>();

        arrayList.add("ABREGO DELGADO ALEXIA ARIANA	");
        arrayList.add("ARANDA PATRON NOMAR JAZIEL");
        arrayList.add("BAUTISTA MONSALVO JULIO CESAR	");
        arrayList.add("CARDENAS RAMOS FRANCISCO EMANUEL	");
        arrayList.add("CARO LOPEZ LUIS RICARDO	");
        arrayList.add("CARVAJAL GUTIERREZ RAUL RAFAEL	");
        arrayList.add("CORDERO VILLA OSCAR ALBERTO	");
        arrayList.add("ESPINO SERRANO CESAR RAMSES	");
        arrayList.add("ESPINOSA ABANDO DENISSE YANETH	");
        arrayList.add("ESPINOZA ORONIA CARLOS EDUARDO	");
        arrayList.add("GALLEGOS GODINEZ FRANCISCO JAVIER	");
        arrayList.add("GIL LLANOS JUAN PEDRO	");
        arrayList.add("GONZALEZ ARELLANO ERNESTO	");
        arrayList.add("GONZALEZ CASTELLANOS EDGAR FABRIZIO	");
        arrayList.add("GUTIERREZ ESPARZA BRAYAN JESUS	");
        arrayList.add("GUTIÉRREZ ROJAS BRYAN	");
        arrayList.add("HERNANDEZ SANDOVAL ABRIL YARELI	");
        arrayList.add("JIMENEZ ORTIZ JUAN DANIEL	");
        arrayList.add("LIZOLA CHAVARÍN LUIS FERNANDO	");
        arrayList.add("LOZANO MORA EDGAR ERNESTO	");
        arrayList.add("MARTINEZ BAÑUELOS ERIKA LIZBETH	");
        arrayList.add("MENDEZ SANTANA KEVIN ALEJANDRO	");
        arrayList.add("MONROY SALCEDO JOSE DE JESUS	");
        arrayList.add("PARRA DOMINGUEZ DYLAN SALVADOR	");
        arrayList.add("PEREZ ARAIZA FLOR MARIELA	");
        arrayList.add("PUGA FLORES CARLOS	");
        arrayList.add("REYES GUERRERO GUILLERMO GUADALUPE	");
        arrayList.add("RODRIGUEZ ADAME OLIVER GIOVANNY	");
        arrayList.add("SANCHEZ CARRILLO BETSY DEL CARMEN	");
        arrayList.add("SILVA CAMACHO EDUARDO LUIS	");
        arrayList.add("TORRES CUETO JESUS MANUEL	");
        arrayList.add("VALDEZ CORREA CARLOS GERMAN	");
        arrayList.add("VALDEZ LOPEZ HOLLIVER EDUARDO	");
        arrayList.add("VALENZUELA MIRAMONTES JOSE PABLO	");
        arrayList.add("VEGA LUNA CRISTOBAL ELIHU	");
        arrayList.add("CARRILLO GONZÁLEZ CARLOS ARTURO	");
        arrayList.add("IBARRA MARAVILLAS JONATHAN GUADALUPE	");
        arrayList.add("OCAMPO AGUILAR JESUS ANDRÉS	");


        AdapterDatos adapter= new AdapterDatos(arrayList);
        recyclerView.setAdapter(adapter);
    }
}
