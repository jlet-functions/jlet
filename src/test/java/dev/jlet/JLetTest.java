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
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.same;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

/**
 * Tests for {@link JLet}.
 */
final class JLetTest {

  @Test
  void itMethod0ValuesThrowsNPEForNullArg() {
    final ThrowingSupplier<Object, Error> block = null;

    assertThatCode(() -> JLet.it(block))
      .isInstanceOf(NullPointerException.class);
  }

  @Test
  void itMethod0Values() {
    final Object result = new Object();
    final ThrowingSupplier<Object, Error> block = mockSupplier(result);

    assertThat(JLet.it(block))
      .isSameAs(result);
    verify(block, times(1)).get();
  }

  @Test
  void itMethod1ValueThrowsNPEForNullArg() {
    final ThrowingConsumer<Object, Error> block = null;

    assertThatCode(() -> JLet.it("", block))
      .isInstanceOf(NullPointerException.class);
  }

  @Test
  void itMethod1Value() {
    final Object v = new Object();
    final ThrowingConsumer<Object, Error> block = mockConsumer();

    assertThat(JLet.it(v, block))
      .isSameAs(v);
    verify(block, times(1)).accept(same(v));
    verifyNoMoreInteractions(block);
  }

  @Test
  void itMethod2ValuesThrowsNPEForNullArg() {
    final ThrowingConsumer2<Object, Object, Error> block = null;

    assertThatCode(() -> JLet.it("", "", block))
      .isInstanceOf(NullPointerException.class);
  }

  @Test
  void itMethod2Values() {
    final Object v1 = new Object();
    final Object v2 = new Object();
    final ThrowingConsumer2<Object, Object, Error> block = mockConsumer2();

    assertThat(JLet.it(v1, v2, block))
      .isSameAs(v1);
    verify(block, times(1)).accept(same(v1), same(v2));
    verifyNoMoreInteractions(block);
  }

  @Test
  void itMethod3ValuesThrowsNPEForNullArg() {
    final ThrowingConsumer3<Object, Object, Object, Error> block = null;

    assertThatCode(() -> JLet.it("", "", "", block))
      .isInstanceOf(NullPointerException.class);
  }

  @Test
  void itMethod3Values() {
    final Object v1 = new Object();
    final Object v2 = new Object();
    final Object v3 = new Object();
    final ThrowingConsumer3<Object, Object, Object, Error> block = mockConsumer3();

    assertThat(JLet.it(v1, v2, v3, block))
      .isSameAs(v1);
    verify(block, times(1)).accept(same(v1), same(v2), same(v3));
    verifyNoMoreInteractions(block);
  }

  @Test
  void itMethod4ValuesThrowsNPEForNullArg() {
    final ThrowingConsumer4<Object, Object, Object, Object, Error> block = null;

    assertThatCode(() -> JLet.it("", "", "", "", block))
      .isInstanceOf(NullPointerException.class);
  }

  @Test
  void itMethod4Values() {
    final Object v1 = new Object();
    final Object v2 = new Object();
    final Object v3 = new Object();
    final Object v4 = new Object();
    final ThrowingConsumer4<Object, Object, Object, Object, Error> block = mockConsumer4();

    assertThat(JLet.it(v1, v2, v3, v4, block))
      .isSameAs(v1);
    verify(block, times(1)).accept(same(v1), same(v2), same(v3), same(v4));
    verifyNoMoreInteractions(block);
  }

  @Test
  void itMethod5ValuesThrowsNPEForNullArg() {
    final ThrowingConsumer5<Object, Object, Object, Object, Object, Error> block = null;

    assertThatCode(() -> JLet.it("", "", "", "", "", block))
      .isInstanceOf(NullPointerException.class);
  }

  @Test
  void itMethod5Values() {
    final Object v1 = new Object();
    final Object v2 = new Object();
    final Object v3 = new Object();
    final Object v4 = new Object();
    final Object v5 = new Object();
    final ThrowingConsumer5<Object, Object, Object, Object, Object, Error> block = mockConsumer5();

    assertThat(JLet.it(v1, v2, v3, v4, v5, block))
      .isSameAs(v1);
    verify(block, times(1)).accept(same(v1), same(v2), same(v3), same(v4), same(v5));
    verifyNoMoreInteractions(block);
  }

  @Test
  void itMethod6ValuesThrowsNPEForNullArg() {
    final ThrowingConsumer6<Object, Object, Object, Object, Object, Object, Error> block = null;

    assertThatCode(() -> JLet.it("", "", "", "", "", "", block))
      .isInstanceOf(NullPointerException.class);
  }

