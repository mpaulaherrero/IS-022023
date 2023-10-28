package main.practica3.e2;

public class Prueba {
    private static Prueba p;
    public static void f(){ p = new Prueba(); p.g();}
    public void g() { this.h();}
    public void h() { System.out.println("Prueba algo");}
}
