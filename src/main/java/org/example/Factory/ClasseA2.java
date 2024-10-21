package org.example.Factory;

//Une classe concrete
public class ClasseA2 implements InterfaceA {
    private String name;
    public ClasseA2() {
        this.name = "A2";
    }

    public void m1() {System.out.println("m1 dans Classe concrete 2");}
    public void m2() {System.out.println("m2 dans Classe concrete 2");}


    public String toString(){
        return "Classe concrete 2";
    }
}
