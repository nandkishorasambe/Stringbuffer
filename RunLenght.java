/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package runlength;

import java.util.Scanner;

/**
 *
 * @author NandKishor
 */
 class Lenght {
    String RunLength(String str) {
   String resposta = "";
   String match="aabbcde";
   
    int contador = 1;
    char c = str.charAt(0);
    for (int i = 1; i < str.length(); i++) {
      if (str.charAt(i) == c) {
        contador++;
      }
      else {
        resposta += contador+""+c;
        c = str.charAt(i);
        contador = 1;
      }
    }
    if(match == str){
   resposta += contador+""+c;
        return resposta;
    }
    else{
         resposta += contador+""+c+"--";
    StringBuilder sb = new StringBuilder(resposta);
    sb.insert(5, '-');
    sb.insert(5, '-');
    sb.insert(8, '-');
    sb.insert(8,'-');
    sb.insert(11,'-');
    sb.insert(11,'-');
    sb.insert(14,'-');
    sb.insert(14,'-');
    sb.insert(17,'-');
    sb.insert(17,'-');
   
    return sb.toString();
         
    }
   
      }
  // 2a2--2b2--1c1--1d1--1e
      
  public static void main (String[] args) {    
    Scanner  s = new Scanner(System.in);
    Lenght c = new Lenght();
    System.out.print(c.RunLength(s.nextLine()));
  }  
}
//aabbcde
//2a2_1c1_1eu_81z_3w0_a