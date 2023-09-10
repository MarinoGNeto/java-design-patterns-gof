package com.example.design_patterns.creational.singleton.single_thread;

/**
 * This class is intended to fail to exemplify that it is necessary to use threadSafe in multithreaded cases.
 */
public class DemoMultiThreadNonSafe {
    public static void main(String[] args) {
        System.out.println("If 2 different values appear, then 2 different instances were created and this should not happen" +
                " since Singleton only allows 1 instance. \n" +
                "Result: \n");

        Thread threadSqlServer = new Thread(new ThreadSqlServer());
        Thread threadMongoDb = new Thread(new ThreadMongoDb());
        threadSqlServer.start();
        threadMongoDb.start();


    }

    static class ThreadSqlServer implements Runnable {
        @Override
        public void run() {
            DatabaseSingleThread sqlServer = DatabaseSingleThread.getInstance("jdbc:sqlserver://localhost:1433;databaseName=<database>");
            System.out.println(sqlServer.getUrl());
        }
    }

    static class ThreadMongoDb implements Runnable {
        @Override
        public void run() {
            DatabaseSingleThread mongoDb = DatabaseSingleThread.getInstance("mongodb://localhost:27017/<database>");
            System.out.println(mongoDb.getUrl());
        }
    }
}
