package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity{

    @NotNull(message = "Name required!")
    //@NotBlank(message = "Do not leave blank!")
    @Size(min = 1, max = 255)
    private String location;

    public Employer() {};

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
}
