package com.spc.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.lang.reflect.Array;

public class UserDetailServiceImpl implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }


    public static  <T> T[] test(T t,int size){
      T[] tt =(T[])  new Object[size];
      return tt;
    }

    public static  <T> void test(int size, Class<T> type) {
        T[] tt = (T[]) Array.newInstance(type, size);
        // 在这里继续对 tt 进行其他操作
    }

    public static void main(String[] args) {
//        String[] asdfas = test("asdfa", 1);
        String[] tt =(String[])  new Object[8];
    }
}
