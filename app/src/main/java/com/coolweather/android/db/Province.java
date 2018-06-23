package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Edward on 2018/6/23.
 */

public class Province extends DataSupport {

    private int id;

    private String provinceName;

    private int provinceCode;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    private String getProvinceName(){
        return provinceName;
    }

    private void setProvinceName(String provinceName){
        this.provinceName = provinceName;
    }

    private int getProvinceCode(){
        return provinceCode;
    }

    private void setProvinceCode(int provinceCode){
        this.provinceCode = provinceCode;
    }
}
