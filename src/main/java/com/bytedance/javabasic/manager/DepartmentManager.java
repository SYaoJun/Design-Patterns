package com.bytedance.javabasic.manager;


import com.bytedance.javabasic.dao.entity.Department;
import com.bytedance.javabasic.dao.entity.DepartmentExample;

import java.util.List;

public class DepartmentManager {

    public List<Department> getList(){

        DepartmentExample example = new DepartmentExample();
        DepartmentExample.Criteria criteria = example.createCriteria();
        criteria.andNameLike("%li");
        return null;
    }

}
