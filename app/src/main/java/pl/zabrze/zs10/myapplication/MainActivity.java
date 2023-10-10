package pl.zabrze.zs10.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int liczbaZnalezionych =0;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textViewPolecenie);
    }

    public void odpowiedzNo(View view) {
        Toast.makeText(this, R.string.ostrzezenie, Toast.LENGTH_SHORT).show();
    }

    public void odpowiedzOk(View view) {
        view.setVisibility(View.INVISIBLE);
        Toast.makeText(this, "Ok", Toast.LENGTH_SHORT).show();
        liczbaZnalezionych++;
        if(liczbaZnalezionych == 4){
            //zmienic napis
            textView.setText("Test zakończono, otrzymano flagę Polski");
        }
    }
}