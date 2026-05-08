package org.lessons.ciclabile;

public class Ciclabile {

    private int[] nums;
    private int i=0;

    //COSTRUTTORE

    public Ciclabile(){
        this.nums=new int[0];
    }

    public Ciclabile(int[] nums){
        this.nums=nums;
    }

    //GETTER & SETTER
    public int[] getNums(){
        return this.nums;
    }

    public void setNums(int[] nums){
        this.nums=nums;
    }

    //ALTRI METODI
    public int getElementoSuccessivo(){
        i++;
        if(i>nums.length){
            return -1;
        }
        return nums[i-1];
    }

    public boolean hasAncoraElementi(){
        return i+1>nums.length?false:true;   
    }

    public void addElemento(int numero){
        int[] tmp = new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            tmp[i]=nums[i];
        }
        tmp[nums.length]=numero;
        this.nums=tmp;
    }

    public void checkSituation(){
        System.out.printf("%nIndice attuale: \u001B[35m%d\u001B[0m%nLunghezza array: \u001B[34m%d\u001B[0m%n%n",this.i,this.nums.length);
    }

}
