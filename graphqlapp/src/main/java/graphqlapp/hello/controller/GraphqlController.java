package graphqlapp.hello.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import graphql.ExecutionResult;
import graphql.GraphQL;
import graphqlapp.hello.service.HelloWorldGraphqlService;

@RestController
public class GraphqlController {

	@Autowired
	HelloWorldGraphqlService graphqlService;
	
	@RequestMapping(value="/graphql", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Object executeOperation(@RequestBody Map body){
		  String query = (String) body.get("query");
		  Map<String, Object> variables = (Map<String, Object>) body.get("variables");
		  GraphQL graphqlExecutor = graphqlService.getGraphqlExecutor();
		  ExecutionResult executionResult = graphqlExecutor.execute(query, (Object) null, variables);
		  Map<String, Object> result = new LinkedHashMap<String, Object>();
	        if (executionResult.getErrors().size() > 0) {
	            result.put("errors", executionResult.getErrors());
	            
	        }
	        result.put("data", executionResult.getData());
	        return result;
	}
	
}
