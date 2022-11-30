package com.example.resoursebundle;


import lombok.AllArgsConstructor;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Service;

import java.util.Locale;
import java.util.ResourceBundle;

@Service
@AllArgsConstructor
public class TranslationService {

    private final ResourceBundleMessageSource messageSource;

    public String translate(String code, Locale locale) {
        return messageSource.getMessage(code, null, "Неизвестная ошибка, повторите попытку позже!", locale);
    }
}
