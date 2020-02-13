package io.tjohander.searchlight.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import java.time.Duration;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = Blog.class, name = "blog")
})
@Document(collation = "activities")
public abstract class Activity {

  private int duration;
  private int impactScore;

  protected Activity(int duration, int impactScore) {
    this.duration = duration;
    this.impactScore = impactScore;
  }

}
