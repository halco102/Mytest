/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kladionica;
import java.util.*;
/**
 *
 * @author admir
 */
public class Kladionica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner unos = new Scanner(System.in);
        System.out.println("Pronalazenje najcescih brojeva");
        int broj;
        int niz1[]= new int [35]; 
        int niz2[] = new int [35];
        // kreirati odredjen broj nizova
        int kolicina=0;
        System.out.println("Koliko zelite nizova kreirati");
        kolicina=unos.nextInt();
        int beskonacno[][]= new int[kolicina][6];
        for(int brojilo=0;brojilo<kolicina;brojilo++)
        {
            
            //Prvi loop odredjuje koji je redni broj niza, ogranicava ga brojilo
            System.out.println("Radi se niz["+brojilo+"]");
            for(int i = 0;i<6;i++)
            {
                
                
                //U ovom loopu popunjajemo nas niz sa brojevima iz binga
                System.out.print("Brojevi su ");
                broj=unos.nextInt();
                
                beskonacno[brojilo][i]=broj;
             
                
                
            }
            
            
            
        }
        //kraj
        
        //Novi nacin racunanja 
        
        System.out.println("Koja 2 niza zelite uporedit??");
        Scanner izabrat = new Scanner(System.in);
        int izabrano;
        int temp1=0,temp2=0;
        for(int brojac = 0;brojac<2; brojac++)
        {
               izabrano=izabrat.nextInt();
               if(brojac==0)
               {
                   temp1=izabrano;
               }
               temp2=izabrano;
        }
    
        System.out.println("Izabrani brojevi su broj1 = "+ temp1 + " broj2 = "+temp2);
        
        
        
        
        //KRAJ
        //Kreiranje novo niza za cuvanje poredivih brojeva
          int noviniz[][]=new int [1][6];
          int novi=0;
          int pomocna=0;
        //Poredjenje 2 niza 
           for(int poredjenje=0;poredjenje<6;poredjenje++)
           {
               for(int l =0 ; l<6; l++)
               {
                   if(beskonacno[temp1][poredjenje]==beskonacno[temp2][l])
                   {
                       pomocna=beskonacno[temp2][l];
                       noviniz[0][l]=pomocna;
                       
                       
                   }
               }
           }
          
        
        
        //KRAJ
        
        //Provjera
            for(int jk=0;jk<6;jk++)
            {
                System.out.println("Ti pronadjeni brojevi su " + noviniz[0][jk]);
            }
           
           //KRAJ
        
    /* Stari nacin     
        for ( int i = 0 ; i < 2; i++)
        {
            if(i == 0 )
            {
                for(int j = 0 ; j<35; j++)
                {
                    broj=unos.nextInt();
                    niz1[j]=broj;
                }
                
            }
            else if(i==1)
            {
                 System.out.println("unos u drugi niz");
                for(int k = 0; k<35; k++)
                {
                    
                    broj=unos.nextInt();
                    niz2[k]=broj;
                }
            
            }
                
        }
        
        int novi=0;
        int izracunato=0;
        int noviniz[]=new int[35];
        //unesena su 2 niza 
        //provjera najcescih brojeva
        
        /*for (int g=0; g<6;g++)
        {
            System.out.println("g "+ g);
            if(niz1[novi]==niz2[g]){
                
                System.out.println("Taj broj je " + niz2[g]);
                noviniz[novi]=niz2[g];
                
                izracunato++;
                
            }
           
        }*/
              
        /*
            for(int g= 0; g<35;g++)
           {
               for(int p = 0 ; p<35; p++)
               {
                   if(niz1[g]==niz2[p])
                   {
                       System.out.println("Taj broj je "+ niz2[p]);
                       noviniz[novi]=niz2[p];
                       novi++;
                       izracunato++;
                   }
               }
                  
                
           }
          */ 
    
        
        
        
        
        
        
        
        
        // provjera novog niza 
      /*  
        for(int kk =0 ; kk<izracunato; kk++)
        {
            System.out.println("Taj novi niz ima istih sledecih brojeva " + noviniz[kk]);
        }
        
        */
                
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}

