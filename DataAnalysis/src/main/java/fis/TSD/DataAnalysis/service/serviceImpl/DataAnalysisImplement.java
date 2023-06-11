package fis.TSD.DataAnalysis.service.serviceImpl;

import fis.TSD.DataAnalysis.entity.DataAnalysis;
import fis.TSD.DataAnalysis.repository.DataAnalysisRepository;
import fis.TSD.DataAnalysis.service.DataAnalysisService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.ZoneId;
import java.util.Date;
import java.util.List;

@Slf4j
@Service
@Transactional

public class DataAnalysisImplement implements DataAnalysisService {
    @Autowired
    private DataAnalysisRepository dataAnalysisRepository;
    @Override
    public List<DataAnalysis> getAllDataAnalysisByCurrentYear() {
        Date now= new Date();
        String year= String.valueOf(now.toInstant().atZone(ZoneId.systemDefault()).getYear());
        List<DataAnalysis> dataAnalysisList= dataAnalysisRepository.getAllDataAnalysisByCurrentYear(year);
        return null;
    }
}
