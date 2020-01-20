package com.raghu;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceTest {
    public static void main(String[] args) {
        Member[] members = {new Member("Raghu", "Bgowda"), new Member("Maaya", "Singh")};
        List<Member> membersList = Arrays.asList(members);

        //Static method reference
        membersList.forEach(System.out :: println);

        //Instance method reference
        membersList.forEach(Member :: printHash);
    }

}

class Member{
    Member(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private String firstName;
    private String lastName;

    public String toString(){
        return "{\n\tFirst Name: "+firstName+"\n\tLast Name: "+lastName+" \n}";
    }

    void printHash(){
        System.out.println(firstName.hashCode() ^ lastName.hashCode());
    }

}
