//package com.dv.service;
//
//import com.corearchi.utils.AESpass;
//import com.dv.dao.UserDAO;
//import org.springframework.stereotype.Service;
//import org.springframework.util.DigestUtils;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.HashMap;
//
//@Service
//public class LoginService {
//    UserDAO userDAO = new UserDAO();
//    HashMap<String, ArrayList> users = userDAO.getUsers();
//
//    public LoginService() throws IOException {
//    }
//
//    //登录传参
//    public void doLogin(String username, String password) throws Exception {
//
//
//        //如果有这个用户
//        if (users.containsKey(username)){
//            ArrayList list = users.get(username);
//            String s = AESpass.aesDecrypt((String) list.get(1),(String)list.get(2));
//            String base = password+s;
//            //md5加密
//            String md5 = DigestUtils.md5DigestAsHex(base.getBytes());
//            if(md5.equals(list.get(0))){
//                System.out.println("登陆成功");
//                System.out.println(username+"欢迎登录");
//            }else {
//                //设置登录次数--n
//                int n = (int)list.get(3);
//                list.set(3,--n);
//                if(n>2){
//                    System.out.println("您的密码输入错误");
//                }else if(n<=2&&n>0){
//                    System.out.println("您还剩"+n+"次机会");
//                }else if(n<=0){
//                    System.out.println("您的账户已被锁定!!!");
//                }
//            }
//        }
//    }
//}
