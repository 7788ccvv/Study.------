package com.Day04.订餐系统2;


import java.util.Scanner;

public class Xtong {

    public static void main(String[] args) {
//        存入用户数据
        User user = new User();
        user.id = 001;
        user.name = "张三";
        user.password = "123456";
        User[] us = new User[5];
        us[0] = user;

//        存入菜谱信息
        Menus[] m = new Menus[3];

        Menus menu1 = new Menus();
        menu1.id = 1;
        menu1.Mname = "红烧肉";
        menu1.price = 10;
        m[0] = menu1;

        Menus menu2 = new Menus();
        menu2.id = 2;
        menu2.Mname = "炒青菜";
        menu2.price = 8;
        m[1] = menu2;

        Menus menu3 = new Menus();
        menu3.id = 3;
        menu3.Mname = "西红柿炒鸡蛋";
        menu3.price = 9;
        m[2] = menu3;

//        订单
        Menus[] m2 = new Menus[3];

        System.out.println("-------------点餐系统---------------");
        System.out.println("登录请按1，注册请按2");
        System.out.println("请输入你的选择：");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        switch (x) {
//            登录功能
            case 1:
                System.out.println("------------登录-------------");
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("请输入你的账号:");
                String nm = scanner1.next();
                System.out.println("请输入你的密码：");
                String pw = scanner1.next();
//                登录判定
                for (int i = 0; i < us.length; i++) {if ((nm.equals(us[i].name)) && (pw.equals(us[i].password))) {
                        System.out.println("欢迎进入系统");
                        System.out.println("请选择你需要的功能:");
                        System.out.println("1.查看系统菜单");
                        System.out.println("2.选餐");
                        System.out.println("3.支付");
                        System.out.println("4.退款");
                        System.out.println("5.评价");
                        System.out.println("请输入你的选择：");
                        int y = scanner.nextInt();
                        boolean a = true;
                            switch (y) {
                                case 1:
 /*
    1.查看系统菜单
 * */
                                    System.out.println("编号\t\t\t名称\t\t\t\t\t单价");
                                    for (int j = 0; j < m.length; j++) {
                                        if (m[j] != null) {
                                            System.out.println(m[j].id + "\t" + "\t" + "\t" + m[j].Mname + "\t" + "\t" + "\t" + m[j].price);
                                        }
                                    }
                                    break;
                                case 2:
/*
    2.选餐
 */
                                    boolean isFlag=false;
                                    Scanner sc2=new Scanner(System.in);
                                    System.out.println("是否需要点餐？(y/n)");
                                    String next=sc2.next();
                                    if (next.equals("y")) {
                                        isFlag = true;
                                    }
                                    while (isFlag) {
                                        System.out.println("请选择您需要点餐的编号");
                                        int c = scanner.nextInt();
                                        //根据菜品Id进行查询
                                        for (Menus menus : m) {
                                            if (menus != null && menus.id == c) {
                                                for (int k = 0; k < m2.length; k++) {
                                                    if (m2[k] != null && m2[k].id == c) {
                                                        m2[k].count++;
                                                        break;
                                                    } else {
                                                        for (int r = 0; r < m2.length; r++) {
                                                            if (m2[r] == null) {
                                                                m[i].count++;
                                                                m2[r] = m[k];
                                                                break;
                                                            }
                                                        }
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        System.out.println("点餐成功，是否需要继续点餐(y/n)");
                                        String d = scanner.next();
                                        if (d.equals("y")) {
                                            isFlag = true;
                                        } else {
                                            isFlag = false;
                                        }
                                    }

                                    System.out.println("编号\t\t\t名称\t\t\t价格\t\t\t数量");
                                    for (int o = 0; o < m2.length; o++) {
                                        if (m2[o] != null) {
                                            System.out.println(m2[o].id + "\t\t\t" + m2[o].Mname + "\t\t\t" + m2[o].price + "\t\t\t" + m2[o].count);
                                        }
                                        break;
                                    }
                                    break;
                                case 3:
 /*
    3.支付
*/
                                    boolean  n=true;
                                    if(n==true) {
                                        System.out.println("支付成功");
                                    }
                                    else{
                                        break;
                                    }
                                    break;
                                case 4:
/*
    4.退款
*/
                                     for(int q=0;q<m2.length;q++){
                                         System.out.println(m2[q].id + "\t\t"+m2[q].Mname + "\t\t\t" + m2[q].price + "\t"+m2[q].count);
                                     }
                                    System.out.println("想删除红烧肉，请选择1");
                                    System.out.println("想删除炒青菜，请选择2");
                                    System.out.println("想删除西红柿炒鸡蛋，请选择3");
                                    Scanner  scanner3 = new Scanner(System.in);
                                    int i1 = scanner3.nextInt();
                                    switch (i1) {
                                        case  1:
                                            for(int j=0;j<m2.length;j++){
                                                if(m2[j].id==1){
                                                   m2[j].id=0;
                                                   m2[j].Mname="0";
                                                   m2[j].price=0;
                                                   m2[j].count--;
                                            }
                                        }
                                        case 2:
                                            for(int j=0;j<m2.length;j++){
                                                if(m2[j].id==2){
                                                   m2[j].id=0;
                                                   m2[j].Mname="0";
                                                   m2[j].price=0;
                                                   m2[j].count--;
                                            }
                                        }
                                        case 3:
                                        for(int j=0;j<m2.length;j++){
                                            if(m2[j].id==3){
                                                m2[j].id=0;
                                                m2[j].Mname="0";
                                                m2[j].price=0;
                                                m2[j].count--;
                                            }
                                        }
                                        default:
                                                break;
                                    }
                                    break;
                                case 5:
//                                    评价功能
                                    System.out.println("请对商品进行评价：");
                                    System.out.println("请输入菜品的编号:");
                                    Scanner s = new Scanner(System.in);
                                    int  cc1=s.nextInt();
                                    switch (cc1){
                                        case 1:
                                            System.out.println("请输出对炒青菜的评价:");
                                            String s1 = s.next();
                                            System.out.println(s1);
                                            break;
                                        case 2:
                                            System.out.println("请输出红烧肉的评价:");
                                            String s2 = s.next();
                                            System.out.println(s2);
                                            break;
                                        case 3:
                                            System.out.println("请输出西红柿炒鸡蛋的评价:");
                                            String s3 = s.next();
                                            System.out.println(s3);

                                    }
                            }
                        }
                    else {
                    /*
                         账号密码不对
                    * */
                        System.out.println("用户有误");
                        break;
                    }}
                    break;
//                注册功能
                    case 2:
                        User user1 = new User();
                        System.out.println("------------注册-------------");
                        System.out.println("请输入你的账号:");
                        boolean dg = true;
                        while (dg) {
                            String Uname = scanner.next();
                            System.out.println("请输入你的密码:");
                            String Upassword = scanner.next();
                            System.out.println("请再次输入你的密码:");
                            String Upassword2 = scanner.next();
                            if (Upassword.equals(Upassword2)) {
                                user1.name = Uname;
                                user1.password = Upassword;
                                us[1] = user1;
                                System.out.println("恭喜你成功注册");
                                System.out.println("请重新登录系统");
                                dg = false;
                            } else {
                                System.out.println("请再次输入密码");
                                dg = true;
                            }
                        }
                        break;
                    default:
                        System.out.println("输入错误！");
                        break;
                }
        }
    }