package com.xqx.dispatcher.filter;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/24 21:45
 * description:
 */
public class SesitiveFilter implements Filter {
    @Override
    public String doFilter(String str) {
        return str.replace("被就业", "就业").replace("敏感", "");
    }
}
