package common._01_variables

/**
 * 변수 선언 (4)
 * - 자바에선 반드시 클래스 선언이 필요하고 그 다음 main() 안에서 뭔가를 작성할 수 있었다.
 * - 하지만 코틀린은 클래스를 선언할 필요 없이 그냥 main()을 선언할 수 있고, 그 바깥에다가 값들을 선언하거나 지정할 수 있다.
 * - 추가로 const 키워드를 붙여서 컴파일 타임 상수로 만들 수가 있는데 이를 탑 레벨 상수라고 한다.
 * - 컴파일 타임 상수는 메인보다 우선해서 컴파일이 되고 이 값을 사용하면 성능상 우위를 가져올 수가 있다.
 */

const val name = "Alice"
const val age = 20
const val pi = 3.14

fun main() {
    println("""
        name = $name
        age = $age
        pi = $pi
    """.trimIndent())
}
