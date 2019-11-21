package com.hyperbolicbaby.training;

import org.springframework.stereotype.Component;

@Component // To register it on the Spring Container
public class FinancialReportTrim001 implements FinancialReportCreation {
    @Override
    public String getFinancialReport() {
        return "Financial Report presentation from first trimester";
    }
}
