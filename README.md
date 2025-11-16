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

When you call a scope function with an object and a lambda expression, it forms a temporary scope. In this scope, you
can access the object as a lambda expression argument.

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

* has value arguments (from 1 to 8)
* has result (lambda expression result)

<!-- @formatter:off -->
```java
String shortString = let(someObject.toString(), s ->
  s.length() > 10 ? s.substring(0, 11) : s
);
```
<!-- @formatter:on -->

### `test`

* has value arguments (from 0 to 8)
* has result (lambda expression `boolean` result)

<!-- @formatter:off -->
```java
if (test(someObject.toString(), s -> s.length() > 10 && s.contains("."))) {
  System.out.println("OK");
}
```
<!-- @formatter:on -->

### `run`

* has no value arguments
* has no result

<!-- @formatter:off -->
```java
run(() -> {
  String localVariable1 = "string1";
  String localVariable2 = "string2";
  System.out.println(localVariable1);
  System.out.println(localVariable2);
});
```
<!-- @formatter:on -->

### `with`

* has value arguments (from 1 to 8)
* has no result

<!-- @formatter:off -->
```java
with(someObject.toString(), s -> {
  String shortString = s.length() > 10 ? s.substring(0, 11) : s;
  System.out.println(shortString);
});
```
<!-- @formatter:on -->

### `it`

There are two options

* has no value arguments
* has result (lambda expression result)

<!-- @formatter:off -->
```java
someObject.setString(it(() -> {
  // calculations
  return "string";
}));
```
<!-- @formatter:on -->

* has value arguments (from 1 to 8)
* has result (the first value argument)

<!-- @formatter:off -->
```java
someObject.setMap(it(new HashMap<>(), m -> {
  m.put(1, "first");
  m.put(2, "second");
}));
```
<!-- @formatter:on -->

## Checked exceptions

All of these functions allow not catching checked exceptions.

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
