package net.a15minute.zekr.utils;

import android.content.Context;

import com.google.gson.Gson;

import net.a15minute.zekr.models.Zekr;
import net.a15minute.zekr.models.ZekrResponseList;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class JsonLoader {

    private String mJson;
    private ZekrResponseList mAzkarList;

    public JsonLoader(Context context, String fileName) {
        try {
            InputStream inputStream = context.getAssets().open("data/" + fileName + ".json");
            int size = inputStream.available();
            byte[] buffer = new byte[size];
            inputStream.read(buffer);
            inputStream.close();
            this.mJson = new String(buffer, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getJsonString() {
        return this.mJson;
    }

    public ArrayList<Zekr> getAzkarList() {
        this.mAzkarList = new Gson().fromJson(this.mJson, ZekrResponseList.class);
        return this.mAzkarList.azkar;
    }
}
