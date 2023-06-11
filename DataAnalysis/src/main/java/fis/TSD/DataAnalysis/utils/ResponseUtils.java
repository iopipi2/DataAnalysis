package fis.TSD.DataAnalysis.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Service
@Slf4j
public class ResponseUtils {


    public String getHostName(ServerHttpRequest request) {
        return Objects.requireNonNull(request.getRemoteAddress()).getHostName();
    }

    public ResponseEntity<?> getResponseEntity(Object data, int code, String mess, HttpStatus status) {
        Map<String, Object> response = new HashMap<>();
        response.put("data", data);
        response.put("code", code);
        response.put("message", mess);
        return new ResponseEntity<>(response, status);
    }
}
