import org.scalatest.FunSpec
import org.scalatest.Matchers._


class MainTest extends FunSpec {

  it("create canvas") {
    Main.createCanvas(20, 4) shouldBe
      """----------------------
        ||                    |
        ||                    |
        ||                    |
        ||                    |
        |----------------------""".stripMargin
  }



}
