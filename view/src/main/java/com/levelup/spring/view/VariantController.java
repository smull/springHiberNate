package com.levelup.spring.view;

import com.levelup.spring.service.VariantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by SMULL on 10.04.2015.
 */
@Controller
@RequestMapping("/variant")
public class VariantController {

    @Autowired
    VariantService variantService;
}
