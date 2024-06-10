import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    System.out.println("SAT DATA!!!!");

    // create data structure to store all total scores
    ArrayList<Integer> totalScore = new ArrayList<Integer>();
    ArrayList<Integer> totalMathScore = new ArrayList<Integer>();
    ArrayList<Integer> totalReadingScore = new ArrayList<Integer>();

    
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

    int below600 = 0;
    for(int score : totalScore) {
      if(score<600) {
        below600++;
      }
    }
    System.out.println(below600 +" students got a score less than 600.");

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
      Scanner s = new Scanner(new File("math.txt")); 
      while(s.hasNext()){
        int score = Integer.parseInt(s.nextLine());
        totalMathScore.add(score);
      }
      s.close();
    }
    catch(Exception e){
      System.out.println("file not found");
    }


    int mathTotal = 0;
    for(int score : totalMathScore) {
        mathTotal += score;
    }
    double mathAverage = (double)mathTotal/totalMathScore.size();
    System.out.println(mathAverage + " is the average math score.");


    // take reading score from reading.txt
    try{
      Scanner s = new Scanner(new File("reading.txt")); 
      while(s.hasNext()){
        int score = Integer.parseInt(s.nextLine());
        totalReadingScore.add(score);
      }
      s.close();
    }
    catch(Exception e){
      System.out.println("file not found");
    }


    int readingTotal = 0;
    for(int score : totalReadingScore) {
          readingTotal += score;
    }
    double readingAverage = (double)readingTotal/totalReadingScore.size();
    System.out.println(readingAverage + " is the average reading score.");

    
  }

}
