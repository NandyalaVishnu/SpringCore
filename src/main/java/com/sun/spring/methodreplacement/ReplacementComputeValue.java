package com.sun.spring.methodreplacement;

import java.lang.reflect.Method;
import org.springframework.beans.factory.support.MethodReplacer;

public class ReplacementComputeValue implements MethodReplacer {

	@Override
	public Object reimplement(Object sourceObject, Method reimplementMethod, Object[] args)
			                throws Throwable {
		
        // get the input value, work with it, and return a computed result
        String input = (String) args[0];
        return "My Values here 100";
    }
}
