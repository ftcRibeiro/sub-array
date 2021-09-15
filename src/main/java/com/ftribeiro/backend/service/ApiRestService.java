package com.ftribeiro.backend.service;

import java.util.List;

import com.ftribeiro.backend.dto.MaxSumDTO;

public interface ApiRestService {
    public MaxSumDTO getMaxSum(List<Integer> itemsList);
}
