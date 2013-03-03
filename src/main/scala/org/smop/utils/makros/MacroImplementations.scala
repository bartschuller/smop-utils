package org.smop.utils.makros

import scala.reflect.macros.Context

object MacroImplementations {
  def log(c: Context): c.Expr[Any] = {
    import c.universe._
    
    c.prefix.tree match {
      case Apply(_, realPrefix :: Nil) => {
        val prefixCode = c.Expr[String](Literal(Constant(show(realPrefix))))
        val prefix = c.Expr[String](realPrefix)
        reify {
          val temp = prefix.splice
          println(prefixCode.splice + " = " + temp)
          temp
        }
      }
    }
  }
}
