package bdbk.seckill.validator;


import bdbk.seckill.util.ValidatorUtil;
import com.alibaba.druid.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *  手机校验
 */
public class IsMobileValidator implements ConstraintValidator<IsMobile, String> {

	private boolean required = false;
	
	@Override
	public void initialize(IsMobile constraintAnnotation) {
		required = constraintAnnotation.required();
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if(required) {
			return ValidatorUtil.isMobile(value);
		}else {
			return StringUtils.isEmpty(value) || ValidatorUtil.isMobile(value);
		}
	}

}
