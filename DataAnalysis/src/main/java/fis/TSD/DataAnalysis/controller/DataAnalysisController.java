package fis.TSD.DataAnalysis.controller;

import fis.TSD.DataAnalysis.entity.DataAnalysis;
import fis.TSD.DataAnalysis.service.DataAnalysisService;
import fis.TSD.DataAnalysis.utils.ResponseUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.fis.spro.common.constants.ResponseCodeEnum;
import vn.fis.spro.common.model.ResponseDto;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/data-analysis")
public class DataAnalysisController {
    @Autowired
    private DataAnalysisService dataAnalysisService;
    @Autowired
    private ResponseUtils responseUtils;
    @GetMapping("/getAllDataAnalysisByCurrentYear")
    public ResponseEntity<?> getAllData() {
        try {
            log.info("Get All Data Analysis By Current Year");
            List<DataAnalysis> listAllByCurrentYear = dataAnalysisService.getAllDataAnalysisByCurrentYear();

            return ResponseEntity.ok(ResponseDto.builder().code(1).data(listAllByCurrentYear).build());
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return responseUtils.getResponseEntity(null, -1, "Fail", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
