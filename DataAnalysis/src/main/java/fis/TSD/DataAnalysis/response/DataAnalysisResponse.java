package fis.TSD.DataAnalysis.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DataAnalysisResponse {
    private Long id;
    private String name;
    private Double infrastructure;
    private Double energyClimateChange;
    private Double waste;
    private Double water;
    private Double transportation;
    private Double educationSearch;
    private Double rank;
    private String year;

    public DataAnalysisResponse(Long id,String name,Double infrastructure,Double energyClimateChange, Double waste, Double water,Double transportation,
                                Double educationSearch, Double rank, String year){
        this.id=id;
        this.name=name;
        this.infrastructure=infrastructure;
        this.energyClimateChange=energyClimateChange;
        this.waste=waste;
        this.water=water;
        this.transportation=transportation;
        this.educationSearch=educationSearch;
        this.rank=rank;
        this.year=year;
    }
}