  @Test
  void itMethod6Values() {
    final Object v1 = new Object();
    final Object v2 = new Object();
    final Object v3 = new Object();
    final Object v4 = new Object();
    final Object v5 = new Object();
    final Object v6 = new Object();
    final ThrowingConsumer6<Object, Object, Object, Object, Object, Object, Error> block = mockConsumer6();

    assertThat(JLet.it(v1, v2, v3, v4, v5, v6, block))
      .isSameAs(v1);
    verify(block, times(1)).accept(same(v1), same(v2), same(v3), same(v4), same(v5), same(v6));
    verifyNoMoreInteractions(block);
  }

  @Test
  void itMethod7ValuesThrowsNPEForNullArg() {
    final ThrowingConsumer7<Object, Object, Object, Object, Object, Object, Object, Error> block = null;

    assertThatCode(() -> JLet.it("", "", "", "", "", "", "", block))
      .isInstanceOf(NullPointerException.class);
  }

  @Test
  void itMethod7Values() {
    final Object v1 = new Object();
    final Object v2 = new Object();
    final Object v3 = new Object();
    final Object v4 = new Object();
    final Object v5 = new Object();
    final Object v6 = new Object();
    final Object v7 = new Object();
    final ThrowingConsumer7<Object, Object, Object, Object, Object, Object, Object, Error> block = mockConsumer7();

    assertThat(JLet.it(v1, v2, v3, v4, v5, v6, v7, block))
      .isSameAs(v1);
    verify(block, times(1)).accept(same(v1), same(v2), same(v3), same(v4), same(v5), same(v6), same(v7));
    verifyNoMoreInteractions(block);
  }

  @Test
  void itMethod8ValuesThrowsNPEForNullArg() {
    final ThrowingConsumer8<Object, Object, Object, Object, Object, Object, Object, Object, Error> block = null;

    assertThatCode(() -> JLet.it("", "", "", "", "", "", "", "", block))
      .isInstanceOf(NullPointerException.class);
  }

  @Test
  void itMethod8Values() {
    final Object v1 = new Object();
    final Object v2 = new Object();
    final Object v3 = new Object();
    final Object v4 = new Object();
    final Object v5 = new Object();
    final Object v6 = new Object();
    final Object v7 = new Object();
    final Object v8 = new Object();
    final ThrowingConsumer8<Object, Object, Object, Object, Object, Object, Object, Object, Error> block =
      mockConsumer8();

    assertThat(JLet.it(v1, v2, v3, v4, v5, v6, v7, v8, block))
      .isSameAs(v1);
    verify(block, times(1)).accept(same(v1), same(v2), same(v3), same(v4), same(v5), same(v6), same(v7), same(v8));
    verifyNoMoreInteractions(block);
  }

  @Test
  void letMethod1ValueThrowsNPEForNullArg() {
    final ThrowingFunction<Object, Object, Error> block = null;

    assertThatCode(() -> JLet.let("", block))
      .isInstanceOf(NullPointerException.class);
  }

  @Test
  void letMethod1Value() {
    final Object v = new Object();
    final Object result = new Object();
    final ThrowingFunction<Object, Object, Error> block = mockFunction(result);

    assertThat(JLet.let(v, block))
      .isSameAs(result);
    verify(block, times(1)).apply(same(v));
    verifyNoMoreInteractions(block);
  }

  @Test
  void letMethod2ValuesThrowsNPEForNullArg() {
    final ThrowingFunction2<Object, Object, Object, Error> block = null;

    assertThatCode(() -> JLet.let("", "", block))
      .isInstanceOf(NullPointerException.class);
  }

  @Test
  void letMethod2Values() {
    final Object v1 = new Object();
    final Object v2 = new Object();
    final Object result = new Object();
    final ThrowingFunction2<Object, Object, Object, Error> block = mockFunction2(result);

    assertThat(JLet.let(v1, v2, block))
      .isSameAs(result);
    verify(block, times(1)).apply(same(v1), same(v2));
    verifyNoMoreInteractions(block);
  }

  @Test
  void letMethod3ValuesThrowsNPEForNullArg() {
    final ThrowingFunction3<Object, Object, Object, Object, Error> block = null;

    assertThatCode(() -> JLet.let("", "", "", block))
      .isInstanceOf(NullPointerException.class);
  }

  @Test
  void letMethod3Values() {
    final Object v1 = new Object();
    final Object v2 = new Object();
    final Object v3 = new Object();
    final Object result = new Object();
    final ThrowingFunction3<Object, Object, Object, Object, Error> block = mockFunction3(result);

    assertThat(JLet.let(v1, v2, v3, block))
      .isSameAs(result);
    verify(block, times(1)).apply(same(v1), same(v2), same(v3));
    verifyNoMoreInteractions(block);
  }

