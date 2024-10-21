package org.example.Strategy;

public class StrategyB implements Strategy{
    private String name;

    public StrategyB() {
        this.name = "StrategyB";
    }

    public void doStrategy() {
        System.out.println("StrategyB do strategy");
    }
}
