package com.xqx.dispatcher.filter;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/24 21:42
 * description:
 */
public class HTMLFilter implements Filter {
    @Override
    public String doFilter(String str) {
       // process the html tag <>
        return str.replace('<', '[').replace('>', ']');
    }
}
