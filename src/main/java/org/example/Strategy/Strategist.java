package org.example.Strategy;

public class Strategist {
    private String name;
    private Strategy strategy;

    public Strategist() {
        this.name = "Bob";
        //on décide de créer une stratégie A au départ
        this.strategy = new StrategyA();
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void m1(){
        System.out.println("m1");
        this.strategy.doStrategy();
    }
}
