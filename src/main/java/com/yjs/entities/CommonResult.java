package com.yjs.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author Kim
 * @create 2020-03-23 14:00
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

	private Integer code;
	private String  message;
	private T 		data;
	
	public CommonResult(Integer code,String message) {
		this(code,message,null);
	}

	
}
