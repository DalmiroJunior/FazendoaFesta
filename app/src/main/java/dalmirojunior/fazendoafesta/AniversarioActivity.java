package dalmirojunior.fazendoafesta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class AniversarioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aniversario);

        Toolbar toolbar = (Toolbar) findViewById(R.id.customToolbar);
        setSupportActionBar(toolbar);
    }
}