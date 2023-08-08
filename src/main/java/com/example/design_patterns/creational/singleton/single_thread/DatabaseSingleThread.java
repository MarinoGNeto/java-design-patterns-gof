package com.example.design_patterns.creational.singleton.single_thread;

/**
 * Este exemplo com lazy inicialization serve para thread única apenas
 * Desta maneira não funciona com Multithread conforme exemplo em DemoMultiThreadNonSafe
 */
public class DatabaseSingleThread {

    private static DatabaseSingleThread databaseInstance;
    private String url;

    private DatabaseSingleThread(String url) {
        this.url = url;
    }

    public static DatabaseSingleThread getInstance(String url) {
        if (databaseInstance == null) {
            databaseInstance = new DatabaseSingleThread(url);
        }

        return databaseInstance;
    }

    public String getUrl() {
        return url;
    }
}
