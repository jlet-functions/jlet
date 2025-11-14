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
package dev.jlet;

import dev.jlet.function.ThrowingBooleanSupplier;
import dev.jlet.function.ThrowingConsumer;
import dev.jlet.function.ThrowingConsumer2;
import dev.jlet.function.ThrowingConsumer3;
import dev.jlet.function.ThrowingConsumer4;
import dev.jlet.function.ThrowingConsumer5;
import dev.jlet.function.ThrowingConsumer6;
import dev.jlet.function.ThrowingConsumer7;
import dev.jlet.function.ThrowingConsumer8;
import dev.jlet.function.ThrowingFunction;
import dev.jlet.function.ThrowingFunction2;
import dev.jlet.function.ThrowingFunction3;
import dev.jlet.function.ThrowingFunction4;
import dev.jlet.function.ThrowingFunction5;
import dev.jlet.function.ThrowingFunction6;
import dev.jlet.function.ThrowingFunction7;
import dev.jlet.function.ThrowingFunction8;
import dev.jlet.function.ThrowingPredicate;
import dev.jlet.function.ThrowingPredicate2;
import dev.jlet.function.ThrowingPredicate3;
import dev.jlet.function.ThrowingPredicate4;
import dev.jlet.function.ThrowingPredicate5;
import dev.jlet.function.ThrowingPredicate6;
import dev.jlet.function.ThrowingPredicate7;
import dev.jlet.function.ThrowingPredicate8;
import dev.jlet.function.ThrowingRunnable;
import dev.jlet.function.ThrowingSupplier;

/**
 * JLet functions.
 */
public final class JLet {

  /**
   * Utility class ctor.
   */
  private JLet() {
  }

  /**
   * Calls the specified function block and returns its result.
   *
   * @param block the function block
   * @param <R>   type of the function block result
   * @return function block result
   * @throws NullPointerException if {@code block} arg is {@code null}
   */
  public static <R> R it(final ThrowingSupplier<? extends R, ?> block) {
    return ThrowingSupplier.unchecked(block).get();
  }

  /**
   * Calls the specified function block with the given value and returns this value.
   *
   * @param t     the value
   * @param block the function block
   * @param <T>   type of the value
   * @return value
   * @throws NullPointerException if {@code block} arg is {@code null}
   */
  public static <T> T it(final T t,
                         final ThrowingConsumer<? super T, ?> block) {
    ThrowingConsumer.unchecked(block).accept(t);
    return t;
  }

  /**
   * Calls the specified function block with the given values and returns the first value.
   *
   * @param t1    the first value
   * @param t2    the second value
   * @param block the function block
   * @param <T1>  type of the first value
   * @param <T2>  type of the second value
   * @throws NullPointerException if {@code block} arg is {@code null}
   */
  public static <T1, T2> T1 it(final T1 t1,
                               final T2 t2,
                               final ThrowingConsumer2<? super T1, ? super T2, ?> block) {
    ThrowingConsumer2.unchecked(block).accept(t1, t2);
    return t1;
  }

  /**
   * Calls the specified function block with the given values and returns the first value.
   *
   * @param t1    the first value
   * @param t2    the second value
   * @param t3    the third value
   * @param block the function block
   * @param <T1>  type of the first value
   * @param <T2>  type of the second value
   * @param <T3>  type of the third value
   * @throws NullPointerException if {@code block} arg is {@code null}
   */
  public static <T1, T2, T3> T1 it(final T1 t1,
                                   final T2 t2,
                                   final T3 t3,
                                   final ThrowingConsumer3<? super T1, ? super T2, ? super T3, ?> block) {
    ThrowingConsumer3.unchecked(block).accept(t1, t2, t3);
    return t1;
  }

  /**
   * Calls the specified function block with the given values and returns the first value.
   *
   * @param t1    the first value
   * @param t2    the second value
   * @param t3    the third value
   * @param t4    the fourth value
   * @param block the function block
   * @param <T1>  type of the first value
   * @param <T2>  type of the second value
   * @param <T3>  type of the third value
   * @param <T4>  type of the fourth value
   * @throws NullPointerException if {@code block} arg is {@code null}
   */
  public static <T1, T2, T3, T4> T1 it(final T1 t1,
                                       final T2 t2,
                                       final T3 t3,
                                       final T4 t4,
                                       final ThrowingConsumer4<? super T1, ? super T2, ? super T3, ? super T4, ?> block) {
    ThrowingConsumer4.unchecked(block).accept(t1, t2, t3, t4);
    return t1;
  }

