package com.functional;

import java.util.List;

public class FPUsingStreamOtherStreams {

    public static void main(String[] args) {
	// write your code here
        System.out.println(printAllTheCubeOfOddNumbersInistStructure(List.of(1,4,5,3,7,12,56)));
        List<String> strigs = List.of("Spring","AWS","Cloud Spring");
    }

    //Print a list of numbers from list structure
    public static int printAllTheCubeOfOddNumbersInistStructure(List<Integer> numbers){
        return numbers.stream().reduce(0, Integer::sum);
    }

}
