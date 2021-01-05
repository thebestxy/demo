//package com.dv.usercheck;
//
//
//import com.corearchi.utils.AESpass;
//import org.springframework.util.DigestUtils;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.Properties;
//import java.util.Set;
//
//
//public class Login {
//
//    ArrayList list = new ArrayList();
//
//    public Login() throws IOException {
//
//        Properties properties = new Properties();
//        InputStream inStream =  ClassLoader.getSystemResourceAsStream("application.properties");
//        //读取properties文件
//        properties.load(inStream);
//        //获取值传入键 properties.get();获取用户名和密码
//        Set<String> strings = properties.stringPropertyNames();
//        //迭代器获取键值然后遍历properties
//        Iterator<String> it = strings.iterator();
//        while (it.hasNext()) {
//            //获取每一个键然后判断是否与用户名相同 有一个问题 如果用户名和密码相同会触发
//            String zhanghao = it.next();
//            if ("id".equals(zhanghao.substring(zhanghao.length() - 2, zhanghao.length()))) {
//                String user = (String) properties.getProperty(zhanghao);
//                String mima = zhanghao.substring(0, zhanghao.length() - 2) + "password";
//                String yan = zhanghao.substring(0, zhanghao.length() - 2) + "salt";
//                String yaoshi = zhanghao.substring(0, zhanghao.length() - 2) + "key";
//                String n = zhanghao.substring(0, zhanghao.length() - 2) + "n";
//                //顺序加入
//                String pass = (String)properties.getProperty(mima);
//                String salt = (String)properties.getProperty(yan);
//                String key = (String)properties.getProperty(yaoshi);
//                int num = Integer.parseInt(properties.getProperty(n));
//                //加入list集合
//                list.add(user);
//                list.add(pass);
//                list.add(salt);
//                list.add(key);
//                list.add(num);
//            }
//        }
//    }
//
//
//    public void doLogin(String id, String password) throws Exception {
//        //遍历集合
//        for(int i = 0;i<list.size();i+=5){
//            //找到用户名相匹配
//            if(id.equals(list.get(i))){
//                //aes解密
//                String s = AESpass.aesDecrypt((String) list.get(i + 2), (String) list.get(i + 3));
//                //加盐
//                String base = password+s;
//                //md5加密
//                String md5 = DigestUtils.md5DigestAsHex(base.getBytes());
//                if(md5.equals(list.get(i+1))){
//                    System.out.println("登陆成功");
//                    System.out.println(id+"欢迎登录");
//                }else {
//                    //设置登录次数--n
//                    int n = (int)list.get(i+4);
//                    list.set(i+4,--n);
//                    if(n>2){
//                        System.out.println("您的密码输入错误");
//                    }else if(n<=2&&n>0){
//                        System.out.println("您还剩"+n+"次机会");
//                    }else if(n<=0){
//                        System.out.println("您的账户已被锁定!!!");
//                    }
//                }
//            }
//        }
//
//    }
//
//}
