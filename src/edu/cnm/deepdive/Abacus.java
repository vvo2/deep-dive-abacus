package edu.cnm.deepdive;


import java.util.Arrays;
public class Abacus {

  public static void main(String[] args){
    double sum = 0; //primitive are just value, object have address and behavior
    for (String s : args) {
      sum += Double.parseDouble(s); //update a result as sum = sum + s
    }         //parsDouble is a name of the method
  //  System.out.print("Sum = ");
   // System.out.println(sum);
    System.out.printf("Sum of %s = %5.2f%n", Arrays.toString(args), sum); //need to import array class
    //print formatted, %f is decimal placeholder %n is new line
  }

}
