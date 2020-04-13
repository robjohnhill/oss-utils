package uk.co.myopensourcesolutions.world.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uk.co.myopensourcesolutions.world.api.CityResponses;
import uk.co.myopensourcesolutions.world.builder.WorldBuilder;
import uk.co.myopensourcesolutions.world.service.WorldService;

@Api(value = "WorldController", description = "REST APIs related to Sams Worlds!!!!")
@RestController
public class WorldController {

	@Autowired
	private WorldService worldService;

	@Autowired
	private WorldBuilder worldBuilder;

	@ApiOperation(value = "Get all cities", httpMethod = "GET", response = CityResponses.class, tags = "cities")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success|OK"),
			@ApiResponse(code = 401, message = "not authorized!"),
			@ApiResponse(code = 403, message = "forbidden!!!"),
			@ApiResponse(code = 404, message = "not found!!!") })
	@RequestMapping("/cities")
	public CityResponses cities() {
		return worldBuilder.buildCityResponses(worldService.getAllCity());
	}

	@ApiOperation(value = "Get cities with populations greater than", httpMethod = "GET", response = CityResponses.class, tags = "citiesPopulationGreater")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success|OK"),
			@ApiResponse(code = 401, message = "not authorized!"),
			@ApiResponse(code = 403, message = "forbidden!!!"),
			@ApiResponse(code = 404, message = "not found!!!") })
	@RequestMapping("/cities/greater/{population}")
	public CityResponses citiesPopulationGreaterThan(@PathVariable("population") Integer population) {
		return worldBuilder.buildCityResponses(worldService.getCityWithPopulationsGreaterThan(population));
	}

}