  @Test
  void letMethod4ValuesThrowsNPEForNullArg() {
    final ThrowingFunction4<Object, Object, Object, Object, Object, Error> block = null;

    assertThatCode(() -> JLet.let("", "", "", "", block))
      .isInstanceOf(NullPointerException.class);
  }

  @Test
  void letMethod4Values() {
    final Object v1 = new Object();
    final Object v2 = new Object();
    final Object v3 = new Object();
    final Object v4 = new Object();
    final Object result = new Object();
    final ThrowingFunction4<Object, Object, Object, Object, Object, Error> block = mockFunction4(result);

    assertThat(JLet.let(v1, v2, v3, v4, block))
      .isSameAs(result);
    verify(block, times(1)).apply(same(v1), same(v2), same(v3), same(v4));
    verifyNoMoreInteractions(block);
  }

  @Test
  void letMethod5ValuesThrowsNPEForNullArg() {
    final ThrowingFunction5<Object, Object, Object, Object, Object, Object, Error> block = null;

    assertThatCode(() -> JLet.let("", "", "", "", "", block))
      .isInstanceOf(NullPointerException.class);
  }

  @Test
  void letMethod5Values() {
    final Object v1 = new Object();
    final Object v2 = new Object();
    final Object v3 = new Object();
    final Object v4 = new Object();
    final Object v5 = new Object();
    final Object result = new Object();
    final ThrowingFunction5<Object, Object, Object, Object, Object, Object, Error> block = mockFunction5(result);

    assertThat(JLet.let(v1, v2, v3, v4, v5, block))
      .isSameAs(result);
    verify(block, times(1)).apply(same(v1), same(v2), same(v3), same(v4), same(v5));
    verifyNoMoreInteractions(block);
  }

  @Test
  void letMethod6ValuesThrowsNPEForNullArg() {
    final ThrowingFunction6<Object, Object, Object, Object, Object, Object, Object, Error> block = null;

    assertThatCode(() -> JLet.let("", "", "", "", "", "", block))
      .isInstanceOf(NullPointerException.class);
  }

  @Test
  void letMethod6Values() {
    final Object v1 = new Object();
    final Object v2 = new Object();
    final Object v3 = new Object();
    final Object v4 = new Object();
    final Object v5 = new Object();
    final Object v6 = new Object();
    final Object result = new Object();
    final ThrowingFunction6<Object, Object, Object, Object, Object, Object, Object, Error> block =
      mockFunction6(result);

    assertThat(JLet.let(v1, v2, v3, v4, v5, v6, block))
      .isSameAs(result);
    verify(block, times(1)).apply(same(v1), same(v2), same(v3), same(v4), same(v5), same(v6));
    verifyNoMoreInteractions(block);
  }

  @Test
  void letMethod7ValuesThrowsNPEForNullArg() {
    final ThrowingFunction7<Object, Object, Object, Object, Object, Object, Object, Object, Error> block = null;

    assertThatCode(() -> JLet.let("", "", "", "", "", "", "", block))
      .isInstanceOf(NullPointerException.class);
  }

  @Test
  void letMethod7Values() {
    final Object v1 = new Object();
    final Object v2 = new Object();
    final Object v3 = new Object();
    final Object v4 = new Object();
    final Object v5 = new Object();
    final Object v6 = new Object();
    final Object v7 = new Object();
    final Object result = new Object();
    final ThrowingFunction7<Object, Object, Object, Object, Object, Object, Object, Object, Error> block =
      mockFunction7(result);

    assertThat(JLet.let(v1, v2, v3, v4, v5, v6, v7, block))
      .isSameAs(result);
    verify(block, times(1)).apply(same(v1), same(v2), same(v3), same(v4), same(v5), same(v6), same(v7));
    verifyNoMoreInteractions(block);
  }

  @Test
  void letMethod8ValuesThrowsNPEForNullArg() {
    final ThrowingFunction8<Object, Object, Object, Object, Object, Object, Object, Object, Object, Error> block = null;

    assertThatCode(() -> JLet.let("", "", "", "", "", "", "", "", block))
      .isInstanceOf(NullPointerException.class);
  }

  @Test
  void letMethod8Values() {
    final Object v1 = new Object();
    final Object v2 = new Object();
    final Object v3 = new Object();
    final Object v4 = new Object();
    final Object v5 = new Object();
    final Object v6 = new Object();
    final Object v7 = new Object();
    final Object v8 = new Object();
    final Object result = new Object();
    final ThrowingFunction8<Object, Object, Object, Object, Object, Object, Object, Object, Object, Error> block =
      mockFunction8(result);

    assertThat(JLet.let(v1, v2, v3, v4, v5, v6, v7, v8, block))
      .isSameAs(result);
    verify(block, times(1)).apply(same(v1), same(v2), same(v3), same(v4), same(v5), same(v6), same(v7), same(v8));
    verifyNoMoreInteractions(block);
  }

