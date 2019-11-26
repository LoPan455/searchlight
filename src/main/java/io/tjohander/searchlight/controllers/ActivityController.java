package io.tjohander.searchlight.controllers;

import io.tjohander.searchlight.model.Activity;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/activity")
public class ActivityController {

  @GetMapping("/list")
  public List<? extends Activity> list() {
    return null;
  }

  @GetMapping("/list/{id}")
  public Activity getActivity(@PathVariable Long id) {
    return null;
  }

}
