package com.example.useofcheckbox;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBox1, checkBox2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox1 = findViewById(R.id.option1);
        checkBox2 = findViewById(R.id.option2);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.btnValidar) {
            validar();
        }
    }

    private void validar() {
        String cadena = "Casillas seleccionadas: \n";

        if (checkBox1.isChecked())
            cadena += "La OPCION1\n";

        if (checkBox2.isChecked())
            cadena += "La OPCION2";

        Toast.makeText(getApplicationContext(), cadena, Toast.LENGTH_SHORT).show();
    }

}
