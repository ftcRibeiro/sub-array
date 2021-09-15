package com.ftribeiro.backend.enums;

import com.ftribeiro.backend.dto.MaxSumDTO;

public enum CasesEnum{
    CASE1([-1000, -1, -1, -1, -1000], -1, [2]),
    CASE2([1, 2, 3, 4, -1000], 10, [1, 2, 3, 4]),
    CASE3([-1000, 1, 2, 3, 4], 10 [2, 3, 4, 5]),
    CASE4([-1000, 2, -1, 2, -1000], 3, [2, 3, 4]);

    private List<Integer> inputList;
    private MaxSumDTO response;

    InputCasesEnum(List<Integer> list, Integer maxSum, List<Integer> positions){
        this.inputList = list
        this.response.setSum(maxSum);
        this.response.setPositions(positions);
    }

    public List<Integer> getInputList(){
        return this.inputList;
    }

    public MaxSumDTO getResponse(){
        return this.response;
    }
}