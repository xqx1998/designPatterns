package com.xqx.dispatcher.filter;

public interface Filter {
    void doFilter(Request request, Response response, FilterChain filterChain);
}
