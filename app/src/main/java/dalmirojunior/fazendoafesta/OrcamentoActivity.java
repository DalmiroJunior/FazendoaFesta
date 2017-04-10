package dalmirojunior.fazendoafesta;

        import android.app.Activity;
        import android.app.DatePickerDialog;
        import android.app.Dialog;
        import android.os.Bundle;
        import android.view.View;
        import android.view.View.OnClickListener;
        import android.widget.DatePicker;
        import android.widget.EditText;

        import java.util.Calendar;

public class OrcamentoActivity extends Activity {

    EditText editText3;

    private int mYear;
    private int mMonth;
    private int mDay;

    static final int DATE_DIALOG_ID = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orcamento);

        editText3 = (EditText) findViewById(R.id.editText3);

        editText3.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                showDialog(DATE_DIALOG_ID);

            }
        });

    }

    @Override
    protected Dialog onCreateDialog(int id) {

        switch (id) {
            case DATE_DIALOG_ID:

                Calendar dataAtual = Calendar.getInstance();
                return new DatePickerDialog(this, mDateSetListener, dataAtual.get(Calendar.YEAR), dataAtual.get(Calendar.MONTH),
                        dataAtual.get(Calendar.DAY_OF_MONTH));
        }
        return null;
    }

    private DatePickerDialog.OnDateSetListener mDateSetListener = new DatePickerDialog.OnDateSetListener() {

        public void onDateSet(DatePicker view, int year, int monthOfYear,
                              int dayOfMonth) {
            mYear = year;
            mMonth = monthOfYear;
            mDay = dayOfMonth;
            editText3.setText(dayOfMonth + "/" + monthOfYear + "/" + year);
        }
    };
}

