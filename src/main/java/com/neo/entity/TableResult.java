package com.neo.entity;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gustaov on 2018/4/6.
 */
public class TableResult {
    private int total;
    private int page;
    private JSONArray rows;

    public TableResult(){
        rows = new JSONArray();
    }
    public void addRows(List<?> list){
        rows.addAll(list);
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public JSONArray getRows() {
        return rows;
    }

    public String toString(){
        JSONObject json = new JSONObject();
        json.fluentPut("total", total);
        json.fluentPut("rows", rows);
        json.fluentPut("page", page);
        return json.toString();
    }

    public static void main(String[] args) {
        TableResult table = new TableResult();
        table.setTotal(3);
        List<String> data = new ArrayList<>();
        data.add("hello");
        data.add("world");
        table.addRows(data);
        System.out.println(table);
    }
}
