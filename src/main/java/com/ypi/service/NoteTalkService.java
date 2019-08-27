package com.ypi.service;

import com.ypi.bean.Notetalk;
import com.ypi.dao.NotetalkMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteTalkService {

    @Autowired
    NotetalkMapper notetalkMapper;

    public List<Notetalk> getAll() {
        return notetalkMapper.selectByExample(null);
    }
}
