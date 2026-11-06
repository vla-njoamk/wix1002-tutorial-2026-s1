### Question1 
### a
```java
double[] numbers = new double[12];
```
### b
```java
char[] alphabet = {'A','B','C','D','E'};
```
### c
```java
String[] names = new String[100];
```
### d
```java
int[][] num = new int[6][2];
```
### e
```java
int[][] num = {{6,9},{2,5},{4,6}};
```
### f
```java
int[][] num = new int[3][2];
num[0] = {6,9};
num[1] = {2,4};
num[2] = {3,7};
```
### g
```java
for(int i = 0; i < contact.length; i++){
    System.out.println(contact[i]);
}
```
### Question 2
### a
```java
String[] code = {"AAA", "AAB", "AAC", "AAD"}; //use "" for String
```
### b
```java
int sum = 0; //initialize sum
int[] num = new int[10]; //int[]
for(int k=0; k< num.length; k++)//use < to avoid overflow
    sum+=num[k]; //use [] to assign value
```
### c
```java
int [][]t = new int[3][3];   //declare column
t[1][2] = 5; 
```
### d
```java
int i=4; 
int []score = new int[5]; 
score [1] = 78; 
score[i] = 100; //max index = 4
```
### Question 3
```java
marks = {961,31,1,31,31}
```
### Question 4
```java
int count = 0;
for(String word : sentence){
    if(word.equalsIgnaoreCase("the")){
        count++;
    }
}
System.out.print(count);
```
### Quetion 5
```java
for(int i = 0; i < sentence.length; i++){
    String reversed = "";
    for(int j = entence[i].length()-1; j >= 0; j--){
        reversed += sentence[i].charAt(j);
    }
    sentence[i] = reversed;
}
for(int k = 0; k < sentence.length/2; k++){
    String hold = sentence[k]
    sentence[k] = sentence[sentence.length-(k+1)];
    sentence[sentence.length-(k+1)] = hold;
}
System.out.print(Arrays.toString(sentence));
```
### Question 6
```java
Random random = new Random();
int num = random.nextInt(256);
System.out.println("Random number: " + num);
int binary = 0;
int place = 1;
while(num != 0){
    binary += (num % 2) * place;
    num /= 2;
    place *= 10;
}
System.out.print(binary);
```