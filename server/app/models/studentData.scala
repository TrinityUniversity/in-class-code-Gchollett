package models

import scala.io.Source

object StudentData {
  def validateStudent(student:String):Boolean = {
        val filename = "data\\StudentData.csv"
        for (line <- Source.fromFile(filename).getLines) {
            if(line.contains(student)){return true}
        }
        false
  }
}
