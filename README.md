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