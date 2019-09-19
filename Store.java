import java.util.Scanner;

Scanner input = new Scanner(System.In);

public class Receipt {
    public static void main(String [] args){
      Scanner input = new Scanner(System.In);
      System.out.printIn("Number of books bought");
      int BooksBought = input.nextInt();
      System.out.printIn("Number of movies bought")
      int MoviesBought = input.nextInt();
      System.out.printIn("Pounds of peanuts bought");
      int PeanutsBought = input.nextInt();

      int month = Math.floor(1 + Math.random()* 12);
      int days = Math.floor(1 + Math.random()* 31);
      int years = Math.floor(1 + Math.random()* 99)

      double books = 9.0;
      double movies = 13.97;
      double peanuts = 1.72;

      double shipbook = 0.95;
      double shipmovies = 0.04;
      double shippeanuts = 0.30;
      double tax = 0.072;

      double bookstotal = (books * BooksBought * tax) + (shipbook * BooksBought)
      double moviestotal = (movies * MoviesBought * tax) + (shipmovies * MoviesBought)
      double peanutstotal = (peanuts * PeanutsBought * tax) + (shippeanuts * PeanutsBought)

    }

}
