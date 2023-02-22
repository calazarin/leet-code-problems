package com.lazarin.googlequestions.interviewprocess;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/unique-email-addresses/
public class UniqueEmailAddresses {

    public static void main(String args[]){

        System.out.println(numUniqueEmails(new String[]{
                "test.email+alex@leetcode.com",
                "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com"
        }));
    }

    public static int numUniqueEmails(String[] emails) {

        if(emails == null){
            return 0;
        }

        Set<String> allLocalNames = new HashSet<String>();

        for(String email : emails){

            String[] emailAndDomain = email.split("@");
            String onlyLocalName = emailAndDomain[0];
                if(onlyLocalName.contains("+")){
                    String[] withoutPlusSign = onlyLocalName.split("\\+");
                    allLocalNames.add(removeDots(withoutPlusSign[0]) + "@" + emailAndDomain[1]);
                } else {
                    allLocalNames.add(removeDots(onlyLocalName) + "@" +emailAndDomain[1]);
                }
        }

        return allLocalNames.size();
    }

    private static String removeDots(String localName){
        return localName.replace(".","");
    }
}
