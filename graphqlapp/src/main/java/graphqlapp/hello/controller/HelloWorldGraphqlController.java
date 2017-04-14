package graphqlapp.hello.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import graphql.GraphQL;
import graphqlapp.hello.service.HelloWorldGraphqlService;

@RestController
public class HelloWorldGraphqlController {

	@Autowired
	HelloWorldGraphqlService graphqlService;

	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	public Map<String, Object> sayHello() {
		GraphQL graphqlExecutor = graphqlService.getGraphqlExecutor();
		Map<String, Object> result = graphqlExecutor.execute("{hello}").getData();
		System.out.println(result);
		return result;
	}

}
