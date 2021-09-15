package com.ftribeiro.backend.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.ftribeiro.backend.dto.MaxSumDTO;
import com.ftribeiro.backend.enums.CasesEnum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class ApiRestServiceTest {

    
    @Autowired
    ApiRestService apiRestService;

    @Test
    public void testCase1(){
        MaxSumDTO dto = apiRestService.getMaxSum(CasesEnum.CASE1.getInputList());
        assertEquals(CasesEnum.CASE1.getResponse(), dto);
    }
    @Test
    public void testCase2(){
        MaxSumDTO dto = apiRestService.getMaxSum(CasesEnum.CASE2.getInputList());
        assertEquals(CasesEnum.CASE2.getResponse(), dto);
    }
    @Test
    public void testCase3(){
        MaxSumDTO dto = apiRestService.getMaxSum(CasesEnum.CASE3.getInputList());
        assertEquals(CasesEnum.CASE3.getResponse(), dto);
    }
    @Test
    public void testCase4(){
        MaxSumDTO dto = apiRestService.getMaxSum(CasesEnum.CASE4.getInputList());
        assertEquals(CasesEnum.CASE4.getResponse(), dto);
    }
}
