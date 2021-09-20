package com.company;

public class Complex {

    int re = 0; // целая часть
    int im = 0;  // мнимая часть

    public int getIm() {
        return im;
    }

    public int getRe() {
        return re;
    }

    public void setIm(int im) {
        this.im = im;
    }

    public void setRe(int re) {
        this.re = re;
    }

    public Complex() {
        new Complex(re, im);
    }

    public Complex(int re, int im) {
        this.re = re;
        this.im = im;
    }

    public Complex(int im) {
        new Complex(re, im);
        this.re = re;
        this.im = im;

    }


    public Complex(Complex complex) {
        this.re = re;
        this.im = im;
    }

    public void plus(Complex other) {
        this.re += other.re;
        this.im += other.im;
    }

    public static Complex plus(Complex z1, Complex z2) {
        return new Complex(z1.re + z2.re, z1.im + z2.im);
    }

    public static Complex minus(Complex z1, Complex z2) {
        return new Complex(z1.re - z2.re, z1.im - z2.im);
    }

    public void minus(Complex other) {
        this.re -= other.re;
        this.im -= other.im;
    }

    public boolean indefin (Complex z1, Complex z2)
    {
        return (z1.re == z2.re && z1.im ==z2.im);
    }
    public static boolean  indenif (Complex z1, Complex z2)
    {
        return (z1.re == z2.re && z1.im == z2.im);
    }

    public void Multy (Complex other)
    {
        new Complex( re,im);
        this.re = this.re * other.re + this.im *other.im;
        this.im = this.im * other.re + this.re * other.im;
    }

    public static Complex Multy (Complex z1, Complex z2)
    {
        return new Complex(z1.re * z2.re + z1.im * z2.im, z1.im * z2.re + z1.re * z2.im);
    }

    public static String ToString ( Complex complex)
    {
        return ("Целая часть: " + complex.getRe() + "  мнимая часть:" + complex.getIm() + "i");
    }
}

