package com.vito.mvc.service;

import com.vito.mvc.bean.Question;
import com.vito.mvc.dao.QuestionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionMapper questionMapper;

    /**
     * 查询所有部门
     * @return
     */
    public List<Question> getAll() {
        return questionMapper.selectByExample(null);
    }
}
