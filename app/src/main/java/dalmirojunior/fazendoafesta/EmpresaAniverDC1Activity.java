package dalmirojunior.fazendoafesta;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class EmpresaAniverDC1Activity extends AppCompatActivity {

    private ImageButton callButton;
    private String phone = "32999999999";
    private Button ButtonIr;
    private Button buttonLoc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empresa_dc1_aniver);

        Toolbar toolbar = (Toolbar) findViewById(R.id.customToolbar);
        toolbar.setLogo(R.drawable.ic_voltar);
        toolbar.setTitle("Contato");
        setSupportActionBar(toolbar);

        callButton = (ImageButton) findViewById(R.id.imageButtonLigarAniver);
        callButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ligar();
            }
        });

        ButtonIr = (Button) findViewById(R.id.orcamento);
        ButtonIr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EmpresaAniverDC1Activity.this, OrcamentoActivity.class));
            }
        });

        buttonLoc = (Button) findViewById(R.id.localizacao);
        buttonLoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                Intent it  = new Intent(EmpresaAniverDC1Activity.this, MapsActivity.class);
                it.putExtra("latitude",-21.193700);
                it.putExtra("longitude",-41.906493);
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
}