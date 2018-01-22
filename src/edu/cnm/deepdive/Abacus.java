package edu.cnm.deepdive;

public class Abacus {

  public static void main(String[] args){
    double sum = 0;
    for (String s : args) {
      sum += Double.parseDouble(s); //update a result as sum = sum + s
    }
    System.out.println(sum);
  }

}
