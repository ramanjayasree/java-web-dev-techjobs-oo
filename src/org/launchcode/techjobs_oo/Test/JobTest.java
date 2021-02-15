package org.launchcode.techjobs_oo.Test;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;
import static org.junit.Assert.*;

public class JobTest {

   Job job1;
   Job job2;
//   Job job1;
//   @Before
//    public void testTwoObjects(){
//         job = new Job();
//         job1 = new Job();
//   }


@Before
public void createJob() {
    job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
            new PositionType("Quality control"), new CoreCompetency("Persistence"));
    job2 = new Job("Front End Developer", new Employer("MC"), new Location("Ocean"),
            new PositionType("Developement"), new CoreCompetency("Programming"));

}

   @Test
 public void testSettingJobId(){
         assertFalse(job1.getId() - job2.getId() == 1);
 }

 @Test
 public void testJobConstructorSetsAllFields(){
assertEquals("Product tester",job1.getName());
assertEquals("ACME",job1.getEmployer().getValue());
assertEquals("Desert", job1.getLocation().getValue());
assertEquals("Quality control",job1.getPositionType().getValue());
assertEquals("Persistence",job1.getCoreCompetency().getValue());

//assertTrue(job1 instanceof(new Job()));

 }

 @Test
    public void testJobsForEquality(){


       System.out.println("job:" + job1.getName().toString() + "\n");
     //System.out.println("job3:" + job3.getName().toString());



       /*job2.setEmployer(new Employer("ACME"));
       job2.setCoreCompetency(new CoreCompetency("Java"));
       job2.setLocation(new Location("St.Louis"));
       job2.setName("FrontEnd Developer");
       job2.setPositionType(new PositionType("Developer"));

       job3.setEmployer(new Employer("ACME"));
       job3.setCoreCompetency(new CoreCompetency("Java"));
       job3.setLocation(new Location("St.Louis"));
       job3.setName("FrontEnd Developer");
       job3.setPositionType(new PositionType("Developer"));
*/
       //assertEquals(false, job2.equals(job3));

       assertFalse(job1.equals(job2));

 }

 @Test
    public void testToString(){
       assertFalse(job1.toString().startsWith("\n"));
       assertFalse(job1.toString().endsWith("\n"));
 }

}
