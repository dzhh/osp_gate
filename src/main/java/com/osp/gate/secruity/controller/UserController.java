package com.osp.gate.secruity.controller;


import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RequestMapping(value = "/users")
@RestController
public class UserController {


	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Object detail(@PathVariable Integer id) {
		return "Get a user";
    }
    
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public Object create(HttpServletRequest request) {
		return "POST a user";
    }

    @RequestMapping(method = RequestMethod.PUT)
    @ResponseBody
    public Object update(HttpServletRequest request) {
		return "PUT a user";
    }

}