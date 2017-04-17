# graphql

What is graphql?
1. Graphql is a query language for your API
2. And a server-side runtime for executing queries.
3. The graphql queries are validated against the schema you define for your data.
4. schema composes various type components explained below.


How to Create a graphql service?
1. A GraphQL Service is created by defining 
	1. types.
	2. fields on the types.
	3. and functions for those types.
	

Graphql Query Execution Flow
1. GraphQL Service will be running typically at a URL on a web service.
2. GraphQl queries are received by the Graphql Service.
3. GraphQL Service will validate the query against the schema already defined.
4. GraphQl Service will execute the query by calling the functions defined for those types.


How to query Graphql Server?
1. Fields.
2. Arguments.
3. Aliases.
4. Fragments.
5. Variables.
6. 


Graphql Schema Design
1. Graphql requires schema. when graphql query come in, they are validated and executed against that schema.
2. Schema describes set of possible data you can query on graphql service. 
3. Components of graphql schema
	1. object types
	2. Scalar types - they don't have sub selections. Leaves.
	3. Query(mandatory) and Mutation types
	4. Enumeration types.
	5. Lists and Non-Null
	6. Interfaces
	7. Union Types
	8. Input Types
	


Setup
1) Add Graphql to java using maven dependency
	<dependency>
    <groupId>com.graphql-java</groupId>
    <artifactId>graphql-java</artifactId>
    <version>2.4.0</version>
	</dependency>




Graphql Backend as a service
https://scaphold.io/
https://www.youtube.com/watch?v=sgHckUwEWRw


Graphiql
1. https://github.com/graphql/graphiql
2. play around - http://graphql.org/swapi-graphql/
3. https://learngraphql.com/basics/query-variables/1
4. https://console.graph.cool/Example%20Project/schema
5. Zero to Graphql - https://www.youtube.com/watch?v=UBGzsb2UkeY&list=PLXbHhQRjOMkfQtmsGT7Q6ZrNUfenllE-U
6. Graphql Spring boot starter - https://github.com/merapar/spring-boot-starter-graphql
7. Graphql Java - https://github.com/graphql-java/graphql-java



