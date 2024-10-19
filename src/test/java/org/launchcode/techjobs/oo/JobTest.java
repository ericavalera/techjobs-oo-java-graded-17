package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here


    @Test
    // create two empty job objects and use assertNotEquals to make sure the IDs are different
    public void testSettingJobId(){
        Job job1 = new Job();
        Job job2 = new Job();

        assertNotEquals(job1, job2);
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

}
