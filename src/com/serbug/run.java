package com.serbug;

public class run{

    private long run(){
        long start=System.nanoTime();
       // Integer d =new Integer(2+3); //8100
        start=2+3; //2452
        return System.nanoTime()-start;
    }
    public void testViteza(){
        System.out.println(run());
    }
}

//public class Varsta {
//    private int ani;
//
//    public Varsta(int a){
//        ani=a;
//    }
//    public void setAni(int a){
//        ani=a;
//    }
//    public void printVarsta(){
//        System.out.println("Varsta este "+ani);
//    }
//}

//public class MyClass{
//
//    private int a;
//    private int b;
//
//    public MyClass(int a, int b){
//        this.a=a;
//        this.b=b;
//    }
//
//    public void setA(int a){
//        this.a=a;
//    }
//    public void setB(int b){
//        this.b=b;
//    }
//    public int getA(){
//        return this.a;
//    }
//    public int getB(){
//        return this.b;
//    }
//}
