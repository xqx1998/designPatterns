package com.xqx.dispatcher.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/24 22:03
 * description:
 */
public class FilterChain implements Filter {
    List<Filter> filters = new ArrayList<Filter>();
    int index = 0;

    public FilterChain addFilter(Filter f){
        this.filters.add(f);
        return this;
    }


    @Override
    public void doFilter(Request request, Response response,FilterChain filterChain) {
        if (index == filters.size()) return;
        Filter f = filters.get(index);
        index ++;
        f.doFilter(request,response,filterChain);

    }
}
