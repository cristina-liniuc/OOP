package com.cristina.Laboratory6;

public class FullName {
    String givenName;
    String middleName;
    String familyName;

    public FullName(String given, String middle, String family) {
        givenName = given;
        middleName = middle;
        familyName = family;
    }

    @Override
    public String toString() {
        return "{" +
                "givenName='" + givenName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", familyName='" + familyName + '\'' +
                '}';
    }
}
