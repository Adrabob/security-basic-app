package com.security.basicapp.entities;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority{
	ROLE_USER,
	ROLE_ADMIN,
	ROLE_MOD;

	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return name();
	}

}
