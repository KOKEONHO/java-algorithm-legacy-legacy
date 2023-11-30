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

#### 819. Most Common Word

- `isEmpty()` 메서드와 `isBlank()` 메서드는 엄연히 다름
  - `isEmpty()`: 문자열의 길이가 0인 경우, 즉 완전히 빈 문자열인 경우 `true` 반환
  - `isBlank()`: 문자열이 비어있거나 공백 문자(`" "`, `"\t"` 등등)로만 구성되어 있는 경우 `true` 반환
- 정규표현식
  - `[]`: 문자 클래스를 정의하는 데 사용 → 문자 클래스 = 괄호 안에 포함된 어떤 한 문자에 일치  
    ex. `[abc]`: `a`, `b`, or `c` 중 하나의 문자와 일치  
    범위 지정도 가능 → `[a-z]` = 모든 소문자 영문자와 일치
  - `^`: 대괄호 안에서 사용할 경우 → 부정 문자 클래스  
    ex. `[^a-z]`: 소문자 영문자를 제외한 모든 문자와 일치
