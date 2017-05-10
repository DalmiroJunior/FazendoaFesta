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

private String[] empresasB = {"Empresa 1"};
private ListView ListEmpresasBolo;
@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bolo);
    ListEmpresasBolo = (ListView) findViewById(R.id.ListEmpresaBolos);


        Toolbar toolbar = (Toolbar) findViewById(R.id.customToolbar);
        toolbar.setTitle("Bolo Casamento");
        setSupportActionBar(toolbar);
        ArrayAdapter<String> adapter = new ArrayAdapter(this,
        android.R.layout.simple_list_item_1, empresasB);


    ListEmpresasBolo.setAdapter(adapter);
    ListEmpresasBolo.setOnItemClickListener(new AdapterView.OnItemClickListener() {


        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            if (position == 0){
                startActivity(new Intent(BoloActivity.this, EmpresaBL1Activity.class));
            }
        }
    });

}
}
