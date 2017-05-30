package nof.fazendoafesta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ConvitesInfActivity extends AppCompatActivity {

    private String[] empresasC = {"Empresa 1"};
    private ListView ListEmpresasConvites;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convites_inf);
        ListEmpresasConvites = (ListView) findViewById(R.id.ListEmpresasConvitesInf);


        Toolbar toolbar = (Toolbar) findViewById(R.id.customToolbar);
        toolbar.setTitle("Convite Infantil");
        setSupportActionBar(toolbar);
        ArrayAdapter<String> adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, empresasC);


        ListEmpresasConvites.setAdapter(adapter);
        ListEmpresasConvites.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    startActivity(new Intent(ConvitesInfActivity.this, EmpresaInfCV1Activity.class));
                }
            }
        });

    }
}
