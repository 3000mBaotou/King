package com.bw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* @author 遂川(苗舒轩)
* @version 创建时间:2018年5月28日 下午12:28:41
* 类说明:
*/
@Controller
public class TestController {

	@RequestMapping("list")
	@ResponseBody
	public String list() {
		return "ok";
	}
}
