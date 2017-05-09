package dalmirojunior.fazendoafesta;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class EmpresaInfSG1Activity extends AppCompatActivity {

    private ImageButton callButton;
    private String phone = "32999999999";
    private Button buttonLoc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empresa_inf_sg1);

        Toolbar toolbar = (Toolbar) findViewById(R.id.customToolbar);
        toolbar.setTitle("Contato");
        setSupportActionBar(toolbar);

        callButton = (ImageButton) findViewById(R.id.imageButtonLigar);
        callButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ligar();
            }
        });



        buttonLoc = (Button) findViewById(R.id.localizacao);
        buttonLoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                Intent it  = new Intent(EmpresaInfSG1Activity.this, MapsActivity.class);
                it.putExtra("latitude",-21.193700);
                it.putExtra("longitude",-41.906493);
                it.putExtra("nome", "Empresa 1");
                startActivity(it);
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
        String[] to = {"contato@empresa.com"};
        intent.putExtra(Intent.EXTRA_EMAIL, to);
        intent.putExtra(intent.EXTRA_SUBJECT, "Pedido de Orçamento");
        intent.putExtra(intent.EXTRA_TEXT, "");
        intent.setType("message/rfc822");
        Intent chooser = Intent.createChooser(intent, "Enviar email");
        startActivity(chooser);
    }
}
