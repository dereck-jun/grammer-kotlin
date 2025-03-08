package common._03_string

/**
 * 문자열
 * - 자바에서 제공하는 기능들 대부분이 있고, 확인하려면 문자열 변수에 `.`을 찍어서 확인해보자.
 * - 코틀린은 문자열의 특정 번째의 글자를 취할 때 간단하게 배열처럼 접근할 수가 있다.
 *    - var hello = "Hello"
 *    - print(hello[0])
 *
 * - 자바에서 문자열을 결합하는 일반적인 방법은 `+` 연산자를 사용하는 것이었다.
 *    - var name = "Alice"
 *    - print("제 이름은 " + name + "입니다.")
 *
 * - 코틀린은 String Interpolation 기능을 제공해서 문자열 안에 바로 변수를 넣을 수가 있다.
 * - 이때 공백이 없으면 에러가 발생하는데, 이 경우엔 앞뒤에 중괄호로 감싸버리면 되고, 추가로 수식을 만들어서 넣을 수도 있다.
 *    - var name = "Alice"
 *    - print("제 이름은 $name입니다.")  <--  Wrong!
 *    - print("제 이름은 $name 입니다.")  <-- Correct!
 *    - print("제 이름은 ${name + 10}입니다.")  <-- Correct!
 */

fun main() {
    var hello = "Hello"
    println("안녕하세요는 영어로 " + hello + "입니다.")

    hello.uppercase()
    println("대문자로 바꾸면 $hello 입니다.")

    hello.lowercase()
    println("소문자로 바꾸면 $hello 입니다.")

    print("앞글자 하나만 가져와볼까요?: ")
    println(hello[0])

    println("중괄호를 사용해서 공백없이 붙이기: ${hello}!")
    println("중괄호 안에 수식을 추가할 수도 있어요: ${hello + 10}")
}