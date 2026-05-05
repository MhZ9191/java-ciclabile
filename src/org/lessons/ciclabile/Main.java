package org.lessons.ciclabile;

public class Main {

    public static void main(String[] args) {
        
        int[] n = {1,12,13,14}; 
        Ciclabile test = new Ciclabile(n);
        

        boolean ancoraElementi = test.hasAncoraElementi();
        System.out.println(ancoraElementi);
        int x = test.getElementoSuccessivo();
        System.out.println(x);
        x=test.getElementoSuccessivo();
        System.out.println(x);
        ancoraElementi = test.hasAncoraElementi();
        System.out.println(ancoraElementi);
        x=test.getElementoSuccessivo();
        System.out.println(x);
        ancoraElementi = test.hasAncoraElementi();
        System.out.println(ancoraElementi);
        x=test.getElementoSuccessivo();
        System.out.println(x);
        ancoraElementi = test.hasAncoraElementi();
        System.out.println(ancoraElementi);
        x=test.getElementoSuccessivo();
        System.out.println(x);


    }
}
