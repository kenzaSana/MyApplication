package com.example.kenzack.myapplication;

/**
 * Created by KenZack on 09/05/2016.
 */
import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Collection;

/**
 * Created by zaziouiz on 07/05/2016.
 */
@DatabaseTable
public class Utilisateur {
    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField
    private String login;
    @DatabaseField
    private String hashedPasswd;
    @ForeignCollectionField
    ForeignCollection<Image> imagesCrees;

    public ForeignCollection<Image> getImagesCree() {
        return imagesCrees;
    }

    public void setImagesCree(ForeignCollection<Image> imagesCree) {
        this.imagesCrees = imagesCree;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getHashedPasswd() {
        return hashedPasswd;
    }

    public void setHashedPasswd(String hashedPasswd) {
        this.hashedPasswd = hashedPasswd;
    }
}
