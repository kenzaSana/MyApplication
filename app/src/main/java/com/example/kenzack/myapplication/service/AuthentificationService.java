package com.example.kenzack.myapplication.service;

import com.example.kenzack.myapplication.Utils.HashUtils;
import com.example.kenzack.myapplication.model.Image;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;

/**
 * Created by aziouiz on 10/05/16.
 */
public class AuthentificationService {
    private final String DB_NAME = "DEV";
    private final String LOGIN_MYSQL = "root";
    private final String PASSWORD_MYSQL = "helix";
    private final String IP_MYSQL = "localhost";
    private ConnectionSource connectionSource;
    private Dao<Image.Utilisateur, Integer> utilisateurDao;

    public AuthentificationService(){
        try {
            String url = "jdbc:mysql://" + IP_MYSQL + ":3306/DEV";
            connectionSource = new JdbcConnectionSource(url, LOGIN_MYSQL, PASSWORD_MYSQL);
            utilisateurDao = DaoManager.createDao(connectionSource, Image.Utilisateur.class);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public String authentifier(String login,String passwd){
        StringBuilder errorMessage = null;
        String hashedPasswd = HashUtils.MD5(passwd);
        //faut faire la query ici en utilisant utilisateurDao
        return errorMessage.toString();
    }
}
