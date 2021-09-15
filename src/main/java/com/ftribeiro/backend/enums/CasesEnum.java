package com.ftribeiro.backend.enums;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

import com.ftribeiro.backend.dto.MaxSumDTO;

public enum CasesEnum{
    CASE1(new ArrayList<Integer>(Arrays.asList(-1000, -1, -1, -1, -1000)), -1, new ArrayList<Integer>(Arrays.asList(2))),
    CASE2(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, -1000)), 10, new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4))),
    CASE3(new ArrayList<Integer>(Arrays.asList(-1000, 1, 2, 3, 4)), 10, new ArrayList<Integer>(Arrays.asList(2, 3, 4, 5))),
    CASE4(new ArrayList<Integer>(Arrays.asList(-100, 2, -1, 2, -100)), 3, new ArrayList<Integer>(Arrays.asList(2, 3, 4)));


    private final List<Integer> inputList;
    private final MaxSumDTO response;

    CasesEnum(List<Integer> list, Integer maxSum, List<Integer> positions){
        this.inputList = list;
        this.response = new MaxSumDTO(maxSum, positions);
    }

    public List<Integer> getInputList(){
        return this.inputList;
    }

    public MaxSumDTO getResponse(){
        return this.response;
    }
}