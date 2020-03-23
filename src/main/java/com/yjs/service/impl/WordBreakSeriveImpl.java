package com.yjs.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.yjs.service.WordBreakService;
import com.yjs.utils.WordBreakUtil;

/**
 * 
 * @author kim
 *
 */
@Service
public class WordBreakSeriveImpl implements WordBreakService {

	@Override
	public String wordBreakOnlyOne(String word, List<String> dict) {
		List<String> words = WordBreakUtil.wordBreak(word, dict);
		if(words.size()>0) {
			return words.get(0);
		}
		return "";
	}

	@Override
	public List<String> wordBreakList(String word, List<String> dict) {
		
		return WordBreakUtil.wordBreak(word, dict);
	}
}
