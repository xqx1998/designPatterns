package com.xqx.main;

import com.xqx.dispatcher.filter.*;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/24 21:14
 * description:
 */
public class Main {
    public static void main(String[] args) {
        String msg = "大家好 :), <script>, 敏感， 被就业， 网络授课没感觉，因为看不见大家伙儿";
        System.out.println(msg);
        MsgProcessor mp = new MsgProcessor();
        mp.setMsg(msg);
        FilterChain filterChain = new FilterChain();

        filterChain.addFilter(new HTMLFilter())
                .addFilter(new SesitiveFilter());

        FilterChain filterChain1 = new FilterChain();
        filterChain1.addFilter(new FaceFilter());
        filterChain.addFilter(filterChain1);

        mp.setFilterChain(filterChain);
        String result = mp.process();
        System.out.println(result);
    }
}
