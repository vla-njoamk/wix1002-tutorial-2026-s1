## Question 1
### a
```java
int n = 1;
while (n*n*n < 2000){
    n++;
}
System.out.print(n-1);
```
### b
```java
for(int num = 1; num < 13; num++){
    System.out.println(num*num);
}
```
### c
```java
 Random random = new Random();
for(int j = 0; j<4; j++){
    System.out.println("\n");
    for(int i = 0; i < 5; i++){
        int num = random.nextInt(101);
        System.out.printf("%2d\t",num);
    }
}
```
### d
```java
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
for(int i = 1; i <= num; i++){
    int sum +=i;
}
```
### e
```java
double total = 0;
for(int i = 1; i < 26; i++){
    total += (double)i/(26-i);
}
System.out.printf("%.2f",total);
```
### Question 2
### a
```java
for (x = 10; x < 0; x--) //infinite loop
    sum += x;
```
### b
```java
int x = 0; //initialise x
int y = 0; //initialise y
do{ // add {} 
    x += 2;     
    y += x;                 
    System.out.println(x + " and " + y);
} while (x < 100)
```
### c
```java
for ( x==1, y==20; x < y, x++, y-=2){ //use {} instead of ; for if
    System.out.println(x + " " + y); //& to +
}
```
### d
```java
int i =1; //declare variable type
while(i<=10) {   //make if statement functionable 
    if (i==10)       
    System.out.println("Program End"); 
}
```
### Question 3
```java
int num = 1;
int num1 = 0;
int num2 = 0;
for(int i = 0; i < 10; i++){
    System.out.println(num);
    num2 = num1;
    num1 = num;
    num = num1 + num2;
}
```
### Question 4
```java
String s;
for(int i = 1; i <= s.length(); i++){
    char c = s.charAt(s.length() - i);
    System.out.print(c);
}
```