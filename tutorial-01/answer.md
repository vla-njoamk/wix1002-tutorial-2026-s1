# Tutorial 01 — Answers

## Part I

### Question 1
```text
I:read numbers a and b  
P:product = a*b  
O:display product 

Start
read numbers a and b  
product = a*b  
display product  
Stop
```

```mermaid
flowchart TD
    A([Start]) --> B[/read numbers a and b/]
    B --> C[product = a*b]
    C --> D[/display product/]
    D --> F([End])
```
### Question 2
```text
I:a generated random number n  
P:compare n with 50  
O:display comparison result

Start  
generate random number n  
if(n>50)  
    display "Greater than 50"  
else  
    display "Lower than 50"  
end if  
Stop
```

```mermaid
flowchart TD
    A([Start]) --> B[generate random number n]
    B --> C{if n>50}
    C --True--> D[/display "Greater than 50"/]
    C --False--> E[/display "Lower than 50"/]
    D --> F([End])
    E --> F([End])
```
### Question 3
```text
I:mark
P:check validity and compare mark with 40
O:"Invalid mark" or "Pass" or "Fail"

Start
read mark
if(mark<0 or mark>100)
    display "Invalid mark"
else if (mark < 40)
    display "Fail"
else
    display "Pass"
end if 
Stop
```
```mermaid
flowchart TD
    A([Start]) --> B[/read mark/]
    B --> C{if mark<0 or mark>100}
    C --True--> D[/display "Invalid mark"/]
    C --False--> E{if mark<40}
    E --True--> F[/display "Fail"/]
    E --False--> G[/display "Pass"/]
    D --> H([Stop])
    F --> H([Stop])
    G --> H([Stop])
```
### Question 4
```text
I:read dice 1 ,d1 and dice 2,d2
P:compare d1 and d2
O:display winner or tie

Start
read dice 1 ,d1 and dice 2,d2
if(d1 = d2)
    display "Tie"
else if (d1 > d2)
    display "Player 1 win"
else
    display "Player 2 win"
end id
Stop
```

```mermaid
flowchart TD
A([Start]) --> B[/read dice 1 ,d1 and dice 2,d2/]
B --> C{d1 = d2}
C --True--> D[/display "Tie"/] --> H([Stop])
C --False--> E{d1 > d2}
E --True--> F[/display "Player 1 win"/]--> H([Stop])
E --False--> G[/display "Player 2 win"/] --> H([Stop])

```
### Question 5
```text
I:read width and length
P:calculate perimeter 
O:display perimeter

Start
read width and length
perimeter = 2*(width + length)
display perimeter
Stop
```
```mermaid 
flowchart TD
A([Start]) --> B[/read width and length/]
B --> C[perimeter = 2*（width + length）]
C --> D[/display perimeter/] 
D--> E([Stop])
```
### Question 6
```text
I:10 generated random numbers
P:compare each number
O:display the minimum number

Start
generate a random numbers,a
min = a
count = 1
while(count < 10)
    generate a random number, n
    if(n < min)
        min = n
    endif
    count++
end while
display min
Stop
```
```mermaid
flowchart TD
A([Start]) --> B[generate a random number,a]
B --> C[min = a, count = 1] 
C --> D{while count < 10}
D --True--> E[generate a random number,n]
D --False-->F[/display min/]-->Z([Stop])
E --> G{if n < min}
G --True-->H[min = n]-->I[count++]
G --False--> I
I -->D
```
### Question 7
```text
I:10 generated numbers (10 - 100)
P:modulus numbers by 2 and count even and odd number
O:display total of even and odd number

Start
even = 0
odd = 0
count = 0
while(count < 10)
    generate random number，n(10 - 100)
    if(n%2 = 0)
        even++
    else
        odd++
    end if
    count++
end while
display even , odd
Stop
```

