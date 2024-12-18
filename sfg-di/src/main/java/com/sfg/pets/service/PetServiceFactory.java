package com.sfg.pets.service;

public class PetServiceFactory {

	public PetService getPetService(String petType) {
		switch(petType) {
		
		case "Dog" : return new DogPetService(); 
		case "Cat" : return new CatPetService();
		default    : return new DogPetService();
		
		}
	}
}