  @Test
  void testMethod0ValuesThrowsNPEForNullArg() {
    final ThrowingBooleanSupplier<Error> block = null;

    assertThatCode(() -> JLet.test(block))
      .isInstanceOf(NullPointerException.class);
  }

  @Test
  void testMethod0Values() {
    final boolean result = true;
    final ThrowingBooleanSupplier<Error> block = mockBooleanSupplier(result);

    assertThat(JLet.test(block))
      .isSameAs(result);
    verify(block, times(1)).get();
  }

  @Test
  void testMethod1ValueThrowsNPEForNullArg() {
    final ThrowingPredicate<Object, Error> block = null;

    assertThatCode(() -> JLet.test("", block))
      .isInstanceOf(NullPointerException.class);
  }

  @Test
  void testMethod1Value() {
    final Object v = new Object();
    final boolean result = true;
    final ThrowingPredicate<Object, Error> block = mockPredicate(result);

    assertThat(JLet.test(v, block))
      .isSameAs(result);
    verify(block, times(1)).test(same(v));
    verifyNoMoreInteractions(block);
  }

  @Test
  void testMethod2ValuesThrowsNPEForNullArg() {
    final ThrowingPredicate2<Object, Object, Error> block = null;

    assertThatCode(() -> JLet.test("", "", block))
      .isInstanceOf(NullPointerException.class);
  }

  @Test
  void testMethod2Values() {
    final Object v1 = new Object();
    final Object v2 = new Object();
    final boolean result = true;
    final ThrowingPredicate2<Object, Object, Error> block = mockPredicate2(result);

    assertThat(JLet.test(v1, v2, block))
      .isSameAs(result);
    verify(block, times(1)).test(same(v1), same(v2));
    verifyNoMoreInteractions(block);
  }

  @Test
  void testMethod3ValuesThrowsNPEForNullArg() {
    final ThrowingPredicate3<Object, Object, Object, Error> block = null;

    assertThatCode(() -> JLet.test("", "", "", block))
      .isInstanceOf(NullPointerException.class);
  }

  @Test
  void testMethod3Values() {
    final Object v1 = new Object();
    final Object v2 = new Object();
    final Object v3 = new Object();
    final boolean result = true;
    final ThrowingPredicate3<Object, Object, Object, Error> block = mockPredicate3(result);

    assertThat(JLet.test(v1, v2, v3, block))
      .isSameAs(result);
    verify(block, times(1)).test(same(v1), same(v2), same(v3));
    verifyNoMoreInteractions(block);
  }

  @Test
  void testMethod4ValuesThrowsNPEForNullArg() {
    final ThrowingPredicate4<Object, Object, Object, Object, Error> block = null;

    assertThatCode(() -> JLet.test("", "", "", "", block))
      .isInstanceOf(NullPointerException.class);
  }

  @Test
  void testMethod4Values() {
    final Object v1 = new Object();
    final Object v2 = new Object();
    final Object v3 = new Object();
    final Object v4 = new Object();
    final boolean result = true;
    final ThrowingPredicate4<Object, Object, Object, Object, Error> block = mockPredicate4(result);

    assertThat(JLet.test(v1, v2, v3, v4, block))
      .isSameAs(result);
    verify(block, times(1)).test(same(v1), same(v2), same(v3), same(v4));
    verifyNoMoreInteractions(block);
  }

  @Test
  void testMethod5ValuesThrowsNPEForNullArg() {
    final ThrowingPredicate5<Object, Object, Object, Object, Object, Error> block = null;

    assertThatCode(() -> JLet.test("", "", "", "", "", block))
      .isInstanceOf(NullPointerException.class);
  }

  @Test
  void testMethod5Values() {
    final Object v1 = new Object();
    final Object v2 = new Object();
    final Object v3 = new Object();
    final Object v4 = new Object();
    final Object v5 = new Object();
    final boolean result = true;
    final ThrowingPredicate5<Object, Object, Object, Object, Object, Error> block = mockPredicate5(result);

    assertThat(JLet.test(v1, v2, v3, v4, v5, block))
      .isSameAs(result);
    verify(block, times(1)).test(same(v1), same(v2), same(v3), same(v4), same(v5));
    verifyNoMoreInteractions(block);
  }

  @Test
  void testMethod6ValuesThrowsNPEForNullArg() {
    final ThrowingPredicate6<Object, Object, Object, Object, Object, Object, Error> block = null;

    assertThatCode(() -> JLet.test("", "", "", "", "", "", block))
      .isInstanceOf(NullPointerException.class);
  }

