package com.springcloud.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author zhaopan
 * @Date 2017-05-26
 **/
@Slf4j
@Component
public class TokenFilter extends ZuulFilter {

    /**
     * zuul中定义了四种不同生命周期的过滤器类型,具体如下：
         pre：可以在请求被路由之前调用
         routing：在路由请求时候被调用
         post：在routing和error过滤器之后被调用
         error：处理请求时发生错误时被调用
     * @return
     */
    @Override
    public String filterType() {
        return "post";
    }
    @Override
    public int filterOrder() {
        return 0;
    }
    @Override
    public boolean shouldFilter() {
        return true;
    }
    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        log.info(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));
        Object accessToken = request.getParameter("accessToken");
        if(accessToken == null) {
            log.warn("access token is empty");
            //ctx.setSendZuulResponse(false);
            //ctx.setResponseStatusCode(401);
            try {
                log.info("This is a pre filter, it will throw a RuntimeException");
                throw new RuntimeException("Exist some errors...");

            } catch (Exception e) {
                ctx.set("error.status_code", HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
                ctx.set("error.exception", e);
            }

            return null;
            //return "access token is empty";

        }
        log.info("access token ok");
        return null;
    }
}