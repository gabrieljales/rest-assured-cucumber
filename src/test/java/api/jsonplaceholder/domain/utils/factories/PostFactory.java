package api.jsonplaceholder.domain.utils.factories;

import api.jsonplaceholder.domain.models.Post;

public class PostFactory {

    public static Post createDefaultPost() {
        return  Post.builder()
                .userId(1)
                .title("Título de Exemplo")
                .body("Conteúdo do Post")
                .build();
    }

    public static Post createPostWithCustomFields(int userId, String title, String body) {
        return Post.builder()
                .userId(userId)
                .title(title)
                .body(body)
                .build();
    }
}
