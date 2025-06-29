package api.jsonplaceholder.features.posts;

import api.jsonplaceholder.domain.models.Post;
import api.jsonplaceholder.domain.steps.PostSteps;
import api.jsonplaceholder.domain.utils.factories.PostFactory;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Entao;
import io.restassured.response.Response;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class CreatePostStepsDefinitions {

    private final PostSteps postSteps = new PostSteps();

    private Post newPost;
    private Response response;

    @Dado("que eu tenho um novo post válido")
    public void dadoQueEuTenhoUmNovoPostValido() {
        newPost = PostFactory.createDefaultPost();
    }

    @Dado("que eu tenho um post com título vazio")
    public void dadoQueEuTenhoUmPostComTituloVazio() {
        newPost = PostFactory.createPostWithCustomFields(2, "", "Corpo do post");
    }

    @Quando("faço uma requisição POST para {string}")
    public void quandoFaçoUmaRequisiçãoPOSTPara(String endpoint) {
        response = postSteps.createPost(newPost, endpoint);
    }

    @Entao("a resposta deve retornar o status {int}")
    public void entaoARespostaDeveRetornarOStatus(int statusCode) {
        assertThat(response.getStatusCode(), equalTo(statusCode));
    }

    @Entao("o corpo da resposta deve conter os dados do post criado")
    public void entaoOCorpoDaRespostaDeveConterOsDadosDoPostCriado() {
        assertThat(response.jsonPath().getString("title"), equalTo(newPost.getTitle()));
        assertThat(response.jsonPath().getString("body"), equalTo(newPost.getBody()));
        assertThat(response.jsonPath().getInt("userId"), equalTo(newPost.getUserId()));
    }
}
