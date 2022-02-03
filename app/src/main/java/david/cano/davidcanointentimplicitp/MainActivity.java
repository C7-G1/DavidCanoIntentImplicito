package david.cano.davidcanointentimplicitp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onEjecutar(View v){
        Intent i = new Intent();
        switch(v.getId()) {
            case R.id.btBateria:

                i.setAction(Intent.ACTION_POWER_USAGE_SUMMARY);
                startActivity(i);
                break;
            case R.id.btNavegador:
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.youtube.com"));
                startActivity(i);
                break;
            case R.id.btGaleria:
                i.setAction(Intent.ACTION_GET_CONTENT);
                i.setType("image/*");
                startActivity(i);
                break;
            case R.id.btSMS:
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("sms: 5553344"));
                startActivity(i);
                break;
            case R.id.btMarcacion:
                i.setAction(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:5554433"));
                startActivity(i);
                break;
            case R.id.btLlamada:
                i.setAction(Intent.ACTION_CALL);
                i.setData(Uri.parse("tel:5554433"));
                startActivity(i);
        }
    }
}