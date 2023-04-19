import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.*;    

class UasJava
{
	
	public static void main(String[] args)
	{
		java.util.Scanner abc = new java.util.Scanner(System.in);

		new UasJava();
		String[] suhu = {"Celcius", "Fahrenheit", "Kelvin"};
		
		System.out.print("\nSatuan Suhu : \n");
		for (int i = 0; i < suhu.length; i++) {
  		    System.out.println(i+1+". "+suhu[i]);
		}
		System.out.print("\nMasukkan Satuan Suhu : ");
		int cat = abc.nextInt();

		switch(cat) {	
		   case 1:
			System.out.print("\nMasukkan Batas Angka : ");
			int cel = abc.nextInt();
			myTable(1, cel+1);
		   	break;
		   case 2:
			System.out.print("\nMasukkan Batas Angka : ");
			int cell = abc.nextInt();
			myTable(2, cell+1);
		   	break;
		   case 3:
			System.out.print("\nMasukkan Batas Angka : ");
			int celll = abc.nextInt();
			myTable(3, celll+1);
		   	break;
		   default:
    		   	System.out.println("Coba lagi");	
		}

	}	
	static double[] celsius(int x)
	{
	   double[] satuan = new double[2];
	
	   satuan[0] = x*1.8+32;
	   satuan[1] = x+273.15;
	   
    	   return satuan;
  	}
	static double[] fahrenheit(int x)
	{
	   double[] satuan = new double[2];
	
	   satuan[0] = x+459.67/1.8;
	   satuan[1] = x-32/1.8;
	   
    	   return satuan;
  	}
	static double[] kelvin(int x)
	{
	   double[] satuan = new double[2];
	
	   satuan[0] = x-273.15;
	   satuan[1] = x*1.8-459.67;
	   
    	   return satuan;
  	}
	static void myTable(int x, int y)
	{
	   JFrame f;    
    	   f=new JFrame();
	   String data[][]= new String[y][3];
	   String kolom[]= new String[3];
	   if (x == 1) { 
	      for (int i = 0; i < y; i++) {
	      	for (int j = 0; j < 3; j++) {
		   double[] get = celsius(i);
		   data[i][0]= Integer.toString(i);    
    	   	   data[i][1]= Double.toString(get[0]);
		   data[i][2]= Double.toString(get[1]);
	       	} 
	      }    
    	      kolom[0] = "Celsius"; 
	      kolom[1] = "Fahrenheit";
	      kolom[2] = "Kelvin";
	   
	   } 
	   if (x == 2) {
	      for (int i = 0; i < y; i++) {
	      	for (int j = 0; j < 3; j++) {
		   double[] get = fahrenheit(i);
		   data[i][0]= Integer.toString(i);    
    	   	   data[i][1]= Double.toString(get[0]);
		   data[i][2]= Double.toString(get[1]);
	       	} 
	      }    
    	      kolom[0] = "Fahrenheit"; 
	      kolom[1] = "Kelvin";
	      kolom[2] = "Celsius";
	   }
	   if (x == 3) {
	      for (int i = 0; i < y; i++) {
	      	for (int j = 0; j < 3; j++) {
		   double[] get = kelvin(i);
		   data[i][0]= Integer.toString(i);    
    	   	   data[i][1]= Double.toString(get[0]);
		   data[i][2]= Double.toString(get[1]);
	       	} 
	      }    
    	      kolom[0] = "Kelvin"; 
	      kolom[1] = "Celsius";
	      kolom[2] = "Fahrenheit";
	   }
    	   JTable jt=new JTable(data, kolom);    
    	   jt.setBounds(30,40,200,300);          
    	   JScrollPane sp=new JScrollPane(jt);    
	   f.add(sp);          
	   f.setSize(300,400);    
	   f.setVisible(true);    
	}
}