  @Test
  void testMethod6Values() {
    final Object v1 = new Object();
    final Object v2 = new Object();
    final Object v3 = new Object();
    final Object v4 = new Object();
    final Object v5 = new Object();
    final Object v6 = new Object();
    final boolean result = true;
    final ThrowingPredicate6<Object, Object, Object, Object, Object, Object, Error> block = mockPredicate6(result);

    assertThat(JLet.test(v1, v2, v3, v4, v5, v6, block))
      .isSameAs(result);
    verify(block, times(1)).test(same(v1), same(v2), same(v3), same(v4), same(v5), same(v6));
    verifyNoMoreInteractions(block);
  }

  @Test
  void testMethod7ValuesThrowsNPEForNullArg() {
    final ThrowingPredicate7<Object, Object, Object, Object, Object, Object, Object, Error> block = null;

    assertThatCode(() -> JLet.test("", "", "", "", "", "", "", block))
      .isInstanceOf(NullPointerException.class);
  }

  @Test
  void testMethod7Values() {
    final Object v1 = new Object();
    final Object v2 = new Object();
    final Object v3 = new Object();
    final Object v4 = new Object();
    final Object v5 = new Object();
    final Object v6 = new Object();
    final Object v7 = new Object();
    final boolean result = true;
    final ThrowingPredicate7<Object, Object, Object, Object, Object, Object, Object, Error> block =
      mockPredicate7(result);

    assertThat(JLet.test(v1, v2, v3, v4, v5, v6, v7, block))
      .isSameAs(result);
    verify(block, times(1)).test(same(v1), same(v2), same(v3), same(v4), same(v5), same(v6), same(v7));
    verifyNoMoreInteractions(block);
  }

  @Test
  void testMethod8ValuesThrowsNPEForNullArg() {
    final ThrowingPredicate8<Object, Object, Object, Object, Object, Object, Object, Object, Error> block = null;

    assertThatCode(() -> JLet.test("", "", "", "", "", "", "", "", block))
      .isInstanceOf(NullPointerException.class);
  }

  @Test
  void testMethod8Values() {
    final Object v1 = new Object();
    final Object v2 = new Object();
    final Object v3 = new Object();
    final Object v4 = new Object();
    final Object v5 = new Object();
    final Object v6 = new Object();
    final Object v7 = new Object();
    final Object v8 = new Object();
    final boolean result = true;
    final ThrowingPredicate8<Object, Object, Object, Object, Object, Object, Object, Object, Error> block =
      mockPredicate8(result);

    assertThat(JLet.test(v1, v2, v3, v4, v5, v6, v7, v8, block))
      .isSameAs(result);
    verify(block, times(1)).test(same(v1), same(v2), same(v3), same(v4), same(v5), same(v6), same(v7), same(v8));
    verifyNoMoreInteractions(block);
  }

  @Test
  void runMethodThrowsNPEForNullArg() {
    final ThrowingRunnable<Error> block = null;

    assertThatCode(() -> JLet.run(block))
      .isInstanceOf(NullPointerException.class);
  }

  @Test
  void runMethod() {
    final ThrowingRunnable<Error> block = mockRunnable();

    JLet.run(block);
    verify(block, times(1)).run();
  }

  @Test
  void withMethod1ValueThrowsNPEForNullArg() {
    final ThrowingConsumer<Object, Error> block = null;

    assertThatCode(() -> JLet.with("", block))
      .isInstanceOf(NullPointerException.class);
  }

  @Test
  void withMethod1Value() {
    final Object v = new Object();
    final ThrowingConsumer<Object, Error> block = mockConsumer();

    JLet.with(v, block);
    verify(block, times(1)).accept(same(v));
    verifyNoMoreInteractions(block);
  }

  @Test
  void withMethod2ValuesThrowsNPEForNullArg() {
    final ThrowingConsumer2<Object, Object, Error> block = null;

    assertThatCode(() -> JLet.with("", "", block))
      .isInstanceOf(NullPointerException.class);
  }

  @Test
  void withMethod2Values() {
    final Object v1 = new Object();
    final Object v2 = new Object();
    final ThrowingConsumer2<Object, Object, Error> block = mockConsumer2();

    JLet.with(v1, v2, block);
    verify(block, times(1)).accept(same(v1), same(v2));
    verifyNoMoreInteractions(block);
  }

  @Test
  void withMethod3ValuesThrowsNPEForNullArg() {
    final ThrowingConsumer3<Object, Object, Object, Error> block = null;

    assertThatCode(() -> JLet.with("", "", "", block))
      .isInstanceOf(NullPointerException.class);
  }

