/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kladinoca_sa_klasama;
import java.util.*;
/**
 *
 * @author admir
 */
public class Kladinoca_sa_klasama {
    
    
public static int[][] nizovi (int br_nizova){
   int niz[][]=new int[br_nizova][35];
   int broj=0;
   Scanner unos = new Scanner(System.in);
    for(int i = 0 ; i <br_nizova ; i++)
    {
        
        for(int j=0 ; j <35; j++)
        {
            System.out.print("Niz ["+i+"]"+"["+j+"]= ");
            broj=unos.nextInt();
            niz[i][j]=broj;
            
            
        }
        
       System.out.println();
    }
    return niz;
    
}

static int[][] provjera(int [][]niz){
    
    int novo[][]=new int[2][35];
    int temp=0;
       
       for(int i=0;i<35;i++)
       {
            for(int j=0;j<35;j++)
           {
             /*novo[0][j]=niz[0][j];
             if(novo[0][j]==niz[1][j])*/
               if(niz[0][i]==niz[1][j])
               {
                   novo[0][j]=niz[1][j];
               }
             
                
           } 
       }
         
       
       return novo;
}

public static int moji_brojevi(int [][] niz, int brojevi[],int biranje, int[][] isti)
{
    int brojac=0;
    if(biranje ==0||biranje==1)
    {
        for(int i = 0;i <6;i++)
        {
            for(int k=0;k<35;k++)
            {
                if(brojevi[i]==niz[biranje][k])
                {
                    brojac++;
                }
            }
        }
       
    }
    else 
        for(int n=0;n<6;n++)
        {
            for(int m=0;m<35;m++)
            {
                if(brojevi[n]==isti[0][m])
                {
                    brojac++;
                }
            }
        }
    if(brojac<5)
    {
        
        return 0;
    }
    else 
        return 1;
}

public static int provjera_listica(int listic[])
{
    
    int novi_niz[]=listic;
    int temp=0;
    Arrays.sort(listic);
    
    for(int i =0; i<listic.length;i++)
    {
        for(int j=i+1;j<listic.length;j++)
        {
            if(listic[i]==listic[j])
            {
                return 0;
            }
        }
    }
   
  
    return 1;
}



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner unos = new Scanner(System.in);
        int broj=0;
        int br_nizova=0;
        
        //Listic
        System.out.println("Unesite svoj listic: ");
                    int listic=0;
                    int listic_niz[]=new int[6];
                    do{
           
                         for(int l=0;l<6;l++)
                    {
                        System.out.print("Broj:");
                        listic=unos.nextInt();
                        listic_niz[l]=listic;
                        if(listic_niz[l]>48 ||listic_niz[l]<=0)
                        {
                            System.out.println("Ne moze bit <=0 ili >48");
                            break ;
                        }
                        
                    }
                provjera_listica(listic_niz);
            if(provjera_listica(listic_niz)==0)
            {
               System.out.println("Ponovo"+listic_niz.length);
               for(int i=0;i<6;i++)
                {
                    //restart listica
                    listic_niz[i]=0;
                    System.out.println("Sad listic ima niz od "+listic_niz[i]);
                }
            }
             
            
        }   while(provjera_listica(listic_niz)==0);         
                    
  
       
             
        //KRAJ
        
        
        
        
        
        
        System.out.println("Koliko nizova zelite kreirat");
        System.out.print("Broj nizova = ");
        br_nizova=unos.nextInt();
        int novi[][]=nizovi(br_nizova);
        
     
        
        System.out.println("Kreirali ste " + br_nizova);
        for(int k=0;k<br_nizova;k++)
        {
            for(int i=0;i<35;i++)
            {
                System.out.println("Br niza "+ k + " ima u sebi " + novi[k][i]);
            }
           
        }
        
        System.out.println("Imaju "+ br_nizova+ " nizova, koja 2 zelite izabati");
        int temp1=0,temp2=0;
        int izabrat;
        Scanner tastatura=new Scanner(System.in);
        for(int brojac=0;brojac<2;brojac++)
        {
            System.out.print("Izaberite niz :");
            izabrat=tastatura.nextInt();
            if(brojac==0)
            {
                temp1=izabrat;
            }
            else
            temp2=izabrat;
        }
        
        //Koji se brojevi ponavljaju
            int pro[][]=provjera(novi);
           
            
                              
                
                    /*for(int k=0;k<35;k++ )
                    {
                            System.out.println("Nadjeno je istih ="+ pro[0][k]);
                            
                    }*/
                
           System.out.println("Provjera brojeva i vaseg listica");
           System.out.println("Da li zelite provjeriti sa prvim izvucenim brojevima"
                   + " kliknite broj 0, ako zelite provjeriti sa drugim izvucenim"
                   + " brojevima kliknite 1, ako zelite provjeriti sa zajednickim"
                   + " brojevima od prvih i drugih izvucenih brojeva kliknite 2");
           //Provjera listica
           int brojac=0;
           int biranje;
           System.out.print("Biranje:");
           biranje=unos.nextInt();
           if(moji_brojevi(novi,listic_niz,biranje,pro)==0)
           {
               System.out.println("Izgubili ste");
           }
           else 
               System.out.println("Dobili ste");
           
           
           
       
        //KRAJ
                   
                 
                
                    
                    
                    
                    
                    
                    
                    
                    
    }
    
}

