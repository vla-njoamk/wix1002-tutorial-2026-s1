### Question 1
### a
```java
static int Max(int a, int b, int c){
    if(a > b && a > c){
        return a;
    }
    else if(b > a && b > c){
        return b;
    }
    else{
        return c;
    }
}
```
###  b
```java
static boolean IsSquare(int a){
    return Math.sqrt(a) % 1 == 0;
}
```
### c
```java
static int C(int n, int k){
    return factorial(n)/(factorial(k)*factorial(n-k));
}
static int factorial(int a){
    int result = 1;
    for(int i = 2; i <= a; i++){
        result *= i;
    }
    return result;
}
```
### d
```java
static boolean PentagonalNumber(int a){
    return ((1+Math.sqrt(1+24*a))/6) % 1 == 0;
}
```
### e
```java
static void Count(String a){
    a = a.toUpperCase();
    int numDigit = 0;
    int numLetter = 0;
    for(int i=0; i<a.length(); i++){
        char c = a.charAt(i);
        if(c > 'A' && c < 'Z'){
            numLetter++;
        }
        else if(c > '0' && c < '9'){
            numDigit++;
        }
    }
    System.out.print("Number of letters: "+ numLetter +"\nNumber of digits: "+ numDigit);
}
```
### f
```java
static void RandomNum(int[] num){
    Random r = new Random();
    for(int i=0; i < 10; i++){
        num[i] = r.nextInt(101);
    }
}
```
### g
```java
static void Circle(double r, double[] result;){
    result[0] = Math.PI * r * r;
    result[1] = 2 * Math.PI * r;
}
```
### h
```java
static int GenerateTwice(){
    Random r = new Random();
    int[] num = new int[12];
    for(int i=0; i < num.length; i++){
        num[i] = r.nextInt(11);
        for(int j=0; j < i; j++){
            if(num[i] = num[j]){
                return num[i];
            }
        }
    }
}
```
### Question 2
```java
class Q2{
    static void DecreasingOrder(int a, int b, int c){
        int[] num = {a, b, c};
        for(int i=0; i < num.length - 1; i++){
            for(int j=0; j < num.length - i - 1; j++){
                if(num[j] < num[j+1]){
                    int hold = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = hold; 
                }
            }
        }
        for(int n : num){
            System.out.print(n + " ");
        }
    }
}
```