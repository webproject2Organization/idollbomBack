package com.example.idollbom.service.myPageservice.parentservice;

import com.example.idollbom.domain.vo.myPagevo.parentvo.reportVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface reportService {
    public List<reportVO> selectReportList();
}
