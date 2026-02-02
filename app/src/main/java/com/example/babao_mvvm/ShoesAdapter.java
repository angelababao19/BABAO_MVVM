// ShoesAdapter.java
package com.example.babao_mvvm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ShoesAdapter extends RecyclerView.Adapter<ShoesAdapter.ShoesViewHolder> {

    private List<ShoesItems> shoesList = new ArrayList<>();

    @NonNull
    @Override
    public ShoesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.shoe_item_grid, parent, false);
        return new ShoesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ShoesViewHolder holder, int position) {
        ShoesItems currentShoe = shoesList.get(position);

        holder.shoeImageView.setImageResource(currentShoe.getImageDrawableId());
        holder.shoeNameTextView.setText(currentShoe.getName());
        holder.shoeBrandTextView.setText(currentShoe.getBrand());

        // Format the price with comma separators and Peso sign
        NumberFormat format = NumberFormat.getCurrencyInstance(new Locale("en", "PH"));
        String formattedPrice = format.format(currentShoe.getPrice());
        holder.shoePriceTextView.setText(formattedPrice);
    }

    @Override
    public int getItemCount() {
        return shoesList.size();
    }

    public void setShoesList(List<ShoesItems> shoesList) {
        this.shoesList = shoesList;
        notifyDataSetChanged();
    }

    // ViewHolder as a static inner class
    static class ShoesViewHolder extends RecyclerView.ViewHolder {
        ImageView shoeImageView;
        TextView shoeNameTextView;
        TextView shoeBrandTextView;
        TextView shoePriceTextView;

        public ShoesViewHolder(@NonNull View itemView) {
            super(itemView);
            shoeImageView = itemView.findViewById(R.id.shoeImageView);
            shoeNameTextView = itemView.findViewById(R.id.shoeNameTextView);
            shoeBrandTextView = itemView.findViewById(R.id.shoeBrandTextView);
            shoePriceTextView = itemView.findViewById(R.id.shoePriceTextView);
        }
    }
}
