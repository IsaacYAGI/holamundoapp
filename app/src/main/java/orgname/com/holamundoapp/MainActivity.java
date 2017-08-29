package orgname.com.holamundoapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnShowAlert_click(View vista){

        showAlert("Mensaje a mostrar","Mensaje");
    }

    public void showAlert(String titulo, String mensaje){
        AlertDialog msjAD = new AlertDialog.Builder(this).create();
        msjAD.setTitle(titulo);
        msjAD.setMessage(mensaje);
        msjAD.setButton(DialogInterface.BUTTON_NEUTRAL, "Cerrar", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int which){

            }
        });
        msjAD.show();
    }
}
