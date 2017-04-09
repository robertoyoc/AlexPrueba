package mx.com.talentics.alexprueba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    private TextView Texto;
    private  Button Boton1, Boton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Texto = (TextView) findViewById(R.id.textView);
        Boton1 = (Button) findViewById(R.id.button1);
        Boton2 = (Button) findViewById(R.id.button2);


    }

    @Override
    public void onClick(View v){
        Texto.setText("Hola Ya le di click");
    }
}
