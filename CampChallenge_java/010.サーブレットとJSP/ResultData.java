/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author guest1Day
 */
public class ResultData {

    private String luckList;
    private Date d;

    public ResultData() {
    }

    public String getLuckList() {
        return luckList;
    }

    public void setLuckList(String luckList) {
        this.luckList = luckList;
    }

    public Date getD() {
        return d;
    }

    public void setD(Date d) {
        this.d = d;
    }
}

