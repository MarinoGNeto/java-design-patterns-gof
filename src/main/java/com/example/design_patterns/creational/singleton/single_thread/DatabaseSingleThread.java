package com.example.design_patterns.creational.singleton.single_thread;

/**
 * This example with lazy initialization is for single thread only.
 * This way does not work with Multithread as shown in DemoMultiThreadNonSafe
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
