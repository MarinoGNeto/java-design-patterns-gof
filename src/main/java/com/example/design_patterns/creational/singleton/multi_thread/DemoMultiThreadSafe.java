package com.example.design_patterns.creational.singleton.multi_thread;


public class DemoMultiThreadSafe {
    public static void main(String[] args) {
        System.out.println("Caso apareça 2 valores diferentes, então foram criados 2 instancias diferentes e isso não deveria ocorrer," +
                " visto que singleton permite apenas 1 instância. \n" +
                "Resultado: \n");

        Thread threadSqlServer = new Thread(new DemoMultiThreadSafe.ThreadSqlServer());
        Thread threadMongoDb = new Thread(new DemoMultiThreadSafe.ThreadMongoDb());
        threadSqlServer.start();
        threadMongoDb.start();


    }

    static class ThreadSqlServer implements Runnable {
        @Override
        public void run() {
            DatabaseMultiThread sqlServer = DatabaseMultiThread.getInstance("jdbc:sqlserver://localhost:1433;databaseName=<database>");
            System.out.println(sqlServer.getUrl());
        }
    }

    static class ThreadMongoDb implements Runnable {
        @Override
        public void run() {
            DatabaseMultiThread mongoDb = DatabaseMultiThread.getInstance("mongodb://localhost:27017/<database>");
            System.out.println(mongoDb.getUrl());
        }
    }
}
