package io.tjohander.searchlight.model;

import java.time.Duration;
import lombok.Data;

@Data
public abstract class Activity {

  private int duration;

  private int impactScore;

}