  /**
   * Calls the specified function block with the given values and returns the first value.
   *
   * @param t1    the first value
   * @param t2    the second value
   * @param t3    the third value
   * @param t4    the fourth value
   * @param t5    the fifth value
   * @param block the function block
   * @param <T1>  type of the first value
   * @param <T2>  type of the second value
   * @param <T3>  type of the third value
   * @param <T4>  type of the fourth value
   * @param <T5>  type of the fifth value
   * @throws NullPointerException if {@code block} arg is {@code null}
   */
  public static <T1, T2, T3, T4, T5> T1 it(final T1 t1,
                                           final T2 t2,
                                           final T3 t3,
                                           final T4 t4,
                                           final T5 t5,
                                           final ThrowingConsumer5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ?> block) {
    ThrowingConsumer5.unchecked(block).accept(t1, t2, t3, t4, t5);
    return t1;
  }

  /**
   * Calls the specified function block with the given values and returns the first value.
   *
   * @param t1    the first value
   * @param t2    the second value
   * @param t3    the third value
   * @param t4    the fourth value
   * @param t5    the fifth value
   * @param t6    the sixth value
   * @param block the function block
   * @param <T1>  type of the first value
   * @param <T2>  type of the second value
   * @param <T3>  type of the third value
   * @param <T4>  type of the fourth value
   * @param <T5>  type of the fifth value
   * @param <T6>  type of the sixth value
   * @throws NullPointerException if {@code block} arg is {@code null}
   */
  public static <T1, T2, T3, T4, T5, T6> T1 it(final T1 t1,
                                               final T2 t2,
                                               final T3 t3,
                                               final T4 t4,
                                               final T5 t5,
                                               final T6 t6,
                                               final ThrowingConsumer6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ?> block) {
    ThrowingConsumer6.unchecked(block).accept(t1, t2, t3, t4, t5, t6);
    return t1;
  }

  /**
   * Calls the specified function block with the given values and returns the first value.
   *
   * @param t1    the first value
   * @param t2    the second value
   * @param t3    the third value
   * @param t4    the fourth value
   * @param t5    the fifth value
   * @param t6    the sixth value
   * @param t7    the seventh value
   * @param block the function block
   * @param <T1>  type of the first value
   * @param <T2>  type of the second value
   * @param <T3>  type of the third value
   * @param <T4>  type of the fourth value
   * @param <T5>  type of the fifth value
   * @param <T6>  type of the sixth value
   * @param <T7>  type of the seventh value
   * @throws NullPointerException if {@code block} arg is {@code null}
   */
  public static <T1, T2, T3, T4, T5, T6, T7> T1 it(final T1 t1,
                                                   final T2 t2,
                                                   final T3 t3,
                                                   final T4 t4,
                                                   final T5 t5,
                                                   final T6 t6,
                                                   final T7 t7,
                                                   final ThrowingConsumer7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ?> block) {
    ThrowingConsumer7.unchecked(block).accept(t1, t2, t3, t4, t5, t6, t7);
    return t1;
  }

  /**
   * Calls the specified function block with the given values and returns the first value.
   *
   * @param t1    the first value
   * @param t2    the second value
   * @param t3    the third value
   * @param t4    the fourth value
   * @param t5    the fifth value
   * @param t6    the sixth value
   * @param t7    the seventh value
   * @param t8    the eighth value
   * @param block the function block
   * @param <T1>  type of the first value
   * @param <T2>  type of the second value
   * @param <T3>  type of the third value
   * @param <T4>  type of the fourth value
   * @param <T5>  type of the fifth value
   * @param <T6>  type of the sixth value
   * @param <T7>  type of the seventh value
   * @param <T8>  type of the eighth value
   * @throws NullPointerException if {@code block} arg is {@code null}
   */
  public static <T1, T2, T3, T4, T5, T6, T7, T8> T1 it(final T1 t1,
                                                       final T2 t2,
                                                       final T3 t3,
                                                       final T4 t4,
                                                       final T5 t5,
                                                       final T6 t6,
                                                       final T7 t7,
                                                       final T8 t8,
                                                       final ThrowingConsumer8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ?> block) {
    ThrowingConsumer8.unchecked(block).accept(t1, t2, t3, t4, t5, t6, t7, t8);
    return t1;
  }

