package org.launchcode.javawebdevtechjobsmvc.controllers;

import org.launchcode.javawebdevtechjobsmvc.models.Job;
import org.launchcode.javawebdevtechjobsmvc.models.JobData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

import static org.launchcode.javawebdevtechjobsmvc.controllers.ListController.columnChoices;

/**
 * Created by LaunchCode
 */
@Controller
@RequestMapping("search")
public class SearchController {

    @RequestMapping(value = "")
    public String search(Model model) {
        model.addAttribute("columns", columnChoices);
        return "search";
    }

    // TODO #3 - Create a handler to process a search request and render the updated search view.

    @PostMapping (value = "results")
    public String displaySearchResults (Model model, @RequestParam String searchType, @RequestParam String searchTerm ) {
        //java code to search trhough your jobs to see if it matches what is in the search
        //arraylist <String> jobs = new list <> (variable Array list) to hold the jobs

        // initialize a variable to hold the matching jobs
        // IF search type is all and search term is an empty string then return all jobs
        //if search term has a value, use that value to find by column and value on JobData
        //add data to the model
        //return model to the search view

        return "results";
    }
}
