package test;

import java.util.List;
import java.util.Map;

import org.junit.Test;

import cn.itcast.commons.CommonUtils;
import cn.itcast.jdbc.JdbcUtils;

public class TxQueryRunner {
//	@Test
//      public void testupdate()
//      {
//    	  String sql="insert into t_person(pid,name,age) values(?,?,?)";
//    	  Object[] params={"124","pter",20};//给spl中对应的参数
//    	  QueryRunner qr=new TxQueryRunner();//不提供连接池
//          qr.updates(sql,params);//执行sql也不提供连接，它用JDBCUtils连接；
//      }
//	
//	/*
//	 * 使用事务
//	 */
//	 public void testupdate2()
//     {
//		 try {
//			 //开启事务
//			  JDBCUtils。beginTransaction();
//			  
//			 //操作
//			  String sql="insert into t_person(pid,name,age) values(?,?,?)";
//		   	  Object[] params={"125","p5ter",20};//给spl中对应的参数
//		   	  QueryRunner qr=new TxQueryRunner();//不提供连接池
//		      qr.updates(sql,params);//执行sql也不提供连接，它用JDBCUtils连接；
//		         
//		         
//		     params= new  Object[]{"126","p65ter",23};//给spl中对应的参数
//		      qr.updates(sql,params);//执行sql也不提供连接，它用JDBCUtils连接；
//			 
//			 //提交事务
//			 JdbcUtils.commitTransaction();
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//			 JdbcUtils.rollbackTransaction();//出现异常，回滚事务
//		}
//   	  
//     }
//	 /**
//	  * 查询
//	  * 1、QueryRunner执行select语句，得到Resultset
//	  * 2、Resultset转换成其他类型
//	  */
//	 
//	 //Bean中，单行结果
//      public void testquery1()
//      {
//    	  String sql="select * from t_person where pid?";
//    	  QueryRunner qr=new TxQueryRunner();
//    	 Person p= qr.query(sql,new BeanHandler<Person>(Person.class),"1");
//    	 System.out.println(p);
//      }
//      
//      //多行结果
//      public void testquery2()
//      {
//    	  String sql="select * from t_person where pid?";
//    	  QueryRunner qr=new TxQueryRunner();
//    	  List<Person> list= qr.query(sql,new BeanListHandler<Person>(Person.class));
//    	 System.out.println(list);
//      }
//      //使用MapHandler,将结果封装在Map对象中
//      public void testquery3()
//      {
//    	  String sql="select * from t_person where pid?";
//    	  QueryRunner qr=new TxQueryRunner();
//    	  Map<String, Object> map = qr.query(sql,new MapHandler<Person>(Person.class));
//    	 System.out.println(map);
//      }
//      
//      //使用MapListHandler，将多行结果封装在List<Map>中,即多个Map，一行对应一个Map,多行对应List<Map>
//      public void testquery4()
//      {
//    	  String sql="select * from t_person where pid?";
//    	  QueryRunner qr=new TxQueryRunner();
//    	  List<Map<String, Object>> listmap= qr.query(sql,new MapListHandler<Person>(Person.class));
//    	 System.out.println(listmap);
//      }
//      
//      //使用ScalarHandler,将单行单列的结果封装在Object对象中
//      public void testquery5()
//      {
//    	  String sql="select count(*) from t_person ";
//    	  QueryRunner qr=new TxQueryRunner();
//    	  Object obj= qr.query(sql,new ScalarHandler<Person>(Person.class));
//    	  //将Object类型强转为Number类型
//    	  Number number=(Number)obj;
//    	  int cnt=number.intValue();
//    	 System.out.println(cnt);
//      }
//      
//      //多表查询，一条结果集中包含两张表的列，用MapHandler;
//      /**
//       * 1.将结果封装在map中
//       * 2.用map生成Person对象
//       * 3.用map生成address对象
//       * 4.将两个实体对象建立关系
//       */
//      public void testquery()
//      {
//    	  String sql="select * from t_person,a_address where pid=aid ";
//    	  QueryRunner qr=new TxQueryRunner();
//    	  //1.得到Map
//          Map map=qr.query(sql,new MapHandler(),"aaa");
//          //2 将Map中的部分数据封装在Person中
//          Person p=CommonUtils.toBean(map,Person.class);
//          //3 将Map中的剩余数据封装在Address中
//          Address adr=CommonUtils.toBean(map, Address.class);
//          //4 建立实体关系
//          p.setAddress(adr);
//          System.out.println(p);
//
//      }
}
