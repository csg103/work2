package com.xxx;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 执行过程参数VO
 *
 * @author csg
 * @create 2018-01-18:31
 */

public class ExecuteVO extends BaseVO{
    //用于判断XML中配置的表达式是否执行的条件map
    //在业务层用于xml判断 是否执行当前服务。当在a=0时跳过当前服务，可在次map中增加map(a,0). 并在xml中配置节点 <bean executeFlag="mes.getExecuteflag()" >
    private Map<String,Integer> executeflag =new HashMap();
    //用于封装分布式调用是的执行方法和服务名
    private LinkedHashMap<String,String> executeMap =new LinkedHashMap();

    public Map<String, Integer> getExecuteflag() {
        return executeflag;
    }

    public void setExecuteflag(Map<String, Integer> executeflag) {
        this.executeflag = executeflag;
    }

    public LinkedHashMap<String, String> getExecuteMap() {
        return executeMap;
    }

    public void setExecuteMap(LinkedHashMap<String, String> executeMap) {
        this.executeMap = executeMap;
    }
}