  /**
   * Calls the specified function block with the given value and returns its result.
   *
   * @param t     the value
   * @param block the function block
   * @param <T>   type of the value
   * @param <R>   type of the function block result
   * @return function block result
   * @throws NullPointerException if {@code block} arg is {@code null}
   */
  public static <T, R> R let(final T t,
                             final ThrowingFunction<? super T, ? extends R, ?> block) {
    return ThrowingFunction.unchecked(block).apply(t);
  }

  /**
   * Calls the specified function block with the given values and returns its result.
   *
   * @param t1    the first value
   * @param t2    the second value
   * @param block the function block
   * @param <T1>  type of the first value
   * @param <T2>  type of the second value
   * @param <R>   type of the function block result
   * @return function block result
   * @throws NullPointerException if {@code block} arg is {@code null}
   */
  public static <T1, T2, R> R let(final T1 t1,
                                  final T2 t2,
                                  final ThrowingFunction2<? super T1, ? super T2, ? extends R, ?> block) {
    return ThrowingFunction2.unchecked(block).apply(t1, t2);
  }

  /**
   * Calls the specified function block with the given values and returns its result.
   *
   * @param t1    the first value
   * @param t2    the second value
   * @param t3    the third value
   * @param block the function block
   * @param <T1>  type of the first value
   * @param <T2>  type of the second value
   * @param <T3>  type of the third value
   * @param <R>   type of the function block result
   * @return function block result
   * @throws NullPointerException if {@code block} arg is {@code null}
   */
  public static <T1, T2, T3, R> R let(final T1 t1,
                                      final T2 t2,
                                      final T3 t3,
                                      final ThrowingFunction3<? super T1, ? super T2, ? super T3, ? extends R, ?> block) {
    return ThrowingFunction3.unchecked(block).apply(t1, t2, t3);
  }

  /**
   * Calls the specified function block with the given values and returns its result.
   *
   * @param t1    the first value
   * @param t2    the second value
   * @param t3    the third value
   * @param t4    the fourth value
   * @param block the function block
   * @param <T1>  type of the first value
   * @param <T2>  type of the second value
   * @param <T3>  type of the third value
   * @param <T4>  type of the fourth value
   * @param <R>   type of the function block result
   * @return function block result
   * @throws NullPointerException if {@code block} arg is {@code null}
   */
  public static <T1, T2, T3, T4, R> R let(final T1 t1,
                                          final T2 t2,
                                          final T3 t3,
                                          final T4 t4,
                                          final ThrowingFunction4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R, ?> block) {
    return ThrowingFunction4.unchecked(block).apply(t1, t2, t3, t4);
  }

  /**
   * Calls the specified function block with the given values and returns its result.
   *
   * @param t1    the first value
   * @param t2    the second value
   * @param t3    the third value
   * @param t4    the fourth value
   * @param t5    the fifth value
   * @param block the function block
   * @param <T1>  type of the first value
   * @param <T2>  type of the second value
   * @param <T3>  type of the third value
   * @param <T4>  type of the fourth value
   * @param <T5>  type of the fifth value
   * @param <R>   type of the function block result
   * @return function block result
   * @throws NullPointerException if {@code block} arg is {@code null}
   */
  public static <T1, T2, T3, T4, T5, R> R let(final T1 t1,
                                              final T2 t2,
                                              final T3 t3,
                                              final T4 t4,
                                              final T5 t5,
                                              final ThrowingFunction5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R, ?> block) {
    return ThrowingFunction5.unchecked(block).apply(t1, t2, t3, t4, t5);
  }

  /**
   * Calls the specified function block with the given values and returns its result.
   *
   * @param t1    the first value
   * @param t2    the second value
   * @param t3    the third value
   * @param t4    the fourth value
   * @param t5    the fifth value
   * @param t6    the sixth value
   * @param block the function block
   * @param <T1>  type of the first value
   * @param <T2>  type of the second value
   * @param <T3>  type of the third value
   * @param <T4>  type of the fourth value
   * @param <T5>  type of the fifth value
   * @param <T6>  type of the sixth value
   * @param <R>   type of the function block result
   * @return function block result
   * @throws NullPointerException if {@code block} arg is {@code null}
   */
  public static <T1, T2, T3, T4, T5, T6, R> R let(final T1 t1,
                                                  final T2 t2,
                                                  final T3 t3,
                                                  final T4 t4,
                                                  final T5 t5,
                                                  final T6 t6,
                                                  final ThrowingFunction6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R, ?> block) {
    return ThrowingFunction6.unchecked(block).apply(t1, t2, t3, t4, t5, t6);
  }

