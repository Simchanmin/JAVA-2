# 4/10
## 객체지향언어의 목적
- 실세계에 대한 쉬운 모델링
- 실세계에서 발생한 일을 프로그래밍
- 현실에선 절차나 과정보다 물체(객체) 간의 상호 작용으로 묘사하는것이 용이함
## 클래스와 객체
- 클래스 : 객체의 틀로서 객체를 생성하기 위한 구조를 정의함
- 객체 : 클래스를 기반으로 설계된 실체 
클래스에서 정의된 데이터와 메서드(동작)을 가짐

## try - catch 
- 예외 확률이 있는 코드가 예외 발생 시 다른 코드를 실행하게 함
```
try {
    int result = 10 / 0; //오류 발생
} catch (ArithmeticException e) { //0으로 나눌때 발생하는 오류
    System.out.println("예외 발생");
}
```

# 4/3
## 2차원 배열
- 앞이 행, 뒤쪽이 열
```
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
```
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
int [] n = {1,2,3,4,5};
int sum = 0;
for(int k : n){ //배열의 0번째 인덱스부터 끝까지 k에 대입입
    sum += k;
};
### continue / break
- 각각 반복문을 진행 / 중지시키기 위해 사용용
### 중첩반복문
```
for (int i = 2; i <= 9; i++) {
            System.out.println(i + "단:");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            } //여기서 j값 초기화 된 뒤 첫 for문으로 돌아감
            System.out.println();
        }
```
### do-while
```
char a = 'a';
do {
        System.out.println(a);
        a = (char) (a+1);
    } while (a == 'z');
//코드가 일단 한번은 실행됨
//아스키 코드값 참조해서 출력력

```
### while
```
while(int i = 10 > 0){ //i가 0보다 클 동안 
           System.out.println(i); 
           i--
        }

```
### for
```
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

```
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
~~~
public class test {
    public static void main(String[] args) {
        int npmt1 = 1;
        int npmt2 = 3;
        int npmt3 = npmt1 + npmt2;
        System.out.println(npmt3);
    }
}

~~~

```
public class test {
    public static void main(String[] args) {
        int npmt1 = 1;
        int npmt2 = 3;
        int npmt3 = npmt1 + npmt2;
        System.out.println(npmt3);
    }
}
```