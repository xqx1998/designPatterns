package com.xqx.dispatcher.filter;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/24 21:55
 * description:
 */
public class FaceFilter implements Filter {
    @Override
    public String doFilter(String str) {
        return str.replace(":)","^V^");
    }
}
