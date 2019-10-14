package com.example.vistasbasicas;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String error = "eRror";

//    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        TextView tv = findViewById(R.id.texto);
        Button b;
//        CheckBox cb;
//        RadioButton rb0, rb1;
//        EditText et;
//        Spinner s;
//        ArrayAdapter<CharSequence> recogedor;
//        SeekBar sb;
//
        b = findViewById(R.id.boton);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("Esto va por el canal", error);
            }
        });
//        cb = findViewById(R.id.checkbox);
//        cb.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                CheckBox cb =(CheckBox) v;
//                if (cb.isChecked()){
//                    Log.e("Info", "CheckBox selecciona");
//                } else {
//                    Log.e("Info", "CheckBox no seleccionado");
//                }
//
//            }
//        });
//        rb0 = findViewById(R.id.radio0);
//        rb0.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.e("Info", "RadioButton0 seleccionado");
//            }
//        });
//        rb1 = findViewById(R.id.radio1);
//        rb1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.e("Info", "RadioButton1 seleccionado");
//            }
//        });
//        et = findViewById(R.id.EditText0);
//        et.setOnKeyListener(new View.OnKeyListener() {
//            @Override
//            public boolean onKey(View v, int keyCode, KeyEvent event) {
//                if (keyCode == event.KEYCODE_ENTER){
//                    EditText et = (EditText) v;
//                    Log.e("Info", et.getText().toString());
//                }
//                return false;
//            }
//        });
//        s = findViewById(R.id.spinner0);
//        recogedor = ArrayAdapter.createFromResource(this, R.array.combo, android.R.layout.simple_spinner_item);
//        recogedor.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        s.setAdapter(recogedor);
//        s.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Log.e("Info", "Se ha seleccionado" + id);
//            }
//        });
//        sb = findViewById(R.id.spinner0);
//        sb.setMax(10);
//        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
//            @Override
//            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//
//            }
//
//            @Override
//            public void onStartTrackingTouch(SeekBar seekBar) {
//
//            }
//
//            @Override
//            public void onStopTrackingTouch(SeekBar seekBar) {
//                Integer i = seekBar.getProgress();
//                Log.e("Info", i.toString());
//            }
//        });


//        tv.setText("Editamos el texto desde codigo");
    }
}
