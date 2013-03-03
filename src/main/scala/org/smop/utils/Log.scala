package org.smop
import language.experimental.macros

package object utils {

  /**
   * Wrapper around anything, to provide a logging facility.
   */
  implicit class Log(target: Any) {
    /**
     * Logging method, can be placed in any expression chain.
     * This is the identity function with a side effect: it prints
     * the expression it's operating on, as well as the current value of
     * that expression.
     * Mnemonic: it copies.
     */
    def © : Any = macro makros.MacroImplementations.log
    /**
     * Logging method, can be placed in any expression chain.
     * This is the identity function with a side effect: it prints
     * the expression it's operating on, as well as the current value of
     * that expression.
     * @see © for a shorter name for the same method.
     */
    def LOG : Any = macro makros.MacroImplementations.log
  }
}
