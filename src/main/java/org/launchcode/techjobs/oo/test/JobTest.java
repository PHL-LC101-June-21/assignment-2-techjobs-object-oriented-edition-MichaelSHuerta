package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;


/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

     Job testJob;
     Job testJobTwo;
     Job test_job3;

@Test
public void testSettingJobId(){
    assertEquals(testJob, testJobTwo);
    }
@Test
    public void testJobConstructorSetsAllFields(){
    test_job3 =  new Job("Product tester",
            new Employer("ACME"),
            new Location("Desert"),
            new PositionType("Quality control"),
            new CoreCompetency("Persistence"));

}
}
