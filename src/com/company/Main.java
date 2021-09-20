package com.company;


public class Main {


    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

public static void task1()
{

        Complex z1 = new Complex ( 23 , 23);
        Complex z2 = new Complex ( 5,6);

        System.out.println("Сумма :" + Complex.ToString (Complex.plus(z1,z2)) + " \n");
        System.out.println("Разность: " + Complex.ToString(Complex.minus(z1,z2)) +"\n");
        System.out.println("Умножение: " + Complex.ToString(Complex.Multy(z1,z2)) +" \n");
        System.out.println("Сравнение: " + (Complex.indenif(z1,z2)) + " \n");
    }
    public  static void task2(){

        Vector v1 = new Vector (1,2,4);
        Vector v2 = new Vector(2,3,4);

        System.out.println("Сумма: " + Vector.ToString(Vector.plus(v1,v2)) + " \n");
        System.out.println("Разность: " + Vector.ToString(Vector.minus(v1,v2)) + "\n");
        System.out.println( "Умножение: " + Vector.ToString(Vector.multy(v1,v2)));
        System.out.println("Сравнение: " + (Vector.indefin(v1,v2)) + " \n");

    };
    public static void task3(){};



}
