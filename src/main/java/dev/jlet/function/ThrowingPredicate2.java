/*
 * MIT License
 *
 * Copyright (c) 2025-2026 Evgenii Plugatar
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
 * The {@link java.util.function.Predicate} specialization for 2 arguments that might throw an exception.
 *
 * @param <T1> type of the first input argument
 * @param <T2> type of the second input argument
 * @param <E>  type of the throwing exception
 */
@FunctionalInterface
public interface ThrowingPredicate2<T1, T2, E extends Throwable> {

  /**
   * Evaluates this predicate on the given arguments.
   *
   * @param t1 the first input argument
   * @param t2 the second input argument
   * @return {@code true} if the input arguments matches the predicate, otherwise {@code false}
   * @throws E if predicate threw exception
   */
  boolean test(T1 t1,
               T2 t2) throws E;

  /**
   * Returns given predicate.
   *
   * @param block the predicate
   * @param <T1>  type of the first input argument
   * @param <T2>  type of the second input argument
   * @param <E>   type of the throwing exception
   * @return predicate
   * @throws NullPointerException if {@code block} arg is {@code null}
   */
  @SuppressWarnings("unchecked")
  static <T1, T2, E extends Throwable> ThrowingPredicate2<T1, T2, E> of(
    final ThrowingPredicate2<? super T1, ? super T2, ? extends E> block
  ) {
    if (block == null) { throw new NullPointerException("block arg is null"); }
    return (ThrowingPredicate2<T1, T2, E>) block;
  }

  /**
   * Returns given predicate as an unchecked function.
   *
   * @param block the origin predicate
   * @param <T1>  type of the first input argument
   * @param <T2>  type of the second input argument
   * @return unchecked predicate
   * @throws NullPointerException if {@code block} arg is {@code null}
   */
  @SuppressWarnings("unchecked")
  static <T1, T2> ThrowingPredicate2<T1, T2, Error> unchecked(
    final ThrowingPredicate2<? super T1, ? super T2, ?> block
  ) {
    if (block == null) { throw new NullPointerException("block arg is null"); }
    return (ThrowingPredicate2<T1, T2, Error>) block;
  }
}
