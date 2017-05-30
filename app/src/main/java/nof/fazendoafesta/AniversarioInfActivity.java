package nof.fazendoafesta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AniversarioInfActivity extends AppCompatActivity {

    private String[] aniversarioInf = {"Decoração","Bolo","Doces","Convites","Salgados"};
    private ListView ListAniversarioInf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aniversario_inf);
        ListAniversarioInf = (ListView) findViewById(R.id.ListAniversarioInf);


        Toolbar toolbar = (Toolbar) findViewById(R.id.customToolbar);
        toolbar.setTitle("Aniversario Infantil");
        setSupportActionBar(toolbar);
        // ArrayAdapter<String> adapter = new ArrayAdapter(getApplicationContext(),
        ArrayAdapter<String> adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, aniversarioInf);

        ListAniversarioInf.setAdapter(adapter);
        ListAniversarioInf.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    startActivity(new Intent(AniversarioInfActivity.this, DecoracaoInfActivity.class));
                }else if(position == 1){
                    startActivity(new Intent(AniversarioInfActivity.this, BoloInfActivity.class));
                }else if(position == 2){
                    startActivity(new Intent(AniversarioInfActivity.this, DocesInfActivity.class));
                }else if(position == 3) {
                    startActivity(new Intent(AniversarioInfActivity.this, ConvitesInfActivity.class));
                }else if(position == 4) {
                    startActivity(new Intent(AniversarioInfActivity.this, SalgadosInfActivity.class));
                }
            }
        });

        }
}
