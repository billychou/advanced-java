package com.example.controller;

import com.example.common.utils.ResponseCommonResult;
import com.example.common.utils.ResponseManageTemplate;
import com.example.core.model.dto.PersonDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author songchuan.zhou
 */
@Controller
@RequestMapping("/demo")
public class DemoController {
    @ResponseBody
    @GetMapping("/hello")
    public ResponseCommonResult<Map<String, String>> getHello(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String age
    ) {
        return ResponseManageTemplate.invoke(new ResponseManageTemplate.ITemplateCallback<ResponseCommonResult<Map<String, String>>>() {
            @Override
            public void checkParams() {

            }

            @Override
            public ResponseCommonResult<Map<String, String>> doInvoke() throws Exception {
                Map<String, String> result = new HashMap<>();
                result.put("name", name);
                result.put("age", age);
                return ResponseCommonResult.success(result);
            }

            @Override
            public ResponseCommonResult<Map<String, String>> doFailed(String errorCode, String errMsg) {
                return ResponseCommonResult.fail(errMsg);
            }
        });
    }

    @ResponseBody
    @PostMapping("/post")
    public ResponseCommonResult<Map<String, String>> getPostDemo(PersonDto personDto) {
        return ResponseManageTemplate.invoke(new ResponseManageTemplate.ITemplateCallback<ResponseCommonResult<Map<String, String>>>() {
            @Override
            public void checkParams() {

            }

            @Override
            public ResponseCommonResult<Map<String, String>> doInvoke() throws Exception {
                String name = personDto.getName();
                String age = personDto.getAge();
                Map<String, String> result = new HashMap<>();
                result.put("name", name);
                result.put("age", age);
                return ResponseCommonResult.success(result);
            }

            @Override
            public ResponseCommonResult<Map<String, String>> doFailed(String errorCode, String errMsg) {
                return null;
            }
        });
    }
}
