package com.company;

public class Fraccion {
    int numerador;
    int denominador;
    public Fraccion(int numerador , int denominador){
        this.numerador =numerador;
        this.denominador =denominador;

    }
    public Fraccion sumar(Fraccion a){
        int cont1=(a.numerador*this.denominador)+(a.denominador*this.numerador);
        int cont2=this.denominador*denominador;
        Fraccion r =new Fraccion(cont1,cont2);
        return r;
    }
    public void mostrar(){
        System.out.print(numerador+"/"+denominador);
    }
}
