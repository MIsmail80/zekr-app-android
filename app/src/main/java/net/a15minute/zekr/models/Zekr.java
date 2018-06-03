package net.a15minute.zekr.models;

import java.io.Serializable;

public class Zekr implements Serializable{
    private int id;
    private String meta;
    private String content;

    public Zekr(int id, String meta, String content) {
        this.id = id;
        this.meta = meta;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public String getMeta() {
        return meta;
    }

    public String getContent() {
        return content;
    }
}
