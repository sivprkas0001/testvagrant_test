
public class testvag {

	public static void main(String[] args) {
	 int[][] basket=new int[4][3];
	 basket[0][0]=1100;
	 basket[0][1]=18;
	 basket[0][2]=1;
	 basket[1][0]=900;
	 basket[1][1]=12;
	 basket[1][2]=4;
	 basket[2][0]=200;
	 basket[2][1]=28;
	 basket[2][2]=3;
	 basket[3][0]=100;
	 basket[3][1]=0;
	 basket[3][2]=2;
	 int maxgstpaid=Integer.MIN_VALUE;
	 int maxprodid=0;
	 int totalamount=0;
	   for(int i=0;i<4;i++)
	   {
		  int gstpaid=(basket[i][2]*basket[i][0]*basket[i][1])/100;
		  if(gstpaid>maxgstpaid)
		  {
			  maxprodid=i;
			  maxgstpaid=gstpaid;
		  }
		  if(basket[i][0]>=500)
	       basket[i][0]=basket[i][0]*95/100;
		  totalamount+=basket[i][0]*basket[i][2]+gstpaid;
	   }
	  System.out.print("product for which max gst is paid:");
	  switch(maxprodid)
	  {
	  case 0:System.out.println("Leather Wallet");
	         break;
	  case 1:System.out.println("Umbrella");
             break;
	  case 2:System.out.println("Cigarette");
             break;
	  case 3:System.out.println("Honey");
             break;
	  }
	  System.out.println("Total amount to be paid is= "+totalamount);
	}
   

}
