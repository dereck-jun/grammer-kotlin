package common._02_transformation

/**
 * 4. 형 변환
 * - 자바에서는 byte -> int로 대입 하는 경우 묵시적 타입 캐스팅이 일어나서 별도의 형 변환을 명시적으로 작성할 필요가 없었다.
 * - 하지만 코틀린에선 타입이 다르면 들어가지지 않는다.
 * - Int -> Long, Long -> Int, String -> Int, Int -> String ... 모두 마찬가지다.
 *    - var intValue = 1
 *    - var longValue = 1L
 *    - var strValue = "10"
 *    - longValue = intValue <-- Wrong!
 *    - longValue = (Long) intValue <-- Wrong!
 *    - longValue = intValue.toLong() <-- Correct!
 * - 형 변환 시엔 `.toXxx`와 같은 것들을 사용하면 된다.
 *    - intValue = strValue.toInt()
 *    - strValue = intValue.toString()
 */

fun main() {

    var intValue = 1
    var longValue = 1L
    var strValue = "1"

    // longValue = intValue
    // longValue = (Long) intValue
    longValue = intValue.toLong()
    intValue = longValue.toInt()

    strValue = intValue.toString()
    intValue = strValue.toInt()

    println("""
        intValue = $intValue
        longValue = $longValue
        strValue = $strValue
    """.trimIndent())
}
