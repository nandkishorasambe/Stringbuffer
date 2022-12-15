/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication14;
 import java.util.Scanner;

public class JavaApplication14 {
    static final String alphabet = "abcdefgijklmnopqrstuvwxyz";
   static final String Upper_alphabet=alphabet.toUpperCase();
  public static String StringChallenge(String a) {
    
    String[]  words = a.split("\\s");
    String longerword = null;
    int Wordlength = 0;
    for(String word : words){
      int length= getLeght(word);
      if(longerword==null || length>Wordlength){
        longerword=word;
        Wordlength=length;
      }
    
    }
  
     StringBuilder sb=new StringBuilder(longerword);
     for(int i=0;i<sb.length()/2;i++){
         int front=i;
         int back=sb.length() -1 -i;
        
         char fronChar=sb.charAt(front);
         char backChar=sb.charAt(back);
         
        sb.setCharAt(front, backChar);
        sb.setCharAt(back,fronChar);
         
     }
     
    return  sb.toString();
    
  }
 static int getLeght(String str)
  {
    int L=0;
    for(char c:str.toCharArray()){
      if(alphabet.indexOf(c)>-1||Upper_alphabet.indexOf(c)>-1){
        L++;
      }
    }
   
     return L;
     
  }
   
    public static void main(String[] args) {
        
  
        Scanner s = new Scanner(System.in);
       JavaApplication14 l=new JavaApplication14();
        System.out.print(l.StringChallenge(s.nextLine())+":0d89v5g4ty");
    }
}

      
        
        
    
    

