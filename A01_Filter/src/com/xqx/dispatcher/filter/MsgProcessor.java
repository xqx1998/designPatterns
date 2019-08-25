package com.xqx.dispatcher.filter;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/24 21:18
 * description:
 */
public class MsgProcessor {
    private String msg;
    //创建过滤器 数组
    // Filter[] filters = {new HTMLFilter(), new SesitiveFilter(), new FaceFilter()};
    FilterChain filterChain;

    public FilterChain getFilterChain() {
        return filterChain;
    }

    public void setFilterChain(FilterChain filterChain) {
        this.filterChain = filterChain;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String process() {
        return filterChain.doFilter(msg);
    }

}
