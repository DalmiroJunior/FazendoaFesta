package dalmirojunior.fazendoafesta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CasamentoActivity extends AppCompatActivity {

    private String[] casamento = {"Empresa 1","Empresa 2","Empresa 3","Empresa 4","Empresa 5"};
    private ListView listViewCasamento;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_casamento);
        // ArrayAdapter<String> adapter = new ArrayAdapter(getApplicationContext(),
        ArrayAdapter<String> adapter = new ArrayAdapter(getApplicationContext(),
                android.R.layout.simple_list_item_1, casamento);

        listViewCasamento.setAdapter(adapter);
        listViewCasamento.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    startActivity(new Intent(CasamentoActivity.this, CasamentoActivity.class));
                }else if(position == 1){
                    startActivity(new Intent(CasamentoActivity.this, ConstrucaoActivity.class));
                }else if(position == 2){
                    startActivity(new Intent(CasamentoActivity.this, ConstrucaoActivity.class));
                }else if(position == 3){
                startActivity(new Intent(CasamentoActivity.this, ConstrucaoActivity.class));
                 }else if(position == 4){
                    startActivity(new Intent(CasamentoActivity.this, ConstrucaoActivity.class));
                 }


            }
        });

    }
}
