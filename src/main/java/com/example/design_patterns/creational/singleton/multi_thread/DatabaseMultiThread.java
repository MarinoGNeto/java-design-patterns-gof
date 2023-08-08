package com.example.design_patterns.creational.singleton.multi_thread;

/**
 * Este exemplo com sincronização serve para
 * Singleton seguro para threads com lazy inicialization
 */
public class DatabaseMultiThread {

    /**
     * O campo deve ser declarado como volatile para o double check lock funcionar corretamente.
     */
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
