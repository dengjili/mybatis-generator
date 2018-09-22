package priv.dengjl.dao;

import priv.dengjl.bean.StudentBean;

public interface StudentBeanMapper {
    int insert(StudentBean record);

    int insertSelective(StudentBean record);
}