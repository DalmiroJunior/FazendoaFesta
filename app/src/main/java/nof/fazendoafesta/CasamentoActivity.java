package nof.fazendoafesta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CasamentoActivity extends AppCompatActivity {

    private String[] casamento = {"Decoração","Buffet","Bolo","Convites","Cabelo e Maquiagem"};
    private ListView ListViewCasamento;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_casamento);
        ListViewCasamento = (ListView) findViewById(R.id.ListCasamento);

        Toolbar toolbar = (Toolbar) findViewById(R.id.customToolbar);
        toolbar.setTitle("Casamento");
        setSupportActionBar(toolbar);
        // ArrayAdapter<String> adapter = new ArrayAdapter(getApplicationContext(),
        ArrayAdapter<String> adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, casamento);

        ListViewCasamento.setAdapter(adapter);
        ListViewCasamento.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    startActivity(new Intent(CasamentoActivity.this, DecoracaoActivity.class));
                }else if(position == 1){
                    startActivity(new Intent(CasamentoActivity.this, BuffetActivity.class));
                }else if(position == 2){
                    startActivity(new Intent(CasamentoActivity.this, BoloActivity.class));
                }else if(position == 3){
                    startActivity(new Intent(CasamentoActivity.this, ConvitesActivity.class));
                }else if(position == 4){
                    startActivity(new Intent(CasamentoActivity.this, CabeloActivity.class));
                }
            }
        });

    }
}
