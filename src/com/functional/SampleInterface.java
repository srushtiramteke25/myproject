package com.functional;

@FunctionalInterface
public interface SampleInterface {

    public abstract void sample(int a);
    public default void sampleDefault(){
        System.out.println("------Coming Here------");
    }
}
@FunctionalInterface
interface Sample2Inteface{
    public abstract int sampleAdd(int a, int b);
}

class SampleImpl{

}

class Main{
    public static void main(String args[]) {
        Sample2Inteface sample2Inteface = (a,b) ->(a+b);
        System.out.println(sample2Inteface.sampleAdd(2,3));
    }
}
