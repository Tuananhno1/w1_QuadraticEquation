public class QuadraticEquation {
    private double a,b,c;

    public QuadraticEquation(){

    }

    public QuadraticEquation(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant(){
       double d = (this.b*this.b)-(4*this.a*this.c);
       return d;
    }

    public double getRoot(){
        return (-this.b)/(2*this.a);
    }

    public double getRoot1(){

        double r1 = (-this.b + Math.pow((this.b*this.b)-(4*this.a*this.c),0.5))/(2*this.a);
        return r1;
    }

    public double getRoot2(){

        double r2 = (-this.b - Math.pow((this.b*this.b)-(4*this.a*this.c),0.5))/(2*this.a);
        return r2;
    }
}
