package org.lessons.ciclabile;

public class Main {

    public static void main(String[] args) {
        
        int[] n = {1,12,13,14}; 
        Ciclabile test = new Ciclabile(n);

        Functions.printTest(test);

        int x = test.getElementoSuccessivo();
        Functions.printX(x);
        
        x=test.getElementoSuccessivo();
        Functions.printX(x);
        
        Functions.printTest(test);
        
        x=test.getElementoSuccessivo();
        Functions.printX(x);
        
        Functions.printTest(test);
        
        x=test.getElementoSuccessivo();
        Functions.printX(x);
        
        Functions.printTest(test);
        
        x=test.getElementoSuccessivo();
        Functions.printX(x);

        System.out.println();
        System.out.println(Color.BGREEN + "---------- BONUS --------------" + Color.RESET);
        System.out.println();

        Ciclabile bonus = new Ciclabile();
        
        Functions.printTest(bonus);
        
        bonus.addElemento(99);

        Functions.printTest(bonus);
            
        int tmpBonus = bonus.getElementoSuccessivo();
        Functions.printX(tmpBonus);

        bonus.addElemento(101);

        Functions.printTest(bonus);
        
        bonus.checkSituation();

        tmpBonus = bonus.getElementoSuccessivo();
        Functions.printX(tmpBonus);

        bonus.checkSituation();

        tmpBonus = bonus.getElementoSuccessivo();
        Functions.printX(tmpBonus);

        bonus.checkSituation();



    }
}
