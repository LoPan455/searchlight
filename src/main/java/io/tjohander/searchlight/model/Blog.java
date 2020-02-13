package io.tjohander.searchlight.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@ToString(callSuper=true, includeFieldNames=true)
@JsonTypeName("blog")
public class Blog extends Activity {

  String articleTitle;

  String blogName;

  int wordLength;

  public Blog(int duration, int impactScore, String articleTitle, String blogName, int wordLength) {
    super (duration, impactScore);
    this.articleTitle = articleTitle;
    this.blogName = blogName;
    this.wordLength = wordLength;
  }
}
