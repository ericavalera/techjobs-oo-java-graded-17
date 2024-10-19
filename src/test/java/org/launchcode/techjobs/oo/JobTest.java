package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

//TASK 4
    @Test
    // create two empty job objects and use assertNotEquals to make sure the IDs are different
    public void testSettingJobId(){
        Job job1 = new Job();
        Job job2 = new Job();

        assertNotEquals(job1.getId(), job2.getId());
    }

    //TODO: TEST CONSTRUCTORS
@Test
    public void testJobConstructorSetsAllFields(){
    Job job = new Job("Product tester",  new Employer("ACME"),
            new Location("Desert"), new PositionType("Quality control"),
            new CoreCompetency("Persistence"));

    //TESTING VALUES
    assertEquals("Product tester", job.getName());
    assertEquals("ACME", job.getEmployer().toString());
    assertEquals("Desert", job.getLocation().toString());
    assertEquals("Quality control", job.getPositionType().toString());
    assertEquals("Persistence", job.getCoreCompetency().toString());
    //TESTING CLASSES
    assertTrue(job instanceof Job);
    assertTrue(job.getEmployer() instanceof Employer);
    assertTrue(job.getLocation() instanceof Location);
    assertTrue(job.getPositionType() instanceof PositionType);
    assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
    }

//Testing equals() method
    @Test
    public void testJobsForEquality(){
        Job job1 = new Job("Product Tester", new Employer("Google"),
                new Location("New York"), new PositionType("Quality Control"),
                new CoreCompetency("Persistence"));
        Job job2 = new Job("Product Tester", new Employer("Google"),
                new Location("New York"), new PositionType("Quality Control"),
                new CoreCompetency("Persistence"));

        assertFalse(job1.equals(job2));
    }

    //TASK 5

    //Test that the print out has a new line in the beginning & end.
    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job job = new Job("Product tester",  new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        assertTrue(job.toString().startsWith(System.lineSeparator()));
        assertTrue(job.toString().endsWith(System.lineSeparator()));
    }
// Tests if it prints the correct information.
@Test
    public void testToStringContainsCorrectLabelsAndData(){
    Job job = new Job("Product tester",  new Employer("ACME"),
            new Location("Desert"), new PositionType("Quality control"),
            new CoreCompetency("Persistence"));

    //System.out.println(job.toString());

    assertTrue(job.toString().contains("ID: "+ job.getId()));
    assertTrue(job.toString().contains("Name: Product tester"));
    assertTrue(job.toString().contains("Employer: ACME"));
    assertTrue(job.toString().contains("Location: Desert"));
    assertTrue(job.toString().contains("Position Type: Quality control"));
    assertTrue(job.toString().contains("Core Competency: Persistence"));
}
@Test
    public void testToStringHandlesEmptyField(){
        //Testing Name
        Job newJobName = new Job("", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(newJobName.toString().contains("Name: Data not available"));

    //Testing Employer
    Job newJobEmployer = new Job("Product tester", new Employer(""), new Location("Desert"),
            new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertTrue(newJobEmployer.toString().contains("Employer: Data not available"));

    //Testing Location
    Job newJobLocation = new Job("Product tester", new Employer("ACME"), new Location(""),
            new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertTrue(newJobLocation.toString().contains("Location: Data not available"));

    //Testing Position Type
    Job newJobPosition = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
            new PositionType(""), new CoreCompetency("Persistence"));
    assertTrue(newJobPosition.toString().contains("Position Type: Data not available"));

    //Testing Core Competency
    Job newJobCore = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
            new PositionType("Quality control"), new CoreCompetency(""));
    assertTrue(newJobCore.toString().contains("Core Competency: Data not available"));

}

}
