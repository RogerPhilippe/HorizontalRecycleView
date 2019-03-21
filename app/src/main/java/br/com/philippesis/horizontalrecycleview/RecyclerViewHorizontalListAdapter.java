package br.com.philippesis.horizontalrecycleview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class RecyclerViewHorizontalListAdapter extends
        RecyclerView.Adapter<RecyclerViewHorizontalListAdapter.GroceryViewHolder> {

    private List<Grocery> horizontalGrocderyList;
    Context context;

    public RecyclerViewHorizontalListAdapter(List<Grocery> horizontalGrocderyList, Context context){
        this.horizontalGrocderyList= horizontalGrocderyList;
        this.context = context;
    }

    @Override
    public GroceryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflate the layout file
        View groceryProductView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.horizontal_list_grocery_item, parent, false);
        GroceryViewHolder gvh = new GroceryViewHolder(groceryProductView);
        return gvh;
    }

    @Override
    public void onBindViewHolder(GroceryViewHolder holder, final int position) {
        holder.txtname.setText(horizontalGrocderyList.get(position).getProductName());
        holder.txtdesc.setText(horizontalGrocderyList.get(position).getProductName());

//        holder.imageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String productName = horizontalGrocderyList.get(position).getProductName().toString();
//                Toast.makeText(context, productName + " is selected", Toast.LENGTH_SHORT).show();
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return horizontalGrocderyList.size();
    }

    public class GroceryViewHolder extends RecyclerView.ViewHolder {

        TextView txtname;
        TextView txtdesc;

        public GroceryViewHolder(View view) {
            super(view);
            txtname=view.findViewById(R.id.id_product_1);
            txtdesc=view.findViewById(R.id.id_product_2);
        }
    }
}
