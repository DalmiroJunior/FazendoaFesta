package nof.fazendoafesta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DecoracaoActivity extends AppCompatActivity {

    private String[] servicosCas = {"Natalie Decorações"};
    private ListView ListViewServicosCas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decoracao);
        ListViewServicosCas = (ListView) findViewById(R.id.ListServicos);


        Toolbar toolbar = (Toolbar) findViewById(R.id.customToolbar);
        toolbar.setTitle("Decoração Casamento");
        setSupportActionBar(toolbar);
        ArrayAdapter<String> adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, servicosCas);
        ListViewServicosCas.setAdapter(adapter);
        ListViewServicosCas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    startActivity(new Intent(DecoracaoActivity.this, EmpresaNatalieDecoracoesDC1Activity.class));
                }
            }
        });

    }
}