  /**
   * Calls the specified function block with the given values and returns its result.
   *
   * @param t1    the first value
   * @param t2    the second value
   * @param t3    the third value
   * @param t4    the fourth value
   * @param t5    the fifth value
   * @param t6    the sixth value
   * @param t7    the seventh value
   * @param block the function block
   * @param <T1>  type of the first value
   * @param <T2>  type of the second value
   * @param <T3>  type of the third value
   * @param <T4>  type of the fourth value
   * @param <T5>  type of the fifth value
   * @param <T6>  type of the sixth value
   * @param <T7>  type of the seventh value
   * @param <R>   type of the function block result
   * @return function block result
   * @throws NullPointerException if {@code block} arg is {@code null}
   */
  public static <T1, T2, T3, T4, T5, T6, T7, R> R let(final T1 t1,
                                                      final T2 t2,
                                                      final T3 t3,
                                                      final T4 t4,
                                                      final T5 t5,
                                                      final T6 t6,
                                                      final T7 t7,
                                                      final ThrowingFunction7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R, ?> block) {
    return ThrowingFunction7.unchecked(block).apply(t1, t2, t3, t4, t5, t6, t7);
  }

  /**
   * Calls the specified function block with the given values and returns its result.
   *
   * @param t1    the first value
   * @param t2    the second value
   * @param t3    the third value
   * @param t4    the fourth value
   * @param t5    the fifth value
   * @param t6    the sixth value
   * @param t7    the seventh value
   * @param t8    the eighth value
   * @param block the function block
   * @param <T1>  type of the first value
   * @param <T2>  type of the second value
   * @param <T3>  type of the third value
   * @param <T4>  type of the fourth value
   * @param <T5>  type of the fifth value
   * @param <T6>  type of the sixth value
   * @param <T7>  type of the seventh value
   * @param <T8>  type of the eighth value
   * @param <R>   type of the function block result
   * @return function block result
   * @throws NullPointerException if {@code block} arg is {@code null}
   */
  public static <T1, T2, T3, T4, T5, T6, T7, T8, R> R let(final T1 t1,
                                                          final T2 t2,
                                                          final T3 t3,
                                                          final T4 t4,
                                                          final T5 t5,
                                                          final T6 t6,
                                                          final T7 t7,
                                                          final T8 t8,
                                                          final ThrowingFunction8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R, ?> block) {
    return ThrowingFunction8.unchecked(block).apply(t1, t2, t3, t4, t5, t6, t7, t8);
  }

  /**
   * Calls the specified function block and returns its {@code boolean} result.
   *
   * @param block the function block
   * @return function block {@code boolean} result
   * @throws NullPointerException if {@code block} arg is {@code null}
   */
  public static boolean test(final ThrowingBooleanSupplier<?> block) {
    return ThrowingBooleanSupplier.unchecked(block).get();
  }

  /**
   * Calls the specified function block with the given values and returns its {@code boolean} result.
   *
   * @param t     the sixth value
   * @param block the function block
   * @param <T>   type of the value
   * @return function block {@code boolean} result
   * @throws NullPointerException if {@code block} arg is {@code null}
   */
  public static <T> boolean test(final T t,
                                 final ThrowingPredicate<? super T, ?> block) {
    return ThrowingPredicate.unchecked(block).test(t);
  }

  /**
   * Calls the specified function block with the given values and returns its {@code boolean} result.
   *
   * @param t1    the first value
   * @param t2    the second value
   * @param block the function block
   * @param <T1>  type of the first value
   * @param <T2>  type of the second value
   * @return function block {@code boolean} result
   * @throws NullPointerException if {@code block} arg is {@code null}
   */
  public static <T1, T2> boolean test(final T1 t1,
                                      final T2 t2,
                                      final ThrowingPredicate2<? super T1, ? super T2, ?> block) {
    return ThrowingPredicate2.unchecked(block).test(t1, t2);
  }

