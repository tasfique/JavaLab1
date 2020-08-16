//Name- Tasfique Enam
//Student ID- 
//Write a Java program that reads in the length and width of a rectangle. Then computes and display the area and perimeter of the rectangle using the following formulas.
package Tutorial1;

import java.util.Scanner;
public class Task1 {
public static void main (String args[])
{
//declaration of variables
int l, w, area, perimeter;
Scanner read = new Scanner (System.in);

//Reading Length and Width
System.out.print ("Enter Length: ");
l = read.nextInt();
System.out.println("Enter Width: ");
w = read.nextInt();

//area of the rectangle
area = l * w;

//perimeter of the rectangle
perimeter = 2 * l * w;

//display results
System.out.println("The area is " + area);
System.out.println("The perimeter is " + perimeter);
}
}
