package com.neo.entity;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gustaov on 2018/4/6.
 */
public class TableResult {
    private int totalCount;
    private JSONArray rows;

    public TableResult(){
        rows = new JSONArray();
    }
    public void addRows(List<?> list){
        rows.addAll(list);
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public JSONArray getRows() {
        return rows;
    }

    public String toString(){
        JSONObject json = new JSONObject();
        json.fluentPut("total", totalCount);
        json.fluentPut("rows", rows);
        return json.toString();
    }

    public static void main(String[] args) {
        TableResult table = new TableResult();
        table.setTotalCount(3);
        List<String> data = new ArrayList<>();
        data.add("hello");
        data.add("world");
        table.addRows(data);
        System.out.println(table);
    }
}
