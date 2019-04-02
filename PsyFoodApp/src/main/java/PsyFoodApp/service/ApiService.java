package PsyFoodApp.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ApiService {

	
	//Current key and id stored in application.properties
	//https://www.edamam.com/   
	//Recipe API only at the moment.
		@Value("${myapi.key}")
		String myApiKey;
		@Value("${myapi.id}")
		String myApiId;
		
		private RestTemplate restTemp = new RestTemplate();
}
