package lanchonetedelicia.br.edu.ucsal.lanchonetedelicia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView)this.findViewById(R.id.list_view_produtos);

        final ArrayList<String> produtos_list = new ArrayList<String>();
        produtos_list.add("Suco de Fruta");
        produtos_list.add("Pao de Sal");
        produtos_list.add("Uva");
        produtos_list.add("Sanduíche");
        produtos_list.add("Big Mac");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,produtos_list);


        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent detalheActivity = new Intent(MainActivity.this, DetalheActivity.class);

                detalheActivity.putExtra("produto_nome", produtos_list.get(i));
                startActivity(detalheActivity);



            }
        });


    }
}
