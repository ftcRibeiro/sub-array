package com.ftribeiro.backend.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.ftribeiro.backend.dto.MaxSumDTO;
import com.ftribeiro.backend.service.ApiRestService;

import org.springframework.stereotype.Service;

@Service
public class ApiRestServiceImpl implements ApiRestService{
    public MaxSumDTO getMaxSum(List<Integer> itemsList) throws Exception{
        
        /*
        Abordagem: Kadane's Algorithm
        */
        try {
            if (itemsList.isEmpty()) {
                throw new Exception("itemsList must be not empty");
            }
            MaxSumDTO dto = new MaxSumDTO();
            int start = 0;
            int end = 0;
            int subMaxSum = itemsList.get(0), maxEnding = itemsList.get(0);
    
            for (int i = 0; i < itemsList.size(); i++) {
                if (itemsList.get(i) > maxEnding + itemsList.get(i)) {
                    start = i;
                    maxEnding = itemsList.get(i);
                } else {
                    if (i!=0) {
                        maxEnding = maxEnding + itemsList.get(i);                  
                    } 
                }
                if (subMaxSum < maxEnding) {
                    subMaxSum = maxEnding;
                    end = i;
                }
            }
    
            dto.setSum(subMaxSum);
            dto.setPositions(buildPositionList(start, end));
            return dto;

        } catch (Exception e) {
            throw e;
        }
        
    }
    private List<Integer> buildPositionList(int start, int end){

        int startRef = Math.min(start, end);
        
        List<Integer> positions = IntStream.rangeClosed(startRef + 1, end + 1)
        .boxed().collect(Collectors.toList());

        return positions;
    }
}
