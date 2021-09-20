package com.company;

public class Vector {
    int x, y, z; // координаты векторов
    double leigh;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }


   public Vector(int z)
   {
        new Vector(x,y,z);
        this.x =x;
        this.y =y;
        this.z = x;
    }
    public  Vector( int x,int y)
    {
        new Vector(x,y,z);
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Vector (int x,int y,int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector()
    {
        new Vector(x,y,z);
    }
    public Vector(Vector vector) {
        this.x = x;
        this.y = y;
        this.z =z;
    }

    public void plus (Vector other)
    {
        this.x += other.x;
        this.y += other.y;
        this.z += other.z;
    }
    public static Vector plus (Vector v1,Vector v2)
    {
        return new Vector ( v1.x + v2.x, v1.y + v2.y, v1.z + v2.z);
    }
    public static Vector minus (Vector v1,Vector v2 )
    {
        return new Vector( v1.x - v2.x, v1.y - v2.y, v1.z - v2.z);

    }

    public void minus (Vector other)
    {
        this.x -= other.x;
        this.y -= other.y;
        this.z -= other.z;
    }
    public void multy ( Vector other)
    {
        this.x = this.x * other.x;
        this.y = this.y * other.y;
        this.z = this.z * other.z;
    }

    public static Vector multy (Vector v1,Vector v2 )
    {
        return new Vector( v1.x * v2.x, v1.y * v2.y, v1.z * v2.z);

    }
    public static boolean indefin (Vector v1, Vector v2)
    {
        return (v1.x == v2.x && v1.y ==v2.y && v1.z == v2.z );
    }

    public static String ToString ( Vector vector)
    {
        return ("Полученный вектор " + "x: " + vector.getX() + " y: " + vector.getY() + " z: " + vector.getZ());
    }

}
