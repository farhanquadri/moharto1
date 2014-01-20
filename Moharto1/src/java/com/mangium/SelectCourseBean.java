/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mangium;

import java.util.ArrayList;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author farhan
 */
@Named(value = "selectCourseBean")
@Dependent
public class SelectCourseBean {

    /**
     * Creates a new instance of SelectCourseBean
     */
    public ArrayList selectcrz;

    public ArrayList getSelectcrz() {
         selectcrz.add("B.Tech");
       selectcrz.add("B.E");
        return selectcrz;
    }

    public void setSelectcrz(ArrayList selectcrz) {
        this.selectcrz = selectcrz;
    }
    
    public SelectCourseBean() {
        selectcrz=new ArrayList();
        SelectCourse sc=new SelectCourse();
       selectcrz.add("B.Tech");
       selectcrz.add("B.E");
       
    }
    
}
