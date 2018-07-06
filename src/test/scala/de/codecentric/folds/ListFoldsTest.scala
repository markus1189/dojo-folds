package de.codecentric.folds

import org.scalactic.TypeCheckedTripleEquals
import org.scalatest.{Matchers, WordSpec}

class ListFoldsTest
    extends WordSpec
    with Matchers
    with TypeCheckedTripleEquals {

  "FoldsTest" should {

    "implement groupBy" in {
      ListFolds.groupBy(
        List("one" -> 1, "two" -> 2, "three" -> 3, "zwei" -> 2))(
        _._2
      ) should ===(
        Map(1 -> Set("one" -> 1),
            2 -> Set("two" -> 2, "zwei" -> 2),
            3 -> Set("three" -> 3))
      )
    }

    "implement reverse" in {
      ListFolds.reverse(List(1, 2, 3, 4, 5)) should ===(List(5, 4, 3, 2, 1))

    }

    "implement filter" in {
      ListFolds.filter(List(1, 2, 3, 4, 5))(i => i % 2 == 0) should ===(
        List(2, 4))
    }

    "implement flatMap" in {
      ListFolds.flatMap(List(1, 2, 3))(i => List(i - 1, i + 1)) should ===(
        List(0, 2, 1, 3, 2, 4)
      )
    }

    "implement map" in {
      ListFolds.map(List(1, 2, 3))(i => i + 1) should ===(List(2, 3, 4))
    }

    "implement foldLeftWithFoldRight" in {
      ListFolds.foldLeftUsingFoldRight(List(1, 2, 3))(List[Int]())((acc, x) =>
        x :: acc) should ===(
        List(1, 2, 3).foldLeft(List[Int]())((acc, x) => x :: acc))
    }
  }
}
