package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

   
    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }



    @Test
    public void same_object_correct() {
        Team team = new Team();
        team.setName("f24-11");
        team.addMember("bob");
        assertEquals(team.equals(team), true);
    }

    @Test
    public void different_class_correct() {
        Team team = new Team();
        team.setName("f24-11");
        team.addMember("bob");
        String different = "Not a Team";
        assertEquals(team.equals(different), false);
    }

    @Test
    public void same_name_same_member_correct() {
        Team team = new Team();
        team.setName("f24-11");
        team.addMember("bob");

        Team other = new Team();
        other.setName("f24-11");
        other.addMember("bob");
        assertEquals(team.equals(other), true);
    }

    @Test
    public void same_name_different_members_correct() {
        Team team = new Team();
        team.setName("f24-11");
        team.addMember("bob");

        Team other = new Team();
        other.setName("f24-11");
        other.addMember("bill");
        assertEquals(team.equals(other), false);
    }

    @Test
    public void different_name_same_members_correct() {
        Team team = new Team();
        team.setName("f24-11");
        team.addMember("bob");

        Team other = new Team();
        other.setName("f24-11");
        other.addMember("bill");
        assertEquals(team.equals(other), false);
    }

    @Test
    public void different_name_different_members_correct() {
        Team team = new Team();
        team.setName("f24-11");
        team.addMember("bob");

        Team other = new Team();
        other.setName("f24-12");
        other.addMember("bill");
        assertEquals(team.equals(other), false);
    }

    @Test
    public void check_hash() {
        Team team = new Team();
        team.setName("f24-11");
        team.addMember("bob");

        Team other = new Team();
        other.setName("f24-11");
        other.addMember("bob");
        assertEquals(team.hashCode(), other.hashCode());


    }

    @Test
    public void check_hash_equiv_mut_problem() {
        Team t = new Team();
        int result = t.hashCode();
        int expectedResult = 1;
        assertEquals(expectedResult, result);

    }



}
