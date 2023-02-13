package DesignPatterns.BehaviouralDesignPatterns.Strategy;

public class Client {
    public static void main(String[] args) {
        GoogleMaps maps=new GoogleMaps();
        maps.findPaths("Bangalore","Chennai","Car");
    }
}
