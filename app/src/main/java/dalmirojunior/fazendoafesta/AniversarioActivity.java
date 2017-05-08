package dalmirojunior.fazendoafesta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AniversarioActivity extends AppCompatActivity {

    private String[] aniversario = {"Decoração","Bolo","Doces","Convites","Salgados"};
    private ListView ListAniversario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aniversario);
        ListAniversario = (ListView) findViewById(R.id.ListAniversario);

        Toolbar toolbar = (Toolbar) findViewById(R.id.customToolbar);
        toolbar.setTitle("Aniversario 15 anos");
        setSupportActionBar(toolbar);
        // ArrayAdapter<String> adapter = new ArrayAdapter(getApplicationContext(),
        ArrayAdapter<String> adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, aniversario);

        ListAniversario.setAdapter(adapter);
        ListAniversario.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    startActivity(new Intent(AniversarioActivity.this, DecoracaoAniverActivity.class));
                }else if(position == 1){
                    startActivity(new Intent(AniversarioActivity.this, BoloAniverActivity.class));
                }else if(position == 2){
                    startActivity(new Intent(AniversarioActivity.this, DocesAniverActivity.class));
                }else if(position == 3) {
                    startActivity(new Intent(AniversarioActivity.this, ConvitesAniverActivity.class));
                }else if(position == 4) {
                    startActivity(new Intent(AniversarioActivity.this, SalgadoAniverActivity.class));
                }
            }
        });

    }
}