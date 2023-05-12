public class triangles {

    //initialize vars
    static int a;
    static int b;
    static int c;
    static String userEntry; 

    public static void main(String[] args) {

        //user input
        System.out.println("Provide three side lenghts - 0 0 0 to terminate");
        System.out.println("What is your a value?");
        a = In.getInt();

        System.out.println("What is your b value?");
        b = In.getInt();

        System.out.println("What is your c value?");
        c = In.getInt();

        if (a == 0 && b == 0 && c == 0) {
            System.out.println("\nProgram Terminated\n");
        } else {
            determineTriangleType();
        }
    }

    //determines the triangle 
    public static void determineTriangleType() {

        //triangle type String
        String equilateral = "Equilateral";
        String isoceles = "Isoceles";
        String scalene = "Scalene";

        //triangle angle String
        String right = " and Right Angle";
        String obtuse = " and Obtuse Angle";
        String acute = " and Acute Angle";

        //triangle decider
        String triangleType = "";
        String triangleAngle = "";

        //modifications
        int aSquared = (int) Math.pow(a, 2);
        int splitterA = (int) ((Math.pow(b, 2)) + (Math.pow(c, 2))); // --> the letter on the end of splitter (splitterX) indicates the side NOT used in the calculation

        int bSquared = (int) Math.pow(b, 2);
        int splitterB = (int) ((Math.pow(a, 2)) + (Math.pow(c, 2)));

        int cSquared = (int) Math.pow(c, 2);
        int splitterC = (int) ((Math.pow(a, 2)) + (Math.pow(b, 2)));

        //check if valid triangle
        int adder = a + b;
        
        //apply check
        if (adder <= c) {
            System.out.println("\nThis is not a valid triangle\n");
        } else {
        //triangle type
        if (a == b && b == c && c == a) {
            triangleType = equilateral;

        //isoceles triangle
        } else if (a == c && a > b || b == c && b > a || b == a && b > c){
            triangleType = isoceles;

        //scalene triangle
        } else if (a != b && b != c && c != a) {
            triangleType = scalene;
        }

        //triangle angle
        if (aSquared == splitterA || bSquared == splitterB || cSquared == splitterC) {
            triangleAngle = right;
        } else if (aSquared > splitterA || bSquared > splitterB || cSquared > splitterC) {
            triangleAngle = obtuse;
        } else if (aSquared < splitterA || bSquared < splitterB || cSquared < splitterC){
            triangleAngle = acute;
        }

        //final output
        System.out.println("\nThe triangle is: " + triangleType + triangleAngle + "\n");
        //System.out.println("Adder is: " + adder);
        }
    }   
}