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
 * The {@link java.util.function.Consumer} specialization for 2 arguments that might throw an exception.
 *
 * @param <T1> type of the first input argument
 * @param <T2> type of the second input argument
 * @param <E>  type of the throwing exception
 */
@FunctionalInterface
public interface ThrowingConsumer2<T1, T2, E extends Throwable> {

  /**
   * Performs this operation on the given arguments.
   *
   * @param t1 the first input argument
   * @param t2 the second input argument
   * @throws E if consumer threw exception
   */
  void accept(T1 t1,
              T2 t2) throws E;

  /**
   * Returns given consumer.
   *
   * @param block the consumer
   * @param <T1>  type of the first input argument
   * @param <T2>  type of the second input argument
   * @param <E>   type of the throwing exception
   * @return unchecked consumer
   * @throws NullPointerException if {@code block} arg is {@code null}
   */
  @SuppressWarnings("unchecked")
  static <T1, T2, E extends Throwable> ThrowingConsumer2<T1, T2, E> of(
    final ThrowingConsumer2<? super T1, ? super T2, ? extends E> block
  ) {
    if (block == null) { throw new NullPointerException("block arg is null"); }
    return (ThrowingConsumer2<T1, T2, E>) block;
  }

  /**
   * Returns given consumer as an unchecked consumer.
   *
   * @param block the origin consumer
   * @param <T1>  type of the first input argument
   * @param <T2>  type of the second input argument
   * @return unchecked consumer
   * @throws NullPointerException if {@code block} arg is {@code null}
   */
  @SuppressWarnings("unchecked")
  static <T1, T2> ThrowingConsumer2<T1, T2, Error> unchecked(
    final ThrowingConsumer2<? super T1, ? super T2, ?> block
  ) {
    if (block == null) { throw new NullPointerException("block arg is null"); }
    return (ThrowingConsumer2<T1, T2, Error>) block;
  }
}
