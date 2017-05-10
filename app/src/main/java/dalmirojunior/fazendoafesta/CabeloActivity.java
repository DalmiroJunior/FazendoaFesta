package dalmirojunior.fazendoafesta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CabeloActivity extends AppCompatActivity {

    private String[] empresasCB = {"Empresa 1"};
    private ListView ListEmpresasCabelo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cabelo);
        ListEmpresasCabelo = (ListView) findViewById(R.id.ListEmpresasCabelo);


        Toolbar toolbar = (Toolbar) findViewById(R.id.customToolbar);
        toolbar.setTitle("Cabelo e Maquiagem");
        setSupportActionBar(toolbar);
        ArrayAdapter<String> adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, empresasCB);


        ListEmpresasCabelo.setAdapter(adapter);
        ListEmpresasCabelo.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    startActivity(new Intent(CabeloActivity.this, EmpresaCB1Activity.class));
                }
            }
        });

    }
}
