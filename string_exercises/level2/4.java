// Write a program to check if the two strings entered by user are anagrams or not. 
//Two words are said to be anagrams if the letters of one word can be rearranged to form the other word. 
//For example, jaxa and ajax are anagrams of each other. 
import java.util.*;
class code{
    public static void anag(String str1, String str2){
        if(str1.length() != str2.length()){
            System.out.println("Las palabras NO son anagramas");
        }
        else{
            int ii=0, jj=0;
            for(ii=0; ii<str1.length();){
                for(jj=0; jj<str2.length();){
                    if(str1.charAt(ii)==str2.charAt(jj)){
                        str1 = str1.substring(0,ii)+str1.substring(ii+1,str1.length());
                        str2 = str2.substring(0,jj)+str2.substring(jj+1,str2.length());
                        System.out.println(str1);
                        System.out.println(str2);
                        ii=0;
                        jj=0;
                    }
                    else
                        jj++;
                }
                if(ii!=jj)
                    ii++;
            }
        if(str1.isEmpty()==true && str2.isEmpty()==true)
            System.out.println("Las palabras SÍ son anagramas");
        else
            System.out.println("Las palabras NO son anagramas");
        }
    }
    public static void main(String[] args){
        String str1 = new String("limalaasno");
        String str2 = new String("lamonalisa");
        anag(str1, str2);
    }
}