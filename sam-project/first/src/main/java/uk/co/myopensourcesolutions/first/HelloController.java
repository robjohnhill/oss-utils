package uk.co.myopensourcesolutions.first;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uk.co.myopensourcesolutions.first.api.TestResponse;

@Api(value = "HelloController", description = "REST APIs related to Sams Project!!!!")
@RestController
public class HelloController {

	@ApiOperation(value = "Test the project is up", httpMethod = "GET", response = TestResponse.class, tags = "sayHello")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success|OK"),
			@ApiResponse(code = 401, message = "not authorized!"),
			@ApiResponse(code = 403, message = "forbidden!!!"),
			@ApiResponse(code = 404, message = "not found!!!") })
	@RequestMapping("/greetings")
	public TestResponse index() {
		TestResponse testResponse = new TestResponse();
		testResponse.setStatus(200);
		testResponse.setMessage("Greetings from Sams project");
		return testResponse;
	}

}
