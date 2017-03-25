/*
Jemma Tiongson
Section #16031
App: Algo
Purpose: Demonstrate ability to program and use methods - adding on to the previous methods lab (Lab13).
-------------------------------------------------------------------------
Methods are a group of statements that work together to execute an operation when called upon.

Terminal:
   Compile: javac Algo.java
   Run: java Algo
_________________________________________________________________________
*/
class Algo{
   //area of Circle
   public static int areaCircle(int radius){
      final double PI = 3.14159;
      double area = PI*Math.pow(radius,2);
      int newArea = (int) area;
      return newArea;
   }
   //circumference of Circle
   public static int circumferenceCircle(int radius){
      final double PI = 3.14159;
      double circCircle = 2*PI*radius;
      int newCirc = (int) circCircle;
      return newCirc;
   }
   //CtoF
   public static int CtoF(int degreesC){
      int constant = 32;
      double fraction = 1.8; //decimal version of 9/5
      double result = (degreesC * fraction) + constant;
      int newResult = (int) result;
      return newResult;
   }
   //FtoC
   public static int FtoC(int degreesF){
      int constant = 32;
      double fraction = .55556; //decimal version of 5/9
      double result = (degreesF - constant)*fraction;
      int newResult = (int) result;
      return newResult;
   }
   //min
   public static int min(int a, int b){
      int minValue;
      if(a < b){
         minValue = a;
      }
      else{
         minValue = b;
      }
      return minValue;
   }
   //max
   public static int max(int a, int b){
      int maxValue;
      if(a < b){
         maxValue = b;
      }
      else{
         maxValue = a;
      }
      return maxValue;
   }
   //odd
   public static boolean isOdd(int a){
      boolean retVal = false;
      if(a%2 != 0){
         retVal = true;
      }
      return retVal;
   }
   //even
   public static boolean isEven(int a) {
      return(a%2==0);
   }
   //palindrome
   public static boolean isPalindrome(String word){
      int begin = 0;
      int end = word.length()-1;
      
      while(begin < end){
         if (word.charAt(begin) != word.charAt(end)){
            return false;
         }
         begin++;
         end--;
      }
      return true;
   }
   //sum of an array
   public static int sumArray(int[] numArray){
      int total = 0;
      for(int i = 0; i < numArray.length; i++){
         total += numArray[i];
      }
      return (total);
   }
   //max value in an array
   public static int maxNum(int[] someArray){
      int max = 0;
      for(int i = 0; i < someArray.length; i++){
         if(someArray[i] > max){
            max = someArray[i];
         }
      }
      return max;
   }
   //min value in an array
   public static int minNum(int[] someArray){
      int min = someArray[0];
      for(int i = 0; i < someArray.length; i++){
         if(someArray[i] <= min){
            min = someArray[i];
         }
      }
      return min;
   }
   //string charAt() - find if char exists in string (returns boolean)
   public static boolean isCharPresent(String word, char c){
      char [] charArray = word.toCharArray();
      boolean result = false;
      for(int i = 0; i<charArray.length; i++){
         if(charArray[i] == c){
            result = true;
         }
      }
      return result;
   }
   //First repeating char in string
   public static char firstChar(String word){
      word = word.toLowerCase();
      int counter = 0;
      char firstRepeat = ' ';
   
      for(int i = 0; i<word.length(); i++){
         for(int j = i+1; j<word.length(); j++){
            if(word.charAt(i) == word.charAt(j)){
               counter++;
               if(counter == 1){
                  firstRepeat = word.charAt(i);
                  break;
               }
            }
         }
      }
      return firstRepeat;
   }
   
   //Last repeating char in string
   public static char lastChar(String word){
      char [] wordArray = word.toCharArray();
      int length = wordArray.length;
      char duplicate = ' ';
   
      for(int i = 0; i<length; i++){
         for(int j = i + 1; j<length; j++ ){
            if(wordArray[i] == wordArray[j]){
               duplicate = wordArray[i];
            }
         }
      }
      return duplicate;
   }
   //Count digits in String
   public static int countDigits (String [] arr){
      int count = 0;
      for(int i = 0; i < arr.length; i++){
         try{
            int num = Integer.parseInt(arr[i]);
            count++;
         }
         catch(NumberFormatException nfe){
         
         }
      }
      return count;
   }
   //Count even numbers in String
   public static int evenDigits (String [] arr){
      int count = 0;
      for(int i = 0; i < arr.length; i++){
         try{
            int num = Integer.parseInt(arr[i]);
            if(num%2 == 0){
               count++;
            }
              
         }
         catch(NumberFormatException nfe){
         
         }
      }
      return count;
   }
   //Reverse array
   public static void reverse(String [] arr){
      int middle = arr.length/2;
      String temp = "";
   
      for(int i = 0; i < middle; i++){
         temp = arr[i];
         arr[i] = arr[arr.length -i-1];
         arr[arr.length -i-1]=temp;
      }
   }
   public static void print(String [] arr){
      for(int i = 0; i < arr.length; i++){
         System.out.print(arr[i]+" \n\n");
      }
   }
   
