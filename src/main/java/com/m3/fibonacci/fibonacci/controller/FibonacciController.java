package com.m3.fibonacci.fibonacci.controller;

import com.m3.fibonacci.fibonacci.service.FibonacciService;
import lombok.*;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;

@RestController
@RequiredArgsConstructor
@RequestMapping("/fibonacci")
public class FibonacciController {

    private final FibonacciService fibonacciService;

    @CrossOrigin
    @PostMapping(value = "/next", consumes = MediaType.APPLICATION_JSON_VALUE)
    public FibonacciResult getNextFibonacci(@RequestBody BigInteger input) {
        return new FibonacciResult(fibonacciService.computeNextFibonacciNumber(input).toString());
    }

    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    private static class FibonacciResult {
        private String value;
    }
}
