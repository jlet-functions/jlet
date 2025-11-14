# JLet

[![Maven Central](https://img.shields.io/maven-central/v/dev.jlet/jlet?color=blue)](https://central.sonatype.com/artifact/dev.jlet/jlet)
[![Javadoc](https://img.shields.io/badge/javadoc-latest-blue.svg)](https://javadoc.io/doc/dev.jlet)
[![License](https://img.shields.io/github/license/jlet-functions/jlet?color=blue)](https://github.com/jlet-functions/jlet/blob/main/LICENSE)
[![GitHub Actions Workflow Status](https://img.shields.io/github/actions/workflow/status/jlet-functions/jlet/tests.yml?branch=main)](https://github.com/jlet-functions/jlet/actions/workflows/tests.yml/)

A set of scope functions for Java.

## Contents

* [What is JLet](#what-is-jlet)
* [How to use](#how-to-use)
* [Functions](#functions)
  * [`let`](#let)
  * [`test`](#test)
  * [`run`](#run)
  * [`with`](#with)
  * [`it`](#it)
* [Checked exceptions](#checked-exceptions)
* [Contributors](#contributors)
* [Licence](#license)

## What is JLet

JLet is a set of scope functions for Java, similar to Kotlin's scope functions but Java-specific.

When you call a scope function on an object with a lambda expression provided, it forms a temporary scope. In this
scope, you can access the object as a lambda expression argument.

## How to use

Requires Java 8+ version.

Maven:

<!-- @formatter:off -->
```xml
<dependencies>
  <dependency>
    <groupId>dev.jlet</groupId>
    <artifactId>jlet</artifactId>
    <version>1.0</version>
  </dependency>
</dependencies>
```
<!-- @formatter:on -->

Gradle (Groovy):

<!-- @formatter:off -->
```groovy
dependencies {
  implementation 'dev.jlet:jlet:1.0'
}
```
<!-- @formatter:on -->

Gradle (Kotlin):

<!-- @formatter:off -->
```kotlin
dependencies {
  implementation("dev.jlet:jlet:1.0")
}
```
<!-- @formatter:on -->

## Functions

### `let`

* has arguments (from 1 to 8)
* has result

<!-- @formatter:off -->
```java
String origin = "abcdef";
String result = let(origin.toLowerCase(), origin.toUpperCase(), (lower, upper) ->
  lower + upper
);
```
<!-- @formatter:on -->

### `test`

* has arguments (from 0 to 8)
* has result (`boolean`)

<!-- @formatter:off -->
```java
if (test(() -> {
  // calculations
  return true;
})) {
  System.out.println("OK");
}
```
<!-- @formatter:on -->

### `run`

* has no arguments
* has no result

<!-- @formatter:off -->
```java
run(() ->
  System.out.println("OK")
);
```
<!-- @formatter:on -->

### `with`

* has arguments (from 1 to 8)
* has no result

<!-- @formatter:off -->
```java
String origin = "abcdef";
with(origin.substring(0, 3), substring ->
  System.out.println("substring: " + substring)
);
```
<!-- @formatter:on -->

### `it`

* has arguments (from 0 to 8)
* has result (function result for the case of no arguments or the first value for others)

<!-- @formatter:off -->
```java
Map<Integer, String> map = it(new HashMap<>(), m -> {
  m.put(1, "first");
  m.put(2, "second");
});

MyObj myObj = new MyObjBuilder()
  .setValue1(100)
  .setValue2(it(() -> {
    // calculations
    return 200;
  }))
  .setValue3(it(map, m -> System.out.println(m)))
  .build();
```
<!-- @formatter:on -->

## Checked exceptions

All of these functions ignore checked exceptions.

<!-- @formatter:off -->
```java
static void throwingMethod() throws Throwable {
  throw new Throwable();
}

static void method() {
  run(() -> throwingMethod());
}
```
<!-- @formatter:on -->

## Contributors

* [@evpl](https://github.com/evpl) as Evgenii Plugatar

## License

JLet is open-source project, and distributed under the [MIT](LICENSE) license.
