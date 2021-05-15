package com.example.myapplication.model;

public class PTB2 {
    private float a;
    private float b;
    private float c;

    public PTB2(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
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

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public String giaiPT(){
        if (a==0){
            //bx+c=0
            PTB1 ptb1=new PTB1(b,c);
            return ptb1.giaiPT();
        }

        else
        {
            float d = b * b - 4 * (a * c);
            if(d<0){
                return "PTB2 vô nghiệm";
            }else if(d==0){
                return "x1=x2="+-b/(2*a);
            }else{
                return "x1="+(-b+Math.sqrt(d)/(2*a))+"\nx2="+(-b-Math.sqrt(d)/(2*a));
            }
        }
    }
}
