package com.haogre.pay.wechat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author HAOZ
 * @date 2016-8-10
 * @description TestController4Test
 *
 */
@RequestMapping(value="")
@Controller
public class TestWXController {

	@RequestMapping(value="/test")
	public String test(){
		return "/wechat/test";
	}
}
