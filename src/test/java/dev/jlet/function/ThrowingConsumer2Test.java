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
 * Tests for {@link ThrowingConsumer2}.
 */
final class ThrowingConsumer2Test {

  @Test
  void ofMethodThrowsNPEForNullArg() {
    assertThatCode(() -> ThrowingConsumer2.of(null))
      .isInstanceOf(NullPointerException.class);
  }

  @Test
  void ofMethodReturnsTheSameObjectAsItsArg() {
    final ThrowingConsumer2<String, String, Throwable> arg = (t1, t2) -> { };

    assertThat(ThrowingConsumer2.of(arg))
      .isSameAs(arg);
  }

  @Test
  void uncheckedMethodThrowsNPEForNullArg() {
    assertThatCode(() -> ThrowingConsumer2.of(null))
      .isInstanceOf(NullPointerException.class);
  }

  @Test
  void uncheckedMethodReturnsTheSameObjectAsItsArg() {
    final ThrowingConsumer2<String, String, Throwable> arg = (t1, t2) -> { };

    assertThat(ThrowingConsumer2.unchecked(arg))
      .isSameAs(arg);
  }
}
