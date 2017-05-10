package dalmirojunior.fazendoafesta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class BuffetActivity extends AppCompatActivity {

    private String[] empresasBF = {"Empresa 1"};
    private ListView ListEmpresasBuffet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buffet);
        ListEmpresasBuffet = (ListView) findViewById(R.id.ListEmpresaBuffet);


        Toolbar toolbar = (Toolbar) findViewById(R.id.customToolbar);
        toolbar.setTitle("Buffet Casamento");
        setSupportActionBar(toolbar);
        ArrayAdapter<String> adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, empresasBF);


        ListEmpresasBuffet.setAdapter(adapter);
        ListEmpresasBuffet.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    startActivity(new Intent(BuffetActivity.this, EmpresaBF1Activity.class));
                }
            }
        });

    }
}