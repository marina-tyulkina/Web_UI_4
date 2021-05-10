package homework4;

import java.lang.Math;

public class TriangleSquare {

    TriangleSquare square = new TriangleSquare();

    public static boolean SquareTriangle(int a, int b, int c) {

        if (a+b-c<=0 || a+c-b<=0 || c+b-a<=0 ){
            return false;
        }

        double p = (a + b + c) / 2;
        double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        String result = String.format("Результат",S);
        System.out.println(result);
        return true;
    }

}
