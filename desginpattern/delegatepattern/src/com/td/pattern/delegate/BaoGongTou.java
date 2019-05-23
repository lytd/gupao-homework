package com.td.pattern.delegate;

import java.util.HashMap;
import java.util.Map;

public class BaoGongTou implements IEmployee {

    private Map<String,IEmployee> employtees=new HashMap();


    public BaoGongTou(){
        employtees.put("安装水",new ShuiGong());
        employtees.put("安装电",new DianGong());

    }

    @Override
    public void work(String work) {

        if (employtees.containsKey(work)){
            employtees.get(work).work(work);
        }else{
            System.out.println("暂时还没有开展此业务");
        }


    }
}
