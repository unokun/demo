package com.example.demo.domain.repository;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

@ConfigAutowireable
@Dao
public interface WhiteListsRepository {
	@Select
	public List<String> findAll();
}
