package com.zdcf.service;

import java.util.List;

import com.zdcf.dto.ThemeDTO;
import com.zdcf.model.Airticle;
import com.zdcf.model.Message;
import com.zdcf.model.Theme;
import com.zdcf.model.User;

public interface UserService {

	public User getUserByIp(String ip);
	
	public int addUserByIp(String ip);
	
}
