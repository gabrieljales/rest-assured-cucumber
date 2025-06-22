package api.jsonplaceholder;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

/*
    O runner é a porta de entrada dos testes Cucumber dentro do projeto, utilizando JUnit Platform.
    Aqui fica a configuração de onde o Cucumber vai encontrar os arquivos .feature e os steps feitos em Java.
 */

@Suite // Gatilho para rodar testes integrados no JUnit 5
@SelectClasspathResource("features") // Caminho para os .feature dentro de resources
@ConfigurationParameter(
        // Configuração do Glue do Cucumber (local onde serão buscados os step definitions e hooks)
        // Glue: Verifica o projeto em busca dos step definitions e os associa aos steps correspondentes em resources/features
        key = GLUE_PROPERTY_NAME,
        value = "api.jsonplaceholder.features,api.jsonplaceholder.domain.shared"
)
@ConfigurationParameter(
        // Configuração de plugins para geração de relatórios
        key = "cucumber.plugin",
        value = "pretty, html:build/cucumber-reports.html, json:build/cucumber.json"
)
public class RunCucumberTest {
}
