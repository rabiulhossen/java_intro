// check palindrome number

import java.util.*;
import java.io.*;

class Palindrome{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int n, sum =0, r , temp;
System.out.println("enter the number: ");
n = input.nextInt();
temp = n;
while (n != 0)
{
r = n%10;
sum = sum*10+r;
n = n/10;
}
if(sum == temp){
System.out.println("number is palindrome");
}
else{
System.out.println("number is not palindrome");
}
}
}
