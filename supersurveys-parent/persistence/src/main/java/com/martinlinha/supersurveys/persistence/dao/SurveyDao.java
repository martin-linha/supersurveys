package com.martinlinha.supersurveys.persistence.dao;

import org.springframework.data.repository.CrudRepository;

import com.martinlinha.supersurveys.persistence.entity.Survey;

public interface SurveyDao extends CrudRepository<Survey, Integer> {

}
