package nof.fazendoafesta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ConvitesActivity extends AppCompatActivity {

    private String[] empresasB = {"Empresa 1"};
    private ListView ListEmpresasConvites;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convites);
        ListEmpresasConvites = (ListView) findViewById(R.id.ListEmpresasConvites);


        Toolbar toolbar = (Toolbar) findViewById(R.id.customToolbar);
        toolbar.setTitle("Convites Casamento");
        setSupportActionBar(toolbar);
        ArrayAdapter<String> adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, empresasB);


        ListEmpresasConvites.setAdapter(adapter);
        ListEmpresasConvites.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    startActivity(new Intent(ConvitesActivity.this, EmpresaCV1Activity.class));
                }
            }
        });

    }
}