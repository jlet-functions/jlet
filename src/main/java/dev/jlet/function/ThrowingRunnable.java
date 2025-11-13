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
 * The {@link Runnable} specialization that might throw an exception.
 *
 * @param <E> type of the throwing exception
 */
@FunctionalInterface
public interface ThrowingRunnable<E extends Throwable> {

  /**
   * Performs this operation.
   *
   * @throws E if runnable threw exception
   */
  void run() throws E;

  /**
   * Returns given runnable.
   *
   * @param block the runnable
   * @param <E>   type of the throwing exception
   * @return runnable
   * @throws NullPointerException if {@code block} arg is {@code null}
   */
  @SuppressWarnings("unchecked")
  static <E extends Throwable> ThrowingRunnable<E> of(final ThrowingRunnable<? extends E> block) {
    if (block == null) { throw new NullPointerException("block arg is null"); }
    return (ThrowingRunnable<E>) block;
  }

  /**
   * Returns given runnable as an unchecked runnable.
   *
   * @param block the origin runnable
   * @return unchecked runnable
   * @throws NullPointerException if {@code block} arg is {@code null}
   */
  @SuppressWarnings("unchecked")
  static ThrowingRunnable<Error> unchecked(final ThrowingRunnable<?> block) {
    if (block == null) { throw new NullPointerException("block arg is null"); }
    return (ThrowingRunnable<Error>) block;
  }
}
