package io.github.soheshts.random;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Author: Sohesh TS
Date: 11/28/2020
*/
/*
* Quest Global Interview question
* Read a sentence from user and read a list of words from a file.
* Count the occurrences of the words read from file in the read sentence.
* */
public class StringCounter {
    public static void main(String[] args) {
        String message;
        System.out.println("ENter a sentence");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        File file = new File("input.txt");
        try {
            BufferedReader fileReader  = new BufferedReader(new FileReader(file));
            message = br.readLine();
            List<String> words = Arrays.asList(message.split(" "));
            String currentword;

            /*Asked me to count all the words in the sentence*/
            Map<String, Integer> wordMap = new HashMap<>();
            words.forEach(word -> {
                if(wordMap.get(word)!=null){
                    int count = wordMap.get(word);
                    count = count+1;
                    wordMap.put(word,count);
                } else{
                    wordMap.put(word, 1);
                }
            });
            wordMap.forEach((k,v)->{
                System.out.println("Word: "+k+" Count:" + v);
            });

            /*Count occurrence of words from file*/
            int count =0;
            while ((currentword = fileReader.readLine())!=null){
                count =0;
                for(String word : words){
                    if(word.compareTo(currentword)==0)
                        count++;
                }
                System.out.println(currentword + " count: "+ count);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
