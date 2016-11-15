///*
// * Copyright 2012-2016 the original author or authors.
// *
// * Licensed under the Apache License, Version 2.0 (the "License");
// * you may not use this file except in compliance with the License.
// * You may obtain a copy of the License at
// *
// *      http://www.apache.org/licenses/LICENSE-2.0
// *
// * Unless required by applicable law or agreed to in writing, software
// * distributed under the License is distributed on an "AS IS" BASIS,
// * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// * See the License for the specific language governing permissions and
// * limitations under the License.
// */
//
//package io.mangue.config;
//
//import com.datastax.driver.core.Cluster;
//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.boot.autoconfigure.AutoConfigureAfter;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.autoconfigure.cassandra.CassandraAutoConfiguration;
//import org.springframework.boot.autoconfigure.cassandra.CassandraProperties;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
//import org.springframework.boot.bind.RelaxedPropertyResolver;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.env.Environment;
//import org.springframework.core.env.PropertyResolver;
//import org.springframework.data.cassandra.core.CassandraAdminOperations;
//
///**
// * {@link EnableAutoConfiguration Auto-configuration} for Spring Data's Cassandra support.
// *
// * @since 1.3.0
// */
//@Configuration
//@ConditionalOnClass({ Cluster.class, CassandraAdminOperations.class })
//@EnableConfigurationProperties(CassandraProperties.class)
//@AutoConfigureAfter(CassandraAutoConfiguration.class)
//public class CassandraConfig {
//
//	private final BeanFactory beanFactory;
//
//	private final CassandraProperties properties;
//
//	private final Cluster cluster;
//
//	private final PropertyResolver propertyResolver;
//
//	public CassandraConfig(BeanFactory beanFactory,
//						   CassandraProperties properties, Cluster cluster, Environment environment) {
//		this.beanFactory = beanFactory;
//		this.properties = properties;
//		this.cluster = cluster;
//		this.propertyResolver = new RelaxedPropertyResolver(environment,
//				"spring.data.cassandra.");
//	}
//}