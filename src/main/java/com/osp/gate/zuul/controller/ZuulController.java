package com.osp.gate.zuul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.zuul.web.ZuulHandlerMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.osp.gate.zuul.service.RefreshRouteService;

import java.util.Map;

/**
 * 
 * @author fly
 *
 */
@RestController
public class ZuulController {

    @Autowired
    RefreshRouteService refreshRouteService;

    @RequestMapping("/refreshRoute")
    public String refreshRoute(){
        refreshRouteService.refreshRoute();
        return "refreshRoute";
    }

    @Autowired
    ZuulHandlerMapping zuulHandlerMapping;

    @RequestMapping("/watchNowRoute")
    public String watchNowRoute(){
        //可以用debug模式看里面具体是什么
        Map<String, Object> handlerMap = zuulHandlerMapping.getHandlerMap();
        for(String key : handlerMap.keySet()) {
        	System.out.println(key + " : " + handlerMap.get(key));
        }
        return "watchNowRoute";
    }



}
