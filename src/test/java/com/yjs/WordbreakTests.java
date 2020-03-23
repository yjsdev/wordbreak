package com.yjs;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yjs.service.WordBreakService;



@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = WordbreakApplication.class)
class WordbreakTests {

	@Autowired
	private WordBreakService wordBreakService;
	
	@Test
	void testWordBreakOnlyOne() {
		String word = "ilikesamsungmobile";
		List<String> wordDict = new ArrayList<String>();
		wordDict.add("i");
		wordDict.add("like");
		wordDict.add("sam");
		wordDict.add("sung");
		wordDict.add("samsung");
		wordDict.add("mobile");
		wordDict.add("icecream");
		wordDict.add("man go");
		wordDict.add("mango");
		
		String result = wordBreakService.wordBreakOnlyOne(word, wordDict);
		System.out.println(result);
	}

	@Test
	void testWordBreakList() {
		String word = "ilikesamsungmobile";
		List<String> wordDict = new ArrayList<String>();
		wordDict.add("i");
		wordDict.add("like");
		wordDict.add("sam");
		wordDict.add("sung");
		wordDict.add("samsung");
		wordDict.add("mobile");
		wordDict.add("icecream");
		wordDict.add("man go");
		wordDict.add("mango");
		
		List<String> result = wordBreakService.wordBreakList(word, wordDict);
		System.out.println(result);
	}
}
