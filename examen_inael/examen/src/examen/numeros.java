/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.Scanner;
public class numeros {
    public void magico(){
        
    
         Scanner sr =new Scanner(System.in);
    
    int usuario=0;
   int numer=1;
    int array []=new int[numer];
   //int random = Match.random()*numer+1;
    
    System.out.println("inserte un numero");
   System.out.println("==>");
           usuario=sr.nextInt();
      for (numer = 1; numer <= 50; numer++) {
                //System.out.println(numer);
            
            
            
     if(numer==usuario){
         System.out.println("acertastes");
         
         
     } else{
         if(numer<=usuario)
         System.out.println("caliente");
         
         
    }
}
}
}
