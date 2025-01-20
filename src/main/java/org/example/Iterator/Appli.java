package org.example.Iterator;

public class Appli {
    public static void main(String[] args) {
        MenuIterable mi = new MenuA();
        mi.addPlat(new Plat("pain"));
        mi.addPlat(new Plat("oeuf"));

        IterateurPlat ip = mi.createIterateurPlat();
        while(ip.hasNext()){
            System.out.println(ip.next());
        }

        MenuIterable mi2 = new MenuB();
        mi2.addPlat(new Plat("blanquette"));
        mi2.addPlat(new Plat("poulet"));
        IterateurPlat ip2 = mi2.createIterateurPlat();
        while(ip2.hasNext()){
            System.out.println(ip2.next());
        }

    }
}
