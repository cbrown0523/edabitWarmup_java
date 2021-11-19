package com.company;

import com.company.nov1.GetWordCount;
import com.company.nov1.Pair;

import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        int wordCount = GetWordCount.countWords("Hello World you are learning Java");
        int[] pair = new Pair().makePair(9, 4);
        System.out.println(wordCount);
        System.out.println(Arrays.toString(pair));

    }
}
//static can use method main without creating a new instance.