package com.geored.dipies;





/**
 * EXAMPLE:
 *
 * class HeadersEnricher implements Enricher<Headers> {
 *
 *     Headers enrich(Headers headers) {
 *         headers.add("x-header", "something")
 *         return headers
 *     }
 * }
 *
 *
 * @author Georgievski Georgy
 *
 */
public interface Enricher<T> {

    T enrich(T thing);
}
