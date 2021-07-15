package com.jherrera.myapprecyclerdvo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<DatosVO> listaVO = new ArrayList<>();
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerId);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        this.insertarDatos();

        AdaptadorRecycler adaptadorRecycler = new AdaptadorRecycler(listaVO);
        recyclerView.setAdapter(adaptadorRecycler);

    }
    public void insertarDatos(){
        listaVO.add(new DatosVO("Fernando Masariegos","4465-5654",R.drawable.continuar));
        listaVO.add(new DatosVO("Clemente Guerra","5576-5677",R.drawable.abeja));
        listaVO.add(new DatosVO("Fabricio Cabrera","3445-5678",R.drawable.perfil));
        listaVO.add(new DatosVO("Luis Cordoba","5268-9865",R.drawable.hombre));
        listaVO.add(new DatosVO("Jonathan Herrera","5907-8765",R.drawable.indigena));
        listaVO.add(new DatosVO("Andrea Cano","5987-9876",R.drawable.indio));
        listaVO.add(new DatosVO("Joaquina Cerrano","5245-7654",R.drawable.turista));
        listaVO.add(new DatosVO("Yesica Hernandez","4564-5654",R.drawable.angel));
        listaVO.add(new DatosVO("Caterine Enriquez","5764-5645",R.drawable.usuario));
        listaVO.add(new DatosVO("Abuelos","7855-6787",R.drawable.abuelos));

    }
}