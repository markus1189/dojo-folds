package de.codecentric.folds

final case class Tree[A](value: A, children: Tree[Tree[A]])

object TreeFolds {
  def foldLeft[A,B](tree: Tree[A])(z: B)(step: (B,A) => A): Tree[B] = ???

  def sum(xs: Tree[Int]): Int = ???

  def product(xs: Tree[Int]): Int = ???

  def map[A, B](xs: Tree[A])(f: A => B): Tree[B] = ???

  def flatMap[A, B](xs: Tree[A])(f: A => Tree[B]): Tree[B] = ???

  def filter[A](xs: Tree[A])(p: A => Boolean): Tree[A] = ???

  def groupBy[A, B](xs: Tree[A])(f: A => B): Map[B, Set[A]] = ???

  def reverse[A](xs: Tree[A]): Tree[A] = ???

  def foldLeftUsingFoldRight[A, B](xs: Tree[A])(z: B)(f: (B, A) => B): B = ???
}