  @Test
  void withMethod3Values() {
    final Object v1 = new Object();
    final Object v2 = new Object();
    final Object v3 = new Object();
    final ThrowingConsumer3<Object, Object, Object, Error> block = mockConsumer3();

    JLet.with(v1, v2, v3, block);
    verify(block, times(1)).accept(same(v1), same(v2), same(v3));
    verifyNoMoreInteractions(block);
  }

  @Test
  void withMethod4ValuesThrowsNPEForNullArg() {
    final ThrowingConsumer4<Object, Object, Object, Object, Error> block = null;

    assertThatCode(() -> JLet.with("", "", "", "", block))
      .isInstanceOf(NullPointerException.class);
  }

  @Test
  void withMethod4Values() {
    final Object v1 = new Object();
    final Object v2 = new Object();
    final Object v3 = new Object();
    final Object v4 = new Object();
    final ThrowingConsumer4<Object, Object, Object, Object, Error> block = mockConsumer4();

    JLet.with(v1, v2, v3, v4, block);
    verify(block, times(1)).accept(same(v1), same(v2), same(v3), same(v4));
    verifyNoMoreInteractions(block);
  }

  @Test
  void withMethod5ValuesThrowsNPEForNullArg() {
    final ThrowingConsumer5<Object, Object, Object, Object, Object, Error> block = null;

    assertThatCode(() -> JLet.with("", "", "", "", "", block))
      .isInstanceOf(NullPointerException.class);
  }

  @Test
  void withMethod5Values() {
    final Object v1 = new Object();
    final Object v2 = new Object();
    final Object v3 = new Object();
    final Object v4 = new Object();
    final Object v5 = new Object();
    final ThrowingConsumer5<Object, Object, Object, Object, Object, Error> block = mockConsumer5();

    JLet.with(v1, v2, v3, v4, v5, block);
    verify(block, times(1)).accept(same(v1), same(v2), same(v3), same(v4), same(v5));
    verifyNoMoreInteractions(block);
  }

  @Test
  void withMethod6ValuesThrowsNPEForNullArg() {
    final ThrowingConsumer6<Object, Object, Object, Object, Object, Object, Error> block = null;

    assertThatCode(() -> JLet.with("", "", "", "", "", "", block))
      .isInstanceOf(NullPointerException.class);
  }

  @Test
  void withMethod6Values() {
    final Object v1 = new Object();
    final Object v2 = new Object();
    final Object v3 = new Object();
    final Object v4 = new Object();
    final Object v5 = new Object();
    final Object v6 = new Object();
    final ThrowingConsumer6<Object, Object, Object, Object, Object, Object, Error> block = mockConsumer6();

    JLet.with(v1, v2, v3, v4, v5, v6, block);
    verify(block, times(1)).accept(same(v1), same(v2), same(v3), same(v4), same(v5), same(v6));
    verifyNoMoreInteractions(block);
  }

  @Test
  void withMethod7ValuesThrowsNPEForNullArg() {
    final ThrowingConsumer7<Object, Object, Object, Object, Object, Object, Object, Error> block = null;

    assertThatCode(() -> JLet.with("", "", "", "", "", "", "", block))
      .isInstanceOf(NullPointerException.class);
  }

  @Test
  void withMethod7Values() {
    final Object v1 = new Object();
    final Object v2 = new Object();
    final Object v3 = new Object();
    final Object v4 = new Object();
    final Object v5 = new Object();
    final Object v6 = new Object();
    final Object v7 = new Object();
    final ThrowingConsumer7<Object, Object, Object, Object, Object, Object, Object, Error> block = mockConsumer7();

    JLet.with(v1, v2, v3, v4, v5, v6, v7, block);
    verify(block, times(1)).accept(same(v1), same(v2), same(v3), same(v4), same(v5), same(v6), same(v7));
    verifyNoMoreInteractions(block);
  }

  @Test
  void withMethod8ValuesThrowsNPEForNullArg() {
    final ThrowingConsumer8<Object, Object, Object, Object, Object, Object, Object, Object, Error> block = null;

    assertThatCode(() -> JLet.with("", "", "", "", "", "", "", "", block))
      .isInstanceOf(NullPointerException.class);
  }

  @Test
  void withMethod8Values() {
    final Object v1 = new Object();
    final Object v2 = new Object();
    final Object v3 = new Object();
    final Object v4 = new Object();
    final Object v5 = new Object();
    final Object v6 = new Object();
    final Object v7 = new Object();
    final Object v8 = new Object();
    final ThrowingConsumer8<Object, Object, Object, Object, Object, Object, Object, Object, Error> block =
      mockConsumer8();

    JLet.with(v1, v2, v3, v4, v5, v6, v7, v8, block);
    verify(block, times(1)).accept(same(v1), same(v2), same(v3), same(v4), same(v5), same(v6), same(v7), same(v8));
    verifyNoMoreInteractions(block);
  }

