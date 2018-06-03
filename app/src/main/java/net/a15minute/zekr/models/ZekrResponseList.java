package net.a15minute.zekr.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class ZekrResponseList {
    @SerializedName("azkar")
    public ArrayList<Zekr> azkar;
}