   //String split
   public static void split(String str){
      String [] arr = str.split(" ");
      for (int i =0; i <arr.length;i++){
         System.out.println(arr[i] +" ");
      }
   }
   //Bubble sort int[]
   public static void bubble(int [] num){
      for (int i =0; i <num.length;i++){
         for(int j = i+1; j <num.length; j++){
            if(num[i] < num[j]){
               int temp = num[i];
               num[i] = num[j];
               num[j] = temp;
            }
         }
      }
   }
   public static void printBubble(int [] num){
      for(int i = 0; i <num.length; i++){
         System.out.println(num [i]);
      }
   }
   //bubble sort string[]
   public static void bubbleString(String [] str){
      String tempString;
      for(int i=0; i<str.length; i++)
      {
         for(int j=1; j< str.length; j++)
         {
            if(str[j-1].compareTo(str[j])>0)
            {
               tempString=str[j-1];
               str[j-1]=str[j];
               str[j]=tempString;
            }
         }
      }
   }
   public static void printString(String [] str){
      for(int i = 0; i < str.length; i++){
         System.out.println(str[i]);
      }
   }
   //Prime number
   public static boolean isPrime(int num){
      if(num < 2){
         return false;
      }
      if(num == 2){
         return false;
      }
      if(num %2 ==0){
         return false;
      }
      for(int i = 3; i < num; i++){
         if(num % i == 0){
            return false;
         }
      }
      return true;
   }
   public static void main (String [] args){
      // 3 tests for area
      System.out.println("Circle with radius 2 has an area of: " +areaCircle(2));
      System.out.println("Circle with radius 5 has an area of: " +areaCircle(5));
      System.out.println("Circle with radius 10 has an area of: " +areaCircle(10));
      System.out.println("---------------------");
      
      // 3 tests for circumference
      System.out.println("Circle with radius 3 has a circumference of: " +circumferenceCircle(3));
      System.out.println("Circle with radius 6 has a circumference of: " +circumferenceCircle(6));
      System.out.println("Circle with radius 11 has a circumference of: " +circumferenceCircle(11));
      System.out.println("---------------------");
      
      // 3 tests for CtoF
      System.out.println("10 degrees Celcius to Fahrenheit is: " +CtoF(10)+ " degrees.");
      System.out.println("-15 degrees Celcius to Fahrenheit is: " +CtoF(-15)+ " degrees.");
      System.out.println("27 degrees Celcius to Fahrenheit is: " +CtoF(27)+ " degrees.");
      System.out.println("---------------------");
      
      // 3 tests for FtoC
      System.out.println("65 degrees Fahrenheit to Celcius is: " +FtoC(65)+ " degrees.");
      System.out.println("101 degrees Fahrenheit to Celcius is: " +FtoC(101)+ " degrees.");
      System.out.println("40 degrees Fahrenheit to Celcius is: " +FtoC(40)+ " degrees.");
      System.out.println("---------------------");
      
      //3 tests for min
      System.out.println("The smallest value between 3 and 5 is: " +min(3,5));
      System.out.println("The smallest value between -3 and 8 is: " +min(-3,8));
      System.out.println("The smallest value between 4 and 1 is: " +min(4,1));
      System.out.println("---------------------");
      
      //3 tests for max
      System.out.println("The larger value between 4 and 9 is: " +max(4,9));
      System.out.println("The larger value between -3 and -7 is: " +max(-3,-7));
      System.out.println("The larger value between 12 and -40 is: " +max(12,-40));
      System.out.println("---------------------");
      
      //tests for isOdd
      int [] oddArray = {5, 2, -23, 35, 26, -258462};
      for(int i = 0; i<oddArray.length; i++){
         System.out.println("Is " +oddArray[i]+ " odd? " + isOdd(oddArray[i]));
      }
      System.out.println("---------------------");
      
      //tests for isEven
      int [] evenArray = {32, -66, 13, 12, 436218};
      for(int i = 0; i<evenArray.length; i++){
         System.out.println("Is " +evenArray[i]+ " even? " + isEven(evenArray[i]));
      }
      System.out.println("---------------------");
      
      //3 tests for Palindrome
      String [] word = {"hamburger", "madam", "racecar"};
      for(int i = 0; i<word.length; i++){
         System.out.println("Is \"" +word[i]+ "\" a palidrome? "+ isPalindrome(word[i]));
      }
      System.out.println("---------------------");
      
      //test for sumArray
      int [] someArray ={1,2,3,4,5};
      System.out.println("The sum of the array {1,2,3,4,5} is: " +sumArray(someArray));
      int [] someArray1 ={10,25,30,45,50};
      System.out.println("The sum of the array {10,25,30,45,50} is: " +sumArray(someArray1));
      int [] someArray2 ={21,32,43,54,65};
      System.out.println("The sum of the array {21,32,43,54,65} is: " +sumArray(someArray2));
      System.out.println("---------------------");
      
      //tests for max Value
      int [] numArray = {51,28,-3,47,1};
      System.out.println("The max value of the array {51,28,-3,47,1} is: " +maxNum(numArray));
      int [] numArray1 = {71,102,303,455,57};
      System.out.println("The max value of the array {71,102,303,455,57} is: " +maxNum(numArray1));
      int [] numArray2 = {-1,-2,3,74,65};
      System.out.println("The max value of the array {-1,-2,3,74,65} is: " +maxNum(numArray2));
      System.out.println("---------------------");
      
      //tests for min Value
      int [] numArray3 = {21,62,-3,74,50};
      System.out.println("The min value of the array {21,62,-3,74,50} is: " +minNum(numArray3));
      int [] numArray4 = {66,32,55,47,-10};
      System.out.println("The min value of the array {66,32,55,47,-10} is: " +minNum(numArray4));
      int [] numArray5 = {-25,-80,-90,-2,-1200};
      System.out.println("The min value of the array {-25,-80,-90,-2,-1200} is: " +minNum(numArray5));
      System.out.println("---------------------");
      
      //tests for charAt
      System.out.println("Does the String \"Jemma\" have the character \'o\'? " +isCharPresent("Jemma", 'o'));
      System.out.println("Does the String \"Hippo\" have the character \'i\'? " +isCharPresent("Hippo", 'i'));
      System.out.println("Does the String \"Friend\" have the character \'e\'? " +isCharPresent("Friend", 'e'));
      System.out.println("---------------------");
      
      //First repeating char in string
      char firstResult = firstChar("boogieboogie");
      System.out.println("The first repeat for the word \"boogieboogie\" is: " +firstResult);
      char firstResult1 = firstChar("rawrbrawl");
      System.out.println("The first repeat for the word \"rawrbrawl\" is: " +firstResult1);
      char firstResult2 = firstChar("MarioCart");
      System.out.println("The first repeat for the word \"MarioCart\" is: " +firstResult2);
      System.out.println("---------------------");
      
      //Last repeating char in string
      char result = lastChar("racecar");
      System.out.println("The last repeating character in the word \"racecar\" is: " +result);
      char result1 = lastChar("Jonathan");
      System.out.println("The last repeating character in the word \"Jonathan\" is: " +result1);
      char result2 = lastChar("bonanza");
      System.out.println("The last repeating character in the word \"bonanza\" is: " +result2);
      System.out.println("---------------------");
      
      //Count digits in String
      String[] myArray = {"hi", "3", "4"};
      int res = countDigits(myArray);
      System.out.println("There are " +res+ " digits in this array.");
      String[] myArray1 = {"2","four","6","8"};
      int res1 = countDigits(myArray1);
      System.out.println("There are " +res1+ " digits in this array.");
      String[] myArray2 = {"33","-89","yo"};
      int res2 = countDigits(myArray2);
      System.out.println("There are " +res2+ " digits in this array.");
      System.out.println("---------------------");
      
      //Count even numbers in String
      String [] myEvenArray = {"40","70","hi", "3", "4"};
      int output = evenDigits(myEvenArray);
      System.out.println("There are " +output+ " even digits in this array.");
      String [] myEvenArray1 = {"42","seventeen","hungry","110","5"};
      int output1 = evenDigits(myEvenArray1);
      System.out.println("There are " +output1+ " even digits in this array.");
      String [] myEvenArray2 = {"Why","is","6","afraid","of", "seven?"};
      int output2 = evenDigits(myEvenArray2);
      System.out.println("There are " +output2+ " even digits in this array.");
      System.out.println("---------------------");
      
      //Reverse array
      String [] originalArray = {"Jemma","am","I"};
      print(originalArray);
      reverse(originalArray);
      print(originalArray);
   
      String [] originalArray2 = {"Lift off!","1","2","3","4","5"};
      print(originalArray2);
      reverse(originalArray2);
      print(originalArray2);
      System.out.println("---------------------");
      
      //String split
      String str = "I think I am getting better at Java!";
      split(str);

      String str1 = "Please give me an A!";
      split(str1);
      System.out.println("---------------------");
      
      //Bubble sort int[] order from largest to smallest int
      int [] num = {2,4,1,9,10,17} ;
      bubble(num);
      printBubble(num);
      System.out.println("---------------------");
      
      //bubble sort string[] alphabetical order
      String [] words = {"cat","rat", "dog","cow", "crow","donkey", "moose"};
      bubbleString(words);
      print(words);
      System.out.println("---------------------");
      
      //Prime number
      boolean resPrime = isPrime(4);
      System.out.println("Is 4 a prime number?" +resPrime);
      boolean resPrime1 = isPrime(17);
      System.out.println("Is 17 a prime number?" +resPrime1);
      boolean resPrime2 = isPrime(29);
      System.out.println("Is 29 a prime number?" +resPrime2);
      System.out.println("---------------------");
      
   }
}