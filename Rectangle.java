import java.util.Scanner;


public class Rectangle {

	public static void main(String [] args){
		
		Scanner scanner = new Scanner(System.in);
		
		int length = 0;
		int width = 0;
		int perimeter = 0;
		int area = 0;
		
		System.out.println("Enter length of Rectangle ");
		length = scanner.nextInt();
		
		System.out.println("Enter width of Rectangle ");
		width = scanner.nextInt();
		
		area = length * width;
		perimeter = (2*length) + (2*width);
		
		System.out.println("The area of the Rectangle is " + area);
		System.out.println("The perimeter of the rectangle is " + perimeter);



		
		
		
		
		
	}

}

