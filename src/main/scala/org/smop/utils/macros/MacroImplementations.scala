package org.smop.utils.macros

import reflect.makro.Context

object MacroImplementations {
  def log(c: Context): c.Expr[Any] = {
    import c.mirror._
    
    c.prefix.tree match {
      case Apply(_, realPrefix :: Nil) => {
        val prefixCode = c.Expr[String](Literal(Constant(show(realPrefix))))
        c.reify {
          val temp = c.Expr[String](realPrefix).eval
          println(prefixCode.eval + " = " + temp)
          temp
        }
      }
    }
  }
}
