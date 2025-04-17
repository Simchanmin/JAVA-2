# 202230118 심찬민

# 4/17
## static
- 정적으로 다른 클래스에서 사용 가능
```java
class Example {
    static int count = 0; // 정적 변수
    static int count2 = 3; // 정적 변수
    public Example() {
        count2++;
    }
    public static void printCount() {
        System.out.println("Count: " + count); // 정적 메서드
    }
}

public class static2 {
    public static void main(String[] args) {
        Example ex1 = new Example();
        Example ex2 = new Example();
        System.out.println("Number of objects: " + Example.count2); // 정적 변수 따오기
        System.out.println("Count: " + Example.count); // 정적 변수 따오기
        Example.printCount(); // 정적 메서드 실행
        
    }
}
```
## 접근 지정자
- private, protected, public, 디폴트
- private: 모든 클래스 허용
- protected: 동일 패키지와 자식 클래스
- 디폴트: 동일 패키지만 적용
- private: 외부 완벽 차단
- 클래스나 일부 멤버를 공개하여 다른 클래스에서 접근하도록 허용
- 객체지향 언어의 캡슐화 정책은 "멤버 보호"
## 패키지
- 상호 관련 있는 클래스 파일(컴파일된 .class)를 저장해 관리하는 디렉터리  
- 자바 응용프로그램은 하나 이상의 패키지로 구성성
## 가비지 컬렉션
- 자동으로 메모리 관리 수행
- 메모리 부담을 덜어주고 누수를 방지해줌줌
## 객체 치환
- 레퍼런스를 복사하겠다
- 가비지 객체는 컴파일중 처리됨
```java
int a = 10;
int b = 5;
a = b;
```
## 메서드(오버로딩)
- c/c++의 함수와 동일
- 모든 메서드는 클래스 안에 존재해야함
- 똑같은 이름의 메서드가 여러개 존재

## 객체 배열
```java
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("이름: " + name + ", 나이: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        
        Person[] people = new Person[3]; // 객체 배열 선언 및 생성
        people[0] = new Person("찬민", 30);
        people[1] = new Person("지민", 25);
        people[2] = new Person("유민", 35);// 값 넣기

        for (Person person : people) {
            person.displayInfo();
        }
    }
}
```
## 생성자2
- 생성자는 클래스 이름과 동일해야함
- 매개변수의 갯수나 타입이 다른 이상 갯수 제한이 없음
- 사용자가 생성자를 만들지 않아도 컴파일 때 자동 생성
- 생성자는 클래스의 제일 앞에 있어야함
```java
class Circle {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void printArray(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}

public class Constructor3 {
    public static void main(String[] args) {
        int[] i = {1, 2, 3, 4, 5};// 배열 생성
        Circle circle = new Circle(1);
        circle.printArray(i);// 배열도 인스턴스가 가능하다
    }
}
```
```java
int foo = 100;
Car Mycar = new Car(); // 변수나 객체나 같은 형태이다
```
#### this 레퍼런스
- 객체 자신의 레퍼런스

# 4/10
## 생성자
- 객체가 생성되는 순간에 자동으로 호출됨
- 객체가 생성될때 초기화 목적으로 실행됨
- 리턴타입을 지정하지 않음
```java
class Person{
    String name;
    int age;
}
    Person(String name, int age){ //매개변수가 있는 생성자
        this.name = name;
        this.age = age;
    }
    Person(){ //매개변수가 없는 생성자(초기화)
        this.name = "???";
        this.age = 0;
    }
    void info(){
        System.out.println(name + "" + age); //출력 메서드
    }
public class Constructor{
    public static void main(String[] args){
        Person person1 = new Person("sim",23);
        Person person2 = Person();
        person1.info();
        person2.info();
    }
}
```
## 절차지향 언어
- 작업 순서를 표현하는 컴퓨터 명령 집함
- 함수들의 집합으로 프로그램 작성
## 객체지향 언어
- 컴퓨터가 수행하는 작업을 객체들 간의 상호 작용으로 표현
- 클래스 혹은 객체들의 집합으로 프로그램 작성
```java
public class Class1 {
    public static void main(String[] args) {
        Car MyCar = new Car(); //클래스로 객체 생성
        MyCar.brand = "Toyota"; //값 넣어주기
        MyCar.speed = 120;
        MyCar.drive(); //함수(메서드) 실행
    }
}
class Car{
    String brand; //가진 특성들
    int speed;
    void drive(){ //객체가 가질 함수
        System.out.println(brand + "가" + speed + "Km/h로 달림");
    }
}
```
## 객체지향언어의 목적
- 실세계에 대한 쉬운 모델링
- 실세계에서 발생한 일을 프로그래밍
- 현실에선 절차나 과정보다 물체(객체) 간의 상호 작용으로 묘사하는것이 용이함
## 클래스와 객체
- 클래스 : 객체의 틀로서 객체를 생성하기 위한 구조를 정의함  
public Class Circle  
//전역 //선언 //이름
- 객체 : 클래스를 기반으로 설계된 실체  
클래스에서 정의된 데이터와 메서드(동작)을 가짐  
인스턴스라고도 불림

