package itsav.edu.appproyecto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{
    private CardView AgregarP, EliminarP, EditarP, UsuariosP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //tarjetas de definicion
        setContentView(R.layout.activity_main);
        AgregarP = (CardView) findViewById(R.id.Agregar);
        EliminarP = (CardView) findViewById(R.id.Eliminar);
        EditarP = (CardView) findViewById(R.id.Editar);
        UsuariosP = (CardView) findViewById(R.id.Usuarios);
        //Añadir click listener a las tarjetas
        AgregarP.setOnClickListener(this);
        EliminarP.setOnClickListener(this);
        EditarP.setOnClickListener(this);
        UsuariosP.setOnClickListener(this);
    }
//El metodo onclick sera llamado cada vez que hagamos clic en Cardview
    @Override
    public void onClick(View v) {

        Intent i ;

        switch (v.getId()) {


            case R.id.Agregar: i = new Intent(this, Agregar.class); startActivity(i);break;
            case R.id.Eliminar: i = new Intent( this,Eliminar.class); startActivity(i);break;
            case R.id.Editar: i = new Intent( this, Editar.class); startActivity(i);break ;
            case R.id.Usuarios: i = new Intent( this,Usuarios.class);startActivity(i);break;
            default:break;
        }
    }
}
