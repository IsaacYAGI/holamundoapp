package orgname.com.holamundoapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnShowAlert_click(View vista){

        String numTlf = obtenerNumeroCelular();
        if (numTlf.isEmpty() || numTlf == null){
            numTlf = obtenerNumeroDeSubscriptor();
            if (numTlf.isEmpty() || numTlf == null)
                numTlf = "NO SE ENCONTRO EL NUMERO DE TELEFONO";

        }

        showAlert("Mensaje a mostrar","El numero de telefono es: " + numTlf);
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

    public String obtenerNumeroCelular(){
        TelephonyManager mTelephonyManager;
        mTelephonyManager = (TelephonyManager) getSystemService(this.TELEPHONY_SERVICE);
        return (String) mTelephonyManager.getLine1Number();
        //return "";
    }

    public String obtenerNumeroDeSubscriptor(){
        TelephonyManager mTelephonyManager;
        mTelephonyManager = (TelephonyManager) getSystemService(this.TELEPHONY_SERVICE);
        return (String) mTelephonyManager.getSubscriberId();
        //return "";
    }
}
