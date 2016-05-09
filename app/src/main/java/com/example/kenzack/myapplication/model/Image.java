package com.example.kenzack.myapplication.model;

/**
 * Created by KenZack on 09/05/2016.
 */
import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;


@DatabaseTable
public class Image {
    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField
    private String nom;
    @DatabaseField(dataType= DataType.BYTE_ARRAY,columnDefinition = "LONGBLOB")
    private byte[] image;
    @DatabaseField(foreign = true, foreignAutoRefresh = true)
    private Utilisateur proprietaire;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Utilisateur getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Utilisateur proprietaire) {
        this.proprietaire = proprietaire;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    /**
     * Created by zaziouiz on 07/05/2016.
     */
    @DatabaseTable
    public static class Utilisateur {
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
}