## try - catch 
- 예외 확률이 있는 코드가 예외 발생 시 다른 코드를 실행하게 함
```java
try {
    int result = 10 / 0; //오류 발생
} catch (ArithmeticException e) { //0으로 나눌때 발생하는 오류
    System.out.println("예외 발생");
}
```

# 4/3
## 2차원 배열
- 앞이 행, 뒤쪽이 열
```java
int[][] array2 = new int[3][3]; //3*3 배열 설정

int[][] array2 = { //초기값 바로 설정
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

int[][] array2 = new int[3][]; //행만 설정하고 열은 나중에 설정
array2[0] = new int[2];
array2[1] = new int[3];
array2[2] = new int[4];

int[] row1 = {1, 2, 3}; //1차원 배열을 두개 참조하여 2차원 배열을 만듦
int[] row2 = {4, 5, 6};
int[][] array2 = {row1, row2};

Array2.length / Array2[i].length //첫 행의 길이와 i번째 행의 길이
```
## 1차원 배열
- 인덱스와 인덱스에 대응하는 데이터들로 이루어진 자료구조 한번에 많은 공간 선언
- 반복문으로 관리하기 적합함
- 인덱스는 0번으로 시작
```java
int[] numbers = new int[5]; // 크기가 5인 int 배열 선언

int[] numbers = {10, 20, 30, 40, 50}; // 초기값 설정

int[] numbers;
numbers = new int[3]; // 크기를 나중에 정의

numbers[2] = 3; //인덱스가 2인 공간에 3대입

int[] numbers = new int[5];
int[] Mynumbers = numbers; //같은 공간을 공유하는 다른 배열 생성

int[] intarray = new int[5];
int size = intarray.length; //배열의 크기를 size에 저장
```
## 반복문
### for - each
```java
int [] n = {1,2,3,4,5};
int sum = 0;
for(int k : n){ //배열의 0번째 인덱스부터 끝까지 k에 대입
    sum += k;
};
```
### continue / break
- 각각 반복문을 진행 / 중지시키기 위해 사용용
### 중첩반복문
```java
for (int i = 2; i <= 9; i++) {
            System.out.println(i + "단:");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            } //여기서 j값 초기화 된 뒤 첫 for문으로 돌아감
            System.out.println();
        }
```
### do-while
```java
char a = 'a';
do {
        System.out.println(a);
        a = (char) (a+1);
    } while (a == 'z');
//코드가 일단 한번은 실행됨
//아스키 코드값 참조해서 출력력

```
### while
```java
while(int i = 10 > 0){ //i가 0보다 클 동안 
           System.out.println(i); 
           i--
        }

```
### for
```java
for (초기문; 조건식; 반복 후 작업){
    작업문
};

for(int i = 0; i<10; i++){
    System.out.println(i);
};
```


# 3/27
### 연산자
```
- 증감연산자 = ++, --
- 산술연산자 = +, -, *, /, %
- 비교연산자 = >, <=, !=
- 대입연산자 = a*=b, a/=b등등
- 논리연산자 = !, a^b, ||, && true/false값으로 반환
(age >= 20) && (age < 30)
- 삼항연산자 = 연산자가 3개 /if문을 간단하게 대체
int big = (x>y) ? x : y 참이면 x, 거짓이면 y를 대입
```
#### 비트연산자
```
<<, >> 비트 이동 
성능이 중요한 경우나 최적화가 필요한 경우 사용
데이터 압축 및 최적화
해싱 및 암호화 - 비트 연산을 활용해 해시 함수 및 암호화 알고리즘 최적화
빠른 연산
```
### System.in 
- 표준 입력 스트림
- 입력된 키를 바이트로 리턴      
- 바이트를 문자나 숫자로 변환해야함
### Scanner
- 읽은 바이트를 다양한 타입으로 변환하여 리턴  
- java.util.Scanner 선언 필요  
- 객체를 사용해 사용  
- 입력된 값을 공백으로 구분되는 토큰 단위로 읽음


 var = 형식을 자동으로 만들어줌  
 final = 상수 형식, 값을 초기에 설정해줘야 하며 변경 불가  
 print와 println = 자동 줄바꿈 유무 차이  
 printf = 형식을 지정하여 출력 ex)%d / %f / %s

```java
public class test {
    public static void main(String[] args) {
        final double PI = 3.14; //상수 설정  
        double radius = 10.2;  
        double circleArea = radius*radius*PI;  

        System.out.print("반지름" + radius + ", ");   
        System.out.println("원의 면적 = " + circleArea);  
    }
}
```


# 3/21
#### 불필요 파일 제거
#### 간단한 변수 활용(test.java)
#### 배열, 논리연산자, while문 연습





# 3/20
#### VScode에서 자바 프로젝트 생성 방법   
#### git 연동 
#### 변수 이름은 정수 n- 실수 f- bool b-
----
-
*
<!---마크다운 코드블럭 처리법--->
~~~java
public class test {
    public static void main(String[] args) {
        int npmt1 = 1;
        int npmt2 = 3;
        int npmt3 = npmt1 + npmt2;
        System.out.println(npmt3);
    }
}

~~~

```c
public class test {
    public static void main(String[] args) {
        int npmt1 = 1;
        int npmt2 = 3;
        int npmt3 = npmt1 + npmt2;
        System.out.println(npmt3);
    }
}
```