package common._06_input

import java.util.Scanner

/**
 * 키보드 입력
 * - 키보드 입력의 경우엔 자바와 동일하게 `Scanner` 객체를 생성해서 동일하게 사용하면 된다.
 * - 하지만 `Scanner`를 생성하는 방법이 조금 다르니 주의해서 사용하자.
 * - 특히 코틀린에선 in 키워드를 사용할 수 없어서 백틱으로 묶어서 사용하게 된다.
 *    - Scanner(System.in) <-- Wrong!
 *    - Scanner(System.`in`) <-- Correct!
 */

fun main() {
    var value = Scanner(System.`in`)
    var input = value.next()
    print("입력한 값: $input")
}