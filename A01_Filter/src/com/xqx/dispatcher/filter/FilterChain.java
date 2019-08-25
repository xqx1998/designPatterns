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

    public FilterChain addFilter(Filter f){
        this.filters.add(f);
        return this;
    }

    public String doFilter(String str){
        for (Filter filter : filters) {
            str = filter.doFilter(str);
        }
        return str;
    }
}
