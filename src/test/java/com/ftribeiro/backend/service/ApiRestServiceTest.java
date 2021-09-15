package com.ftribeiro.backend.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.ftribeiro.backend.dto.MaxSumDTO;
import com.ftribeiro.backend.dto.RequestBodyDTO;
import com.ftribeiro.backend.enums.InputCasesEnum;
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
    private static final RequestBodyDTO DTOCASE1_BODY_DTO = InputCasesEnum.CASE1.getList();
    private static final RequestBodyDTO DTOCASE2_BODY_DTO = InputCasesEnum.CASE2.getList();
    private static final RequestBodyDTO DTOCASE3_BODY_DTO = InputCasesEnum.CASE3.getList();
    private static final RequestBodyDTO DTOCASE4_BODY_DTO = InputCasesEnum.CASE4.getList();

    private static final MaxSumDTO RESPONSECASE1_DTO;
    private static final MaxSumDTO RESPONSECASE2_DTO;
    private static final MaxSumDTO RESPONSECASE3_DTO;
    private static final MaxSumDTO RESPONSECASE4_DTO;

    @Autowired
    ApiRestService apiRestService;

    @Test
    public void testCase1(){
        MaxSumDTO dto = apiRestService.getMaxSum(dtoCase1.getList());
        assertEquals(expected, dto);
    }
}
