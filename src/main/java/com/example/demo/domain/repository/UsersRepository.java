package com.example.demo.domain.repository;

import java.util.Optional;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import com.example.demo.domain.model.AuthUserEntity;

@ConfigAutowireable
@Dao
public interface UsersRepository {
	@Select
	public Optional<AuthUserEntity> findAuthById(String userId);
}
