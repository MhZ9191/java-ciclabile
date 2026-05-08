package org.lessons.ciclabile;

public abstract class Functions {

    public static final void printTest(Ciclabile test){
        System.out.println("Ci sono elementi ? :"+(test.hasAncoraElementi()?Color.GREEN+test.hasAncoraElementi()+Color.RESET:Color.RED+test.hasAncoraElementi()+Color.RESET));
    }

    public static final void printX(int x){
        System.out.println(x>-1?Color.YELLOW+x+Color.RESET:Color.BRED+"X OUT OF INDEX"+Color.RESET);
    }

}
