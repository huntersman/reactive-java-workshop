package io.javabrains.reactiveworkshop;

import java.io.IOException;

public class Exercise9 {


    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux()

        // Print size of intNumbersFlux after the last item returns
        ReactiveSources.intNumbersFlux().count().subscribe(num -> System.out.println(num));

        // Collect all items of intNumbersFlux into a single list and print it
        ReactiveSources.intNumbersFlux().collectList().subscribe(num -> System.out.println(num));

        // Transform to a sequence of sums of adjacent two numbers
        ReactiveSources.intNumbersFlux().buffer(2).map(list -> list.get(0) + list.get(1)).subscribe(num -> System.out.println(num));

        System.out.println("Press a key to end");
        System.in.read();
    }

}
