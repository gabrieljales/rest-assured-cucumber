package api.jsonplaceholder.domain.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Post {
    private int userId;
    private String title;
    private String body;
}
