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

        System.out.println("---------- BONUS --------------");

        Ciclabile bonus = new Ciclabile();
        System.out.println(bonus.hasAncoraElementi());
        bonus.addElemento(99);
        System.out.println(bonus.hasAncoraElementi());
        int tmpBonus = bonus.getElementoSuccessivo();
        System.out.println(tmpBonus);
        bonus.addElemento(101);
        System.out.println(bonus.hasAncoraElementi());
        tmpBonus = bonus.getElementoSuccessivo();
        System.out.println(tmpBonus);

    }
}
