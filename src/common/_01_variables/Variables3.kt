package common._01_variables

/**
 * 변수 선언 (3)
 * - 상수는 `val`이라는 키워드를 사용한다.
 *    - val: 자바의 final 같은 키워드로 변수 선언 하는 것. 한번 초기화하면 재할당 불가능.
 */

fun main() {
    var name = "Alice"
    var age = 20

    val pi = 3.14
    // pi = 4.14    <-- 재할당 불가능!

    println("""
        name = $name
        age = $age
        pi = $pi
    """.trimIndent())
}