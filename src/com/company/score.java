package com.company;

import java.util.*;


class score
{
    static int math[]=new int[10];
    static int chiness[]=new int[10];
    static int english[]=new int[10];
    static int average[]=new int[10];
    static int count[]=new int[10];

    public static void calaverage()
    {
        for (int i=0; i<=9; i++)
        {
            count[i]=0;
            average[i]=(math[i]*3+chiness[i]*2+english[i]*3)/8;
            if (math[i]>=60) count[i]=count[i]+3;
            if (chiness[i]>=60) count[i]=count[i]+2;
            if (english[i]>=60) count[i]=count[i]+3;
        }
    }
    public static void inputs()
    {

        Scanner sc = new Scanner(System.in);
        for (int i=0;i<=9;i++)
        {
            System.out.println("user"+(i+1));
            System.out.print("請輸入數學成績：");
            math[i] = sc.nextInt();
            System.out.print("請輸入國文成績：");
            chiness[i] = sc.nextInt();
            System.out.print("請輸入英文成績：");
            english[i] = sc.nextInt();
        }
    }

    public static void swap(int i,int j)
    {
        int t;

        t=average[i];
        average[i]=average[j];
        average[j]=t;
    }


    public static void sort()
    {
        Arrays.sort(math);
        System.out.println();
        Arrays.sort(chiness);
        Arrays.sort(english);


    }

    public static void outs()
    {
        int j;

        for(int i=0;i <=9;i++)
        {
            j=i+1;
            System.out.println(math[i]+" "+chiness[i]+" "+english[i]+" "+average[i]+" "+count[i]+" "+j);
        }

    }
    public static void main(String args[])
    {

        inputs();// 輸入
        calaverage();//計算平均
        sort();//排序
        outs();
    }
    
}
