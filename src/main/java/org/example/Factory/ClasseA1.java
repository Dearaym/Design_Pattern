package org.example.Factory;

//Une classe concrete
public class ClasseA1 implements InterfaceA {
    private String name;
    public ClasseA1() {
        this.name = "A1";
    }

    public void m1() {System.out.println("m1 dans Classe concrete 1");}
    public void m2() {System.out.println("m2 dans Classe concrete 1");}


    public String toString(){
        return "Classe concrete 1";
    }
}
