package com.bytedance.manager;


import com.bytedance.dao.entity.Department;
import com.bytedance.dao.entity.DepartmentExample;
import com.bytedance.dao.mapper.DepartmentMapper;

import java.util.List;

public class DepartmentManager {

    public List<Department> getList(){

        DepartmentExample example = new DepartmentExample();
        DepartmentExample.Criteria criteria = example.createCriteria();
        criteria.andNameLike("%li");
        return null;
    }

}
