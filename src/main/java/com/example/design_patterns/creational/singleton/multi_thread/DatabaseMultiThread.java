package com.example.design_patterns.creational.singleton.multi_thread;

/**
 * This example with synchronization is for
 * Thread-safe singleton with lazy initialization
 */
public class DatabaseMultiThread {

    private static DatabaseMultiThread databaseInstance;
    private String url;

    private DatabaseMultiThread(String url) {
        this.url = url;
    }

    public static synchronized DatabaseMultiThread getInstance(String url) {
       if (databaseInstance == null) {
           databaseInstance = new DatabaseMultiThread(url);
       }
       return databaseInstance;
    }

    public String getUrl() {
        return url;
    }
}
