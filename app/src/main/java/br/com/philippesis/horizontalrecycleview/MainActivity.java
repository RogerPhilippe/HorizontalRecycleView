package br.com.philippesis.horizontalrecycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Grocery> groceryList = new ArrayList<>();
    private RecyclerView groceryRecyclerView;
    private RecyclerViewHorizontalListAdapter groceryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        groceryRecyclerView = findViewById(R.id.id_recycle_view);
        // add a divider after each item for more clarity
        groceryRecyclerView.addItemDecoration(new DividerItemDecoration(MainActivity.this,
                LinearLayoutManager.HORIZONTAL));
        groceryAdapter = new RecyclerViewHorizontalListAdapter(groceryList, getApplicationContext());
        LinearLayoutManager horizontalLayoutManager = new LinearLayoutManager(MainActivity.this,
                LinearLayoutManager.HORIZONTAL, false);
        groceryRecyclerView.setLayoutManager(horizontalLayoutManager);
        groceryRecyclerView.setAdapter(groceryAdapter);
        populategroceryList();

    }

    private void populategroceryList(){
        Grocery potato = new Grocery("Potato", "Produto de outono");
        Grocery onion = new Grocery("Onion", "Origen do Sul");
        Grocery cabbage = new Grocery("Cabbage", "Desconhecido");
        Grocery cauliflower = new Grocery("Cauliflower", "Verdejante");
        groceryList.add(potato);
        groceryList.add(onion);
        groceryList.add(cabbage);
        groceryList.add(cauliflower);
        groceryAdapter.notifyDataSetChanged();
    }

}
