package cn.lechange.happor.controllers;

import cn.lechange.happor.annotation.DefaultController;
import cn.lechange.happor.controller.HttpNormalHandler;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.FullHttpResponse;
import io.netty.handler.codec.http.HttpResponseStatus;

@DefaultController
public class DefaultHandler extends HttpNormalHandler {

	@Override
	protected void handle(FullHttpRequest request, FullHttpResponse response) {
		// TODO Auto-generated method stub
		response.setStatus(HttpResponseStatus.FORBIDDEN);
	}

	@Override
	protected void atlast() {
		// TODO Auto-generated method stub
		
	}

}
