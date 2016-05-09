package com.example.kenzack.myapplication;


import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;


@DatabaseTable
public class Droit {
    @DatabaseField(foreign = true, foreignAutoRefresh = true)
    private Image image;
    @DatabaseField(foreign = true, foreignAutoRefresh = true)
    private Utilisateur utilisateur;
    private Autorisation autorisation;

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Autorisation getAutorisation() {
        return autorisation;
    }

    public void setAutorisation(Autorisation autorisation) {
        this.autorisation = autorisation;
    }
}
