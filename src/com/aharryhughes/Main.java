package com.aharryhughes;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
//       node n1 = new node(1);
//
//
//       node n2 = new node(5);
//       n1.left = n2;
//       node n3 = new node(7);
//       n1.right = n3;
//
//       node n5 = new node(7);
//       n2.left = n5;
//       node n6 = new node(23);
//       n2.right = n6;
//       node n7 = new node(14);
//       n3.left = n7;
//       node n8 = new node(9);
//       n3.right = n8;
//
//       node n9 = new node(8);
//       n7.left = n9;
//
//       node n10 = new node(4);
//       n8.right = n10;
//
//       node n11 = new node(100);
//       n9.right = n11;
//
//       leftMost(n1, -1, 0);

        Scanner scanner = new Scanner(System.in);

        String userMonth = scanner.nextLine();

        boolean pastMonth = false;
        for (Month month : Month.values()) {
            if(month.getEnglishName().equals(userMonth)){
                pastMonth = true;
            }
            if(pastMonth){
                System.out.println(month.getEnglishName());
            }
        }

    }

    public static long fib(long one, long two, long count){
        if(count==0){return two;}
        System.out.println(one+two);
        return one + fib(two, (one+two), count-1);
    }

    public static int leftMost(node root, int furthestDepth, int currentDepth){
        if(currentDepth > furthestDepth) {
            System.out.println(root.value);
            furthestDepth = currentDepth;
        }
        int tmpDepth = furthestDepth;
        if(root.left != null) {
            tmpDepth = leftMost(root.left, furthestDepth, currentDepth+1);
        }
        if(root.right != null) {
            leftMost(root.right, tmpDepth, currentDepth+1);
        }

        return tmpDepth;
    }


}
