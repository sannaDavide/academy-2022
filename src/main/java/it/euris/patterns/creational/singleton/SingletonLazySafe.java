package it.euris.patterns.creational.singleton;

public class SingletonLazySafe {

    private static SingletonLazySafe instance;

    private SingletonLazySafe(){}

    public static synchronized SingletonLazySafe getInstance(){
        if(instance == null){
            instance = new SingletonLazySafe();
        }
        return instance;
    }

}
