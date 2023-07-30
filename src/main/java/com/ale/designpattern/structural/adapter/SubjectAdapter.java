package com.ale.designpattern.structural.adapter;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class SubjectAdapter implements ViewAdapter{
    private SubjectService subjectService;
    @Override
    public List<String> getViews() {
        return subjectService.getSubjects().stream()
                .map(s -> "View: " + s)
                .toList();
    }
}
