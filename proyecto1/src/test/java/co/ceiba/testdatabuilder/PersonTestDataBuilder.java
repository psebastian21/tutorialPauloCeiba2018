package co.ceiba.testdatabuilder;

import co.ceiba.domain.Person;

public class PersonTestDataBuilder {

	private String name;
	private String lastName;
	
	public PersonTestDataBuilder(){
		this.name = "John";
		this.lastName = "Doe";
	}

	public PersonTestDataBuilder(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}
	
	public PersonTestDataBuilder withName(String name){
		this.name = name;
		return this;
	}
	
	public PersonTestDataBuilder withLastName( String lastName){
		this.lastName = lastName;
		return this;
	}
	
	public Person build(){
		return new Person(this.name, this.lastName);
	}
}
