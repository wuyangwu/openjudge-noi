package nanshida.b2020Round1;


import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();

        }
        Arrays.sort(a);

        int c=1;
        int op1,op2;
        b[0]=a[0]+a[1];
        long ans=b[0];
        int i=2,j=0;
        while(++c<n){
            if(i<n-1&&a[i]<b[j])	op1=a[i++];
            else	op1=b[j++];
            if(i<=n-1&&a[i]<b[j])	op2=a[i++];
            else	{if(b[j]==0)op2=a[i++];else op2=b[j++];}

            b[c-1]=op1+op2;
            ans+=b[c-1];
        }
        System.out.println(ans);
    }
}