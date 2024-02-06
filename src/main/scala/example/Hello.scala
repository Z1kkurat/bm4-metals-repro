package example

object Hello extends App {
  for {
    _ <- Some(1)
    implicit0(bar: Bar) = new Bar(1)
    foo = new Foo
    baz = new Baz
  } yield ()
}
