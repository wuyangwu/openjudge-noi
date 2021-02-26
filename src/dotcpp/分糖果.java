package dotcpp;

import java.util.Scanner;

public class 分糖果 {

	public static void main(String[] args) {
	      Scanner in=new Scanner(System.in);
	        int n=in.nextInt();
	        int arr[]=new int[n];
	        for(int i=0;i<n;i++)
	        {
	            arr[i]=in.nextInt();
	        }
	        int count=0; //计时器
	        int c = 0;
	        while(true)
	        {
	        	c=1;
	            for(int i=0;i<n;i++)      //数组全部除2
	            {
	                arr[i]=arr[i]/2;
	            }
	            int t=arr[0];             //把数组第一项存起来，不然第一项会变
	            for(int i=0;i<n;i++)      //让小朋友把橘子给旁边的人
	            {
	                if(i+1<n)
	                arr[i]=arr[i]+arr[i+1];
	                 
	                if(i==n-1)
	                {
	                    arr[i]=arr[i]+t;
	                }
	                 
	            }
	            for(int i=0;i<n;i++)       //判断，如果橘子是奇数，就加1，count拿来记数
	            {
	                if(arr[i]%2!=0)
	                {
	                    arr[i]+=1;
	                    count++;
	                     
	                }
	                 
	            }
	            for(int i=0;i+1<n;i++)     //判断数组是否全部相等，如果有不等的，就把flag置为0
	            {
	                if(arr[i]!=arr[i+1])
	                {
	                    c=0;
	                }
	            }
	            if(c==1)            //flag此时还为1的话，那么表示数组就全部相等了，就输出计数器
	            {
	                System.out.println(count);
	                System.exit(0);
	            }
	        }
	    }
	}

