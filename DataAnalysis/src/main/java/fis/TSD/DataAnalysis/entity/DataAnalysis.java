package fis.TSD.DataAnalysis.entity;

import javax.persistence.*;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name= "data_analysis")

public class DataAnalysis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "NAME", nullable = true)
    private String name;
    @Column(name = "TOTAL_SCORE", nullable = true)
    private Long totalScore;
    @Column(name = "INFRASTRUCTURE", nullable = true)
    private Long infrastructure;
    @Column(name = "ENERGY_CLIMATE_CHANGE", nullable = true)
    private Long energyClimateChange;
    @Column(name = "WASTE", nullable = true)
    private Long waste;
    @Column(name = "WATER", nullable = true)
    private Long water;
    @Column(name = "TRANSPROTATION", nullable = true)
    private Long transportation;
    @Column(name = "EDUCATION_SEARCH", nullable = true)
    private Long educationSearch;
    @Column(name = "RANKING", nullable = true)
    private Long ranking;

    @Column(name = "YEAR", nullable = true)
    private String year;


}
