package com.xqx.dispatcher.filter;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/24 21:45
 * description:
 */
public class SesitiveFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        request.requestStr = request.requestStr.replace("被就业", "就业")
                .replace("敏感", "")+"---SesitiveFilter()";
        filterChain.doFilter(request,response,filterChain);
        response.responseStr+="---SesitiveFilter()";
    }

}
