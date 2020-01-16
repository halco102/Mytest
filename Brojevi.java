import java.util.*;
public class Brojevi implements Provjera {
	private int [][]niz;
	private int r,c,broj;
	private int [][]novi_niz;
	private int temp = 0 ;
	private int [][]sacuvaj;
	
	
	
	public Brojevi() {
		
	}
	
	public Brojevi(int r, int c)
	{
		this.r = r;
		this.c = c;
	}
	
	public int provjera()
	{
		int temp=0;
		System.out.println("Provjera brojeva");
		for(int i = 0 ; i < this.r ; i ++)
		{
			for(int j=0 ; j<6;j++)
			{
				for(int k=j+1;k<6;k++)
				{
					if(niz[i][j]==niz[i][k])
					{
						
						temp++;
					
					
						
					}
				}
			}
		}
		if(temp>0)
		{
			System.out.println("Istih ima "+ temp);
			return 0;
		}
		return 1;
		
		
		
	}
	
	public int [][] getNoviNiz(){
		return this.novi_niz;
	}
	
	public void setNoviNiz(int niz[][]) {
		this.novi_niz=niz;
	}
	

	public int[][] provjera_niza(int a,int b)  //radi ovaj implements
	{
		
		int pomocna [][] = this.niz;//uzme niz [n][n] i + radi yaya
		this.novi_niz=new int[1][this.c];
		
		for(int i = 0 ; i < 6 ; i ++)
		{
			for(int j = 0 ; j < 6 ; j++)
			{
				if(pomocna[a][i]==pomocna[b][j])
				{
					temp++;
					this.novi_niz[0][i]=pomocna[a][i];
				}
				
			}
		}
		
		
		
		
		
		return novi_niz;
		
	}
	
	public void sacuvaj  (int sacuvano[][], int br)
	{
		this.sacuvaj=new int[1][];
		
		for(int i = 0 ; i <br;i++ )
		{
			this.sacuvaj[0][i]=sacuvano[0][i];
			System.out.println("Ti brojevi su " + this.sacuvaj[0][i]);
		}
		
	}
	
	
	

	public int getTemp() {
		return temp;
	}
	
	public int [][] nizovi (){
		Scanner unos = new Scanner(System.in);
		niz=new int[this.r][this.c];
		for(int i = 0 ; i < this.r ; i ++)
		{
			for(int j = 0 ; j < this.c ; j ++)
			{
				System.out.print("Broj :");
				broj=unos.nextInt();
				this.niz[i][j]=broj;
			}
			System.out.println();
		}
		
		return niz;
		
	}
	public int[][] getNiz(){
		return this.niz;
	}
	
	public void setNiz(int niz[][])
	{
		this.niz=niz;
	}
	
	
		public void ispis(int koliko) {
			System.out.println("Kreira li ste "+ koliko + " niza");
			for(int i = 0 ; i<koliko ; i ++)
			{
				for(int j = 0 ; j < 6; j ++)
				{
					System.out.println("Niz "+"["+i+"]"+"["+j+"]"+" = "+this.niz[i][j]);
				}
			}
	}
	
		public int [][] get_brojevi(){
			return this.niz;
		}
		
	
	
	
}

