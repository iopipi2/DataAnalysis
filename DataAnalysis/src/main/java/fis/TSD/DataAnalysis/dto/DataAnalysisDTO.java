package fis.TSD.DataAnalysis.dto;

import lombok.Data;

import java.time.Year;

@Data
public class DataAnalysisDTO {
    private Long id;
    private String name;
    private Double totalScore;
    private Double infrastructure;
    private Double energyClimateChange;
    private Double waste;
    private Double water;
    private Double transportation;
    private Double educationSearch;
    private Double rank;
    private String year;
}
