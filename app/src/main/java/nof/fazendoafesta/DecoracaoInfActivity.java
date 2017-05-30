package nof.fazendoafesta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DecoracaoInfActivity extends AppCompatActivity {

    private String[] EmpresasInf = {"Natalie Decorações","Camila Festas"};
    private ListView ListEmpresasInfa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decoracao_inf);
        ListEmpresasInfa = (ListView) findViewById(R.id.ListEmpresasInf);


        Toolbar toolbar = (Toolbar) findViewById(R.id.customToolbar);
        toolbar.setTitle("Decoração Infantil");
        setSupportActionBar(toolbar);

        ArrayAdapter<String> adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, EmpresasInf);
        ListEmpresasInfa.setAdapter(adapter);
        ListEmpresasInfa.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    startActivity(new Intent(DecoracaoInfActivity.this, EmpresaInfNatalieDecoracoesDC1Activity.class));
                }else if (position == 1){
                    startActivity(new Intent(DecoracaoInfActivity.this, EmpresaInfCamilaFestasDC2Activity.class));
                }
            }
        });

    }
}