package com.yjs.service;

import java.util.List;

public interface WordBreakService {

	String wordBreakOnlyOne(String word, List<String> dict);

	List<String> wordBreakList(String word, List<String> dict);
	
}
