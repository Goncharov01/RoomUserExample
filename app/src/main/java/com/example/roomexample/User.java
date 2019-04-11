package com.example.roomexample;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "users")
public class User {

    @PrimaryKey
    private int _id;

    @ColumnInfo(name = "name")
    private String _name;

    @ColumnInfo(name = "email")
    private String _email;

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        this._id = id;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_email() {
        return _email;
    }

    public void set_email(String _email) {
        this._email = _email;
    }
}
