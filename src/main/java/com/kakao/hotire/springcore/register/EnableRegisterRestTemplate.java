package com.kakao.hotire.springcore.register;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Import;

import com.kakao.hotire.springcore.import_selector.Mode;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(ImportRestTemplateRegister.class)
public @interface EnableRegisterRestTemplate {
  Mode mode() default Mode.NONE;
}
