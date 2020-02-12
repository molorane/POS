/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blessy.BLL;

import com.blessy.DAL.Objects.User;
import com.blessy.DAL.Provider.ProviderBase;
import java.util.ArrayList;

/**
 *
 * @author Mothusi Molorane
 */
public class UserBLL {
    
    private ArrayList<User> users;
    
    public UserBLL(){
        this.users = new ArrayList<>();
    }
    
    public static User getUser(String userName){
        return ProviderBase.Instance().getUser(userName);
    }
    
    public static boolean Login(String userName, String password){
        return ProviderBase.Instance().Login(userName, password);
    }
}
