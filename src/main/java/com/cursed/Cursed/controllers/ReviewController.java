package com.cursed.Cursed.controllers;

import com.cursed.Cursed.models.Review;
import com.cursed.Cursed.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReviewController {
    @Autowired
    private ReviewRepository reviewRepository;

    @GetMapping("/review")
    public String reviewMain(Model model){
        Iterable<Review> reviews = reviewRepository.findAll();
        model.addAttribute("reviews", reviews);
        return "review";
    }
}