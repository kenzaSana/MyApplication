package com.example.kenzack.myapplication.model;


import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;


@DatabaseTable
public class Droit {
    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField(foreign = true, foreignAutoRefresh = true)
    private Image image;
    @DatabaseField(foreign = true, foreignAutoRefresh = true)
    private Image.Utilisateur utilisateur;
    @DatabaseField
    private Autorisation autorisation;

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Image.Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Image.Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Autorisation getAutorisation() {
        return autorisation;
    }

    public void setAutorisation(Autorisation autorisation) {
        this.autorisation = autorisation;
    }
}
