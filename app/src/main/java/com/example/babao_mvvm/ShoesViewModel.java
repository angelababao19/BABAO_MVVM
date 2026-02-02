// ShoesViewModel.java
package com.example.babao_mvvm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.util.ArrayList;
import java.util.List;

public class ShoesViewModel extends ViewModel {

    private MutableLiveData<List<ShoesItems>> shoesList;

    public LiveData<List<ShoesItems>> getShoesList() {
        if (shoesList == null) {
            shoesList = new MutableLiveData<>();
            loadShoes();
        }
        return shoesList;
    }

    private void loadShoes() {
        ArrayList<ShoesItems> list = new ArrayList<>();

        // Adidas
        list.add(new ShoesItems("Adizero EVO SL", "Adidas", 8500, R.drawable.adidas1));
        list.add(new ShoesItems("Supernova Prima 2", "Adidas", 8000, R.drawable.adidas2));
        list.add(new ShoesItems("Adizero ADIOS PRO 4", "Adidas", 13000, R.drawable.adidas3));

        // Asics
        list.add(new ShoesItems("Novablast 5 Lite-Show", "Asics", 9490, R.drawable.asics1));
        list.add(new ShoesItems("Gel-Nimbus 28", "Asics", 11090, R.drawable.asics2));
        list.add(new ShoesItems("Gel-Kayano 32", "Asics", 11090, R.drawable.asics3));

        // Hoka
        list.add(new ShoesItems("Skyflow", "Hoka", 6996, R.drawable.hoka1));
        list.add(new ShoesItems("Gaviota 6", "Hoka", 10995, R.drawable.hoka2));
        list.add(new ShoesItems("Clifton 10", "Hoka", 5596, R.drawable.hoka3));

        // New Balance
        list.add(new ShoesItems("Fresh Foam X More v6", "New Balance", 9421, R.drawable.newb1));
        list.add(new ShoesItems("FuelCell Rebel v5", "New Balance", 8538, R.drawable.newb2));
        list.add(new ShoesItems("FuelCell SuperComp Trainer v3", "New Balance", 11188, R.drawable.newb3));

        // Nike
        list.add(new ShoesItems("Nike Pegasus Premium", "Nike", 11995, R.drawable.nike1));
        list.add(new ShoesItems("Nike Vomero Plus", "Nike", 9395, R.drawable.nike2));
        list.add(new ShoesItems("Nike Zoom Fly 6", "Nike", 9395, R.drawable.nike3));

        shoesList.setValue(list);
    }
}
