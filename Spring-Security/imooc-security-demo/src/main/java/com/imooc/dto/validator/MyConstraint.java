package com.imooc.dto.validator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;


@Target({ElementType.METHOD, ElementType.FIELD}) //注解标注在方法和字段上
@Retention(RetentionPolicy.RUNTIME) //运行时的注解
@Constraint(validatedBy = MyConstraintValidator.class) //当前注解是用于校验 ，用什么类注解
public @interface MyConstraint {

	String message();
	Class<?>[] groups() default { };
	Class<? extends Payload>[] payload() default {};
}
