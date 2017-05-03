package dalmirojunior.fazendoafesta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class BoloActivity extends AppCompatActivity {

private String[] empresasB = {"Empresa 1","Empresa 2","Empresa 3","Empresa 4","Empresa 5"};
private ListView ListEmpresasBolo;
@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bolo);
    ListEmpresasBolo = (ListView) findViewById(R.id.ListEmpresaBolos);


        Toolbar toolbar = (Toolbar) findViewById(R.id.customToolbar);
        toolbar.setTitle("Bolo");
        setSupportActionBar(toolbar);
        ArrayAdapter<String> adapter = new ArrayAdapter(this,
        android.R.layout.simple_list_item_1, empresasB);


    ListEmpresasBolo.setAdapter(adapter);
    ListEmpresasBolo.setOnItemClickListener(new AdapterView.OnItemClickListener() {


        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            if (position == 0){
                startActivity(new Intent(BoloActivity.this, EmpresaBL1Activity.class));
            }else if(position == 1){
                startActivity(new Intent(BoloActivity.this, ConstrucaoActivity.class));
            }else if(position == 2){
                startActivity(new Intent(BoloActivity.this, ConstrucaoActivity.class));
            }else if(position == 3){
                startActivity(new Intent(BoloActivity.this, ConstrucaoActivity.class));
            }else if(position == 4){
                startActivity(new Intent(BoloActivity.this, ConstrucaoActivity.class));
            }
        }
    });

}
}
