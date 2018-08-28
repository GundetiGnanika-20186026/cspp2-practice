import java.util.Scanner;
class Area {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        float rad = scan.nextFloat();
        System.out.println(areaofcircle(rad)); 
    }
    static double areaofcircle( float rad) {
        double area = pi() * rad * rad;
        return area;
    }
    static double pi(){
        double pi = 3.14;
        return pi;
    }
}