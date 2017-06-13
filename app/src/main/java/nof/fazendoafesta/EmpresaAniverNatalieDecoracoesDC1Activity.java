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

public class EmpresaAniverNatalieDecoracoesDC1Activity extends AppCompatActivity {

    private ImageButton callButton;
    private String phone = "32999253785";
    private FancyButton buttonLoc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_natalie_decoracoes_aniver_dc1);

        Toolbar toolbar = (Toolbar) findViewById(R.id.customToolbar);
        toolbar.setLogo(R.drawable.ic_voltar);
        toolbar.setTitle("Contato");
        setSupportActionBar(toolbar);

        buttonLoc = (FancyButton) findViewById(R.id.localizacao);
        buttonLoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                Intent it  = new Intent(EmpresaAniverNatalieDecoracoesDC1Activity.this, MapsActivity.class);
                Toast.makeText(EmpresaAniverNatalieDecoracoesDC1Activity.this, "Localização não disponível", Toast.LENGTH_SHORT).show();

            }
        });
    }

    public void ligar(){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        String ligar = "tel:" + phone;
        intent.setData(Uri.parse(ligar));
        startActivity(intent);
    }
    public void email(View view){

        Intent intent;

        intent  = new Intent(Intent.ACTION_SEND);
        intent.setData(Uri.parse("mailto:"));
        String[] to = {"natfumia1010@yahoo.com.br"};
        intent.putExtra(Intent.EXTRA_EMAIL, to);
        intent.putExtra(intent.EXTRA_SUBJECT, "Pedido de Orçamento");
        intent.putExtra(intent.EXTRA_TEXT, "");
        intent.setType("message/rfc822");
        Intent chooser = Intent.createChooser(intent, "Enviar email");
        startActivity(chooser);
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