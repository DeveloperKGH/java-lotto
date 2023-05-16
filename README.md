# 로또 - TDD

---

> NEXTSTEP TDD, 클린 코드 with Java 16기, 로또 - TDD 관련 미션을 구현한 저장소입니다.

# 목차

- [1단계 - 문자열 계산기](#1단계---문자열-계산기-요구사항)
- [2단계 - 로또(자동)](#2단계---로또--자동--요구사항)


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
- [x] 나눗셈 사칙연산 기호가 포함 된 입력된 문자열이 나눗셈 사칙연산의 정수 결과값이 반환되는지 확인(ex: "11 / 2" -> 5)
- [x] 나눗셈 사칙연산시 0으로 나누려는 경우 IllegalArgumentException 예외가 발생하는지 확인 (ex: "4.7 / 0")
- [x] 입력된 순서대로 사칙연산이 되는지 확인 (ex: "1 + 5 * 3" -> 18)
---

<br>

## 2단계 - 로또(자동) 요구사항

---
- [x] 입력된 금액이 1000원 미만인 경우 IllegalArgumentException 예외가 발생하는지 확인 (ex: 900)
- [x] 입력된 금액이 1000원 단위가 아닌 경우 IllegalArgumentException 예외가 발생하는지 확인 (ex: 1150)
- [x] 입력된 금액만큼 로또 구입 가능한 갯수가 반환되는지 확인 (ex: 15000 -> 15개)
- [x] 로또 번호의 범위가 유효하지 않다면 IllegalArgumentException 예외 발생 (ex: num < 1 or num > 45)
- [x] 로또 번호 객체가 정상적으로 생성되는지 확인
- [x] 로또 티켓 객체가 정상적으로 생성되는지 확인
- [x] 로또 티켓의 번호가 6개가 아닌경우 IllegalArgumentException 예외가 발생하는지 확인 (ex: [1, 2, 3])
- [x] 로또 티켓의 번호 중 중복이 있다면 IllegalArgumentException 예외가 발생하는지 확인 (ex: [1, 2, 2, 3, 3, 4])
- [x] 생성된 로또 티켓의 번호가 오름차순 정렬이 되어 반환되는지 확인
- [x] 입력된 문자열이 콤마+공백을 기준으로 분리되는지 확인 (ex: "1, 2, 3" -> [1, 2, 3])
- [x] 입력된 문자열이 유효하지 않은 경우 IllegalArgumentException 예외가 발생하는지 확인 (ex: null or "")
- [x] 입력된 당첨번호가 6개가 아닌경우 IllegalArgumentException 예외가 발생하는지 확인 (ex: "1, 2, 3")
- [x] 입력된 당첨번호의 범위가 유효하지 않다면 IllegalArgumentException 예외 발생 (ex: num < 1 or num > 45)
- [x] 당첨번호 객체가 정상적으로 생성되는지 확인
- [x] 당첨번호가 6개가 아닌경우 IllegalArgumentException 예외가 발생하는지 확인
- [x] 당첨번호와 로또 티켓 번호를 비교하여 일치하는 수만큼 반환되는지 확인 (ex: [1, 2, 3], [2, 3] -> 2) 
- [x] 당첨된 갯수에 해당하는 상금이 반환되는지 확인 (ex : 3개 : 5000원, 4개 : 50000원, 5개 : 1500000원, 6개 : 2000000000원) 
- [x] 당첨된 금액이 0인 경우 수익률도 0 이 반환되는지 확인
- [x] 당첨된 금액이 0 이상인 경우 소숫점 둘째자리까지의 수익률이 계산되어 반환 되는지 확인  (5000/14000 -> 0.35)
- [ ] 계산된 수익률이 1을 기준으로 이득 or 손해 가 반환되는지 확인
---


