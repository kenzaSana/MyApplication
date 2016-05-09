package com.example.kenzack.myapplication;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import org.junit.Test;

import java.sql.SQLException;

import com.example.kenzack.myapplication.model.Droit;
import com.example.kenzack.myapplication.model.Image;

/**
 * Created by aziouiz on 09/05/16.
 */
public class InitDatabaseDev {
    private final String DB_NAME = "DEV";
    private final String LOGIN_MYSQL = "root";
    private final String PASSWORD_MYSQL = "helix";
    private final String IP_MYSQL = "localhost";

    @Test
    public void init() throws SQLException {
        String url = "jdbc:mysql://"+IP_MYSQL+":3306/";
        ConnectionSource connectionSource = new JdbcConnectionSource(url,LOGIN_MYSQL,PASSWORD_MYSQL);
        Dao<Image.Utilisateur, Integer> utilisateurDao = DaoManager.createDao(connectionSource, Image.Utilisateur.class);
        utilisateurDao.executeRaw("drop database if exists "+DB_NAME+";");
        utilisateurDao.executeRaw("create database if not exists "+DB_NAME+";");
        utilisateurDao.executeRaw("use "+DB_NAME+";");
        TableUtils.createTable(connectionSource, Image.Utilisateur.class);
        TableUtils.createTable(connectionSource, Image.class);
        TableUtils.createTable(connectionSource, Droit.class);
        connectionSource.close();
    }
}
