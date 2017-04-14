package graphqlapp.hello.service;

import static graphql.Scalars.GraphQLString;
import static graphql.schema.GraphQLFieldDefinition.newFieldDefinition;
import static graphql.schema.GraphQLObjectType.newObject;

import org.springframework.stereotype.Service;

import graphql.GraphQL;
import graphql.schema.GraphQLObjectType;
import graphql.schema.GraphQLSchema;

@Service
public class HelloWorldGraphqlService {

	public GraphQL getGraphqlExecutor() {
		GraphQLObjectType queryType = newObject().name("helloWorldQuery")
				.field(newFieldDefinition().type(GraphQLString).name("hello").staticValue("world")).build();
		GraphQLSchema schema = GraphQLSchema.newSchema().query(queryType).build();
		GraphQL graphQL = GraphQL.newGraphQL(schema).build();
		return graphQL;
	}
}
