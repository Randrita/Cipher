package com.randrita;

import java.util.HashMap;

public class mostOccured {

    //highest occurring character
    public static void main(String args[]) {
        System.out.println(count("success"));
        System.out.println(count("associated"));
    }

    public static int count(String s){
        char c;
        int freq,oFreq;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            c=s.charAt(i);
            if(map.containsKey(c)){
                freq=map.get(c);
                oFreq=freq+1;
                map.put(c,oFreq);
            }
            else{
                map.put(c,1);
            }
        }

        char mostOccurred=s.charAt(0);
        int mostFreq=map.get(mostOccurred);
        for(Character key:map.keySet()){
            if(map.get(key)>map.get(mostOccurred)){
                mostOccurred=key;
                mostFreq=map.get(mostOccurred);
            }
        }return mostFreq;
    }
}

