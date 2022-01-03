package com.javarush.task.task08.task0801;

import java.util.HashSet;
import java.util.Set;

/* 
Set из растений
*/

public class Solution {
    public static void main(String[] args) {
        Set<String> veg = new HashSet<String>();
        
        veg.add("арбуз");
        veg.add("банан");
        veg.add("вишня");
        veg.add("груша");
        veg.add("дыня");
        veg.add("ежевика");
        veg.add("женьшень");
        veg.add("земляника");
        veg.add("ирис");
        veg.add("картофель");
        
        for(String name : veg){
            System.out.println(name);
        }
    }
}
