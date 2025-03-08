package common._01_variables

/**
 * 변수 선언 (2)
 * - 코틀린은 타입을 추론하는 기능이 있어 별도로 타입을 지정해 주지 않아도 된다.
 * - 하지만 변수 선언 시 타입 명시적으로도 선언할 수 있다.
 *    - var name: String = "Alice"
 *    - var age: Int = 10
 *    - var pi: Double = 3.14
 * - 이때 자바에서 제공되는 모든 타입들이 다 클래스 타입으로 제공된다.
 */

fun main() {
    var name = "Alice"
    var age = 20
    var pi = 3.14

    println("""
        name = $name
        age = $age
        pi = $pi
    """.trimIndent())
}