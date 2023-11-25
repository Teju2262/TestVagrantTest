import java.util.*;
import java.math.*;
public class Shoppingcart{
	public static void main(String args[]) {
		String[] Product = new String[14];
	    int[] Price = new int[14];
	    int[] gst = new int[4];
	    int[] quantity = new int[4];
	    String[] str = {"Leather wallet","Umbrella","Cigaratte","Honey"};
	    int[] a1 = {1100,900,200,100};
	    int[] a2={18,12,28,0};
	    int[] a3 = {1,4,3,2};
	    for(int i=0;i<str.length;i++)
	    {
	        Product[i] = str[i];
	    }
	    for(int j=0;j<a1.length;j++)
	    {
	        Price[j]=a1[j];
	    }
	    for(int k=0;k<a2.length;k++)
	    {
	        gst[k]=a2[k];    
	    }
	    for(int x=0;x<a3.length;x++)
	    {
	        quantity[x]=a3[x];
	    }
	    int maxgst = gst[0];
	    for(int s = 1;s<gst.length;s++)
	    {
	       maxgst = Math.max(maxgst,gst[s]);
	    }
	    int total = 0;
	    for(int p=0;p<4;p++)
	    {
	        total = total + (Price[p]*quantity[p]);
	    }
        int[] ans = {maxgst,total};
        for(int t=0;t<ans.length;t++)
	    {
	    	System.out.println(ans[t]);
	    }
    }
}


