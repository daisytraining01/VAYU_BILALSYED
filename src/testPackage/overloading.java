package testPackage;


	import java.util.Scanner;
	interface MyInterface{
	   public void display();
	   public void display(String name, int age);
	}
	public class overloading implements MyInterface{
	   String name;
	   int age;
	   public void display() {
	      System.out.println("This is the implementation of Overloading & interfaces");
	   }
	   public void display(String name, int age) {
	      System.out.println("Name: "+name);
	      System.out.println("Age: "+age);
	   }
	   public static void main(String args[]) {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter your name: " );
	      String name = sc.next();
	      System.out.println("Enter your age: ");
	      int age = sc.nextInt();
	      overloading obj = new overloading();
	      obj.display();
	      obj.display(name, age);
	   }
	}

