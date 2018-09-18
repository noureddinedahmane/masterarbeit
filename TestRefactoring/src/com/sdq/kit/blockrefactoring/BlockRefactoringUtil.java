package com.sdq.kit.blockrefactoring;

public class BlockRefactoringUtil {

	/**
	 * @param object 
	 * @return
	 */
	public boolean isPrimitiveType(Object object){
		if(object.getClass().equals(Float.class))
			return true;
		if(object.getClass().equals(Double.class))
			return true;
		if(object.getClass().equals(Integer.class))
			return true;
		if(object.getClass().equals(Long.class))
			return true;
		if(object.getClass().equals(Byte.class))
			return true;
		if(object.getClass().equals(Short.class))
			return true;
		if(object.getClass().equals(Character.class))
			return true;
		if(object.getClass().equals(Boolean.class))
			return true;
		else
			return false;
	}
	
}
