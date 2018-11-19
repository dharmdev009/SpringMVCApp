package mvcproject.model;

public class UserDetail {
    public Long id;
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String name;
    // fatherName?:string;
    // motherName?:string;
    // spouseName?:string;
    // noOfChildren?:number;
    // noOfBoys?:number;
    // noOfGirls?:number;
    // nameOfBoysChild?:string[];
    // nameOfGirlsChild?:string[];
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
