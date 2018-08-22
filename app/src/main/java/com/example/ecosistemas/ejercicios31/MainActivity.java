package com.example.ecosistemas.ejercicios31;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv_informacion, tv_resultado;
    EditText et_masa, et_altura;
    Button btn_calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_informacion = findViewById(R.id.tv_informacion);
        tv_resultado = findViewById(R.id.tv_resultado);

        et_masa = findViewById(R.id.et_masa);
        et_altura = findViewById(R.id.et_altura);

        btn_calcular = findViewById(R.id.btn_calcular);


        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String text_masa = et_masa.getText().toString();
                float masa = 0;
                boolean publicar = true;

                try{
                    masa = Float.parseFloat(text_masa);
                }catch (Exception ex){
                    publicar = false;
                }

                String text_altura = et_altura.getText().toString();
                float altura = 0;

                try{
                    altura = Float.parseFloat(text_altura);
                }catch (Exception ex){
                    publicar = false;
                }

                String mensaje = "Aqui se vera el IMC";

                if(altura > 0 && masa >= 0 && publicar){
                    float imc = masa/(altura*altura);

                    mensaje = imc + "";
                }else{
                    mensaje = "Por favor ingrese datos validos";
                }


                tv_resultado.setText(mensaje);


            }



        });







    }
}
