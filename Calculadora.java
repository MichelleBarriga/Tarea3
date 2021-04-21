
/**
 * Write a description of class Calculadora here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculadora
{ 
    public String ecuaRecta(Punto punto1,Punto punto2){
        double m,real,x;
        m=(punto2.getY()-(punto1.getY()))/(punto2.getX()-(punto1.getX()));
        real=-punto1.getY()+(m*punto1.getX());
        x=-m;
        return "y+ ("+x+")x+("+real+")=0";
    }
    public double catetoFaltante(double hip,double cat){
        double catFaltante;
        catFaltante=Math.sqrt(hip*hip-cat*cat);
        return catFaltante;
    }
    public String ecuacion2Grado(double a,double b,double c){
        double x1,x2;
        String resultado;
        x1=(-b+Math.sqrt((b*b)-4*a*c))/2*a;
        x2=(-b-Math.sqrt((b*b)-4*a*c))/2*a;
        resultado="X1="+x1+"X2="+x2;
        return resultado;
    }
}
