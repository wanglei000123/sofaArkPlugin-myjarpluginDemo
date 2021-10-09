package com.quadtalent.sofaark.myjarplugindemo;

import com.alipay.sofa.ark.support.startup.SofaArkBootstrap;
import com.quadtalent.sofaark.myjarplugin.MyJarService1;
import com.quadtalent.sofaark.myjarplugin.MyJarService2;

/**
 * @author wanglei
 * @since 2021/10/8 2:52 下午
 */
public class ArkPluginApplication {

    public static void main(String[] args){
        SofaArkBootstrap.launch(args);

        System.out.println("--------------main classloader start---------------------");
        System.out.println("main classloader is: " + ArkPluginApplication.class.getClassLoader());
        System.out.println("--------------main classloader end---------------------");

        new MyJarService1().show();
        new MyJarService2().show();

//        new MyJarService3().show();
//        new MyJarService4().show();
    }

}
