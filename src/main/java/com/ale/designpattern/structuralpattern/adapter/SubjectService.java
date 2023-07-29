package com.ale.designpattern.structuralpattern.adapter;

import java.util.List;

public class SubjectService {
    public List<String> getSubjects(){
        return List.of("English", "Maths", "Literature", "Biology", "Technology");
    }
}
