package com.martinlinha.supersurveys.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.martinlinha.supersurveys.persistence.dao.SurveyDao;
import com.martinlinha.supersurveys.persistence.entity.Survey;

@Controller
@Transactional
public class IndexController {

	@Autowired
	private SurveyDao surveyDao;

	@RequestMapping("/")
	public ModelAndView doIndex() {

		Survey survey = new Survey();
		survey.setActive(true);
		survey.setName("survey 1");

		Survey newSuervey = surveyDao.save(survey);
		newSuervey.setActive(false);
		surveyDao.save(newSuervey);
		
		return new ModelAndView("welcome", "hello", "Hello from index controller.");
	}
}
