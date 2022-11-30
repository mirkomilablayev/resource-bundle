package com.example.resoursebundle;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
@RequiredArgsConstructor
public class ResourceBundleController {

    private final TranslationService translationService;

    @GetMapping("/test/{code}/{locale}")
    public String test(@PathVariable String code, @PathVariable String locale){
        return translationService.translate(code, new Locale(locale));
    }
}