  @SuppressWarnings("unchecked")
  private static ThrowingRunnable<Error> mockRunnable() {
    return mock(ThrowingRunnable.class);
  }

  @SuppressWarnings("unchecked")
  private static <R> ThrowingSupplier<R, Error> mockSupplier(final R result) {
    final ThrowingSupplier<R, Error> mock = mock(ThrowingSupplier.class);
    doReturn(result).when(mock).get();
    return mock;
  }

  @SuppressWarnings("unchecked")
  private static ThrowingBooleanSupplier<Error> mockBooleanSupplier(final boolean result) {
    final ThrowingBooleanSupplier<Error> mock = mock(ThrowingBooleanSupplier.class);
    doReturn(result).when(mock).get();
    return mock;
  }

  @SuppressWarnings("unchecked")
  private static <T> ThrowingConsumer<T, Error> mockConsumer() {
    return mock(ThrowingConsumer.class);
  }

  @SuppressWarnings("unchecked")
  private static <T1, T2> ThrowingConsumer2<T1, T2, Error> mockConsumer2() {
    return mock(ThrowingConsumer2.class);
  }

  @SuppressWarnings("unchecked")
  private static <T1, T2, T3> ThrowingConsumer3<T1, T2, T3, Error> mockConsumer3() {
    return mock(ThrowingConsumer3.class);
  }

  @SuppressWarnings("unchecked")
  private static <T1, T2, T3, T4> ThrowingConsumer4<T1, T2, T3, T4, Error> mockConsumer4() {
    return mock(ThrowingConsumer4.class);
  }

  @SuppressWarnings("unchecked")
  private static <T1, T2, T3, T4, T5> ThrowingConsumer5<T1, T2, T3, T4, T5, Error> mockConsumer5() {
    return mock(ThrowingConsumer5.class);
  }

  @SuppressWarnings("unchecked")
  private static <T1, T2, T3, T4, T5, T6> ThrowingConsumer6<T1, T2, T3, T4, T5, T6, Error> mockConsumer6() {
    return mock(ThrowingConsumer6.class);
  }

  @SuppressWarnings("unchecked")
  private static <T1, T2, T3, T4, T5, T6, T7> ThrowingConsumer7<T1, T2, T3, T4, T5, T6, T7, Error> mockConsumer7() {
    return mock(ThrowingConsumer7.class);
  }

  @SuppressWarnings("unchecked")
  private static <T1, T2, T3, T4, T5, T6, T7, T8> ThrowingConsumer8<T1, T2, T3, T4, T5, T6, T7, T8, Error> mockConsumer8() {
    return mock(ThrowingConsumer8.class);
  }

  @SuppressWarnings("unchecked")
  private static <T, R> ThrowingFunction<T, R, Error> mockFunction(final R result) {
    final ThrowingFunction<T, R, Error> mock = mock(ThrowingFunction.class);
    doReturn(result).when(mock).apply(any());
    return mock;
  }

  @SuppressWarnings("unchecked")
  private static <T1, T2, R> ThrowingFunction2<T1, T2, R, Error> mockFunction2(final R result) {
    final ThrowingFunction2<T1, T2, R, Error> mock = mock(ThrowingFunction2.class);
    doReturn(result).when(mock).apply(any(), any());
    return mock;
  }

  @SuppressWarnings("unchecked")
  private static <T1, T2, T3, R> ThrowingFunction3<T1, T2, T3, R, Error> mockFunction3(final R result) {
    final ThrowingFunction3<T1, T2, T3, R, Error> mock = mock(ThrowingFunction3.class);
    doReturn(result).when(mock).apply(any(), any(), any());
    return mock;
  }

  @SuppressWarnings("unchecked")
  private static <T1, T2, T3, T4, R> ThrowingFunction4<T1, T2, T3, T4, R, Error> mockFunction4(final R result) {
    final ThrowingFunction4<T1, T2, T3, T4, R, Error> mock = mock(ThrowingFunction4.class);
    doReturn(result).when(mock).apply(any(), any(), any(), any());
    return mock;
  }

  @SuppressWarnings("unchecked")
  private static <T1, T2, T3, T4, T5, R> ThrowingFunction5<T1, T2, T3, T4, T5, R, Error> mockFunction5(final R result) {
    final ThrowingFunction5<T1, T2, T3, T4, T5, R, Error> mock = mock(ThrowingFunction5.class);
    doReturn(result).when(mock).apply(any(), any(), any(), any(), any());
    return mock;
  }