  /**
   * Calls the specified function block with the given values and returns its {@code boolean} result.
   *
   * @param t1    the first value
   * @param t2    the second value
   * @param t3    the third value
   * @param block the function block
   * @param <T1>  type of the first value
   * @param <T2>  type of the second value
   * @param <T3>  type of the third value
   * @return function block {@code boolean} result
   * @throws NullPointerException if {@code block} arg is {@code null}
   */
  public static <T1, T2, T3> boolean test(final T1 t1,
                                          final T2 t2,
                                          final T3 t3,
                                          final ThrowingPredicate3<? super T1, ? super T2, ? super T3, ?> block) {
    return ThrowingPredicate3.unchecked(block).test(t1, t2, t3);
  }

  /**
   * Calls the specified function block with the given values and returns its {@code boolean} result.
   *
   * @param t1    the first value
   * @param t2    the second value
   * @param t3    the third value
   * @param t4    the fourth value
   * @param block the function block
   * @param <T1>  type of the first value
   * @param <T2>  type of the second value
   * @param <T3>  type of the third value
   * @param <T4>  type of the fourth value
   * @return function block {@code boolean} result
   * @throws NullPointerException if {@code block} arg is {@code null}
   */
  public static <T1, T2, T3, T4> boolean test(final T1 t1,
                                              final T2 t2,
                                              final T3 t3,
                                              final T4 t4,
                                              final ThrowingPredicate4<? super T1, ? super T2, ? super T3, ? super T4, ?> block) {
    return ThrowingPredicate4.unchecked(block).test(t1, t2, t3, t4);
  }

  /**
   * Calls the specified function block with the given values and returns its {@code boolean} result.
   *
   * @param t1    the first value
   * @param t2    the second value
   * @param t3    the third value
   * @param t4    the fourth value
   * @param t5    the fifth value
   * @param block the function block
   * @param <T1>  type of the first value
   * @param <T2>  type of the second value
   * @param <T3>  type of the third value
   * @param <T4>  type of the fourth value
   * @param <T5>  type of the fifth value
   * @return function block {@code boolean} result
   * @throws NullPointerException if {@code block} arg is {@code null}
   */
  public static <T1, T2, T3, T4, T5> boolean test(final T1 t1,
                                                  final T2 t2,
                                                  final T3 t3,
                                                  final T4 t4,
                                                  final T5 t5,
                                                  final ThrowingPredicate5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ?> block) {
    return ThrowingPredicate5.unchecked(block).test(t1, t2, t3, t4, t5);
  }

  /**
   * Calls the specified function block with the given values and returns its {@code boolean} result.
   *
   * @param t1    the first value
   * @param t2    the second value
   * @param t3    the third value
   * @param t4    the fourth value
   * @param t5    the fifth value
   * @param t6    the sixth value
   * @param block the function block
   * @param <T1>  type of the first value
   * @param <T2>  type of the second value
   * @param <T3>  type of the third value
   * @param <T4>  type of the fourth value
   * @param <T5>  type of the fifth value
   * @param <T6>  type of the sixth value
   * @return function block {@code boolean} result
   * @throws NullPointerException if {@code block} arg is {@code null}
   */
  public static <T1, T2, T3, T4, T5, T6> boolean test(final T1 t1,
                                                      final T2 t2,
                                                      final T3 t3,
                                                      final T4 t4,
                                                      final T5 t5,
                                                      final T6 t6,
                                                      final ThrowingPredicate6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ?> block) {
    return ThrowingPredicate6.unchecked(block).test(t1, t2, t3, t4, t5, t6);
  }

  /**
   * Calls the specified function block with the given values and returns its {@code boolean} result.
   *
   * @param t1    the first value
   * @param t2    the second value
   * @param t3    the third value
   * @param t4    the fourth value
   * @param t5    the fifth value
   * @param t6    the sixth value
   * @param t7    the seventh value
   * @param block the function block
   * @param <T1>  type of the first value
   * @param <T2>  type of the second value
   * @param <T3>  type of the third value
   * @param <T4>  type of the fourth value
   * @param <T5>  type of the fifth value
   * @param <T6>  type of the sixth value
   * @param <T7>  type of the seventh value
   * @return function block {@code boolean} result
   * @throws NullPointerException if {@code block} arg is {@code null}
   */
  public static <T1, T2, T3, T4, T5, T6, T7> boolean test(final T1 t1,
                                                          final T2 t2,
                                                          final T3 t3,
                                                          final T4 t4,
                                                          final T5 t5,
                                                          final T6 t6,
                                                          final T7 t7,
                                                          final ThrowingPredicate7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ?> block) {
    return ThrowingPredicate7.unchecked(block).test(t1, t2, t3, t4, t5, t6, t7);
  }

