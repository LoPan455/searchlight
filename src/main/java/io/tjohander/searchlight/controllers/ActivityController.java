package io.tjohander.searchlight.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.tjohander.searchlight.model.Activity;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/activities")
public class ActivityController<T extends Activity> {

  @Autowired
  ObjectMapper objectMapper;

  @GetMapping("/")
  public List<? extends Activity> list() {
    return null;
  }

  @GetMapping("/{id}")
  public Activity getActivity(@PathVariable Long id) {
    return null;
  }

  @PostMapping("/")
  @ResponseStatus(HttpStatus.CREATED)
  public void createActivity(@RequestBody final T activity) {
    System.out.println(activity);
  }

  @PutMapping("/{id}")
  @ResponseStatus(HttpStatus.ACCEPTED)
  public T modifyActivity(
      @PathVariable String id,
      @RequestBody T activity
      ) {
    return activity;
  }



}
