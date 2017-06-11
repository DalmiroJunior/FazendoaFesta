package nof.fazendoafesta;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import mehdi.sakout.fancybuttons.FancyButton;

public class EmpresaAniverJuSouzaMakeupActivity extends AppCompatActivity {

    private ImageButton callButton;
    private String phone = "32999701437";
    private FancyButton buttonLoc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empresa_aniver_ju_souza_makeup);

        Toolbar toolbar = (Toolbar) findViewById(R.id.customToolbar);
        toolbar.setTitle("Contato");
        setSupportActionBar(toolbar);

        buttonLoc = (FancyButton) findViewById(R.id.localizacao);
        buttonLoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                Intent it  = new Intent(EmpresaAniverJuSouzaMakeupActivity.this, MapsActivity.class);
                it.putExtra("latitude",-20.605480);
                it.putExtra("longitude",-42.140708);
                it.putExtra("nome", "Júh Souza Makeup");
                startActivity(it);
            }
        });
    }

    public void email(View view){

        Intent intent;

        intent  = new Intent(Intent.ACTION_SEND);
        Intent chooser = Intent.createChooser(intent, "Enviar email");
        Toast.makeText(this, "Email não disponivel", Toast.LENGTH_SHORT).show();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_ligar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.buttonLigar:
                Intent intent = new Intent(Intent.ACTION_DIAL);
                String ligar = "tel:" + phone;
                intent.setData(Uri.parse(ligar));
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}