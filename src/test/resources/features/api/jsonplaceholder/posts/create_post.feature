Feature: Criar post na API JSONPlaceholder

  Scenario: Criar um post com dados válidos
    Given que eu tenho um novo post válido
    When faço uma requisição POST para "/posts"
    Then a resposta deve retornar o status 201
    And o corpo da resposta deve conter os dados do post criado
