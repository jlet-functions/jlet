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

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;

/**
 * Tests for {@link ThrowingConsumer8}.
 */
final class ThrowingConsumer8Test {

  @Test
  void ofMethodThrowsNPEForNullArg() {
    assertThatCode(() -> ThrowingConsumer8.of(null))
      .isInstanceOf(NullPointerException.class);
  }

  @Test
  void ofMethodReturnsTheSameObjectAsItsArg() {
    final ThrowingConsumer8<String, String, String, String, String, String, String, String, Throwable> arg =
      (t1, t2, t3, t4, t5, t6, t7, t8) -> { };

    assertThat(ThrowingConsumer8.of(arg))
      .isSameAs(arg);
  }

  @Test
  void uncheckedMethodThrowsNPEForNullArg() {
    assertThatCode(() -> ThrowingConsumer8.of(null))
      .isInstanceOf(NullPointerException.class);
  }

  @Test
  void uncheckedMethodReturnsTheSameObjectAsItsArg() {
    final ThrowingConsumer8<String, String, String, String, String, String, String, String, Throwable> arg =
      (t1, t2, t3, t4, t5, t6, t7, t8) -> { };

    assertThat(ThrowingConsumer8.unchecked(arg))
      .isSameAs(arg);
  }
}