  @SuppressWarnings("unchecked")
  private static <T1, T2, T3, T4, T5, T6, R> ThrowingFunction6<T1, T2, T3, T4, T5, T6, R, Error> mockFunction6(final R result) {
    final ThrowingFunction6<T1, T2, T3, T4, T5, T6, R, Error> mock = mock(ThrowingFunction6.class);
    doReturn(result).when(mock).apply(any(), any(), any(), any(), any(), any());
    return mock;
  }

  @SuppressWarnings("unchecked")
  private static <T1, T2, T3, T4, T5, T6, T7, R> ThrowingFunction7<T1, T2, T3, T4, T5, T6, T7, R, Error> mockFunction7(final R result) {
    final ThrowingFunction7<T1, T2, T3, T4, T5, T6, T7, R, Error> mock = mock(ThrowingFunction7.class);
    doReturn(result).when(mock).apply(any(), any(), any(), any(), any(), any(), any());
    return mock;
  }

  @SuppressWarnings("unchecked")
  private static <T1, T2, T3, T4, T5, T6, T7, T8, R> ThrowingFunction8<T1, T2, T3, T4, T5, T6, T7, T8, R, Error> mockFunction8(final R result) {
    final ThrowingFunction8<T1, T2, T3, T4, T5, T6, T7, T8, R, Error> mock = mock(ThrowingFunction8.class);
    doReturn(result).when(mock).apply(any(), any(), any(), any(), any(), any(), any(), any());
    return mock;
  }

  @SuppressWarnings("unchecked")
  private static <T> ThrowingPredicate<T, Error> mockPredicate(final boolean result) {
    final ThrowingPredicate<T, Error> mock = mock(ThrowingPredicate.class);
    doReturn(result).when(mock).test(any());
    return mock;
  }

  @SuppressWarnings("unchecked")
  private static <T1, T2> ThrowingPredicate2<T1, T2, Error> mockPredicate2(final boolean result) {
    final ThrowingPredicate2<T1, T2, Error> mock = mock(ThrowingPredicate2.class);
    doReturn(result).when(mock).test(any(), any());
    return mock;
  }

  @SuppressWarnings("unchecked")
  private static <T1, T2, T3> ThrowingPredicate3<T1, T2, T3, Error> mockPredicate3(final boolean result) {
    final ThrowingPredicate3<T1, T2, T3, Error> mock = mock(ThrowingPredicate3.class);
    doReturn(result).when(mock).test(any(), any(), any());
    return mock;
  }

  @SuppressWarnings("unchecked")
  private static <T1, T2, T3, T4> ThrowingPredicate4<T1, T2, T3, T4, Error> mockPredicate4(final boolean result) {
    final ThrowingPredicate4<T1, T2, T3, T4, Error> mock = mock(ThrowingPredicate4.class);
    doReturn(result).when(mock).test(any(), any(), any(), any());
    return mock;
  }

  @SuppressWarnings("unchecked")
  private static <T1, T2, T3, T4, T5> ThrowingPredicate5<T1, T2, T3, T4, T5, Error> mockPredicate5(final boolean result) {
    final ThrowingPredicate5<T1, T2, T3, T4, T5, Error> mock = mock(ThrowingPredicate5.class);
    doReturn(result).when(mock).test(any(), any(), any(), any(), any());
    return mock;
  }

  @SuppressWarnings("unchecked")
  private static <T1, T2, T3, T4, T5, T6> ThrowingPredicate6<T1, T2, T3, T4, T5, T6, Error> mockPredicate6(final boolean result) {
    final ThrowingPredicate6<T1, T2, T3, T4, T5, T6, Error> mock = mock(ThrowingPredicate6.class);
    doReturn(result).when(mock).test(any(), any(), any(), any(), any(), any());
    return mock;
  }

  @SuppressWarnings("unchecked")
  private static <T1, T2, T3, T4, T5, T6, T7> ThrowingPredicate7<T1, T2, T3, T4, T5, T6, T7, Error> mockPredicate7(final boolean result) {
    final ThrowingPredicate7<T1, T2, T3, T4, T5, T6, T7, Error> mock = mock(ThrowingPredicate7.class);
    doReturn(result).when(mock).test(any(), any(), any(), any(), any(), any(), any());
    return mock;
  }

  @SuppressWarnings("unchecked")
  private static <T1, T2, T3, T4, T5, T6, T7, T8> ThrowingPredicate8<T1, T2, T3, T4, T5, T6, T7, T8, Error> mockPredicate8(final boolean result) {
    final ThrowingPredicate8<T1, T2, T3, T4, T5, T6, T7, T8, Error> mock = mock(ThrowingPredicate8.class);
    doReturn(result).when(mock).test(any(), any(), any(), any(), any(), any(), any(), any());
    return mock;
  }
}
