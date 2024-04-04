import models.StudentData
import org.junit.runner._
import org.specs2.runner._
import play.api.test._

class TestingStuff extends PlaySpecification {

  "ValidateStudent" should {
    "Return true for Garrett J. Chollett" in {
        StudentData.validateStudent("Garrett J. Chollett") mustBe true
    }
  }
}
