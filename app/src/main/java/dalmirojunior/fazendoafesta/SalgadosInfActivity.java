package dalmirojunior.fazendoafesta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SalgadosInfActivity extends AppCompatActivity {

    private String[] empresaS = {"Empresa 1","Empresa 2","Empresa 3","Empresa 4","Empresa 5"};
    private ListView ListEmpresaSalgados;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salgados_inf);
        ListEmpresaSalgados = (ListView) findViewById(R.id.ListEmpresaSalgadosInf);

        Toolbar toolbar = (Toolbar) findViewById(R.id.customToolbar);
        toolbar.setTitle("Empresas");
        setSupportActionBar(toolbar);
        // ArrayAdapter<String> adapter = new ArrayAdapter(getApplicationContext(),
        ArrayAdapter<String> adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, empresaS);

        ListEmpresaSalgados.setAdapter(adapter);
        ListEmpresaSalgados.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    startActivity(new Intent(SalgadosInfActivity.this, EmpresaInfSG1Activity.class));
                }else if(position == 1){
                    startActivity(new Intent(SalgadosInfActivity.this, ConstrucaoActivity.class));
                }else if(position == 2){
                    startActivity(new Intent(SalgadosInfActivity.this, ConstrucaoActivity.class));
                }else if(position == 3){
                    startActivity(new Intent(SalgadosInfActivity.this, ConstrucaoActivity.class));
                }else if(position == 4){
                    startActivity(new Intent(SalgadosInfActivity.this, ConstrucaoActivity.class));
                }
            }
        });

    }
}