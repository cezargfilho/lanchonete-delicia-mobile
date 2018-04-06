package lanchonetedelicia.br.edu.ucsal.lanchonetedelicia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class DetalheActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);


        TextView textView = findViewById(R.id.textoProduto);
       String prod =  getIntent().getStringExtra("produto_nome");

        textView.setText(prod);
    }
}
