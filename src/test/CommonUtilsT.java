package test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import cn.itcast.commons.CommonUtils;

public class CommonUtilsT {
	@Test
      public void testuuid()
      {
    	
    	  String s=CommonUtils.uuid();
    	 System.out.println(s);
      }
	@Test
      public void testToBean()
      {
    	  Map<String, Object> map= new HashMap<String, Object>();
    	  map.put("pid", "123");
    	  map.put("name","Hua");
    	  map.put("age", 20);//20写成字符串的形式也行，会自动转换；如果出现map.put("xxx","xxx"),这时仍然不会影响映射，数据会丢失
    	  Person p=CommonUtils.toBean(map,Person.class);
    	  System.out.println(p);
      }
}
