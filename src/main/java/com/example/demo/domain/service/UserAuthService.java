package com.example.demo.domain.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.domain.model.AuthUserEntity;
import com.example.demo.domain.repository.UsersRepository;

@Service
public class UserAuthService implements UserDetailsService  {

	@Autowired
	private UsersRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<AuthUserEntity> user = userRepository.findAuthById(username);
		if (!user.isPresent()) {
			throw new UsernameNotFoundException("ユーザーが存在しません。");
		}
		return user.get();
	}

}
