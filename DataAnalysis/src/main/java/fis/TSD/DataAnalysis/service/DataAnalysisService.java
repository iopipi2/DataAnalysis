package fis.TSD.DataAnalysis.service;

import fis.TSD.DataAnalysis.entity.DataAnalysis;

import java.util.List;

public interface DataAnalysisService {
    List<DataAnalysis> getAllDataAnalysisByCurrentYear();
}
