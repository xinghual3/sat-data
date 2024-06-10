import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    System.out.println("SAT DATA!!!!");

    // create data structure to store all total scores
    ArrayList<Integer> totalScore = new ArrayList<Integer>();
    ArrayList<Integer> totalMathScore = new ArrayList<Integer>();
    
    try{
      Scanner s = new Scanner(new File("total.txt"));

      while(s.hasNext()){
        int score = Integer.parseInt(s.nextLine());
        totalScore.add(score);
      }
      s.close();
    }

    catch(Exception e){
      System.out.println("file not found");
    }

    // make sure all data entered the ArrayList
    //System.out.println(totalScore);
    System.out.println(totalScore.size()+ " students took the test.");

    int total = 0;
    for(int score : totalScore) {
      total += score;
    }
    double average = (double)total/totalScore.size();
    System.out.println(average + " is the average score.");



    int above1400 = 0;
    for(int score : totalScore) {
      if(score>=1400) {
        above1400++;
      }
    }
    System.out.println(above1400 +" students got a score of 1400 or higher.");

    int min = 1600;
    for(int score: totalScore) {
      if(score<min) {
        min = score;
      }
    }
    System.out.println(min + " is the lowest score.");

    int max = 0;
    for(int score: totalScore) {
      if(score>max) {
        max = score;
      }
    }
    System.out.println(max + " is the highest score.");

    // take math score from math.txt
    try{
      Scanner s = new Scanner(new File("math.txt")); //Read math.txt
      while(s.hasNext()){
        int score = Integer.parseInt(s.nextLine());
        totalMathScore.add(score);
      }
      s.close();
    }
    catch(Exception e){
      System.out.println("file not found");
    }

    
  }

}
