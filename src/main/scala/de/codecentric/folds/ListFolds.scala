package de.codecentric.folds

object ListFolds {
  def sum(xs: List[Int]): Int = ???

  def product(xs: List[Int]): Int = ???

  def map[A, B](xs: List[A])(f: A => B): List[B] = ???

  def flatMap[A, B](xs: List[A])(f: A => List[B]): List[B] = ???

  def filter[A](xs: List[A])(p: A => Boolean): List[A] = ???

  def groupBy[A, B](xs: List[A])(f: A => B): Map[B, Set[A]] = ???

  def reverse[A](xs: List[A]): List[A] = ???

  def foldLeftUsingFoldRight[A, B](xs: List[A])(z: B)(f: (B, A) => B): B = ???
}
