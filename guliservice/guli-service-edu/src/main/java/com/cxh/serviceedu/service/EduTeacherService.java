package com.cxh.serviceedu.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cxh.serviceedu.entity.EduTeacher;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cxh.serviceedu.entity.EduTeacher;
import com.cxh.serviceedu.entity.teachervo.QueryTeacher;

/**
 * <p>
 * 讲师 服务类
 * </p>
 *
 * @author cxh
 * @since 2020-04-07
 */
public interface EduTeacherService extends IService<EduTeacher> {
    void pageQuery(Page<EduTeacher> pageParam, QueryTeacher teacherQuery);
}
