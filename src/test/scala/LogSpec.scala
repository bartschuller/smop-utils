import org.specs2.mutable._
import org.smop.utils._

class LogSpec extends Specification {
  "The Logging copyright sign" should {
    "log and compute the right answer" in {
      // This is just a silly expression. Experiment with putting the ©-sign
      // in various other places. Observe what happens when you place two of them.
      val foo: String = "foo".toSeq.map(_.toUpper).©.toSet.mkString
      foo must_==("FO")
    }
  }
  "The LOG method" should {
    "log and compute the right answer" in {
      // This is just a silly expression. Experiment with putting the LOG method
      // in various other places. Observe what happens when you place two of them.
      val foo: String = "foo".toSeq.map(_.LOG.toUpper).toSet.mkString
      foo must_==("FO")
    }
  }
}
