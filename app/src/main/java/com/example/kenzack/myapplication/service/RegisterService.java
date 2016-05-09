package com.example.kenzack.myapplication.service;

import com.example.kenzack.myapplication.Utils.HashUtils;
import com.example.kenzack.myapplication.model.Utilisateur;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;

/**
 * Created by aziouiz on 10/05/16.
 */
public class RegisterService {
    private final String DB_NAME = "DEV";
    private final String LOGIN_MYSQL = "root";
    private final String PASSWORD_MYSQL = "helix";
    private final String IP_MYSQL = "localhost";
    private ConnectionSource connectionSource;
    private Dao<Utilisateur, Integer> utilisateurDao;

    public RegisterService(){
        try {
            String url = "jdbc:mysql://" + IP_MYSQL + ":3306/"+DB_NAME;
            connectionSource = new JdbcConnectionSource(url, LOGIN_MYSQL, PASSWORD_MYSQL);
            utilisateurDao = DaoManager.createDao(connectionSource, Utilisateur.class);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void register(String login,String passwd){
        try{
            Utilisateur utilisateur = new Utilisateur();
            utilisateur.setLogin(login);
            String hadshedPasswd = HashUtils.MD5(passwd);
            utilisateur.setHashedPasswd(hadshedPasswd);
            utilisateurDao.create(utilisateur);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
