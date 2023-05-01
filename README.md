# 로또 - TDD

---

> NEXTSTEP TDD, 클린 코드 with Java 16기, 로또 - TDD 관련 미션을 구현한 저장소입니다.

# 목차

- [1단계 - 문자열 계산기](#1단계---문자열-계산기-요구사항)


## 1단계 - 문자열 계산기 요구사항

---
- [x] 유효하지 않은 값이 입력된 경우 IllegalArgumentException 예외가 발생하는지 확인 (ex: null or "")
- [x] 입력된 문자열을 빈공백 기준으로 분리 시, 배열의 사이즈가 짝수가 반환되는 경우 IllegalArgumentException 예외가 발생하는지 확인 (ex: "1 + " -> 2)
- [x] 입력된 문자열을 빈공백 기준으로 분리 시, 홀수번째 원소가 숫자가 아닌 경우 IllegalArgumentException 예외가 발생하는지 확인(ex: "1 + ㄱ" -> ["1", "+", "ㄱ"])
- [x] 입력된 문자열을 빈공백 기준으로 분리 시, 짝수번째 원소가 사칙연산 기호가 아닌 경우 IllegalArgumentException 예외가 발생하는지 확인(ex: "1 ㄱ 3" -> ["1", "ㄱ", "3"])
- [x] 공백을 포함한 입력된 문자열을 빈공백 기준으로 분리가 되는지 확인 (ex: "1 + 3" -> ["1", "+", "3"])
- [x] 덧셈 사칙연산 기호가 포함 된 입력된 문자열이 덧셈 사칙연산 결과가 반환되는지 확인 (ex: "0.1 + 0.2" -> 0.3)
- [x] 뺄셈 사칙연산 기호가 포함 된 입력된 문자열이 뺄셈 사칙연산 결과가 반환되는지 확인 (ex: "2.2 - 1" -> 1.2)
- [x] 곱셈 사칙연산 기호가 포함 된 입력된 문자열이 곱셈 사칙연산 결과가 반환되는지 확인 (ex: "3.3 * 2" -> 6.6)
- [ ] 나눗셈 사칙연산 기호가 포함 된 입력된 문자열이 나눗셈 사칙연산의 정수 결과값이 반환되는지 확인(ex: "10 / 2" -> 5)
- [ ] 나눗셈 사칙연산시 0으로 나누려는 경우 IllegalArgumentException 예외가 발생하는지 확인 (ex: "4.7 / 2" -> 2)
- [ ] 입력된 순서대로 사칙연산이 되는지 확인 (ex: "1 + 5 * 3" -> 18)
---


