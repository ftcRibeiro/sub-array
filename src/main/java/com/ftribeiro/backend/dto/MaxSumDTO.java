package com.ftribeiro.backend.dto;

import java.util.List;

import lombok.Data;

@Data
public class MaxSumDTO {
    private Integer sum;
    private List<Integer> positions;

}
