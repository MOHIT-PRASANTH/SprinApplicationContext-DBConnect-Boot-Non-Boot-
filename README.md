# SprinApplicationContext-DBConnect-Boot-Non-Boot-
About AppplicationContext


ApplicationContext.xml
##########################################################################
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
 xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
 xsi:schemaLocation="http://www.springframework.org/schema/beans
 http://www.springframework.org/schema/beans/spring-beans-4.3.xsd">

	 <bean id="b1" class="">
		<property name="" value=""></property>
	 </bean>
	 
	 <bean id="b2" class="">
	 </bean>
	
	 <bean id="b3" class="">
	 </bean>
</beans>
##########################################################################

What Happends when we load applicationContext.xml file:
	The beans inside applicationContext.xml will be initiated. i.e. It intilized spring container so that beans are present inside that spring container.
	
With out Application Context Loader:
	we need to load applicationContext.xml manually...
	ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml", "applicationContext-part2.xml"});

With Application Context Loader:
```
	<listener>
        <listener-class>org.springframework.web.context.ContextLoaderListener
        </listener-class>
    </listener>
    <context-param>
        <param-name>contextConfigLocation</param-name>
        <param-value>/WEB-INF/applicationContext.xml</param-value>
    </context-param>
```

->When There are no Autowires then:
	we need to load every bean manually by using appContext.getBean("b1");

->When there are Autowires then:
	we can directly place @Autowired which automatically initilizes beans.
	when constructor is called while initilizing beans If there are @Autowired then they are initilized from spring container.
