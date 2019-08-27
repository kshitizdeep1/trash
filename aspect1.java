<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE beans PUBLIC "-//SPRING//DTD BEAN 2.0//EN"
			"http://www.springframework.org/dtd/spring-beans-2.0.dtd">
<beans>
	<bean id="ds"
		class="org.springframework.jdbc.datasource.DriverManagerDataSource">
		<property name="driverClassName" value="com.mysql.jdbc.Driver" />
		<property name="url" value="jdbc:mysql://localhost:3306/kshitiz" />
		<property name="username" value="root" />
		<property name="password" value="Login@12345" />
	</bean>

	<!-- Definition for studentJDBCTemplate bean -->
	<bean id="jdbcTemplate" class="org.springframework.jdbc.core.JdbcTemplate">
		<property name="dataSource" ref="ds" />
	</bean>
	<bean id="createTable" class="com.spring.jdbc1.CreateTable">
		<property name="jdbcTemplate" ref="jdbcTemplate"></property>
	</bean>
</beans>
