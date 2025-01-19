package org.example.MethodTemplate;

public class TriNombre extends TriObjet{
    @Override
    public int comparer(Object obj1, Object obj2) { //retourne 1 si obj1 + plus grand, 0 sinon
        System.out.println("comparer dans TriNombre");
        if(obj1 instanceof Integer && obj2 instanceof Integer){
            Integer nb1 = (Integer) obj1;
            Integer nb2 = (Integer) obj2;

            if(nb1 > nb2){
                return 1;
            }
            return 0;
        }
        return -1;
    }
}
