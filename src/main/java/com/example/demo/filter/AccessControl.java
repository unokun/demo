package com.example.demo.filter;

import java.util.Set;

import lombok.Data;

@Data
public class AccessControl {
	private Set<String> whitelist;

	/**
	 * アクセス制御
	 *
	 * @param ip
	 * @return
	 */
	public boolean isAccessible(String ip) {

		// IPアドレスチェック
		return whitelist.contains(ip);
	}
}
