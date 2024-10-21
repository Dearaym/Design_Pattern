package org.example.Strategy;

public class StrategyA implements Strategy{
    private String name;

    public StrategyA() {
        this.name = "StrategyA";
    }


    public void doStrategy(){
        System.out.println("Strategy A do strategy");
    }
}
