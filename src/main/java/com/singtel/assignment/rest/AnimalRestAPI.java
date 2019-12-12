/**
 * 
 */
package com.singtel.assignment.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author dumidu
 *
 */
public class AnimalRestAPI {
	@RequestMapping(value="animal/getanimal/{animalname}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public AnimalResponse getAnimalByName(@PathVariable("animalname") String transactionTypeCode) {
		//Need to implement method to return Animal object 
		AnimalResponse animalResp = new AnimalResponse();
		return animalResp;
	}
}