  /**
   * Calls the specified function block with the given values and returns its {@code boolean} result.
   *
   * @param t1    the first value
   * @param t2    the second value
   * @param t3    the third value
   * @param t4    the fourth value
   * @param t5    the fifth value
   * @param t6    the sixth value
   * @param t7    the seventh value
   * @param t8    the eighth value
   * @param block the function block
   * @param <T1>  type of the first value
   * @param <T2>  type of the second value
   * @param <T3>  type of the third value
   * @param <T4>  type of the fourth value
   * @param <T5>  type of the fifth value
   * @param <T6>  type of the sixth value
   * @param <T7>  type of the seventh value
   * @param <T8>  type of the eighth value
   * @return function block {@code boolean} result
   * @throws NullPointerException if {@code block} arg is {@code null}
   */
  public static <T1, T2, T3, T4, T5, T6, T7, T8> boolean test(final T1 t1,
                                                              final T2 t2,
                                                              final T3 t3,
                                                              final T4 t4,
                                                              final T5 t5,
                                                              final T6 t6,
                                                              final T7 t7,
                                                              final T8 t8,
                                                              final ThrowingPredicate8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ?> block) {
    return ThrowingPredicate8.unchecked(block).test(t1, t2, t3, t4, t5, t6, t7, t8);
  }

  /**
   * Calls the specified function block.
   *
   * @param block the function block
   * @throws NullPointerException if {@code block} arg is {@code null}
   */
  public static void run(final ThrowingRunnable<?> block) {
    ThrowingRunnable.unchecked(block).run();
  }

  /**
   * Calls the specified function block with the given value.
   *
   * @param t     the value
   * @param block the function block
   * @param <T>   type of the value
   * @throws NullPointerException if {@code block} arg is {@code null}
   */
  public static <T> void with(final T t,
                              final ThrowingConsumer<? super T, ?> block) {
    ThrowingConsumer.unchecked(block).accept(t);
  }

  /**
   * Calls the specified function block with the given values.
   *
   * @param t1    the first value
   * @param t2    the second value
   * @param block the function block
   * @param <T1>  type of the first value
   * @param <T2>  type of the second value
   * @throws NullPointerException if {@code block} arg is {@code null}
   */
  public static <T1, T2> void with(final T1 t1,
                                   final T2 t2,
                                   final ThrowingConsumer2<? super T1, ? super T2, ?> block) {
    ThrowingConsumer2.unchecked(block).accept(t1, t2);
  }

  /**
   * Calls the specified function block with the given values.
   *
   * @param t1    the first value
   * @param t2    the second value
   * @param t3    the third value
   * @param block the function block
   * @param <T1>  type of the first value
   * @param <T2>  type of the second value
   * @param <T3>  type of the third value
   * @throws NullPointerException if {@code block} arg is {@code null}
   */
  public static <T1, T2, T3> void with(final T1 t1,
                                       final T2 t2,
                                       final T3 t3,
                                       final ThrowingConsumer3<? super T1, ? super T2, ? super T3, ?> block) {
    ThrowingConsumer3.unchecked(block).accept(t1, t2, t3);
  }

  /**
   * Calls the specified function block with the given values.
   *
   * @param t1    the first value
   * @param t2    the second value
   * @param t3    the third value
   * @param t4    the fourth value
   * @param block the function block
   * @param <T1>  type of the first value
   * @param <T2>  type of the second value
   * @param <T3>  type of the third value
   * @param <T4>  type of the fourth value
   * @throws NullPointerException if {@code block} arg is {@code null}
   */
  public static <T1, T2, T3, T4> void with(final T1 t1,
                                           final T2 t2,
                                           final T3 t3,
                                           final T4 t4,
                                           final ThrowingConsumer4<? super T1, ? super T2, ? super T3, ? super T4, ?> block) {
    ThrowingConsumer4.unchecked(block).accept(t1, t2, t3, t4);
  }

