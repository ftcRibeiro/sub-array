package com.ftribeiro.backend.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;

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
    public void testValidInputCase1() throws Exception{
        MaxSumDTO dto = apiRestService.getMaxSum(CasesEnum.VALID_CASE1.getInputList());
        assertEquals(CasesEnum.VALID_CASE1.getResponse(), dto);
    }

    @Test
    public void testValidInputCase2() throws Exception{
        MaxSumDTO dto = apiRestService.getMaxSum(CasesEnum.VALID_CASE2.getInputList());
        assertEquals(CasesEnum.VALID_CASE2.getResponse(), dto);
    }

    @Test
    public void testValidInputCase3() throws Exception{
        MaxSumDTO dto = apiRestService.getMaxSum(CasesEnum.VALID_CASE3.getInputList());
        assertEquals(CasesEnum.VALID_CASE3.getResponse(), dto);
    }

    @Test
    public void testValidInputCase4() throws Exception{
        MaxSumDTO dto = apiRestService.getMaxSum(CasesEnum.VALID_CASE4.getInputList());
        assertEquals(CasesEnum.VALID_CASE4.getResponse(), dto);
    }

    @Test
    public void testEmptyInput() throws Exception{
        List<Integer> itemsList = new ArrayList<Integer>();
        assertThrows(Exception.class,()->{
            apiRestService.getMaxSum(itemsList);
        });
    }
}
