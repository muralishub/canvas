import org.scalatest.FunSpec
import org.scalatest.Matchers._


class MainTest extends FunSpec {

  it("create canvas") {
    Main.createCanvas(4, 2) shouldBe
      """----
        ||  |
        ||  |
        ||  |
        ||  |
        |----""".stripMargin
  }



}
