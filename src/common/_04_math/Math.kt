package common._04_math

import kotlin.math.*

/**
 * 숫자를 다루는 기능
 * - 자바에서 제공하는 `Math`를 사용할 수 있다.
 * - 하지만 코틀린에서 제공하는 `math`를 사용하는 것이 아마도 성능이 더 좋을 것이다.
 * - 노란 불 안들어오는 선에서 잘 찾아서 사용하자.
 */

fun main() {
    var i = 10
    var j = 20

    println(max(i, j))
    println(min(i, j))
}