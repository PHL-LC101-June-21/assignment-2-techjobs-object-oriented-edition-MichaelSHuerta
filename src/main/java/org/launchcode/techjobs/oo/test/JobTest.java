package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;


/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    @Test
    public void testSettingJobId() {
        Job runTestJobOne = new Job();
        Job runTestJobTwo = new Job();
        assertEquals(runTestJobOne, runTestJobTwo);

    }

    @Test
    public void testJobConstructorSetsAllFields() {

        Job fieldJobs = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals("Product tester", fieldJobs.getName().toString());
        assertEquals("ACME", fieldJobs.getEmployer().toString());
        assertEquals("Desert", fieldJobs.getLocation().toString());
        assertEquals("Quality control", fieldJobs.getPositionType().toString());
        assertEquals("Persistence", fieldJobs.getCoreCompetency().toString());

        assertTrue(fieldJobs instanceof Job);
        assertTrue(fieldJobs.getEmployer() instanceof Employer);
        assertTrue(fieldJobs.getLocation() instanceof Location);
        assertTrue(fieldJobs.getPositionType() instanceof PositionType);
        assertTrue(fieldJobs.getCoreCompetency() instanceof CoreCompetency);


    }
    @Test
    public void testJobsForEquality() {
        Job runTestJobOne = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job runTestJobTwo = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(runTestJobOne.equals(runTestJobTwo));
    }
    //part 5
    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job displayJob = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        String createString = "\nID: " + displayJob.getId() + "\n" +
                "Name: " + displayJob.getName() + "\n" +
                "Employer: " + displayJob.getEmployer() + "\n" +
                "Location: " + displayJob.getLocation() + "\n" +
                "Position Type: " + displayJob.getPositionType() + "\n" +
                "Core Competency: " + displayJob.getCoreCompetency() + "\n";
        assertEquals(createString, displayJob.toString());
    }
    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job displayJob = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        String createString = displayJob.toString();

        Character line = '\n';
        assertEquals('\n', createString.charAt(0));
        assertEquals('\n', createString.charAt(createString.length() - 1));
    }

    @Test
    public void testToStringHandlesEmptyField(){
        Job displayJob = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        String createString = "\nID: " + displayJob.getId() + "\n" +
                "Name: " + displayJob.getName() + "\n" +
                "Employer: " + displayJob.getEmployer() + "\n" +
                "Location: " + displayJob.getLocation() + "\n" +
                "Position Type: " + displayJob.getPositionType()+ "\n" +
                "Core Competency: Data not available" + "\n";
        assertEquals(createString, displayJob.toString());
    }
}