  /**
   * Calls the specified function block with the given values.
   *
   * @param t1    the first value
   * @param t2    the second value
   * @param t3    the third value
   * @param t4    the fourth value
   * @param t5    the fifth value
   * @param block the function block
   * @param <T1>  type of the first value
   * @param <T2>  type of the second value
   * @param <T3>  type of the third value
   * @param <T4>  type of the fourth value
   * @param <T5>  type of the fifth value
   * @throws NullPointerException if {@code block} arg is {@code null}
   */
  public static <T1, T2, T3, T4, T5> void with(final T1 t1,
                                               final T2 t2,
                                               final T3 t3,
                                               final T4 t4,
                                               final T5 t5,
                                               final ThrowingConsumer5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ?> block) {
    ThrowingConsumer5.unchecked(block).accept(t1, t2, t3, t4, t5);
  }

  /**
   * Calls the specified function block with the given values.
   *
   * @param t1    the first value
   * @param t2    the second value
   * @param t3    the third value
   * @param t4    the fourth value
   * @param t5    the fifth value
   * @param t6    the sixth value
   * @param block the function block
   * @param <T1>  type of the first value
   * @param <T2>  type of the second value
   * @param <T3>  type of the third value
   * @param <T4>  type of the fourth value
   * @param <T5>  type of the fifth value
   * @param <T6>  type of the sixth value
   * @throws NullPointerException if {@code block} arg is {@code null}
   */
  public static <T1, T2, T3, T4, T5, T6> void with(final T1 t1,
                                                   final T2 t2,
                                                   final T3 t3,
                                                   final T4 t4,
                                                   final T5 t5,
                                                   final T6 t6,
                                                   final ThrowingConsumer6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ?> block) {
    ThrowingConsumer6.unchecked(block).accept(t1, t2, t3, t4, t5, t6);
  }

  /**
   * Calls the specified function block with the given values.
   *
   * @param t1    the first value
   * @param t2    the second value
   * @param t3    the third value
   * @param t4    the fourth value
   * @param t5    the fifth value
   * @param t6    the sixth value
   * @param t7    the seventh value
   * @param block the function block
   * @param <T1>  type of the first value
   * @param <T2>  type of the second value
   * @param <T3>  type of the third value
   * @param <T4>  type of the fourth value
   * @param <T5>  type of the fifth value
   * @param <T6>  type of the sixth value
   * @param <T7>  type of the seventh value
   * @throws NullPointerException if {@code block} arg is {@code null}
   */
  public static <T1, T2, T3, T4, T5, T6, T7> void with(final T1 t1,
                                                       final T2 t2,
                                                       final T3 t3,
                                                       final T4 t4,
                                                       final T5 t5,
                                                       final T6 t6,
                                                       final T7 t7,
                                                       final ThrowingConsumer7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ?> block) {
    ThrowingConsumer7.unchecked(block).accept(t1, t2, t3, t4, t5, t6, t7);
  }

  /**
   * Calls the specified function block with the given values.
   *
   * @param t1    the first value
   * @param t2    the second value
   * @param t3    the third value
   * @param t4    the fourth value
   * @param t5    the fifth value
   * @param t6    the sixth value
   * @param t7    the seventh value
   * @param t8    the eighth value
   * @param block the function block
   * @param <T1>  type of the first value
   * @param <T2>  type of the second value
   * @param <T3>  type of the third value
   * @param <T4>  type of the fourth value
   * @param <T5>  type of the fifth value
   * @param <T6>  type of the sixth value
   * @param <T7>  type of the seventh value
   * @param <T8>  type of the eighth value
   * @throws NullPointerException if {@code block} arg is {@code null}
   */
  public static <T1, T2, T3, T4, T5, T6, T7, T8> void with(final T1 t1,
                                                           final T2 t2,
                                                           final T3 t3,
                                                           final T4 t4,
                                                           final T5 t5,
                                                           final T6 t6,
                                                           final T7 t7,
                                                           final T8 t8,
                                                           final ThrowingConsumer8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ?> block) {
    ThrowingConsumer8.unchecked(block).accept(t1, t2, t3, t4, t5, t6, t7, t8);
  }
}
