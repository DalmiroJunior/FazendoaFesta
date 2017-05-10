package dalmirojunior.fazendoafesta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DecoracaoAniverActivity extends AppCompatActivity {

    private String[] EmpresasAniver = {"Empresa 1"};
    private ListView ListEmpresasAniver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decoracao_aniver);
        ListEmpresasAniver = (ListView) findViewById(R.id.ListEmpresasAniver);

        Toolbar toolbar = (Toolbar) findViewById(R.id.customToolbar);
        toolbar.setTitle("Decoração 15 anos");
        setSupportActionBar(toolbar);

        ArrayAdapter<String> adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, EmpresasAniver);
        ListEmpresasAniver.setAdapter(adapter);
        ListEmpresasAniver.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    startActivity(new Intent(DecoracaoAniverActivity.this, EmpresaAniverDC1Activity.class));
                }
            }
        });

    }
}