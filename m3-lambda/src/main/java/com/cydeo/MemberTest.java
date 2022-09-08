package com.cydeo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemberTest {

    public static void main(String[] args) {

        Member p1 = new Member("mike",35,Gender.MALE,"mike@cydeo.com");
        Member p2 = new Member("ozzy",25,Gender.MALE,"ozzy@cydeo.com");
        Member p3 = new Member("tom",55,Gender.MALE,"tom@cydeo.com");
        Member p4 = new Member("sarah",45,Gender.FEMALE,"sarah@cydeo.com");

        List<Member> memberList = Arrays.asList(p1,p2,p3,p4);

        CheckMember checkMember = p -> p.getGender()==Gender.MALE && p.getAge()>=18 && p.getAge()<=25;

        print(memberList,checkMember);

        System.out.println("Second way:");

        print(memberList, p -> p.getGender()==Gender.MALE && p.getAge()>=18 && p.getAge()<=25);


    }

    private static void print(List<Member> memberList, CheckMember checkMember){

        List<Member> result = new ArrayList<>();
        for(Member each : memberList){
            if(checkMember.test(each)){
                result.add(each);
            }
        }
        System.out.println(result);
    }
}
