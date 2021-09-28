package com.nitincodes;
import java.util.Scanner;
        public class ReverseString {
            // java program to print the reverse of a String
            public static void main(String[] args) {
                Scanner sc= new Scanner(System.in);
                String name = sc.next();
                String rev = " ";
                for(int i=name.length()-1;i>=0;i--){
                    rev = rev + name.charAt(i);
                }
                System.out.println("the reverse of the string is "+rev);
            }
        }
