package simpletest

class MySuite extends munit.FunSuite {
  test("example test for factorial") {
    var m = new MathLib
    val result = m.factorial(5)
    val expected: BigInt = 120
    assertEquals(result, expected)
  }
}
