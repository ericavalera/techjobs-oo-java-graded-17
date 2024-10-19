package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        this.id = nextId;
        nextId ++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {
       String jobPrint = System.lineSeparator();

       //ID
       jobPrint += "ID: ";
       if(id == 0){
           jobPrint += "Data not available" + System.lineSeparator();
       } else {
           jobPrint += id + System.lineSeparator();
       }

       //Name
        jobPrint += "Name: ";
        if(name.isEmpty()){
            jobPrint += "Data not available" + System.lineSeparator();
        } else {
            jobPrint += name + System.lineSeparator();
        }

        //Employer
        jobPrint += "Employer: ";
        if(employer.getValue().isEmpty()){
            jobPrint += "Data not available" + System.lineSeparator();
        } else {
            jobPrint += employer + System.lineSeparator();
        }

        //Location
        jobPrint += "Location: ";
        if(location.getValue().isEmpty()){
            jobPrint += "Data not available" + System.lineSeparator();
        } else {
            jobPrint += location + System.lineSeparator();
        }

        //Position type
        jobPrint += "Position Type: ";
        if(positionType.getValue().isEmpty()){
            jobPrint += "Data not available" + System.lineSeparator();
        } else{
            jobPrint += positionType + System.lineSeparator();
        }

        //Core Competency
        jobPrint += "Core Competency: ";
        if(coreCompetency.getValue().isEmpty()){
            jobPrint += "Data not available" + System.lineSeparator();
        } else {
            jobPrint += coreCompetency + System.lineSeparator();
        }

        return jobPrint;
    }
}
