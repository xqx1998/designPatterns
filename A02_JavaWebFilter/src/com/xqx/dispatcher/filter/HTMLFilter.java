package com.xqx.dispatcher.filter;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/24 21:42
 * description:
 */
public class HTMLFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        request.requestStr = request.requestStr.replace('<', '[')
                .replace('>', ']') + "---HTMLFilter()";
        filterChain.doFilter(request,response,filterChain);
        response.responseStr += "---HTMLFilter()";
    }
}
