package com.chat.UserService;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class UserService {

    private List<String> activeUsers=new ArrayList<>();

    public void addUser(String user){
        activeUsers.add(user);
    }

    public void removeUser(String user){
        activeUsers.remove(user);
    }

    public List<String> getUsers(){
        return Collections.unmodifiableList(activeUsers);
    }

}
