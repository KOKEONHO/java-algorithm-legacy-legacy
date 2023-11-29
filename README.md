# ✏️ java-algorithm

Java로 알고리즘 문제들을 푼 저장소입니다.

## Baekjoon

### Gold

### Silver

## Programmers

## Leet Code

#### 125. Valid Palindrome

- `StringBuilder`는 멀티 스레드 환경에서 안전하지 않음.
- 문자 단위로 추출하여 `char`(원시 자료형)로 처리하는 풀이보다 정규식 + 클래스를 비교하는 풀이가 속도가 훨씬 느림.

#### 344. Reverse String

- Java에서 값 스왑은 주로 임시 변수 사용
- 예시 답안처럼 문자 배열에서 원시 자료형인 `char`로 문자들을 직접 조작하니 실행 속도 매우 빠름

#### 937. Reorder Data in Log Files

- `Collections.sort()`에 `Comparator` 이용하면 정렬 조건 설정 가능
    - 두 값이 동일 → `0`
    - 비교 대상의 순서가 앞으로 와야 할 경우 → `1`
    - 비교 대상의 순서가 뒤에 머물러야 할 경우 → `-1`
- Java 8 이상 → `Comparator`에 람다 표현식 사용 가능
- `List`를 `String[]`로 변환하려면 `toArray(new String[0])` 사용