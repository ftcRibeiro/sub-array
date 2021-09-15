package com.ftribeiro.backend.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MaxSumDTO {
    private Integer sum;
    private List<Integer> positions;

}
