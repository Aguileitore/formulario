package primera.app.miformulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    EditText nombre, apellidos, edad, correo;
    Button aceptar;
    ImageView tvSalir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = (EditText)findViewById(R.id.editNombre);
        apellidos = (EditText)findViewById(R.id.editApellido);
        edad = (EditText)findViewById(R.id.editEdad);
        correo = (EditText)findViewById(R.id.editCorreo);
        aceptar = (Button)findViewById(R.id.btnAceptar);


        aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                String name = nombre.getText().toString();
                String ape = apellidos.getText().toString();
                String age = edad.getText().toString();
                String email = correo.getText().toString();

                Intent i = new Intent( MainActivity.this, MostrarDatos.class);

                i.putExtra( "name", name);
                i.putExtra( "ape", ape);
                i.putExtra( "age", age);
                i.putExtra( "email", email);

                startActivity(i);

            }

} );



    }}
