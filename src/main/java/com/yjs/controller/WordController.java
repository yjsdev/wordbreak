package com.yjs.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yjs.entities.CommonResult;
import com.yjs.service.WordBreakService;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author Kim
 *
 */
@RestController
@Slf4j
public class WordController {

	@Resource
	private WordBreakService wordBreakService;
	/**
	 * stage3
	 * find all the valid words
	 * 
	 * @param word
	 * @param dict
	 * @return
	 */
	@PostMapping(value="/WordBreakList/post")
	public CommonResult wordBreakList(String word, String[] dict){
		int code = 200;
		try {
			List<String> wordDict = CollectionUtils.arrayToList(dict);
			List<String> data= wordBreakService.wordBreakList(word, wordDict);
			return new CommonResult(code, "success", data);
		} catch (Exception e) {
			log.info("****wordBreakList:"+e.getMessage());
			return new CommonResult(400, "fail", null);
		}
	}
	/**
	 * stage2
	 * find only  one word
	 * @param word
	 * @param dict
	 * @return
	 */
	
	@PostMapping(value="/wordBreakOnlyOne/post")
	public CommonResult wordBreakOnlyOne(String word, String[] dict){
		int code = 200;
		
		try {
			List<String> wordDict = CollectionUtils.arrayToList(dict);
			String data= wordBreakService.wordBreakOnlyOne(word, wordDict);
			return new CommonResult(code, "success", data);
		} catch (Exception e) {
			log.info("****wordBreakList:"+e.getMessage());
			return new CommonResult(400, "fail", null);
		}
	}
}
