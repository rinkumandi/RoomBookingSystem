package com.mandi.rbs.serviceImpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mandi.rbs.dao.LoginDAO;
import com.mandi.rbs.dto.UserDetails;
import com.mandi.rbs.services.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    @Qualifier("loginDAOImpl")
    private LoginDAO loginDAOImpl;

    @Override
    public UserDetails getUserById(String userId) {
        return loginDAOImpl.getUserById(userId);
    }

}
