package pl.tomaszidzikowski.klasydrugie;
/*
Napisz metodę, która sprawdzi czy z trzech podanych długości boków można zbudować trójkąt
a następnie obliczy jego pole.
 */
public class Zadanie14 {
    public static boolean isTriangle(double a,double b,double c){
        return a+b>c && a+c>b && b+c>a;
    }

    public static double triangleArea(double a,double b,double c){
        double half=(a+b+c)/2;
        return Math.sqrt(half*(half-a)*(half-b)*(half-c));
    }

    public static void main(String[] args) {
        double a=3;
        double b=4;
        double c=5;
        if(isTriangle(a,b,c)){
            System.out.println("The result is "+triangleArea(a,b,c));
        }
        else System.out.println("This is not a triangle!");
    }
}
