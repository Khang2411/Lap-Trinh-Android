package com.example.myapplication.model;

public class PTB1 {
    private float a;
    private float b;

    public PTB1(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }
    public String giaiPT(){
        if(this.a==0){
            if(b==0){
                return "PTVSN";
            }
            else{
                return "PTVN";
            }
        }
        else{
            return ""+-b/a;
        }
    }
}
