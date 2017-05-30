package nof.fazendoafesta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DocesInfActivity extends AppCompatActivity {

    private String[] empresasB = {"Mania de doce"};
    private ListView ListEmpresasBuffet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doces_inf);
        ListEmpresasBuffet = (ListView) findViewById(R.id.ListEmpresaDoceInf);


        Toolbar toolbar = (Toolbar) findViewById(R.id.customToolbar);
        toolbar.setTitle("Doce Infantil");
        setSupportActionBar(toolbar);
        ArrayAdapter<String> adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, empresasB);


        ListEmpresasBuffet.setAdapter(adapter);
        ListEmpresasBuffet.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    startActivity(new Intent(DocesInfActivity.this, EmpresaManiaDoDoceActivity.class));
                }
            }
        });

    }
}