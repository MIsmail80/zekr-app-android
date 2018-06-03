package net.a15minute.zekr.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import net.a15minute.zekr.utils.JsonLoader;
import net.a15minute.zekr.R;
import net.a15minute.zekr.models.Zekr;

import java.util.ArrayList;

public class MainActivity extends AppBaseActivity {

    private static final String ACTIVITY_SABA7 = "saba7";
    private static final String ACTIVITY_MASAA = "masaa";

    private JsonLoader mJsonLoader;
    private ArrayList<Zekr> mAzkarList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Open saba7 list activity
    public void showSaba7List(View v) {
        mJsonLoader = new JsonLoader(v.getContext(), ACTIVITY_SABA7);
        mAzkarList = mJsonLoader.getAzkarList();
        openListActivity(mAzkarList, R.string.saba7_title);
    }

    // Open masaa list activity
    public void showMasaaList(View v) {
        mJsonLoader = new JsonLoader(v.getContext(), ACTIVITY_MASAA);
        mAzkarList = mJsonLoader.getAzkarList();
        openListActivity(mAzkarList, R.string.masaa_title);
    }

    // Start list activity
    public void openListActivity(ArrayList<Zekr> azkarList, int activityTitle) {
        Intent intent = new Intent(this, ListActivity.class);
        intent.putExtra("azkarList", azkarList);
        intent.putExtra("title", activityTitle);
        startActivity(intent);
    }

}
