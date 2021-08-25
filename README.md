# Spring Data Aerospike: Multiple Namespaces Example

The goal of this example is to demonstrate how to use multiple namespaces
with Spring Data Aerospike.

Using a single namespace with Spring Data Aerospike is pretty straight forward,
Configuration comes out-of-the-box, all you need to do is to extend `AbstractAerospikeDataConfiguration` class and
override two methods: `getHosts()` and `nameSpace()`.
You can see an example of using a single namespace in [Simple Web Application Using Java, Spring Boot, Aerospike and Docker](https://medium.com/aerospike-developer-blog/simple-web-application-using-java-spring-boot-aerospike-database-and-docker-ad13795e0089).

Using multiple namespaces with Spring Data Aerospike requires a bit of additional code, create a configuration class per namespace, in each configuration class: extend `AbstractAerospikeDataConfiguration`,
override both `getHosts()` and `nameSpace()`, create an `AerospikeTemplate` bean (with a unique bean name) and point the `aerospikeTemplateRef` field of the
`@EnableAerospikeRepositories` annotation to the relevant new created `AerospikeTemplate` bean name.

You can see a fully working example in this repository.

### Version

The Spring Data Aerospike versions that supports multiple namespaces are `3.1.0` and above.
```
<dependency>
    <groupId>com.aerospike</groupId>
    <artifactId>spring-data-aerospike</artifactId>
    <version>3.1.0</version>
</dependency>
```

### Multiple repositories in a package

If both repositories are located in the same package - same as in this example (`AerospikeProductsRepository` and `AerospikeUsersRepository` are both part of the `repositories` package), then you need to use the `includeFilters` field
of the `@EnableAerospikeRepositories` annotation on your configuration class pointing to the relevant repository using customized annotations (`ProductsRepository` and `UsersRepository`).