import java.util.*;
public class Main {

    static void firstCalculation() {
        System.out.println("Please enter the first height: ");
        Scanner userInput = new Scanner(System.in); // scanner input
        int height1 = userInput.nextInt(); // waiting for user Input (integer)
        System.out.println("Please enter the first width: ");
        int width1 = userInput.nextInt();// waiting for user Input (integer)
        int rectArea = width1 * height1; // calculating the rectangle area
        System.out.printf("Area of rectangle = %d cm²",rectArea); // printing the calculated area of the rectangle
    }

    static void calculateRectArea(Integer width1, Integer height1, Integer width2, Integer height2) {
        int rectArea1 = width1 * height1; // calculating the Rectangle Area
        int rectArea2 = width2 * height2; // calculating the Rectangle Area
        System.out.printf("\nRectangle 1: \nWidth 1: %d cm\nHeight 1: %d cm\n\nRectangle 2: \nWidth 2: %d cm\nHeight 2: %d cm\n",width1,height1,width2,height2);
        System.out.printf("\nArea of rectangle 1 = %d cm²\nArea of rectangle 2 = %d cm²\n",rectArea1, rectArea2);
    }

    static void calculateSquareArea(Integer width, Integer height, Integer a) {
        int squareArea = width * height; // calculating the Square Area
        int squarePerimeter = a + a + a + a; // calculating the Square Perimeter
        System.out.printf("\nSquare W/H: %d cm/%d cm\n\nSquare Perimeter: %d cm\n",width,height,a);
        System.out.printf("\nArea of Square  = %d cm²\nPerimeter of Square = %d cm\n",squareArea, squarePerimeter);
    }

    public static void main(String[] args) {
        int waitTime = 5000; // 5000ms = 5s change it to your liking, if you don't want a pause between the examples just put a 0 in it =).
        System.out.println("\nThis is a program to calculate different types of shapes.\n\nCode Review 1/2. \"calculate the rectangular area.\"\n"); // just a print
        firstCalculation();
        try {
            Thread.sleep(waitTime); // waiting time
        } catch (InterruptedException ignored) {
        }
        System.out.println("\n/////////////////////////////////////////////");
        System.out.println("//     Code Review 3. \"Rectangle Area 1\"  //"); // just a print
        System.out.println("///////////////////////////////////////////");
        calculateRectArea(20, 30, 40, 50); // calling the method "calculateRectArea" and declaring integers for the width and height
        try {
            Thread.sleep(waitTime); // waiting time
        } catch (InterruptedException ignored) {
        }
        System.out.println("\n/////////////////////////////////////////////");
        System.out.println("//     Code Review 3. \"Rectangle Area 2\"  //"); // just a print
        System.out.println("///////////////////////////////////////////");
        calculateRectArea(100, 50, 25, 35); // calling the method "calculateRectArea" and declaring integers for the width and height
        try {
            Thread.sleep(waitTime); // waiting time
        } catch (InterruptedException ignored) {
        }
        System.out.println("\n/////////////////////////////////////////////");
        System.out.println("//     Code Review 3. \"Rectangle Area 3\"  //"); // just a print
        System.out.println("///////////////////////////////////////////");
        calculateRectArea(65, 22, 15, 5); // calling the method "calculateRectArea" and declaring integers for the width and height
        try {
            Thread.sleep(waitTime); // waiting time
        } catch (InterruptedException ignored) {
        }
        System.out.println("\n/////////////////////////////////////////////");
        System.out.println("//Code Review 4. \"Square Area/Perimeter 1\"//"); // just a print
        System.out.println("///////////////////////////////////////////");
        calculateSquareArea(4,4,4); // calling the method "calculateSquareArea" and declaring integers for the width, height and the perimeter
        try {
            Thread.sleep(waitTime); // waiting time
        } catch (InterruptedException ignored) {
        }
        System.out.println("\n/////////////////////////////////////////////");
        System.out.println("//Code Review 4. \"Square Area/Perimeter 2\"//"); // just a print
        System.out.println("///////////////////////////////////////////");
        calculateSquareArea(5,2,10); // calling the method "calculateSquareArea" and declaring integers for the width, height and the perimeter
        try {
            Thread.sleep(waitTime); // waiting time
        } catch (InterruptedException ignored) {
        }
        System.out.println("\n/////////////////////////////////////////////");
        System.out.println("//Code Review 4. \"Square Area/Perimeter 3\"//"); // just a print
        System.out.println("///////////////////////////////////////////");
        calculateSquareArea(10,15,20); // calling the method "calculateSquareArea" and declaring integers for the width, height and the perimeter
    }
}
