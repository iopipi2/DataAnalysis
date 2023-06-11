package fis.TSD.DataAnalysis.repository;

import fis.TSD.DataAnalysis.entity.DataAnalysis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DataAnalysisRepository extends JpaRepository<DataAnalysis, Long>, JpaSpecificationExecutor<DataAnalysis> {
    @Query("SELECT da FROM DataAnalysis da WHERE da.year = :year")
    List<DataAnalysis> getAllDataAnalysisByCurrentYear(String year);
}
