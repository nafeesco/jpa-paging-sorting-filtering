package com.example.jpapagingsortingfiltering.model;

import jakarta.persistence.criteria.CriteriaQuery;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Page;

@Getter
@Setter
public class EmployeeSearchCriteria {
    private String firstName;
    private String lastName;

}

