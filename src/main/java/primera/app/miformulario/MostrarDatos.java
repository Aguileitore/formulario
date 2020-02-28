package primera.app.miformulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MostrarDatos extends AppCompatActivity {

    TextView tvnombre, tvapellidos, tvedad, tvcorreo;
    Button btnOk, btnSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_datos);

        tvnombre = (TextView) findViewById(R.id.tvNombre);
        tvapellidos = (TextView)findViewById(R.id.tvApellidos);
        tvedad = (TextView)findViewById(R.id.tvEdad);
        tvcorreo = ( TextView)findViewById(R.id.tvCorreo);
        btnOk = (Button)findViewById(R.id.btnOk);
        btnSalir = (Button)findViewById(R.id.btnSalir);

        btnOk.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent( MostrarDatos.this, MainActivity.class);
                startActivity(intent);
    }
        });

        btnSalir.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });

          mostrarDato();

    }
    private void mostrarDato(){
        Bundle datos = this.getIntent().getExtras();
        String nombre = datos.getString(  "name");
        String apellidos = datos.getString(  "ape");
        String edad = datos.getString( "age");
        String correo = datos.getString(  "email");

        tvnombre.setText(nombre);
        tvapellidos.setText(apellidos);
        tvedad.setText(edad);
        tvcorreo.setText(correo);

    }
}
