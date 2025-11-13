/*
 * MIT License
 *
 * Copyright (c) 2025 Evgenii Plugatar
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package dev.jlet.function;

/**
 * The {@link java.util.function.Predicate} specialization for 6 arguments that might throw an exception.
 *
 * @param <T1> type of the first input argument
 * @param <T2> type of the second input argument
 * @param <T3> type of the third input argument
 * @param <T4> type of the fourth input argument
 * @param <T5> type of the fifth input argument
 * @param <T6> type of the sixth input argument
 * @param <E>  type of the throwing exception
 */
@FunctionalInterface
public interface ThrowingPredicate6<T1, T2, T3, T4, T5, T6, E extends Throwable> {

  /**
   * Evaluates this predicate on the given arguments.
   *
   * @param t1 the first input argument
   * @param t2 the second input argument
   * @param t3 the third input argument
   * @param t4 the fourth input argument
   * @param t5 the fifth input argument
   * @param t6 the sixth input argument
   * @return {@code true} if the input arguments matches the predicate, otherwise {@code false}
   * @throws E if predicate threw exception
   */
  boolean test(T1 t1,
               T2 t2,
               T3 t3,
               T4 t4,
               T5 t5,
               T6 t6) throws E;

  /**
   * Returns given predicate.
   *
   * @param block the predicate
   * @param <T1>  type of the first input argument
   * @param <T2>  type of the second input argument
   * @param <T3>  type of the third input argument
   * @param <T4>  type of the fourth input argument
   * @param <T5>  type of the fifth input argument
   * @param <T6>  type of the sixth input argument
   * @param <E>   type of the throwing exception
   * @return predicate
   * @throws NullPointerException if {@code block} arg is {@code null}
   */
  @SuppressWarnings("unchecked")
  static <T1, T2, T3, T4, T5, T6, E extends Throwable> ThrowingPredicate6<T1, T2, T3, T4, T5, T6, E> of(
    final ThrowingPredicate6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends E> block
  ) {
    if (block == null) { throw new NullPointerException("block arg is null"); }
    return (ThrowingPredicate6<T1, T2, T3, T4, T5, T6, E>) block;
  }

  /**
   * Returns given predicate as an unchecked function.
   *
   * @param block the origin predicate
   * @param <T1>  type of the first input argument
   * @param <T2>  type of the second input argument
   * @param <T3>  type of the third input argument
   * @param <T4>  type of the fourth input argument
   * @param <T5>  type of the fifth input argument
   * @param <T6>  type of the sixth input argument
   * @return unchecked predicate
   * @throws NullPointerException if {@code block} arg is {@code null}
   */
  @SuppressWarnings("unchecked")
  static <T1, T2, T3, T4, T5, T6> ThrowingPredicate6<T1, T2, T3, T4, T5, T6, Error> unchecked(
    final ThrowingPredicate6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ?> block
  ) {
    if (block == null) { throw new NullPointerException("block arg is null"); }
    return (ThrowingPredicate6<T1, T2, T3, T4, T5, T6, Error>) block;
  }
}
