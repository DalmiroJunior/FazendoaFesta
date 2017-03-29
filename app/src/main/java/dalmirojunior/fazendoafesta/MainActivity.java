package dalmirojunior.fazendoafesta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private String [] eventos = {"Casamento","Aniversario infantil", "Aniversario de 15 anos"};
    private ListView listViewEventos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listViewEventos = (ListView) findViewById(R.id.ListEventos);

        // ArrayAdapter<String> adapter = new ArrayAdapter(getApplicationContext(),
        ArrayAdapter<String> adapter = new ArrayAdapter(getApplicationContext(),
                android.R.layout.simple_list_item_1, eventos);

        listViewEventos.setAdapter(adapter);
        listViewEventos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    startActivity(new Intent(MainActivity.this, CasamentoActivity.class));
                }else if(position == 1){
                    startActivity(new Intent(MainActivity.this, AniversarioInfActivity.class));
                }else{
                    startActivity(new Intent(MainActivity.this, AniversarioActivity.class));
                }


            }
        });

    }
}
