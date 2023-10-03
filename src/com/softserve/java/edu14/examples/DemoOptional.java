package com.softserve.java.edu14.examples;

import java.util.Optional;
import java.util.stream.Stream;

public class DemoOptional {
    public static void main(String[] args) {
        Optional.of("optional")
                .map(String::toUpperCase)
                .ifPresent(System.out::println);

        Optional<Integer> length = Optional.of("optional")
                .map(String::length);
        System.out.println(length.get());

        String defaultValue = Optional.<String>empty()
                .orElse("default");
        System.out.println(defaultValue);

        String valueOfSupplier = Optional.<String>empty()
                .orElseGet(() -> "default from Supplier");
        System.out.println(valueOfSupplier);

        Optional.of("op")
                .filter(val -> val.length() > 3)
                .ifPresent(System.out::println);

           Optional<String> optional = Optional.of("bam");

            optional.isPresent();           // true
            optional.get();                 // "bam"
            optional.orElse("fallback");    // "bam"

            optional.ifPresent((s) -> System.out.println(s.charAt(0)));     // "b"

            // Optional.empty()
            Optional<String> emptyOptional = Optional.empty();
            emptyOptional.isPresent();      // false
            emptyOptional.orElse("fallback");    // "fallback"

            // Optional.ofNullable
            Optional<String> nullableOptional = Optional.ofNullable(null);
            nullableOptional.isPresent();   // false
            nullableOptional.orElse("fallback");    // "fallback"

            // Optional.ofNullable
            Optional<String> nullableOptional2 = Optional.ofNullable("bam");
            nullableOptional2.isPresent();   // true
            nullableOptional2.orElse("fallback");    // "bam"

            // Optional.ofNullable
            Optional<String> nullableOptional3 = Optional.ofNullable(null);
            nullableOptional3.isPresent();   // false
            nullableOptional3.orElse("fallback");    // "fallback"

            // Optional.ofNullable
            Optional<String> nullableOptional4 = Optional.ofNullable("bam");
            nullableOptional4.isPresent();   // true
            nullableOptional4.orElse("fallback");    // "bam"

            // Optional.ofNullable
            Optional<String> nullableOptional5 = Optional.ofNullable(null);
            nullableOptional5.isPresent();   // false
            nullableOptional5.orElse("fallback");    // "fallback"

            // Optional.ofNullable
            Optional<String> nullableOptional6 = Optional.ofNullable("bam");
            nullableOptional6.isPresent();   // true
            nullableOptional6.orElse("fallback");    // "bam"

            // Optional.ofNullable
            Optional<String> nullableOptional7 = Optional.ofNullable(null);
            nullableOptional7.isPresent();   // false
            nullableOptional7.orElse("fallback");    // "fallback"

            // Optional.ofNullable
            Optional<String> nullableOptional8 = Optional.ofNullable("bam");
            nullableOptional8.isPresent();   // true
            nullableOptional8.orElse("fallback");    // "bam"

            // Optional.ofNullable
            Optional<String> nullableOptional9 = Optional.ofNullable(null);
            nullableOptional9.isPresent();   // false
            nullableOptional9.orElse("fallback");    // "fallback"


    }
}
