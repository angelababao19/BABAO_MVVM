// MainActivity.java
package com.example.babao_mvvm;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private ShoesViewModel shoesViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.shoesRecyclerView);
        // Use a GridLayoutManager with 2 columns
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        final ShoesAdapter adapter = new ShoesAdapter();
        recyclerView.setAdapter(adapter);

        // Get the ViewModel
        shoesViewModel = new ViewModelProvider(this).get(ShoesViewModel.class);

        // Observe the LiveData for changes
        shoesViewModel.getShoesList().observe(this, shoes -> {
            // Update the adapter's data when the list changes
            adapter.setShoesList(shoes);
        });
    }
}
