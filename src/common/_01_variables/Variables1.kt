package common._01_variables

/**
 * 변수 선언 (1)
 * - 코틀린에서는 `var`이라는 키워드로 가변 변수를 선언할 수 있다.
 *    - var: 가변 변수. 값 변경 가능
 */

fun main() {
    var name = "Alice"
    var age = 10
    var height = 162.2

    println("""
        name = $name
        age = $age
        height = $height
    """.trimIndent())
}