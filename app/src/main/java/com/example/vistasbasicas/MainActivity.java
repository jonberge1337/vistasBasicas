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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView tv;
        Button b;
        CheckBox cb;
        RadioButton rb0, rb1;
        EditText et;
        SeekBar sb;
//        Spinner s = findViewById(R.id.spinner0);;
//        ArrayAdapter<CharSequence>adapter = ArrayAdapter.createFromResource(this,R.array.combo,android.R.layout.simple_spinner_item);
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner spinner =  findViewById(R.id.spinner0);
//        String[] letra = {"A","B","C","D","E"};
//        spinner.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, letra));

        b = findViewById(R.id.boton);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("Esto va por el canal", error);
            }
        });
        cb = findViewById(R.id.checkbox);
        cb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox cb =(CheckBox) v;
                if (cb.isChecked()){
                    Log.e("Info", "CheckBox selecciona");
                } else {
                    Log.e("Info", "CheckBox no seleccionado");
                }

            }
        });

        rb0 = findViewById(R.id.radio0);
        rb0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("Info", "RadioButton0 seleccionado");
            }
        });

        rb1 = findViewById(R.id.radio1);
        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("Info", "RadioButton1 seleccionado");
            }
        });

        et = findViewById(R.id.EditText0);
        et.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (keyCode == event.KEYCODE_ENTER){
                    EditText et = (EditText) v;
                    Log.e("Info", et.getText().toString());
                }
                return false;
            }
        });

       spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           @Override
           public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
               Log.e("info", "se ha seleccionado" + id);
           }

           @Override
           public void onNothingSelected(AdapterView<?> parent) {

           }
       });

        sb = findViewById(R.id.SeekBar0);
        sb.setMax(10);
        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Integer i = seekBar.getProgress();
                Log.e("Info", i.toString());
            }
        });

        tv = findViewById(R.id.texto);
        tv.setText("Editamos el texto desde codigo");
    }
}
