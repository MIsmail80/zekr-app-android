package net.a15minute.zekr.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import net.a15minute.zekr.R;
import net.a15minute.zekr.models.Zekr;
import net.a15minute.zekr.adapters.ZekrAdapter;

import java.util.ArrayList;

public class ListActivity extends AppBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Intent intent = getIntent();

        // Get activity title
        int title = intent.getIntExtra("title", R.string.app_name);
        setTitle(title);

        // Get the Intent that started this activity and extract the string
        ArrayList<Zekr> azkarList = (ArrayList<Zekr>) intent.getSerializableExtra("azkarList");

        ZekrAdapter zekrAdapter = new ZekrAdapter(this, azkarList);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.azkar_list);
        listView.setAdapter(zekrAdapter);
    }
}
