import java.util.*;
public class Practice {
    public static void main(String[] args){
        int a=100;
        int b=200;
        System.out.println("a->" + a);
        System.out.println("b->" + b);
        a = a+b;
        b = a-b;
        a= a-b;
        System.out.println("a->" + a);
        System.out.println("b->" + b);
    }
}

//Tip->Function overloading -> Same Name but different parameters like - different datatypes,number of parameters,...
//Functions in String class- for Equal = a1.equals(a2); for substring = str.substring(0,5); for comparison between two string - str1.compareTo(str2);
// if 0 both string same if -ve str2 is large and if +ve str1 is large..
//1.Code for Prime Number->
 // public static Boolean isPrime(int n) {
    //     if(n==2) {
    //         return true;
    //     }
    //     Boolean isPrime1 = true;
    //     for(int i=2;i<=Math.sqrt(n);i++) {
    //         if(n%i==0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    // public static void main (String[] args) {
    //     System.err.println("Enter a number:");
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     System.out.println(isPrime(n));
    // }
// 2.Binomial Coefficient Code->
    // public static int fac(int n) {
    //     int f=1;
    //     for(int i=1;i<=n;i++) {
    //         f=f*i;
    //     }
    //     return f;

    // }
    // public static void main(String[] args) {
    //     int n=5;
    //     int r=3;
    //     int den = fac(n-r)*fac(r);
    //     int nCr = fac(n)/den;
    //     System.out.println("Result->" + nCr);

    // }
    //3.-> Binary to Decimal Code->
   // public static int conDec(int binNum) {
//         int muyNum = binNum;
//         int pow=0;
//         int decNum=0;
//         while(binNum>0){
//             int lastNum = binNum % 10;
//             decNum = decNum + (int)(lastNum* Math.pow(2,pow));
//             pow++;
//             binNum = binNum/10;
//         }
//         return decNum;
//     }
//    public static void main(String[] args) {
// System.out.println("decimal Number->" + conDec(101));
//    }
//4.-> Decimal To binary Code->
    // public static void decTobin(int n) {
    //     int decNum = n;
    //     int pow=0;
    //     int binNum = 0;
    //     while(n>0) {
    //         int rem = n %2;
    //         binNum = binNum + (rem * (int)Math.pow(10,pow));
    //         pow++;
    //         n = n/2;
    //     }
    //     System.out.println("Decimal Number " +  decNum  + " To Binary Number:->" + binNum);
    // }
    // public static void main(String[] args) {
    //     decTobin(11);
    // }
    //5.-> Code for Butterfly Pattern ->
    //public static void butterFly(int n) {
    //     // outer loop 1st half of butterfly
    //     for(int i = 1;i<=n;i++) {
    //         //stars
    //         for(int j=1;j<=i;j++) {
    //             System.out.print("*");
    //         }
    //         //spaces concept 2 * (n-i)
    //         for(int j=1;j<=2*(n-i);j++) {
    //             System.out.print(" ");
    //         }
    //         //stars
    //         for(int j=1;j<=i;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    //     //outer loop 2nd half of butterfly
    //     for(int i = n;i>=1;i--) {
    //         //stars
    //         for(int j=1;j<=i;j++) {
    //             System.out.print("*");
    //         }
    //         //spaces concept 2 * (n-i)
    //         for(int j=1;j<=2*(n-i);j++) {
    //             System.out.print(" ");
    //         }
    //         //stars
    //         for(int j=1;j<=i;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void main(String[] args) {
    //     butterFly(5);
    // }
    //6.->Code for Reverse an Array->
   // public static void reverseArray(int numbers[]){
    //     int start =0;
    //     int end = numbers.length-1;
    //     int temp=0;
    //     while(start<=end){
    //         temp = numbers[start];
    //         numbers[start]= numbers[end];
    //         numbers[end]=temp;
    //         start++;
    //         end--;

    //     }
    //     for(int i=0;i<numbers.length;i++){
    //     System.out.print(numbers[i] + " ");
    //     }
    // }
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int numbers[] = new int[5];
    //     for(int i=0;i<numbers.length;i++) {
    //         numbers[i] = sc.nextInt();
    //     }
    //     reverseArray(numbers);

    // }
    //7.-> Code for SubArray ->
   // public static void subArray(int numbers[]) {
    //     int ts=0;
    //     for(int i=0;i<numbers.length;i++) {
    //         int start= i;
    //         for(int j=i;j<numbers.length;j++) {
    //             int end = j;
    //             for(int k=start;k<=end;k++ ){
    //                 System.out.print(numbers[k]);
    //             }
    //             ts++;
    //             System.out.println();
    //         }
    //         System.out.println();
    //     }
    //     System.out.println(ts);
    // }
    // public static void main(String[] args) {
    //     int numbers[] = {2,4,6,7,8};
    //     subArray(numbers);
    // }
    //8.-> Code for Palindrome->
        // public static boolean palindrome1(String str){
    //     int n= str.length();
    //     for(int i=0;i<(str.length())/2;i++){
    //         if(str.charAt(i) != str.charAt(n-1-i)) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    // public static void main(String[] args){
    //     String str = "madam";
    //     System.out.println(palindrome1(str));
    // }
    //9.-> Code for finding shortest path->
    // public static float atShortpath(String str){
    //     int x=0,y=0;
    //     for(int i=0;i<str.length();i++) {
    //         char dir = str.charAt(i);
    //         if(dir == 'N'){
    //             y++;
    //         }
    //         else if(dir=='S'){
    //             y--;
    //         }
    //         else if(dir=='W'){
    //             x--;
    //         }
    //         else x++;
    //     }
    //     float X2 = (x*x);
    //     float Y2 = (y*y);
    //     return (float)Math.sqrt(X2+Y2);
    //     }
    // public static void main(String[] args){
    //     String str = "WNEENESENNN";
    //     System.out.println(atShortpath(str));
    // }
    //10.->Code for StringBuilder
        // public static void main(string[] args){
    //     StringBuilder sb = new StringBuilder("");
    //     for(char ch = 'a';ch<='z';ch++){
    //         sb.append(ch);
    //     }
    //     System.out.print(sb);
    // }
    //sb.toString(); // to convert StringBuilder into String in StringBuilder - mutable
    //11.-> Code for to convert string into capital letter->
     // public static String capitalSize(String str){
    //     StringBuilder sb = new StringBuilder("");
    //     char ch = Character.toUpperCase(str.charAt(0));
    //     sb.append(ch);
    //     for(int i=1;i<str.length();i++){
    //         if(str.charAt(i)==' ' && i<str.length()-1){
    //             sb.append(str.charAt(i));
    //             i++;
    //             sb.append(Character.toUpperCase(str.charAt(i)));
    //         } else sb.append(str.charAt(i));
    //     }
    //     return sb.toString();
    // }
    // public static void main(String[] args){
    //     String str = "hi, i am Suryansh tomar";
    //     System.out.println(capitalSize(str));

    // }
    //12.-> Code for String Compression->
    //     public static String compress(String str){
//         String str1 = "";
//         for(int i=0;i<str.length();i++){
//             Integer count =1;
//             while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
//                 count++;
//                 i++;
//             }
//             str1+=str.charAt(i);
//             if(count>1){
//                 str1+=count.toString();
//             }
//         }
//         return str1;
//     }
//    public static void main(String[] args) {
//     String str= "aaaabbbc";
//     System.out.println(compress(str));

//    }

