package com.company;
import java.util.*;


class Adjust
{
    public static void main(String args[])
    { int a[]=new int[20];
        int max=-999;
        int min=999;
        int i;
        int d=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("輸入20 位成績:");
        for (i=0; i<=a.length-1;i++)
        {
            a[i]=scanner.nextInt();
            if (max<a[i]) max=a[i];
            if (min>a[i]) min=a[i];
        }
        for (i=0;i<=a.length-1;i++)
        {
            if (min<60 && max>=60)
                d=(a[i]-min)*40/(max-min)+60;
            else if (min<60 && max<60)
                d=(a[i]-min)*30/(max-min)+60;
            else d=a[i];
            System.out.println(d);
        }
    }
}
