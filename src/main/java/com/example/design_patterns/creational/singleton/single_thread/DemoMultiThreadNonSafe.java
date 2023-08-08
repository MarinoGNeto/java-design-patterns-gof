package com.example.design_patterns.creational.singleton.single_thread;

/**
 * Esta classe tem intuito de falhar para exemplificar que é necessário usar threadSafe em casos de multithread.
 */
public class DemoMultiThreadNonSafe {
    public static void main(String[] args) {
        System.out.println("Caso apareça 2 valores diferentes, então foram criados 2 instancias diferentes e isso não deveria ocorrer," +
                " visto que singleton permite apenas 1 instância. \n" +
                        "Resultado: \n");

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
