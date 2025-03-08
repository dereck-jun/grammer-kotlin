package common._05_random

import kotlin.random.Random

/**
 * Random 값 얻기
 * - `Random.nextInt()`를 사용해서 랜덤한 Int 값을 얻을 수 있다.
 * - 범위 지정 또한 가능한데 사용할 때 넣은 값이 포함(Inclusive)인지 미포함(Exclusive)인지 잘 확인해서 사용하자.
 *    - Random.nextInt(0, 100) <-- 0 <= x < 100 범위의 랜덤한 값
 *    - Random.nextDouble(0.0, 1.0) <-- 0.0 <= x < 1.0 범위의 랜덤한 값
 */

fun main() {
    var randomInt = Random.nextInt()
    println(randomInt)

    randomInt = Random.nextInt(0, 100)
    println(randomInt)

    var randomDouble = Random.nextDouble(0.0, 1.0)
    println(randomDouble)
}