```mermaid
flowchart TD
A([Start]) --> B[even = 0 ,odd = 0 ,count = 0]
B --> C{while count < 10}
C --True--> D[generate random number,n]
C --False--> E[/display even , odd/]-->Z([Stop])
D --> F{if n%2 = 0}
F --True--> G[even++]-->I[count++]
F --False--> H[odd++]-->I-->C
```
### Part 2

### Question 8
```text
I:read sentence
P:count number of U and M in sentence
O:display number of U and M in sentence

Start
read sentence
numU = 0
numM = 0
count = 0
while(count < sentence.length)
    c = char.At(count)
    if(c == 'U')
        numU++
    else if(c == 'M')
        numM++
    end if
    count++
end while
display numU and numM
Stop
```
```mermaid
flowchart TD
A([Start]) --> B[/raed sentence/]
B --> C[numU = 0, numM = 0, count = 0]
C --> D{while count < sentence.length}
D --True--> E[c = charAt（count）]
D --False-->M[/display numU and numM/]-->Z([Stop])
E --> F{if c == 'U'}
F --True--> G[numU++]-->J
F --False--> H{if c == 'M'}
H --True--> I[numM++]-->J
H --False--> J[count++]-->D
```

### Question 9
```text
I:raed webpage text and keyword
P:inspect frequency of keyword in text
O:display frequency

Start
read webpage text and keyword
String[] words = text.toLowerCase().split([^a-z0-9]+)
count = 0
for(i = 0, i < words.length, i++)
    if(words = keyword)
        count++
    end if
end while
display count
Stop
```
```mermaid
flowchart TD
A([Start]) --> B[/read webpage text and keyword/]
B --> C["String[] words = text.toLowerCase().split([^a-z0-9]+), count = 0, i = 0"]
C --> D{while i < words.length}
D --True--> E{"if words[i] = keyword"}
D --False--> H[/display count/] --> Z([Stop])
E --True--> G[count++] -->F
E --False--> F[i++] --> D
```

### Question 10
```text
I:read student list
P:inspect number of female student
O:display the number

Start
i = 0
count = 0
while (i < 100)
    read gender for student i
    if(gender = female)
        count++
    end if
    i++
end while
display count
Stop
```
```mermaid
flowchart TD
A([Start]) --> B[i = 0, count = 0]
B --> C{while i < 100}
C --True--> D[/read gender for student i/]
C --False--> H[/display count/] --> Z([Stop])
D --> E{if gender = female}
E --True--> F[count++]-->G
E --False--> G[i++]-->C
```
### Question 11
```text
I:5 generated random numbers
P:sort the numbers list in descending
O:display list

Start
generate 5 random numbers in a list
current = list[0]
j=0
i=0
while(i < 4)
    while(j < 4)
        if(list[i] > current)
            temp  = current
            current = list[i]
            list[i] = temp
        end if
        j++
    end while
    i++
end while
display list
Stop
```
```mermaid
flowchart TD
A([Start]) --> B[generate 5 random numbers in a list]
B --> C["current = list[0], i = 0,j=0"]
C --> D{while i < 4} 
X --True--> E{"if list[i] > current"}
X --False--> Y[i++] --> D
D --True--> X{j < 4}
D --False--> H[/display list/]-->Z([Stop])
E --True--> F["temp  = current, current = list[i], list[i] = temp"] --> G
E --False--> G[j++]-->X
```
### Question 12
```text
I:guess
P:compare guess with target
O:"Higher" or "Lower" or "Correct"

Start
generate a random number,a
read guess,n
if (a = n)
    display "Correct"
else if (n > a)
    display "Lower"
else
    display "Higher"
end if
Stop
```
```mermaid
flowchart TD
A([Start]) --> B[genegrate a random number, a] --> C[/read guess,n/]
C --> D{if a = n}
D --True--> E[/display "Correct"/]-->Z([Stop])
D --False--> F{if n > a}
F --True--> G[/display "Lower"/]-->Z
F --False--> H[/display "Higher"/]-->Z
```



