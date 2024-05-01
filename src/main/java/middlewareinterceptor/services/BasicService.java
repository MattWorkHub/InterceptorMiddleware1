package middlewareinterceptor.services;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class BasicService {

    public String getCurrentTime() {
        return "Current DateTime: " + LocalDateTime.now();
    }

}