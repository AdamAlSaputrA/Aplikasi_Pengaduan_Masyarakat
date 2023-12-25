package com.adam.reportapps.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.adam.reportapps.dao.DatabaseDao;
import com.adam.reportapps.model.ModelDatabase;


@Database(entities = {ModelDatabase.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract DatabaseDao databaseDao();
}
