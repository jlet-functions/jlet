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
 * The {@link java.util.function.Supplier} specialization that might throw an exception.
 *
 * @param <R> type of the result
 * @param <E> type of the throwing exception
 */
@FunctionalInterface
public interface ThrowingSupplier<R, E extends Throwable> {

  /**
   * Gets the result.
   *
   * @return result
   * @throws E if supplier threw exception
   */
  R get() throws E;

  /**
   * Returns given supplier.
   *
   * @param block the supplier
   * @param <R>   type of the result
   * @param <E>   type of the throwing exception
   * @return supplier
   * @throws NullPointerException if {@code block} arg is {@code null}
   */
  @SuppressWarnings("unchecked")
  static <R, E extends Throwable> ThrowingSupplier<R, E> of(final ThrowingSupplier<? extends R, ? extends E> block) {
    if (block == null) { throw new NullPointerException("block arg is null"); }
    return (ThrowingSupplier<R, E>) block;
  }

  /**
   * Returns given supplier as an unchecked supplier.
   *
   * @param block the origin supplier
   * @param <R>   type of the result
   * @return unchecked supplier
   * @throws NullPointerException if {@code block} arg is {@code null}
   */
  @SuppressWarnings("unchecked")
  static <R> ThrowingSupplier<R, Error> unchecked(final ThrowingSupplier<? extends R, ?> block) {
    if (block == null) { throw new NullPointerException("block arg is null"); }
    return (ThrowingSupplier<R, Error>) block;
  }
}
