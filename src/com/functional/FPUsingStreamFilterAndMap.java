package com.functional;

import java.util.List;

public class FPUsingStreamFilterAndMap {

    public static void main(String[] args) {
	// write your code here
        printAllTheCubeOfOddNumbersInistStructure(List.of(1,4,5,3,7,12,56));
        List<String> strigs = List.of("Spring","AWS","Cloud Spring");
    }

    //Print a list of numbers from list structure
    public static void printAllTheNumbersInListStructure(List<Integer> numbers){
        numbers.stream().filter(numbs->numbs%2==0).forEach(System.out::println);
    }

    //Print a list of odd numbers from list structure
    public static void printAllTheNumbersOddInListStructure(List<Integer> numbers){
        numbers.stream().filter(numbs->numbs%2!=0).forEach(System.out::println);
    }

    //Print a list of numbers from list structure
    public static void printAllTheWordsInListStructure(List<String> words){
        words.stream().forEach(System.out::println);
    }

    //Print a list of numbers from list structure
    public static void printAllTheSquaresOfEvenNumbersInistStructure(List<Integer> numbers){
        numbers.stream().filter(numbs->numbs%2==0).map(numbs -> numbs * numbs).forEach(System.out::println);
    }

    //Print a list of numbers from list structure
    public static void printAllTheCubeOfOddNumbersInistStructure(List<Integer> numbers){
        numbers.stream().filter(numbs->numbs%2!=0).map(numbs -> numbs * numbs * numbs).forEach(System.out::println);
    }

}
