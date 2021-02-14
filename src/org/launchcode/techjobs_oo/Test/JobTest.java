package org.launchcode.techjobs_oo.Test;

import org.junit.Before;
import org.launchcode.techjobs_oo.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.junit.Assert.*;

public class JobTest {

//   Job job;
//   Job job1;
//   @Before
//    public void testTwoObjects(){
//         job = new Job();
//         job1 = new Job();
//   }


   @Test
 public void testSettingJobId(){
       Job obj = new Job();
       Job job1 = new Job();

       assertTrue(job1.getId() - Job.getId() == 1);

 }

 @Test
 public void testJobConstructorSetsAllFields(){
       Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
               new PositionType("Quality control"), new CoreCompetency("Persistence"));
assertEquals("Product tester",job.getName());
assertEquals("ACME",job.getEmployer().getValue());
assertEquals("Desert", job.getLocation().getValue());
assertEquals("Quality control",job.getPositionType().getValue());
assertEquals("Persistence",job.getCoreCompetency().getValue());

//assertEquals(true, job instanceof(Job));

 }

 @Test
    public void testJobsForEquality(){
       Job job2 = new Job();
       Job job3 = new Job();

       job2.setEmployer(new Employer("ACME"));
       job2.setCoreCompetency(new CoreCompetency("Java"));
       job2.setLocation(new Location("St.Louis"));
       job2.setName("FrontEnd Developer");
       job2.setPositionType(new PositionType("Developer"));

       job3.setEmployer(new Employer("ACME"));
       job3.setCoreCompetency(new CoreCompetency("Java"));
       job3.setLocation(new Location("St.Louis"));
       job3.setName("FrontEnd Developer");
       job3.setPositionType(new PositionType("Developer"));

       //assertEquals(false, job2.equals(job3));

       assertFalse(job2.equals(job3));

 }
}
