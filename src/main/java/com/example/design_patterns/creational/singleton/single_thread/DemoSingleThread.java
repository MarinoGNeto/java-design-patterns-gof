package com.example.design_patterns.creational.singleton.single_thread;

public class DemoSingleThread {
    public static void main(String[] args) {
        System.out.println("Caso apareça 2 valores diferentes, então foram criados 2 instancias diferentes e isso não deveria ocorrer," +
                " visto que singleton permite apenas 1 instância. \n" +
                        "Resultado: \n");

        DatabaseSingleThread sqlServer = DatabaseSingleThread.getInstance("jdbc:sqlserver://localhost:1433;databaseName=<database>");
        DatabaseSingleThread mongoDb = DatabaseSingleThread.getInstance("mongodb://localhost:27017/<database>");
        System.out.println(sqlServer.getUrl());
        System.out.println(mongoDb.getUrl());
    }
}
