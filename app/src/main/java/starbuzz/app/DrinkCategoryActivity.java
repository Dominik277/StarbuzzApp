package starbuzz.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class DrinkCategoryActivity extends AppCompatActivity {

    ListView listViewCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_category);

        listViewCategory = findViewById(R.id.lisViewCategory);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Latte");
        arrayList.add("Cappuccino");
        arrayList.add("Filter");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this
                , android.R.layout.simple_list_item_1,arrayList);
        listViewCategory.setAdapter(arrayAdapter);

        listViewCategory.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(DrinkCategoryActivity.this,DrinkActivity.class);
                startActivity(intent);
            }
        });

    }
}