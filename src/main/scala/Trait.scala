import reflect.makro.Context

trait Mock {
  import language.experimental.macros
  
  def mock(implicit factory: MockFactoryBase) = macro MockImpl.mock
}

object MockImpl {
  
  def mock(c: Context)(factory: c.Expr[MockFactoryBase]): c.Expr[Unit] = {
    c.reify(())
  }
}